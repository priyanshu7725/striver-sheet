public class FloorInASortedArray {
    public static int findFloor(int[] arr, int x) {
        int minDif = Integer.MAX_VALUE;
        int floor = -1;
        
        for ( int i = 0; i < arr.length; i++) {
            if (x-arr[i]>= 0 && minDif >= x-arr[i]) {
                minDif = x-arr[i];
                floor = i;
            }
        }
        return floor;
    }
    public static void main(String args[]) {
        int[] arr = {1,2,8,10,10,12,19};
        System.out.println(findFloor(arr,0));
    }
}