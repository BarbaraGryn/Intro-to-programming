package org.example;

public class JavaTypes {
    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println("Java types example");
        System.out.println("Numbers first");

        // variable - place for storing some content
        // has type and value
        // int - integer number
        // age - name of variable
        int age;
        age = 18;
        age = 20;
        System.out.println("Current age is: " + age);
        age = 25;
        System.out.println("Current age is: " + age);
        int age2 = 19;
        int age3 = 0;
        System.out.println("Current age is: " + age3);

        // double used for floating numbers
        double age5 = 4.5;
        System.out.println("Age5 is: " + age5);

        // int class = 5;  ei lase teha, sest class on miskit muud

        System.out.println("Let's meet number type");
        System.out.println("int type");
        System.out.println("Smallest int is: " + Integer.MIN_VALUE);
        System.out.println("Biggest int is: " + Integer.MAX_VALUE);

        System.out.println("long type");
        long longAge = 5;
        System.out.println("Smallest long is: " + Long.MIN_VALUE);
        System.out.println("Biggest long is: " + Long.MAX_VALUE);

        System.out.println();

        System.out.println("byte type");
        byte byteAge = 5;
        System.out.println("Smallest byte is: " + Byte.MIN_VALUE);
        System.out.println("Biggest byte is: " + Byte.MAX_VALUE);

        System.out.println();

        System.out.println("short type");
        short shortAge= 5;
        System.out.println("Smallest short is: " + Short.MIN_VALUE);
        System.out.println("Smallest short is: " + Short.MAX_VALUE);

    }
}
