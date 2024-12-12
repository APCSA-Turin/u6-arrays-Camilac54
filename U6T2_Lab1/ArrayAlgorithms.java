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


}