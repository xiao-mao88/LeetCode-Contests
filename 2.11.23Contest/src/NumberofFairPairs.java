public class NumberofFairPairs {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        long number = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(((nums[j] + nums[i]) <= upper) && ((nums[j] + nums[i]) >= lower)){
                    number++;
                }
            }
        }
        return number;
    }

    public static void main (String[] args){
        int[] test1 = {0,1,7,4,4,5};
        int[] test2 = {1,7,9,2,5};
        int[] test3 = {-5,-7,-5,-7,-5};

        System.out.println(countFairPairs(test1, 3, 6));
        System.out.println(countFairPairs(test2, 11, 11));
        System.out.println(countFairPairs(test3, -12, -12));
    }
}
