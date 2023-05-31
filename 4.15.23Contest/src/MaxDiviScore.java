import java.util.Arrays;

public class MaxDiviScore {
    public static int score(int[] num, int[] div){
        int index = 0;
        int count = 0;
        Arrays.sort(div);

        for(int i=0; i<div.length; i++){
            int count2 = 0;
            for(int j=0; j<num.length; j++){
                if(num[j]%div[i]==0){
                    count2++;
                }
            }
            if(count2>count){
                count = count2;
                index = i;
            }
        }
        return div[index];
    }

    public static void main(String[] args){
        int[] num1 = {4,7,9,3,9};
        int[] div1 = {5,2,3};
        int[] num2 = {20,14,21,10};
        int[] div2 = {5,7,5};
        int[] num3 = {12};
        int[] div3 = {10,16};
        int[] num4 = {73,13,20,6};
        int[] div4 = {56,75,83,26,24,53,56,61};
        int[] num5 = {31,91,47,6,37,62,72,42,85};
        int[] div5 = {95,10,8,43,21,63,26,45,23,69,16,99,92,5,97,69,33,44,8};

        System.out.println("Score: " + score(num1, div1));
        System.out.println("Score: " + score(num2, div2));
        System.out.println("Score: " + score(num3, div3));
        System.out.println("Score: " + score(num4, div4));
        System.out.println("Score: " + score(num5, div5));
    }
}
