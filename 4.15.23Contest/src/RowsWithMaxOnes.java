import java.util.Arrays;

public class RowsWithMaxOnes {
    public static int[] findingMax (int[][] a){
        int[] newArr = new int[2];
        int max = 0;
        int index = 0;
        for(int i=0; i<a.length; i++){
            int count = 0;
            for(int j=0; j<a[0].length;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max = count;
                index = i;
            }
        }
        newArr[0] = index;
        newArr[1] = max;
        return newArr;
    }

    public static void main (String[] args){
        int[][] test1 = {{0,1}, {1,0}};
        int[][] test2 = {{0,0,0}, {0,1,1}};
        int[][] test3 = {{0,0}, {1,1}, {0,0}};

        System.out.println(Arrays.toString(findingMax(test1)));
        System.out.println(Arrays.toString(findingMax(test2)));
        System.out.println(Arrays.toString(findingMax(test3)));
    }
}
