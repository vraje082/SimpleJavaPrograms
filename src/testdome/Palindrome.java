package testdome;

/**
 * Created by Vasanth on 2017-06-15.
 */
public class Palindrome {
    public static boolean isPalindrome(String word) {
        char[] array = word.toLowerCase().toCharArray();
        int index = word.length() - 1;
        for (int i = 0; i < word.length() / 2; i++) {
            if (array[i] != array[index]) return false;
            index = index-1;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
