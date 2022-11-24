import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/***

 Author: Arjun Maitra
 Assignment: Wave Function Collapse - QuantumRealm
 Date due: 12/6/2022

 Space[][] realm - holds all the different spaces
 public QuantumRealm(int x, int y) - user inputs the x and y dimensions of the realm in the constructor, which initializes realm.
 create a random number from 0 to x-1, and a random number from 0 to y-1, to act as your starting point.
 iterate through realm and set realm[i][j] = to a new Space() default is a " " icon,
 if i and j is your starting point then set it equal to a certain symbol

 public Space[][] getRealm() - returns realm
 public void setRealm(Space[][] realm) - allows you to adjust realm

 public void calculateEntropy() - iterate through realm, check if the space is not blank, if so set its entropy to 0 because it is already set.
 if it is blank, then create a boolean array of size 11, each index representing a possible character.
 go through the 4 surrounding squares, and if a certain character is not allowed, set it false in the array.
 the number of trues in the array is the entropy
 public void collapseRealm() - create a new priority queue which will hold all the spaces. add all spaces with entropy greater than 0 to the priority queue.
 iterate through the priority queue, remove the next space, and then create a random int and find a random possibleCharacter and set it to that spaces icon

 public void displayRealm() - iterates through realm and prints out current space
 public String intToIcon(int x) - using a massive switch statement, checking the value of x and assigning it the corresponding character
 ***/

public class QuantumRealm {
    Space[][] realm;

    // Constructor
    public QuantumRealm(int x, int y) {

        // Initializing Array
        realm = new Space[x][y];

        // Generating Starting Point
        Random rand = new Random();
        int startingX = rand.nextInt((x-1) + 1);
        int startingY = rand.nextInt((x-1) + 1);

        // Setting Starting Point to Certain Icon
        for(int i = 0; i<realm.length; i++) {
            for(int j = 0; j<realm[0].length; j++) {
                realm[i][j] = new Space();
                if(i == startingX && j == startingY) {
                    realm[i][j].setIcon("┌");
                }
            }
        }
    }

    // Accessors and Mutators

    // Gets Realm
    public Space[][] getRealm() {
        return realm;
    }

    // Sets Realm
    public void setRealm(Space[][] realm) {
        this.realm = realm;
    }

    // Calculate Entropy
    public void calculateEntropy() {
        // Iterate Through Realm
        for(int i = 0; i<realm.length; i++) {
            for(int j = 0; j<realm[0].length; j++) {
                // Space Is Empty = No Entropy
                if(!realm[i][j].getIcon().equals(" ")) {
                    realm[i][j].setEntropy(0);
                }
                else {
                    // Array for possible characters
                    boolean[] possibleChars = new boolean[11];
                    Arrays.fill(possibleChars, true);

                    // Check Left
                    if(i - 1 > -1) {
                        // Left Case for ┌
                        if(realm[i-1][j].getIcon().equals("┌")) {
                            possibleChars[3] = false;
                            possibleChars[4] = false;
                            possibleChars[6] = false;
                        }
                        // Left Case for ┐
                        if(realm[i-1][j].getIcon().equals("┐")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                            possibleChars[5] = false;
                        }
                        // Left Case for ┘
                        if(realm[i-1][j].getIcon().equals("┘")) {
                            possibleChars[0] = false;
                            possibleChars[2] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Left Case for └
                        if(realm[i-1][j].getIcon().equals("└")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Left Case for ─
                        if(realm[i-1][j].getIcon().equals("─")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Left Case for ─
                        if(realm[i-1][j].getIcon().equals("│")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }

                        // Left Case for ├
                        if(realm[i-1][j].getIcon().equals("├")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Left Case for ┤
                        if(realm[i-1][j].getIcon().equals("┤")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Left Case for ┬
                        if(realm[i-1][j].getIcon().equals("┬")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Left Case for ┴
                        if(realm[i-1][j].getIcon().equals("┴")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Left Case for ┼
                        if(realm[i-1][j].getIcon().equals("┼")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                    }
                    // Check Right
                    if(i + 1 < realm.length) {
                        // Right Case for ┌
                        if(realm[i+1][j].getIcon().equals("┌")) {
                            possibleChars[3] = false;
                            possibleChars[4] = false;
                            possibleChars[6] = false;
                        }
                        // Right Case for ┐
                        if(realm[i+1][j].getIcon().equals("┐")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                            possibleChars[5] = false;
                        }
                        // Right Case for ┘
                        if(realm[i+1][j].getIcon().equals("┘")) {
                            possibleChars[0] = false;
                            possibleChars[2] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Right Case for └
                        if(realm[i+1][j].getIcon().equals("└")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Right Case for ─
                        if(realm[i+1][j].getIcon().equals("─")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Right Case for ─
                        if(realm[i+1][j].getIcon().equals("│")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }

                        // Right Case for ├
                        if(realm[i+1][j].getIcon().equals("├")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Right Case for ┤
                        if(realm[i+1][j].getIcon().equals("┤")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Right Case for ┬
                        if(realm[i+1][j].getIcon().equals("┬")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Right Case for ┴
                        if(realm[i+1][j].getIcon().equals("┴")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Right Case for ┼
                        if(realm[i+1][j].getIcon().equals("┼")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                    }
                    // Check Bottom
                    if(j - 1 > -1) {
                        // Bottom Case for ┌
                        if(realm[i][j-1].getIcon().equals("┌")) {
                            possibleChars[3] = false;
                            possibleChars[4] = false;
                            possibleChars[6] = false;
                        }
                        // Bottom Case for ┐
                        if(realm[i][j-1].getIcon().equals("┐")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                            possibleChars[5] = false;
                        }
                        // Bottom Case for ┘
                        if(realm[i][j-1].getIcon().equals("┘")) {
                            possibleChars[0] = false;
                            possibleChars[2] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Bottom Case for └
                        if(realm[i][j-1].getIcon().equals("└")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Bottom Case for ─
                        if(realm[i][j-1].getIcon().equals("─")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Bottom Case for ─
                        if(realm[i][j-1].getIcon().equals("│")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }

                        // Bottom Case for ├
                        if(realm[i][j-1].getIcon().equals("├")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Bottom Case for ┤
                        if(realm[i][j-1].getIcon().equals("┤")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Bottom Case for ┬
                        if(realm[i][j-1].getIcon().equals("┬")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Bottom Case for ┴
                        if(realm[i][j-1].getIcon().equals("┴")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Bottom Case for ┼
                        if(realm[i][j-1].getIcon().equals("┼")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                    }
                    // Check Top
                    if(j + 1 < realm[0].length) {
                        // Top Case for ┌
                        if(realm[i][j+1].getIcon().equals("┌")) {
                            possibleChars[3] = false;
                            possibleChars[4] = false;
                            possibleChars[6] = false;
                        }
                        // Top Case for ┐
                        if(realm[i][j+1].getIcon().equals("┐")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                            possibleChars[5] = false;
                        }
                        // Top Case for ┘
                        if(realm[i][j+1].getIcon().equals("┘")) {
                            possibleChars[0] = false;
                            possibleChars[2] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Top Case for └
                        if(realm[i][j+1].getIcon().equals("└")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Top Case for ─
                        if(realm[i][j+1].getIcon().equals("─")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Top Case for ─
                        if(realm[i][j+1].getIcon().equals("│")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }

                        // Top Case for ├
                        if(realm[i][j+1].getIcon().equals("├")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Top Case for ┤
                        if(realm[i][j+1].getIcon().equals("┤")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Top Case for ┬
                        if(realm[i][j+1].getIcon().equals("┬")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Top Case for ┴
                        if(realm[i][j+1].getIcon().equals("┴")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                        // Top Case for ┼
                        if(realm[i][j+1].getIcon().equals("┼")) {
                            possibleChars[0] = false;
                            possibleChars[3] = false;
                            possibleChars[5] = false;
                            possibleChars[6] = false;
                        }
                    }

                    // calculate entropy (# of true characters) using some fancy frequency stuff
                    for(int x = 0; x<possibleChars.length; x++) {

                        // Is Possible Space
                        if(possibleChars[x]) {
                            // sets entropy
                            realm[i][j].setEntropy(realm[i][j].getEntropy()+1);
                            // adds current char to possible chars
                            realm[i][j].addPossibleIcon(intToIcon(x));
                        }
                    }
                }
            }
        }
    }

    // Collapse Realm
    public void collapseRealm() {
        // Keeps Track of Entropy For All Spaces
        PriorityQueue entropyStorage = new PriorityQueue(getRealm().length*getRealm()[0].length);

        // Add all Elligble spaces
        for(int i = 0; i<realm.length; i++) {
            for(int j = 0; j<realm[0].length; j++) {
                if(realm[i][j].getEntropy() > 0) { // Not Already Filled
                    entropyStorage.insert(realm[i][j]);
                }
            }
        }

        // Iterates through entropy storage priority queue
        for(int i = 0; i<entropyStorage.amtOfItems; i++) {

            // Removes Top
            Space removedSpace = entropyStorage.remove();

            // Finds Random Possible Elligible Character and sets it as icon
            Random rand = new Random();
            int index = rand.nextInt(removedSpace.getPossibleIcons().size());
            removedSpace.setIcon(removedSpace.getPossibleIcons().get(index));
        }
    }

    // Prints Out Realm
    public void displayRealm() {
        for(int i = 0; i<realm.length; i++) {
            for(int j = 0; j<realm[0].length; j++) {
                System.out.print(realm[i][j] + " ");
            }
            System.out.println();
        }
    }

    // converts int to icon
    public String intToIcon(int x) {
        switch (x) {
            case(0):
                return "┌";
            case(1):
                return "┐";
            case(2):
                return "┘";
            case(3):
                return "└";
            case(4):
                return "─";
            case(5):
                return "│";
            case(6):
                return "├";
            case(7):
                return "┤";
            case(8):
                return "┬";
            case(9):
                return "┴";
            case(10):
                return "┼";
        }
        return "";
    }

}
