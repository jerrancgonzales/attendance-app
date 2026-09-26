package quarter2;

import org.junit.Test;

public class LacsamanaProfile {
    @Test
    public void printMyProfile() {
        // --- 1. THE INPUT ---
        String myName = "Ma Katlin Ryel Lacsamana";
        String petName = "Kobe";
        String favFood = "Sinigang";
        int myAge = 16;

        // --- 2. THE OUTPUT ---
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + " and I am " + myAge + " years old.");
        System.out.println("I have a wonderful pet named " + petName + ".");
        System.out.println("If I could, I would eat " + favFood + " every single day!");
    }
}
