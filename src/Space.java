/***

 Author: Arjun Maitra
 Assignment: Wave Function Collapse - PriorityQueue
 Date due: 12/6/2022

 String icon - stores the different icon that will be displayed on the space
 public Space() - sets the space's icon to blank (as all will be at the start)

 public String toString() - displays the Space as A String
 ***/

public class Space {
    String icon;

    // Constructor
    public Space() {
        icon = " ";
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

    // Display Space
    public String toString() {
        return icon;
    }
}
