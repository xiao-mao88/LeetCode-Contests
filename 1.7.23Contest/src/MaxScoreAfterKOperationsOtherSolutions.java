import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxScoreAfterKOperationsOtherSolutions {
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length, Comparator.reverseOrder());
        for(int x : nums){
            pq.add(x);
        }
        long ans = 0;
        for(int i = 0; i < k; i++) {
            int top = pq.remove();
            ans += top;
            pq.add((top + 2) / 3);
        }
        return ans;
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
