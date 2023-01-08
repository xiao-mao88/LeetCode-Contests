import java.util.Arrays;

public class MaxScoreAfterKOperations2 {
    public static long maxKelements(int[] nums, int k) {
        long maxScore = 0;
        long largest;
        int index = 0;
        for(int i=0; i<k; i++){
            Arrays.sort(nums);
            maxScore = maxScore + nums[nums.length-1];
            double newnum = nums[nums.length-1];
            nums[nums.length-1] = (int)(Math.ceil(((double)nums[nums.length-1])/3));
        }
        return maxScore;
    }

    public static void main (String[] args){
        int[] test1 = {10,10,10,10,10};
        int[] test2 = {1,10,3,3,3};
        int[] test3 = {672579538,806947365,854095676,815137524};
        int[] test4 = {756902131,995414896,95906472,149914376,387433380,848985151};
        System.out.println(maxKelements(test1, 5));
        System.out.println(maxKelements(test2, 3));
        //2147483647
        System.out.println(maxKelements(test3, 3));
        System.out.println(maxKelements(test4, 6));
    }
}
