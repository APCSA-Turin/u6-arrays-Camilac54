package U6T2_Lab2;

public class Main {
    public static void main(String[] args) {
        int[] nums = {6, 1, 3, 4, 7, 5};
        int[] even = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.reverse(even);
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        int[] odd = {1, 2, 3, 4, 5, 6, 7};
        ArrayAlgorithms.reverse(odd);
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        int[] even2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.reverse(even2);
        for (int i = 0; i < even2.length; i++) {
            System.out.print(even2[i] + " ");
        }
        System.out.println();
        int[] odd2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayAlgorithms.reverse(odd2);
        for (int i = 0; i < odd2.length; i++) {
            System.out.print(odd2[i] + " ");
        }
        System.out.println();
            }
}