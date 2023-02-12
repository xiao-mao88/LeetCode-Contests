public class FindArrayConcatenationValue {
    public static long findTheArrayConcVal(int[] nums) {
        long value = 0;
        for(int i = 0; i<nums.length/2; i++){
            String conc = Integer.toString(nums[i]) + Integer.toString(nums[nums.length-1-i]);
            int add = Integer.valueOf(conc);
            value+=add;
            if(i == ((int) nums.length/2)-1 && nums.length%2!=0){
                value+=nums[i+1];
            }
        }
        return value;
    }

    public static void main (String[] args){
        int[] test1 = {7,52,2,4};
        int[] test2 = {5,14,13,8,12};

        System.out.println(findTheArrayConcVal(test1));
        System.out.println(findTheArrayConcVal(test2));
    }
}
