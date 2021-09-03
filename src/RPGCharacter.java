import javax.swing.JOptionPane;
public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to the game! Here, you will fight and explore around you, so do whatever you want! We dont care!");

        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("Enter your characters first name. ");
        lastName = JOptionPane.showInputDialog("Enter your character last name.");

        JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastName + " to the game!");

        int strength, dexterity, speed, defense, luck, smarts;
        int damage, mana, durability;

        strength = Integer.parseInt(JOptionPane.showInputDialog("What is their strength?"));
        dexterity = Integer.parseInt(JOptionPane.showInputDialog("What is their dexterity?"));
        speed = Integer.parseInt(JOptionPane.showInputDialog("What is their speed?"));
        defense = Integer.parseInt(JOptionPane.showInputDialog("What is their defense?"));
        luck = Integer.parseInt(JOptionPane.showInputDialog("What is their luck?"));


        JOptionPane.showMessageDialog(null, "Your strength is " + strength);
        JOptionPane.showMessageDialog(null, "Your dexterity is " + dexterity);
        JOptionPane.showMessageDialog(null, "Your speed is " + speed);
        JOptionPane.showMessageDialog(null, "Your defense is " + defense);
        JOptionPane.showMessageDialog(null, "Your luck is " + luck);



        System.exit(0);



    }


}
