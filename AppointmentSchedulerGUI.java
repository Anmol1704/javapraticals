import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AppointmentSchedulerGUI extends JFrame {
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private DefaultTableModel tableModel;
    private JTextField dateField, timeField, descriptionField;
    private JButton scheduleButton, updateButton, deleteButton;

    public AppointmentSchedulerGUI() {
        setTitle("Appointment Scheduler");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Date:"));
        dateField = new JTextField();
        inputPanel.add(dateField);
        inputPanel.add(new JLabel("Time:"));
        timeField = new JTextField();
        inputPanel.add(timeField);
        inputPanel.add(new JLabel("Description:"));
        descriptionField = new JTextField();
        inputPanel.add(descriptionField);

        scheduleButton = new JButton("Schedule");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(scheduleButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        scheduleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scheduleAppointment();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateAppointment();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteAppointment();
            }
        });

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Date");
        tableModel.addColumn("Time");
        tableModel.addColumn("Description");

        JTable appointmentTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(appointmentTable);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void scheduleAppointment() {
        String date = dateField.getText();
        String time = timeField.getText();
        String description = descriptionField.getText();

        Appointment appointment = new Appointment(date, time, description);
        appointments.add(appointment);
        updateTable();
    }

    private void updateAppointment() {
        int selectedRow = getSelectedRowIndex();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select an appointment to update.");
            return;
        }

        String date = dateField.getText();
        String time = timeField.getText();
        String description = descriptionField.getText();

        Appointment appointment = appointments.get(selectedRow);
        appointment.setDate(date);
        appointment.setTime(time);
        appointment.setDescription(description);
        updateTable();
    }

    private void deleteAppointment() {
        int selectedRow = getSelectedRowIndex();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select an appointment to delete.");
            return;
        }
        appointments.remove(selectedRow);
        updateTable();
    }

    private int getSelectedRowIndex() {
        JTable appointmentTable = (JTable) ((JScrollPane) getContentPane().getComponent(1)).getViewport().getComponent(0);
        return appointmentTable.getSelectedRow();
    }

    private void updateTable() {
        tableModel.setRowCount(0);
        for (Appointment appointment : appointments) {
            tableModel.addRow(new Object[]{appointment.getDate(), appointment.getTime(), appointment.getDescription()});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AppointmentSchedulerGUI().setVisible(true);
            }
        });
    }
}

class Appointment {
    private String date;
    private String time;
    private String description;

    public Appointment(String date, String time, String description) {
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
