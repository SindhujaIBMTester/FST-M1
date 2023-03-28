package activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Banana");
        hs.add("Papaya");
        hs.add("Orange");
        System.out.println("Print hashset:"+hs);
        System.out.println("Print size of Hashset:"+hs.size());
        System.out.println("Remove an element:"+hs.remove("Papaya"));
        System.out.println("Remove an element not in hashset:"+hs.remove("Watermelon"));
        System.out.println("Check if an element in the hashset or not:"+hs.contains("Mango"));
        System.out.println("Print final hashset:"+hs);
        System.out.println("Print final size of Hashset:"+hs.size());
    }

}
