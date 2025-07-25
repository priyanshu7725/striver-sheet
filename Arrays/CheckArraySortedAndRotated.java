public class CheckArraySortedAndRotated {
    public boolean check(int[] arr) {
        int n = arr.length;
        int count = 1;

        for ( int i = 0; i < 2*n; i++) {
            if ( arr[i%n] <= arr[(i+1)%n]) count++;
            else count = 1;

            if ( count == n) return true;
        }
        return n==1;
    }
}