public class AltDigitSum {
    public static int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int theSum = Character.getNumericValue(s.charAt(0));
        int i = 1;

        for(int j = 1; j<s.length(); j++){
            if(i%2 == 0){
                theSum += theSum = Character.getNumericValue(s.charAt(j));
            }
            else{
                theSum -= Character.getNumericValue(s.charAt(j));
            }
            i++;
        }
        return theSum;
    }

    public static void main (String[] args){
        System.out.println(alternateDigitSum(521));
        System.out.println(alternateDigitSum(111));
        System.out.println(alternateDigitSum(886996));
        System.out.println(alternateDigitSum(10));

    }
}
