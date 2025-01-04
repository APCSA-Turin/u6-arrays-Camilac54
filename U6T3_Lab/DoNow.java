public class DoNow {
    public static void main(String[] arg) {
        int[] nums = {5, 10, 15, 12, 2, 4};
        int[] result = ArrayAlgorithmsDoNow.multiplyByNoModify(nums, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
} 