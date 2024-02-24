class Outer {
    int outer_x = 10;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    class Inner {
        int y = 10; // y is local to Inner

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

    void showy() {
        // Error: y not known here!
        // To access y, you need an instance of Inner class.
        // If you want to access y from within Outer, you need to create an instance of Inner.
        Inner inner = new Inner();
        System.out.println(inner.y);
    }
}

class InnerClassDemo2 {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}