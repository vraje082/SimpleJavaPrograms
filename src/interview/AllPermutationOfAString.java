package interview;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-22.
 */
public class AllPermutationOfAString {
    public static void tempPermutation(String str) {
        tempPermutation("", str);
    }

    private static void tempPermutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                tempPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    public void permutation(String s1){
        permutation("",s1);
    }

    public void permutation(String s1, String s2){
        if(s2.length()==0){
            System.out.println(s1);
        }else{
            for(int i=0;i<s2.length();i++){
                permutation(s1+s2.charAt(i),s2.substring(0,i)+s2.substring(i+1,s2.length()));
            }
        }

    }



    @Test
    public void test(){
        permutation("123");
    }
}
