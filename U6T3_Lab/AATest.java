public class AATest {
    public static void main(String[] args) {
        String[] strings = {"hello", "hola", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings));
        String[] strings2 = {"cut", "boy", "mom", "she"};
        System.out.println(ArrayAlgorithms.longestString(strings2));
        String[] strings3 = {"M", "DA", "B", "FAD"};
        System.out.println(ArrayAlgorithms.longestString(strings3));
        String[] strings4 = {"hello", "holler", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings4));

        int[] nums3 = {-6, -4, 0, -3, -1, -2, 5};
        boolean positive = ArrayAlgorithms.containsPositive(nums3);
        System.out.println(positive);
        int[] nums4 = {-6, -4, 0, -3, -1, -2, -5};
        boolean positive2 = ArrayAlgorithms.containsPositive(nums4);
        System.out.println(positive2);
        int[] nums5 = {6, -4, -8, -3, -1, -2, -5};
        boolean positive3 = ArrayAlgorithms.containsPositive(nums5);
        System.out.println(positive3);
        int[] nums6 = {6, 4, 8, 3, 1, 2, 5};
        boolean positive4 = ArrayAlgorithms.containsPositive(nums6);
        System.out.println(positive4);

    }
}