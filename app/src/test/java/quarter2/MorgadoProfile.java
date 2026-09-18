package quarter2;

import org.junit.Test;
public class MorgadoProfile {
    @Test
    public void printMyProfile() {

        String myName = "Joshua Morgado";
        String petName = "Wakanda";
        String favFood = "Chicken";
        int myAge = 17;

        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is" + myName + "and I am" + myAge + "years old");
        System.out.println("I have a cutie pet named" + petName + ".");
        System.out.println("If I could, I would" + favFood + "every single day!");
    }
}