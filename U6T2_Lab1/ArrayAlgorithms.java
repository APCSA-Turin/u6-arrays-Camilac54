package U6T2_Lab1;

public class ArrayAlgorithms {
    private ArrayAlgorithms () {}
    
    /** Returns the average of all values in numList as a double.
    *
    *  PRECONDITION: numList.length > 0
    */
    public static double average(int[] numList) {
        // IMPLEMENT ME
        double total = 0;
        for (int i = 0; i < numList.length; i ++) {
            total += numList[i];
        }
        return total / numList.length;
    }

    /** Returns the value in numList that represents the minimum
    * value in numList.
    *
    *  PRECONDITION: numList.length > 0
    */
    public static int minimum(int[] numList) {
        // IMPLEMENT ME
        int minVal = numList[0];
        for (int i = 1; i < numList.length; i ++) {
            if (numList[i] < minVal) {
                minVal = numList[i];
            }
        }
        return minVal;
    }

    /** Returns the number of Strings in strList that contain the target.
    *
    *  PRECONDITION: strList.length > 0
    */
    public static int howManyContain(String[] strList, String target) {
        // IMPLEMENT ME
        int count = 0;
        for (int i = 0; i < strList.length; i ++) {
            if (strList[i].indexOf(target) != -1) {
                count ++;
            }
        }
        return count;
    }

    /** Returns an array containing all characters in myStr, in order.
    *
    *  PRECONDITION: myStr.length() > 0
    */
    public static String[] stringToArray(String myStr) {
        // IMPLEMENT ME
        String[] newStr = new String [myStr.length()];
        for (int i = 0; i < myStr.length(); i ++) {
            String chara = myStr.substring (i, i + 1);
            newStr[i] = chara;
        }
        return newStr;
    }

    /**  This method checks each Person in the people array, and if they
    *  are an adult (at least 18 years old), they introduce themselves
    *  (i.e. by calling the introduce() method)
    *
    *  PRECONDITION: people.length > 0
    */
    public static void introduceAdults(Person[] people) {
        // IMPLEMENT ME!
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() >= 18) {
                people[i].introduce();
            }
        }
    }

    /** Prints each String in wordList, on its own line, in reverse order;
    *  the characters of each string are also reversed.
    *
    *  PRECONDITION: wordList.length > 0
    */
    public static void reversePrint(String[] wordList) {
        // IMPLEMENT ME
        for (int i = wordList.length - 1; i >= 0; i --) {
            String current = wordList[i];
            for (int j = current.length() - 1; j >= 0; j --) {
                System.out.print(current.substring(j, j + 1));
            }
            System.out.println();
        }
    }

    /** Returns a new array containing all elements from arr1 combined with 
    *  all elements from arr2; arr1's elements should be followed by
    *  arr2's elements
    *
    *  PRECONDITION: arr1.length > 0, arr2.length > 0
    */
    public static int[] combine(int[] arr1, int[] arr2) {
        // IMPLEMENT ME
        int [] newCombine = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length - 1; i ++) {
            newCombine[i] += arr1[i];
        }
        for (int j = arr1.length; j < arr1.length + arr2.length; j ++) {
            newCombine[j] += arr2[j - arr1.length];
        }
        return newCombine;
    }
}