package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    Map<String,Integer> items;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        items = new HashMap<>();
        for(String s :strings){
            items.put(s,1);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        items = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(items.containsKey(item))
            items.replace(item,items.get(item)+1);
        else
            items.put(item,1);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        items.replace(item,items.get(item)-1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return items.getOrDefault(item, 0);
    }
}
