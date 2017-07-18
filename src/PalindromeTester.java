import java.util.Arrays;

/**
 * Created by emma on 7/18/17.
 */
public class PalindromeTester {

    public static boolean testPalindrome (String[] str) {

        boolean result = false;

        if (str.length <= 1)
            result = true;
        else
        if (str[0] == str[str.length-1])
            result = testPalindrome (Arrays.copyOfRange(str, 1, str.length - 1));

        return result;

    }  // method ptest

    public static void main(String[] args) {

        System.out.println(testPalindrome(new String[]{}));

    }

}
