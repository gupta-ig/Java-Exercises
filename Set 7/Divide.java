class Divide implements Operation {
    @Override
    public int perform(int x, int y) {
        // Write your code here
        if(y == 0) {
            return -1;
        }
        return x/y;
    }
}