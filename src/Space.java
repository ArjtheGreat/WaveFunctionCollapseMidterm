import java.util.ArrayList;

/***

 Author: Arjun Maitra
 Assignment: Wave Function Collapse - PriorityQueue
 Date due: 12/6/2022

 String icon - stores the different icon that will be displayed on the space
 int entropy - keeps track of entropy
 ArrayList<String> possibleIcons - keeps track of possible icons a space can be

 public Space() - sets the space's icon to blank (as all will be at the start)

 public String toString() - displays the Space as A String
 ***/

public class Space {
    String icon;
    int entropy;
    ArrayList<String> possibleIcons;

    // Constructor
    public Space() {
        icon = " ";
        possibleIcons = new ArrayList<String>();
    }

    // Accessors and Mutators

    // Gets Icon
    public String getIcon() {
        return icon;
    }

    // Sets Icon
    public void setIcon(String icon) {
        this.icon = icon;
    }

    // Gets Entropy
    public int getEntropy() {
        return entropy;
    }

    // Sets Entropy
    public void setEntropy(int entropy) {
        this.entropy = entropy;
    }

    // Add Possible Icon
    public void addPossibleIcon(String in) {
        possibleIcons.add(in);
    }

    // Get Possible Icons
    public ArrayList<String> getPossibleIcons() {
        return possibleIcons;
    }

    // Display Space
    public String toString() {
        return icon;
    }
}
