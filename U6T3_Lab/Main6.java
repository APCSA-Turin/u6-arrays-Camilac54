public class Main6 {
    public static void main(String[] args) {
 
        int[ ] values = {6, 2, 1, 7, 12, 5};
        
        // triple each element in the array
        for (int val : values) {
          val *= 3;
        }
 
        // print out array to see if they changed
        System.out.println("Array after the loop: ");
        for (int val : values) {
           System.out.print(val + " ");
        }
    }
 }
 