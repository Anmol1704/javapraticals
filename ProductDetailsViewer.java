import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductDetailsViewer extends JFrame {
    private JComboBox<String> productComboBox;
    private JTextArea detailsTextArea;

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public ProductDetailsViewer() {
        setTitle("Product Details Viewer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        productComboBox = new JComboBox<>();
        detailsTextArea = new JTextArea(10, 30);

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Select Product:"));
        topPanel.add(productComboBox);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(new JScrollPane(detailsTextArea));

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);

        productComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayProductDetails();
            }
        });

        try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            connection = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=path_to_your_access_database");

           
            preparedStatement = connection.prepareStatement("SELECT name FROM products");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                productComboBox.addItem(resultSet.getString("name"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void displayProductDetails() {
        String selectedProduct = (String) productComboBox.getSelectedItem();
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM products WHERE name = ?");
            preparedStatement.setString(1, selectedProduct);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String details = "ID: " + resultSet.getInt("id") + "\n"
                        + "Name: " + resultSet.getString("name") + "\n"
                        + "Price: " + resultSet.getDouble("price") + "\n"
                        + "Description: " + resultSet.getString("description");
                detailsTextArea.setText(details);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ProductDetailsViewer().setVisible(true);
            }
        });
    }
}
