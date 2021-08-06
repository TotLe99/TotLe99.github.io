import java.util.Arrays;

public class _1051_Height_Checker {
    public int heightChecker(int[] heights) {
        int[] cao = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            cao[i] = heights[i];
        }

        Arrays.sort(heights);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (cao[i] != heights[i]){
                count++;
            }
        }

        return count;
    }
}
