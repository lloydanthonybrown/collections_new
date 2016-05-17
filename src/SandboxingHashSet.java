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

        // I can't seem to instantiate a Set. It says it's abstract.
//        Set breakfastSet = new Set();

        // Union: combined unique values of both Sets

        // Intersection: values in common between two Sets
        HashSet intersectedSet = new HashSet(breakfastHashSet.Intersect(lunchHashSet));
        
        // Relative Complement: values unique to one Set of two, ignoring the values in common or unique to the other Set.

        // Happy Paths - remember nulls!
        // Nasty Paths - remember nulls!

    }
}
