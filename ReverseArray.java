public class ReverseArray {

    /**
     * This method reverses an array.
     * 
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public static void reverseArray(int[] array) {

        if(array.length == 0) {
            System.out.println("Empty array");
        }
        
        int[] reverseA = new int[array.length];
        
        int start = 0;
        int end = array.length-1;
        while(start <= end) {
            reverseA[start] = array[end];
            reverseA[end] = array[start];
            start++;
            end--;
        }
        for(int element : reverseA) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {32, 43545, 23, 677};

        reverseArray(array);
    }
}