class _414_Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        final double BASE_VALUE = ((double) Integer.MIN_VALUE) - 1;
        double firstMax = BASE_VALUE;
        double secondMax = BASE_VALUE;
        double thirdMax = BASE_VALUE;

        for (int n : nums){
            if (n > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            }
            else if (n > secondMax && n < firstMax){
                thirdMax = secondMax;
                secondMax = n;
            }
            else if (n > thirdMax && n < firstMax && n < secondMax){
                thirdMax = n;
            }
        }
        
        return thirdMax == BASE_VALUE ? (int) firstMax : (int) thirdMax;
    }
}