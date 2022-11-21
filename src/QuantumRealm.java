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

 public void displayRealm() - iterates through realm and prints out current space
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
                    realm[i][j].setIcon("x");
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

    // Prints Out Realm
    public void displayRealm() {
        for(int i = 0; i<realm.length; i++) {
            for(int j = 0; j<realm[0].length; j++) {
                System.out.print(realm[i][j] + " ");
            }
            System.out.println();
        }
    }
}
