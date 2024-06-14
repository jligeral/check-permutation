import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 */

public class CheckPermutation {
    public static void main(String[] args) {
        String test1 = "hello";
        String test2 = "olleh";
        System.out.println(checkPermutation(test1, test2));
    }
    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
