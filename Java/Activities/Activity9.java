package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Sindhuja");
        myList.add("Divya");
        myList.add("Shyam");
        myList.add("Achu");
        myList.add("Chinnu");
        /**Size of the list 8 */
        System.out.println("Print size of the List :"+myList.size());
        /** Print all names added to the list */
        for (String name : myList) {
            System.out.println("Print names:" + name);
        }
        /** Print 3rd name from the list */
        System.out.println("Print 3rd name from the list:"+myList.get(3));
        /**Check if a name exist in the list */
        System.out.println("Is Achu in the list:"+myList.contains("Achu"));
        /** Remove a name from the list*/
        System.out.println("Print Removed item name:"+myList.remove(1));
        /**Size of the list 8 */
        System.out.println("Print size of the List :"+myList.size());






    }
}
