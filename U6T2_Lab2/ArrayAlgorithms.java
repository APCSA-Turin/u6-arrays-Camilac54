package U6T2_Lab2;

public class ArrayAlgorithms {
    // 12/13/2024, Lab 2 Warm Up
    /** Changes the first and last element of nums to be num
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: nums.length > 0
     */
    public static void bookEnd(int[] nums, int num) {
        // IMPLEMENT ME
        nums[0] = num;
        nums[nums.length - 1] = num;
    }
  
    /** Multiplies each number in numList by multiplier.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void multiplyBy(int[] numList, int multiplier) {
        // IMPLEMENT ME
        for (int i = 0; i < numList.length; i ++) {
            numList[i] *= multiplier;
        }
    }

    /** Returns an array of ints where each element is the product
     *  of the corresponding element in numList and multiplier.
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        // IMPLEMENT ME
        int[] newNumList = new int[numList.length];
        for (int i = 0; i < numList.length; i ++) {
            newNumList[i] = numList[i] * multiplier;
        }
        return newNumList;
    }

    /** Adds a "!" to the end of each String in wordList.  However, if a
     *  a string already ends in an exclamation point, do NOT add another.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: wordList.length > 0
     */
    public static void addExclamation(String[] wordList) {
        // IMPLEMENT ME
        for (int i = 0; i < wordList.length; i ++) {
            if (!(wordList[i].substring(wordList[i].length()-1).equals("!"))){
                wordList[i] = wordList[i] + "!";
            }
        }
    }

    /** Returns an array of booleans where each element reflects whether
     *  the corresponding element in tempList is at or below the freezing
     *  temperature of 32 (true) or not (false).
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: tempList.length > 0
     */
    public static boolean[] isFreezing(int[] tempList) {
        // IMPLEMENT ME
        boolean isFreezing[] = new boolean[tempList.length];
        for (int i = 0; i < tempList.length; i ++) {
            if (tempList[i] <= 32) {
                isFreezing[i] = true;
            } else {
                isFreezing[i] = false;
            }
        }
        return isFreezing;
    }

    //_____________________________________________________//

    /** Shifts all elements in numList to the LEFT one index
     *
     *  The first element in the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
     *  with the last element wrapping around to the back)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftLeft(int[] numList) {
        // IMPLEMENT ME
        int first = numList[0];
        for (int i = 1; i < numList.length; i ++) {
            numList[i - 1] = numList[i];
        }
        numList[numList.length - 1] = first;
    }

    /** Shifts all elements in numList to the RIGHT one index.
     *
     *  The last element in the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
     *  with the last element wrapping around to the front)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftRight(int[] numList) {
        // IMPLEMENT ME
        int last = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i --) {
            numList[i] = numList[i - 1];
        }
        numList[0] = last;
    }

    /** Reverses all elements in an array.
     *
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  modifies the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void reverse(int[] numList) {
        // IMPLEMENT ME: You should solve this two different ways; see below
        /**int[] copy = new int[numList.length];
        for (int i = 0; i < numList.length; i ++) {
            copy[i] = numList[i];
        }
        for (int j = 0; j < numList.length; j ++) {
            numList[numList.length - j - 1] = copy[j];
        }*/

        for (int i = 0; i < numList.length / 2; i ++) {
            int temp = numList[i];
            int idx = numList.length - i - 1;
            numList[i] = numList[idx];
            numList[idx] = temp;

        }
    }
}