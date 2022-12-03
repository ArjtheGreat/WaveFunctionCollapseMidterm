/***

 Author: Arjun Maitra
 Assignment: Wave Function Collapse - Main
 Date due: 12/6/2022
 ***/

public class Main {
    public static void main(String[] args) {

        // Quantum World Setup
        QuantumRealm quantumRealm = new QuantumRealm(4, 4);
        quantumRealm.calculateEntropy();
        quantumRealm.collapseRealm();
        quantumRealm.displayRealm();


    }
}
