public class _977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums){
        int n = nums.length;
        int[] ss = new int[n];
        int start = 0;
        while (start < n && nums[start] < 0){
       start++;
        }

        int end = start;
        start -= 1;
        int idx = 0;
        while (start >= 0 || end < n){
            if (start >= 0 && end <n){
                if (nums[start] * nums[start] > nums[end] * nums[end]){
                    ss[idx++] = nums[end] * nums[end++];
                } else {
                    ss[idx++] = nums[start] * nums[start--];
                }
            } else if (start >= 0){
                ss[idx++] = nums[start] * nums[start--];
            } else {
                ss[idx++] = nums[end] * nums[end++];
            }
        }
        return ss;
    }
}
