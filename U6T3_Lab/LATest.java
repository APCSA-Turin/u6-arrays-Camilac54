public class LATest {
    public static void main(String[] args) {
        String[] strings5 = {"HELLO", "Halo", "Adam", "what", "booyAH", "WHY?"};
        String[] lower = LoopAlgorithms.makeLowercase(strings5);
        for (String str : lower) {
            System.out.print(str + " ");
        }
        System.out.println("\n\noriginal array not modified:");
        for (String str : strings5) {
            System.out.print(str + " ");
        }
        System.out.println();
        // ___________________________________________
        System.out.println("-------------------------------------------");

        String[] strings6 = {"hello!!", "!!!whoa", "sad", "Adam!", "What! No way", "Why!"};
        int numExclamations = LoopAlgorithms.endsInExclamations(strings6);
        System.out.println(numExclamations);

        String[] strings7 = {"hell!o", "w!hoa", "!sad", "Adam", "What! No way", "Why"};
        int numExclamations2 = LoopAlgorithms.endsInExclamations(strings7);
        System.out.println(numExclamations2);
        // ___________________________________________
        System.out.println("-------------------------------------------");

        String[] strings9 = {"HELlo", "Halo", "WHAT!", "Adam", "what", "booyAH", "WHY?", "for"};
        LoopAlgorithms.makeUppercase(strings9);
        for (String str : strings9) {
            System.out.print(str + " ");
        }
        System.out.println();
        // ___________________________________________
        System.out.println("-------------------------------------------");

        int[] arr1 = {2, 5, 6, 1, 0, -6, 10};
        int[] arr2 = {1, 7, 6, -2, 8, -8, 8};
        int[] maximums = LoopAlgorithms.arrayMaximums(arr1, arr2);
    
        for (int num : maximums) {
            System.out.print(num + " ");
        }
        System.out.println("\n\noriginal arrays not modified:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
        // ___________________________________________
        System.out.println("-------------------------------------------");

        int[] nums10 = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
        int numDoubles = LoopAlgorithms.countConsecutiveDoubles(nums10);
        System.out.println(numDoubles);
        int[] nums11 = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        int numDoubles2 = LoopAlgorithms.countConsecutiveDoubles(nums11);
        System.out.println(numDoubles2);
        int[] nums12 = {1, 2, 1, 3, 1, 2, 1, 3, 1, 2, 1, 3};
        int numDoubles3 = LoopAlgorithms.countConsecutiveDoubles(nums12);
        System.out.println(numDoubles3);

        // ___________________________________________
        System.out.println("-------------------------------------------");
        
        int[] nums13 = {10, 20, 10, 30, 10, 20, 10, 30, 10, 20, 10, 30};
        int streak1 = LoopAlgorithms.longestStreak(nums13);
        System.out.println(streak1);
        int[] nums14 = {10, 10, 20, 20, 20, 30, 30, 30, 30, 40, 40, 50};
        int streak2 = LoopAlgorithms.longestStreak(nums14);
        System.out.println(streak2);
        int[] nums15 = {10, 10, 10, 10, 10, 10, 20, 20, 30, 30, 30, 30};
        int streak3 = LoopAlgorithms.longestStreak(nums15);
        System.out.println(streak3);
        int[] nums16 = {20, 20, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
        int streak4 = LoopAlgorithms.longestStreak(nums16);
        System.out.println(streak4);
        int[] nums17 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int streak5 = LoopAlgorithms.longestStreak(nums17);
        System.out.println(streak5);
    }
}