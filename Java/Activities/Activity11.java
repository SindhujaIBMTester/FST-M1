package activities;

import org.apache.commons.collections4.map.MultiKeyMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer,String> colours = new HashMap<>();
        colours.put(1,"Red");
        colours.put(2,"Green");
        colours.put(3,"Yellow");
        colours.put(4,"Orange");
        colours.put(5,"Black");

        System.out.println("Print the map:"+colours);
        System.out.println("Print the map initial size:"+colours.size());
        System.out.println("Print the removed Map:"+colours.remove(3));
        System.out.println("Check if green color exist in the map:"+colours.containsValue("Green"));
        System.out.println("Print the map Final size:"+colours.size());

    }
}
