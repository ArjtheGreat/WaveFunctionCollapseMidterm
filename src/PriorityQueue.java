
/***

Author: Arjun Maitra
Assignment: Wave Function Collapse - PriorityQueue
Date due: 12/6/2022

isEmpty() - iterate through the array, if a value is not 0 (default int value), then return false, else return true
isFull() - iterate through array, if a value is 0 then return false, else return true
insert(Space insertSpace) - set insertInt = insertSpace.getEntropy set iterative var. check if the queue is full. if so, nothing can be added.
                        then check if the queue is empty, if so, insert the element in the first spot in queue
                        else iterate through the array from the back using your iterative var, if insertInt > queue[iterative var]. else break b/c index has been found
                        if above statement is true, set the next open spot = element of queue at current iteration. this shifts it over
                        finally, set queue[iterative var + 1] = insertInt, and amtOfItems++
                        This algorithim is O(n) because it iterates through the queue of size n only once
remove() - subtract 1 from amtOfItems, which moves the queue down 1, then return queue[amtOfItems], which gets the old last element in the array
peekMinimum() - return queue[amtOfItems-1], which returns the last element in the queue (we do -1 since length starts at 1 but indexes start at 0)

 */

public class PriorityQueue {
    Space[] queue;
    int amtOfItems = 0;

    public PriorityQueue(int size) {
        queue = new Space[size];
        amtOfItems = 0;
    }

    // Checks if Queue Is Empty
    public boolean isEmpty() {
        return amtOfItems==0;
    }

    // Checks if Queue Is Full
    public boolean isFull() {
        return amtOfItems==queue.length;
    }

    // Checks if Queue Is Full
    public void insert(Space insertSpace) {
        int insertInt = insertSpace.getEntropy();
        int count = 0;

        // Special Case - Queue is Full
        if(isFull()) {
            System.out.println("Queue Is Full");
        }

        // Special Case - Queue is Empty
        else if (isEmpty()) {
            queue[0] = insertSpace;
            amtOfItems++;
        }

        // Normal Case
        else {

            // Iterate through Queue from Back
            for(count = amtOfItems-1; count>-1; count--) {
                if(insertInt > queue[count].getEntropy()){
                    queue[count+1] = queue[count];
                }
                else {
                    break;
                }
            }
            queue[count+1] = insertSpace;
            amtOfItems++;
        }
    }

    // Remove Last Element
    public Space remove() {

        // Special Case for Queue Is Empty
        if(isEmpty()) {
            return null;
        }
        amtOfItems--; // move down queue
        return queue[amtOfItems];
    }

    // Get Minimum Peek
    public Space peekMinimum() {
        return queue[amtOfItems-1];
    }

    // Print queue

    public String toString() {
        String output = "";
        for(int i = 0; i<queue.length-1; i++) {
            output+=(queue[i] + " | ");
        }
        output+=(queue[queue.length-1]);
        return output;
    }



}
