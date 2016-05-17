import java.util.ArrayList;
import java.util.Scanner;

public class SandboxingArrayList {
    public static void main(String[] args){

//        Scanner userInput = new Scanner(System.in);
//        int anInteger;
//        int count = 0;
        ArrayList<Integer> myIntegerArrayList = new ArrayList<Integer>();

        // Play with an integer ArrayList
        System.out.println("The current size of the array: " + myIntegerArrayList.size());
//        System.out.println("Enter 5 integers.");
//        for (int i=0; i<5; i++){
//            System.out.println("Integer " + (count + 1) + ":");
//            anInteger = userInput.nextInt();
//            // Add the user input to the ArrayList
//            myIntegerArrayList.add(anInteger);
//            System.out.println("The size of the array after adding this integer: " + myIntegerArrayList.size());
//            count ++;

    myIntegerArrayList.add(12);
    myIntegerArrayList.add(17);
    myIntegerArrayList.add(4);
    myIntegerArrayList.add(10);
    myIntegerArrayList.add(11);
    myIntegerArrayList.add(24);

        System.out.println("The ArrayList contains this: " + myIntegerArrayList);
        System.out.println("The ending size of the array: " + myIntegerArrayList.size());

        // Play with a string ArrayList
        System.out.println("The value of the first element before changing it manually: " + myIntegerArrayList.get(0));
        myIntegerArrayList.set(0,42);
        System.out.println("The value of the first element after changing it manually: " + myIntegerArrayList.get(0));

        // For some reason, it doesn't recognize "myListIterator" as being valid. Troubleshoot this later.
        // Play with a list iterator
//        for (int i=0; myListIterator.hasNext(); i++){
//            System.out.println("The value for this index is: " + myIntegerArrayList.get(i));
//        }

        // Play with removing a specific element
        System.out.println("The size of the array before removing the third element: " + myIntegerArrayList.size());
//        for(int i=0; i<myIntegerArrayList.size(); i++){
//            System.out.println(myIntegerArrayList(i));
//        }
        for (Integer item : myIntegerArrayList){
            System.out.print(item + " ");
        }
        System.out.println("");
        System.out.println("The value of the third element is: " + myIntegerArrayList.get(2));
        myIntegerArrayList.remove(2);
        System.out.println("The value of the third element is: " + myIntegerArrayList.get(2));
        System.out.println("The size of the array after removing the third element: " + myIntegerArrayList.size());

        // Try inserting something in a negative index.
        // Result: gives me an IndexOutOfBoundsException, as it should.
        System.out.println("Trying to add something to a negative index.");
        try {
            myIntegerArrayList.add(-1, 99);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't add an integer an out-of-bounds index.");
        }

        // Try to insert something in a positive index, try to override it with another value (does it shift it, replace it?)
        // Result: it just replaces the value at that index.
        System.out.println("Trying to add something to a positive index to evaluate behavior.");
        System.out.println("What the array currently looks like: " + myIntegerArrayList);
        myIntegerArrayList.set(0, 25);
        System.out.println("What the array currently looks like: " + myIntegerArrayList);
        myIntegerArrayList.set(0, 87);
        System.out.println("What the array currently looks like: " + myIntegerArrayList);

        // insert at a negative index
        // Result: gives me an indexoutofboundsexception.
        try {
            myIntegerArrayList.set(-1, 43);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't set a negative index in an ArrayList.");
        }

        // insert at an index way past the end
        // Result: returns an indexoutofboundsexception.
        System.out.println("Contents of the ArrayList: " + myIntegerArrayList);
        try {
            myIntegerArrayList.set(500, 200);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't add an integer on the 500th index.");
        }
        System.out.println("Contents of the ArrayList: " + myIntegerArrayList);

        // Get for negative index.
        // Result: returns an indexoutofboundsexception.
        try {
            myIntegerArrayList.get(-4);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't retrieve an integer from a negative index.");
        }

        // Get for index way past the end of the ArrayList
        // Result: returns an indexoutofboundsexception.
        try {
            myIntegerArrayList.get(200);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("The 200th index is not valid in this ArrayList yet.");
        }

        // what about remove for these two cases?
        // Result: returns an indexoutofboundsexception.
        try {
            myIntegerArrayList.remove(-17);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't remove a negative index.");
        }

        // Try to remove an index that is way out of bounds.
        // Result: returns an indexoutofboundsexception.
        try {
            myIntegerArrayList.remove(435);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't remove an integer from an index so far beyond the current scope of the ArrayList.");
        }

        // Try to create an ArrayList with a negative size
//        System.out.println("Trying to create an Arraylist with a negative size.");
//        try{
//            ArrayList myStringArrayList = new ArrayList(-4);
//        }
//        catch (Exception e){
//            e.printStackTrace();
        // This gives me errors, saying that it can't access the myStringArrayList in the try block, for some reason.
//            System.out.println("The ArrayList contains this: " + myStringArrayList);
//            System.out.println("The ending size of the array: " + myStringArrayList.size());
//        }

    }
}
