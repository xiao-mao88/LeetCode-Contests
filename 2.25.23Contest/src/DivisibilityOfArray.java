import java.util.Arrays;

public class DivisibilityOfArray {
    public static int[] divisibilityArray(String word, int m) {
        int[] arr = new int [word.length()];

        for(int i = 0; i<word.length(); i++){
            int num = Integer.valueOf(word.substring(0, i+1));
            if(num%m == 0){
                arr[i] = 1;
            }
        }
        return arr;
    }

    public static void main (String[] args){
        String test1 = "998244353";
        String test2 = "1010";
        String test3 = "529282143571";

        System.out.println(Arrays.toString(divisibilityArray(test1, 3)));
        System.out.println(Arrays.toString(divisibilityArray(test2, 10)));
        System.out.println(Arrays.toString(divisibilityArray(test3, 4)));
    }
}
