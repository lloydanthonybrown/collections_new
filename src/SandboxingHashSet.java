import java.util.HashSet;
import java.util.Set;

public class SandboxingHashSet {
    public static void main(String[] args){

        // Should I be using a HashSet here, or just a set?
        HashSet breakfastHashSet = new HashSet();
        breakfastHashSet.add("bacon");
        breakfastHashSet.add("eggs");
        breakfastHashSet.add("cheese");
        breakfastHashSet.add("ham");
        breakfastHashSet.add("hot cocoa");
        breakfastHashSet.add("orange juice");
        breakfastHashSet.add("cantaloupe");

        HashSet lunchHashSet = new HashSet();
        lunchHashSet.add("watermelon");
        lunchHashSet.add("chicken sandwiches");
        lunchHashSet.add("cheese");
        lunchHashSet.add("bacon");
        lunchHashSet.add("water");
        lunchHashSet.add("salad");
        lunchHashSet.add("cookies");

        // Happy Paths **********************************************************************************************
        System.out.println("Happy Paths Start Here!! **************************");
        // Union: combined unique values of both Sets
        HashSet unionizedSet = new HashSet(breakfastHashSet);
        unionizedSet.addAll(lunchHashSet);
        System.out.println("The unionizedSet contains: " + unionizedSet);

        // Intersection: values in common between two Sets
        HashSet intersectionSet = new HashSet(breakfastHashSet); // pass in the first Set to a third set
        intersectionSet.retainAll(lunchHashSet); // perform retain all on the second Set to return the unique values
        System.out.println("The intersection between breakfast and lunch is: " + intersectionSet);

        // Relative Complement: values unique to one Set of two, ignoring the values in common or unique to the other Set.
        HashSet relativeComplementSet = new HashSet(breakfastHashSet);
        relativeComplementSet.removeAll(lunchHashSet);
        System.out.println("The relative complement of lunch from breakfast is: " + relativeComplementSet);

        // Nasty Paths - remember nulls!
        System.out.println("Nasty Paths Begin Here!! *************************");
        // Add a null
        try {
            breakfastHashSet.add(null);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't add a null value to this Set.");
        }

        // Remove a null
        try {
            breakfastHashSet.remove(null);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't remove a null value from this Set.");
        }

        // Add a negative element
        try {
            breakfastHashSet.add(-17);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't add a negative value to this Set.");
        }

        // Remove a negative element
        try {
            breakfastHashSet.remove(-12);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't remove a negative value from this Set.");
        }

        // Add a duplicate element
        try {
            breakfastHashSet.add("bacon");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't add a duplicate element to this Set.");
        }

        // Remove a value that doesn't exist
        try {
            breakfastHashSet.remove("green eggs");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't a value that doesn't exist .");
        }


    }
}
