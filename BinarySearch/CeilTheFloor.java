public class CeilTheFloor {
    public static int[] func(int[] arr, int x) {
        int minDif = Integer.MAX_VALUE;
        int floor = -1;
        int minDif2 = Integer.MAX_VALUE;
        int ceil = -1;
        
        for ( int i = 0; i < arr.length; i++) {
            if (x-arr[i]>= 0 && minDif >= x-arr[i]) {
                minDif = x-arr[i];
                floor = arr[i];
            }
            if (arr[i]-x>= 0 && minDif2 >= arr[i]-x) {
                minDif2 = arr[i]-x;
                ceil = arr[i];
            }
        }
        return new int[]{floor,ceil};
    }
    public static void main( String args[]) {
        int[] arr = {36,82,88,56,21,17,73,86};
        int[] num = (func(arr,17));

        for ( int n : num) {
            System.out.print(n + " ");
        }
    }
}
