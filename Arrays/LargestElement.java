public class LargestElement{
    public static int largest(int[] arr) {
        int max = -1;
        
        for ( int n: arr) {
            max = Math.max(max,n);
        }
        return max;
    }
}
