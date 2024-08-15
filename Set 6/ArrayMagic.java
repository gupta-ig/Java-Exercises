public class ArrayMagic {
    
    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {

        // TODO: Write your code
        if(array.length == 0) {
            return false;
        }
        for(int value: array) {
             if(value > number) {
                 return true;
             }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 36, 2343, 544};
        int number = 50;

        System.out.println(doesHaveElementGreaterThan? "True" : "False");
    }
}