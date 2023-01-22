import java.util.Arrays;
import java.util.Comparator;

public class SortStudentsByKthScore {
    public static int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[k] > o2[k]) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return score;
    }

    public static void main (String[] args){
        int[][] test1 = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
        int[][] test2 = {{3,4}, {5,6}};

        System.out.println(Arrays.deepToString(sortTheStudents(test1, 2)));
        System.out.println(Arrays.deepToString(sortTheStudents(test2, 0)));
    }
}
