package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
	private HashMap<Furniture, Integer> furnitureToQuantityOrderMap;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
    	furnitureToQuantityOrderMap = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        furnitureToQuantityOrderMap.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return furnitureToQuantityOrderMap;
    }

    public float getTotalOrderCost() {
    	float cost = 0.0f;
        for(Map.Entry<Furniture, Integer> entry : furnitureToQuantityOrderMap.entrySet()) {
        	Furniture currentEle = entry.getKey();
        	cost += currentEle.cost()*(float)entry.getValue();
        }
        return cost;
    }

    public int getTypeCount(Furniture type) {
        return furnitureToQuantityOrderMap.get(type);
    }

    public float getTypeCost(Furniture type) {
        return type.cost()*(float)(furnitureToQuantityOrderMap.get(type));
    }

    public int getTotalOrderQuantity() {
        int totalQuantity = 0;
        for(Map.Entry<Furniture, Integer> currentEle : furnitureToQuantityOrderMap.entrySet()) {
        	totalQuantity += currentEle.getValue();
        }
        return totalQuantity;
    }
}
