class BasicTopics {
    public static void main(String[] args) {

        // 🔹 Data Types + Variables
        int x = 10;
        double y = 20.5;
        char ch = 'A';
        boolean flag = true;

        System.out.println("Data Types:");
        System.out.println(x + " " + y + " " + ch + " " + flag);

        // 🔹 Operators
        int sum = x + 5;
        int mul = x * 2;
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + mul);

        // 🔹 Relational + Logical
        System.out.println(x > 5);        // true
        System.out.println(x > 5 && y > 10); // true

        // 🔹 Decision Making (if-else)
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is small");
        }

        // 🔹 Switch
        int day = 1;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Other Day");
        }

        // 🔹 For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // 🔹 While Loop
        System.out.println("While Loop:");
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }

        // 🔹 Do-While Loop
        System.out.println("Do-While Loop:");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 3);

        // 🔹 Jump Statements
        System.out.println("Break & Continue:");
        for (int k = 0; k < 5; k++) {

            if (k == 3) break;       // loop stop
            if (k == 1) continue;   // skip 1

            System.out.println(k);
        }

        // 🔹 Return (example)
        System.out.println("Return Example:");
        System.out.println(add(5, 10));
    }

    // Method for return
    static int add(int a, int b) {
        return a + b;
    }
}