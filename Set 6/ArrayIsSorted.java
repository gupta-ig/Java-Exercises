public class ArrayIsSorted {

    /**
     * This method checks if the input array is sorted in ascending order.
     * 
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public static boolean isSorted(int[] array) {

        if(array.length < 2) {
            return true;
        }
        for(int i = 0; i < array.length-1; i++) {
            if(array[i+1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(isSorted(array));
    }
}