import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Put in your 5 nouns.");
        String noun1 = read.nextLine();
        String noun2 = read.nextLine();
        String noun3 = read.nextLine();
        String noun4 = read.nextLine();
        String noun5 = read.nextLine();

        System.out.println("Put in a Plural Noun");
        String pluralNoun = read.nextLine();

        System.out.println("Put your verb, then a verb ending with ED, then a verb ending with ING.");
        String verb = read.nextLine();
        String verbED = read.nextLine();
        String verbING = read.nextLine();

        System.out.println("Put a place, occupation, and an emotion.");
        String place = read.nextLine();
        String occupation = read.nextLine();
        String emotion = read.nextLine();


        System.out.println("It was during the battle of " + noun1 + " when I was running through a " + noun2 + " when a " + noun3 + " went off right next to my platoon. Our " + occupation + " yelled for us to " + verb + " to the nearest " + place + " we could find. When we got to the " + place + " we " + verbED + " to start a fire. As we were starting the fire the enemy saw the " + noun4 + " from the fire and started " + verbING + " " + pluralNoun + " at us. we all quickly ducked behind the " + noun5 + " at the " + place + " and returned fire. we quickly eliminated the enemy and were " + emotion + " that we had won the battle.");

    }

}