import java.util.Arrays;

public class IncrementSubmatricesbyOne {
    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] grid = new int [n][n];
        for(int i = 0; i<queries.length; i++){
            for(int r = 0; r<grid.length; r++){
                for(int c = 0; c<grid[0].length; c++){
                    if(r<=queries[i][2] && c<=queries[i][3] && r>=queries[i][0] && c>=queries[i][1]){
                        grid[r][c]++;
                    }
                }
            }
        }
        return grid;
    }

    public static void main (String[] args){
        int[][] test1 = {{1,1,2,2}, {0,0,1,1}};
        System.out.println(Arrays.deepToString(rangeAddQueries(3,test1)));

        int[][] test2 = {{0,0,1,1}};
        System.out.println(Arrays.deepToString(rangeAddQueries(2,test2)));
    }
}
