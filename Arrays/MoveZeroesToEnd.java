public class MoveZeroesToEnd {
    public static void moveZeroes(int arr[]) {
        int n = arr.length;   
        int i = 0;
        for ( int j = 0; j < n; j++) {
            if ( arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i++] = temp;
            }
        }
    }
}
