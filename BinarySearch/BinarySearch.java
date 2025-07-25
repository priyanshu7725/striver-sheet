public class BinarySearch {
    public int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;

        while ( l <= r) {
            int m = (l+r)/2;

            if ( arr[m] == target) return m;
            else if ( arr[m] > target) r = m-1;
            else l = m+1;
        }

        return -1;
    }
}
