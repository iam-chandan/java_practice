package collections.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Employee {
    public static void main(String[] args) {
        HashSet<String> emplist = new HashSet<String >();

        emplist.add("anil");
        emplist.add("madhu");
        emplist.add("subham");
        emplist.add("saurav");
        emplist.add("tusar");
        emplist.add("deepak");
        emplist.add("chinmay");
        emplist.add("swarna");
        emplist.add("deepak");

        System.out.println(emplist);
        System.out.println("employee size : " + emplist.size());

        HashSet<String> emplist2 = new HashSet<String>();

        emplist2.add("siva");
        emplist2.add("raj");
        emplist2.add("rajesh");
        System.out.println(emplist2);

        // addAll(collection) : Adds all elements from the given collection.
        emplist.addAll(emplist2);

        System.out.println(emplist);
        System.out.println("employee size : " + emplist.size());

        //contains(element) : Checks if the set contains the specified element.
        System.out.println("Does the Set contains 'raj'? " + emplist.contains("raj"));

        //containsAll(collection) : Checks if the set contains all elements from the given collection.
        System.out.println("Does emplist conatin emplist2 : " + emplist.containsAll(emplist2));

        //hashCode() : Returns the hash code of the set.
        System.out.println("HashCode value: " + emplist.hashCode());
        System.out.println("HashCode value: " + emplist2.hashCode());

        //isEmpty() : This method is used to check whether the set is empty or not.
        System.out.println("emplist is empty : " + emplist.isEmpty()); // true/false
        System.out.println("emplist2 is empty : " + emplist2.isEmpty()); // true/false

        // Creating an iterator
        Iterator value = emplist.iterator();

        // Displaying the values after iterating through the iterator
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        // remove(element) : Removing elements using remove() method
        emplist.remove("raj");
        emplist.remove("rajesh");

        // Displaying the Set after removal
        System.out.println("Set after removing elements: " + emplist); // [madhu, swarna, siva, deepak, chinmay, subham, tusar, saurav, anil]
        System.out.println("Set after removing elements: " + emplist.remove("saurav")); // true

        // removeAll(collection) : Remove all elements of emplist2 from s1
        emplist.removeAll(emplist2);
        System.out.println("emplist after removeAll(): " + emplist);


        // toArray() : This method is used to form an array of the same elements as that of the Set.
        // Converting the Set to an Object array
        Object[] arr = emplist.toArray();

        System.out.println("The Array is:");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }


        // Retain only the elements in
        // emplist that are also in emplist2
        // retainAll(collection) : Retains only elements present in the given collection.
        emplist.retainAll(emplist2);
        System.out.println("Modified emplist 1 after retainAll: " + emplist);

        // clear() : Removes all elements from the set.
        // Clearing the Set using clear() method
        emplist.clear();

        // Displaying the final Set after clearing;
        System.out.println("The final set: " + emplist);
    }
}
