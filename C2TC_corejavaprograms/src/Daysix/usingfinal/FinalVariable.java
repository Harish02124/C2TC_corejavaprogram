// Program to demonstrate final Variable
package Daysix.usingfinal;

public class FinalVariable {

    // Final instance variable must be initialized
    final int x = 100;

    // Declare a static blank final variable
    final static int Y;

    // Declare & initialize static final variable
    final static int Z = 10;

    // Instance method
    void change() {
        // x = 30; // ❌ Not allowed: final variable cannot be reassigned
        // Y = 200; // ❌ Not allowed: final static variable cannot be reassigned
        System.out.println("Cannot change final variables.");
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + ", Z=" + Z + "]";
    }

    // Static block to initialize final static variable Y
    static {
        Y = 20;
        // Z = 100; // ❌ Not allowed: Z is already initialized above
        System.out.println("Value of Y: " + Y);
    }
}
