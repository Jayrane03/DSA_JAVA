import java.util.ArrayList;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        // Create a arraylist of type integers
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add elements     
        list.add(0);
        list.add(2);
        list.add(5);
        System.out.println(list);
        // For type String 
        list2.add(0, "My");
        list2.add(1, "name");
        list2.add(2, "is");
        list2.add(3, "Jay");
        System.out.println(list2);




        // get the elemenst 
        System.out.println(list.get(2));

        // add element in between 
        list.add(1, 4);
        System.out.println(list);

        // set the element in the list 
        list.set(0, 10);
        System.out.println("After setting the 0th index to 10 the new list is  : "+list);
        

        // Remove the element in the list 
        list.remove(3);
        System.out.println("After removing the element in the 3rd index the new list is" + list);

        // print the size of the list 
        System.out.println("The size of the ArrayList is : "+ list.size());


        // iterate on the array list using loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");    // output : 10 4 2
    }   
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");    // output : 10 4 2
    }   
        System.out.println();

    // Sorting on the array list 
     Collections.sort(list);
     System.out.println(list);  // Sorted the list in ascending format


}
}
