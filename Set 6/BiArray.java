public class BiArray {

    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        if(sum1 == sum2) {
            return true;
        }
        else {
            return false;
        }
    }

    private int calculateSum(int[] array) {
        
        int sum = 0;
        for(int value: array) {
            sum += value;
        }
    
        return sum;

    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 5,};

        BiArray obj1 = new BiArray(array1, array2);

        System.out.println(obj1.areSumsEqual());
    }
}