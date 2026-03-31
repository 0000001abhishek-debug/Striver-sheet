abstract class Person {

    // Abstract Method
    abstract void showRole(String role);

    // Final Method
    final void finalMethod() {
        System.out.println("This is a final method");
    }
}

class Demo extends Person {

    // Instance Method (public)
    public void greet(String name) {
        System.out.println("Hello " + name);
    }

    // Static Method
    static int add(int a, int b) {
        return a + b;
    }

    // Private Method
    private void secret() {
        System.out.println("This is private method");
    }

    // Protected Method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Varargs Method
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // Method Call Stack Demo
    static void A() {
        System.out.println("Inside A");
        B();
    }

    static void B() {
        System.out.println("Inside B");
        C();
    }

    static void C() {
        System.out.println("Inside C");
    }

    // Implement abstract method
    @Override
    void showRole(String role) {
        System.out.println("Role: " + role);
    }

    public static void main(String[] args) {

        // Object creation
        Demo obj = new Demo();

        // Instance method
        obj.greet("Abhishek");

        // Static method
        int result = Demo.add(10, 20);
        System.out.println("Sum = " + result);

        // Varargs
        System.out.println("Varargs Sum = " + sum(1, 2, 3, 4));

        // Predefined method
        System.out.println("Random: " + Math.random());

        // Access modifier methods
        obj.secret();
        obj.protectedMethod();

        // Abstract + Final
        obj.showRole("Student");
        obj.finalMethod();

        // Command Line Argument
        if (args.length > 0) {
            System.out.println("Command Line Arg: " + args[0]);
        }

        // Call Stack Demo
        A();
    }
}