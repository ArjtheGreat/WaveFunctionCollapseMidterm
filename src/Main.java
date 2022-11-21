/***

 Author: Arjun Maitra
 Assignment: Wave Function Collapse - Main
 Date due: 12/6/2022
 ***/

public class Main {
    public static void main(String[] args) {

        // Quantum World Setup
        QuantumRealm quantumRealm = new QuantumRealm(2, 2);
        quantumRealm.displayRealm();

        // Keeps Track of Entropy For All Spaces
        PriorityQueue entropyStorage = new PriorityQueue(quantumRealm.getRealm().length*quantumRealm.getRealm()[0].length);
    }
}
