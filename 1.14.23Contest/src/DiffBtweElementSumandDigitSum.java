public class DiffBtweElementSumandDigitSum {
    public static int differenceOfSum(int[] nums) {
        int digitSum = 0; int elementSum = 0;
        for(int i = 0; i<nums.length; i++){
            elementSum += nums[i];
            String number = String.valueOf(nums[i]);
            for(int k = 0; k < number.length(); k++) {
                int j = Character.digit(number.charAt(k), 10);
                digitSum += j;
            }
        }
        int diff = Math.abs(elementSum - digitSum);
        return diff;
    }
        public static void main (String[] args){
        int[] test1 = {1,15,6,3};
        System.out.println(differenceOfSum(test1));
        int[] test2 = {1,2,3,4};
        System.out.println(differenceOfSum(test2));
    }
}