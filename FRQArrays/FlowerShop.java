import java.util.Arrays;
import java.util.Collections;


public class FlowerShop {


   private Flower[] flowerInventory;


   // ADDED TO ENABLE TESTING
   public FlowerShop(Flower[] flowerInventory) {
       this.flowerInventory = flowerInventory;
   }


   // ADDED TO ENABLE TESTING
   public Flower[] getFlowerInventory() {
       return flowerInventory;
   }


   // IMPLEMENTATION ADDED TO ENABLE TESTING
   public Flower[] sortByQuantity(Flower[] arr) {
       Flower[] sortedCopy = new Flower[arr.length];
       for (int i = 0; i < sortedCopy.length; i++) {
           sortedCopy[i]= arr[i];
       }
       Arrays.sort(sortedCopy); // sorts low to high (increasing) based on quantity
       Collections.reverse(Arrays.asList(sortedCopy)); // reverses to sort in decreasing order
       return sortedCopy;
   }


   // part a
    public void updateInventory(Flower[] newInventory) {
        for(int i = 0; i < flowerInventory.length; i ++) {
            Flower inventory = flowerInventory[i];
            Flower newInv = newInventory[i];

            int num = inventory.getQuantity() + newInv.getQuantity();
            inventory.setQuantity(num);
        }   
    }


   // part b
    public boolean topNSame(int n, Flower[] otherInventory) {
        Flower[] sortFlower = sortByQuantity(flowerInventory);
        Flower[] sortOther = sortByQuantity(otherInventory);
        
        for (int i = 0; i < n; i ++) {
            String flower = sortFlower[i].getName();
            String other = sortOther[i].getName();
            if (flower.equals(other) == false) {
                return false;
            }
        }
        return true;
        
    }
}