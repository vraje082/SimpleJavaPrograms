package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-27.
 */
public class Excercise2 {

    int index=0;
    public void reverseUsingIteration(String input) {
        char[] array1 = new char[input.length()];
        char[] inputArray = input.toCharArray();
        int index = 0;

        for(int i = input.length()-1;i>-1;i--){
            array1[index++] = inputArray[i];
        }

        for(Character ch : array1){
            System.out.print(ch);
        }
    }

    public void reverseUsingRecursion(String input) {
        if(index==input.length()-1){
            System.out.print(input.charAt(index));
        }else{
            index=index+1;
            reverseUsingRecursion(input);
            System.out.print(input.charAt(index=index-1));
        }
    }

    @Test
    public void test(){
      //  reverseUsingIteration("abc");
        System.out.println();
        reverseUsingRecursion("abc");
    }
}
