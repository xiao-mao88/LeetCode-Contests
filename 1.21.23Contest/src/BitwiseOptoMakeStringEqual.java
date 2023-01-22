public class BitwiseOptoMakeStringEqual {
    public static boolean makeStringsEqual(String s, String target) {
        if(s.equals(target)){
            return true;
        }
        else if(s.indexOf("1") != -1 && target.indexOf("1") != -1){
            return true;
        }
        return false;
    }

    public static void main (String[] args){
        String s1 = "1010";
        String target1 = "0110";

        System.out.println(makeStringsEqual(s1, target1));
        System.out.println(makeStringsEqual("11", "00"));
        System.out.println(makeStringsEqual("101110100", "110011000"));
    }
}
