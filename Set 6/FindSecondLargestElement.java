public class FindSecondLargestElement {
    
    /**
     * This method finds and returns the second largest element in the given array.
     * 
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */
     
    public static int findSecondLargestElement(int[] array) {

        if(array.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int value: array) {
            if(value > largest) {
                secLargest = largest;
                largest = value;
            }
            else if(value > secLargest && value != largest) {
                secLargest = value;
            }
        }
        if(secLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secLargest;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        System.out.printf("Second largest number is %d." , findSecondLargestElement(array));
    }
}