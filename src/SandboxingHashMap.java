import java.util.HashMap;
import java.util.Map;

public class SandboxingHashMap {
    public static void main(String[] args){
        Map exampleHashMap = new HashMap();
        System.out.println("The current size of the hashmap is: " + exampleHashMap.size());
        exampleHashMap.put("Nathan Brown" , "19 years old");
        exampleHashMap.put("Greg Brown"   , "24 years old");
        exampleHashMap.put("Lloyd Brown"  , "26 years old");
        exampleHashMap.put("Julie Brown"  , "28 years old");

        // Why does it print out in a weird order? Greg > Nathan > Lloyd > Julie? That doesn't make any sense.
        System.out.println("The current contents of the hashmap are: " + exampleHashMap);
        System.out.println("A collection view of the values for this hashmap looks like this: " + exampleHashMap.values());

        System.out.println("The current size of the hashmap is: " + exampleHashMap.size());

        System.out.println("Lloyd Brown's age: " + exampleHashMap.get("Lloyd Brown"));

        System.out.println("Does this hashmap contain the key Nathan Brown? " + exampleHashMap.containsKey("Nathan Brown"));
        System.out.println("Does this hashmap contain the value of 26? " + exampleHashMap.containsValue("26 years old"));

        System.out.println("The value of the key 'Greg Brown': " + exampleHashMap.get("Greg Brown"));

        // It returns the same output as line 17 "The current contents of the hashmap". Why? Is it based on the order in memory?
        System.out.println("Testing out the return of a keyset: " + exampleHashMap.keySet());

        // Apparently the put and replace methods do the same thing.
        System.out.println("The value of the key 'Keith Brown' before replacing it: " + exampleHashMap.get("Keith Brown"));
        exampleHashMap.put("Keith Brown", "104 years old");
        System.out.println("The value of the key 'Keith Brown' after replacing it: " + exampleHashMap.get("Keith Brown"));

        System.out.println("The value of the key 'Julie Brown' prior to replacing it: " + exampleHashMap.get("Julie Brown"));
        exampleHashMap.replace("Julie Brown", "28 years old", "64 years old");
        System.out.println("The value of the key 'Julie Brown' after replacing it: " + exampleHashMap.get("Julie Brown"));

        exampleHashMap.replace("Julie Brown", "28 years old", "64 years old");
        System.out.println("The value of the key 'Julie Brown' after replacing it: " + exampleHashMap.get("Julie Brown"));

        System.out.println("The contents of the hashmap prior to removing a key: " + exampleHashMap);
        System.out.println("Viewing just the keys using the .keySet method: " + exampleHashMap.keySet());
        exampleHashMap.remove("Mark Brown");
        System.out.println("The contents of the hashmap after removing 'Mark Brown': " + exampleHashMap);
        System.out.println("The keyset after removing a particular key: " + exampleHashMap.keySet());
        // How could I iterate through a keyset? I just want to see each key and its associated value, but in a different format.

        // See what happens when you try to retrieve a value from a partial key.
        try {
            System.out.println(exampleHashMap.get("Greg"));
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't use a partial key to find associated values.");
        }

        // See what happens when you try to retrieve a value from a hashmap as if it were an array.
        try {
            System.out.println(exampleHashMap.get(1));
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't find keys by their index. This is not an array.");
        }

        // Try to replace a value (using the put or replace methods) with a null value.
        try {
            exampleHashMap.put("Diana Brown", null);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't replace a value with null.");
        }

        // Try to replace a value (using the put or replace methods) with a negative value.
        try {
            exampleHashMap.put("Diana Brown", -17);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't replace a value with a negative integer.");
        }

        // Try to replace a value for a nonexistent key.
        try {
            exampleHashMap.put("Mom Brown", "Older Than A Dinosaur");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't replace a value for a non-existent key.");
        }


        // Try to change the value of a current key.
        try {
            exampleHashMap.put("Lloyd Brown", "99 years old");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't enter a duplicate key and value");
        }

        // Try to change a key.


//        for (int i = 0; i < myHashMap.size(); i++)

//        for (Map.Entry<KeyType, ValueType> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//
//        for (Map.Entry : myHashMap.entrySet())

    }
}
