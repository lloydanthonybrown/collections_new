import java.util.Iterator;
import java.util.TreeSet;

public class SandboxingTreeSet {
    public static void main(String[] args){
        TreeSet multipleCharTypeTreeSet= new TreeSet();

// Happy Paths
        System.out.println("HAPPY PATHS");

// Adding elements of different types to my TreeSet
        multipleCharTypeTreeSet.add("Elmo");
        multipleCharTypeTreeSet.add("1");
        multipleCharTypeTreeSet.add("$");
        multipleCharTypeTreeSet.add("!");
        multipleCharTypeTreeSet.add("_");
        multipleCharTypeTreeSet.add("Big Bird");
        multipleCharTypeTreeSet.add("wascally wabbit");
        multipleCharTypeTreeSet.add("64");
        multipleCharTypeTreeSet.add("Sergeant Tibbs");
        multipleCharTypeTreeSet.add("Cruella De Ville");
        multipleCharTypeTreeSet.add("The Rockies");
        multipleCharTypeTreeSet.add("cheese");
        multipleCharTypeTreeSet.add("shooting stars");
        multipleCharTypeTreeSet.add("Emma Stone");

// Show what's currently in the TreeSet
        System.out.println(multipleCharTypeTreeSet);

// The ceiling method
        // This really displays the element that would be after the one I'm giving it, giving me an idea of where it
        // would end up. That's cool.
        System.out.println("What comes after bacon? (ceiling): " + multipleCharTypeTreeSet.ceiling("bacon"));

// The floor method
        System.out.println("What comes before bacon? (floor): " + multipleCharTypeTreeSet.floor("bacon"));

// Comparator method
        System.out.println("What comparator am I using? ");
        if (multipleCharTypeTreeSet.comparator() == null) {
            System.out.println("I'm using the default comparator");
        }
        else
            System.out.println("The comparator I'm using is: " + multipleCharTypeTreeSet.comparator());

// Boolean contains
        System.out.println("Does my TreeSet contain bacon? " + multipleCharTypeTreeSet.contains("bacon"));

// Descending Iterator
        Iterator mySadIterator;
        mySadIterator = multipleCharTypeTreeSet.descendingIterator();
        System.out.println("My TreeSet values: ");
        while (mySadIterator.hasNext())
            System.out.printf(mySadIterator.next() + " "); //Why does this need a string?

// first
        System.out.println("Results of the 'first' method: " + multipleCharTypeTreeSet.first());
// last
        System.out.println("Results of the 'last' method: " + multipleCharTypeTreeSet.last());
// higher
        System.out.println("Results of the 'higher' method: " + multipleCharTypeTreeSet.higher("bacon"));
// lower
        System.out.println("Results of the 'lower' method: " + multipleCharTypeTreeSet.lower("bacon"));
// pollFirst
        System.out.println("Contents of the TreeSet prior to using the 'pollFirst' method: " + multipleCharTypeTreeSet);
        System.out.println("Results of the 'pollFirst' method: " + multipleCharTypeTreeSet.pollFirst());
// pollLast
        System.out.println("Contents of the TreeSet prior to using the 'pollLast' method: " + multipleCharTypeTreeSet);
        System.out.println("Results of the 'pollLast' method: " + multipleCharTypeTreeSet.pollLast());
// descendingSet
        System.out.println("Results of the 'descendingSet' method: " + multipleCharTypeTreeSet.descendingSet());
// isEmpty
        System.out.println("Results of the 'isEmpty' method: " + multipleCharTypeTreeSet.isEmpty());
// iterator
        // This one still isn't working quite right
        System.out.println("Results of the 'iterator' method: " + multipleCharTypeTreeSet.iterator());
// remove
        System.out.println("Contents of the TreeSet prior to removing Elmo: " + multipleCharTypeTreeSet);
        System.out.println("Results of the 'remove' method: " + multipleCharTypeTreeSet.remove("Elmo")); // I didn't realize this, but this is a boolean method.
        System.out.println("Contents of the TreeSet after removing Elmo: " + multipleCharTypeTreeSet);
// size
        System.out.println("Results of the 'size' method: " + multipleCharTypeTreeSet.size());
// subset
        System.out.println("Results of the 'subset' method, using 64 and Cruella De Ville: " + multipleCharTypeTreeSet.subSet("64","Cruella De Ville"));
// headset
        System.out.println("Contents of the TreeSet for using the 'headset' and 'tailset' methods: " + multipleCharTypeTreeSet);
        System.out.println("Results of the 'headset' method, using 'Big Bird': " + multipleCharTypeTreeSet.headSet("Big Bird"));
// tailset
        System.out.println("Results of the 'tailset' method, using '1': " + multipleCharTypeTreeSet.tailSet("1"));

// Nasty Paths
        System.out.println("NASTY PATHS");

// Using floor method on a value that doesn't exist
//
//
//
// Using floor method on a value that doesn't exist
// Using floor method on a value that doesn't exist
// Using floor method on a value that doesn't exist
// Using floor method on a value that doesn't exist
// Using floor method on a value that doesn't exist

    }
}
