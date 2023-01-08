public class MaxCountofPosIntandNegInt {
    public static int maximumCount(int[] nums) {
        int neg = 0, pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg++;
            } else if (nums[i] > 0) {
                pos++;
            }
        }
        if (neg > pos) {
            return neg;
        }
        return pos;
    }

    public static void main (String[] args){
        int[] test1 = {-2,-1,-1,1,2,3};
        int[] test2 = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(test1));
        System.out.println(maximumCount(test2));
    }
}
