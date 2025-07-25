public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int max2 = -1;
        
        for ( int n : arr) {
            if ( n > max) {
                max2 = max;
                max = n;
            }
            else if ( n < max && max2 < n) {
                max2 = n;
            }
        }
        return max2;
    }
}
