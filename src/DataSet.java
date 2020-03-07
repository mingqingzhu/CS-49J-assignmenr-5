public class DataSet {
    private int maxNum;
    private double[] myArray;
    private int crtSize;

    public DataSet(int maxNum) {
        crtSize = 0;
        this.maxNum = maxNum;
        myArray = new double[maxNum];
        System.out.println("You have created an array with size of " + maxNum + "\n");
    }

    public void add(double value) {
        if (crtSize < maxNum) {
            myArray[crtSize] = value;
            crtSize += 1;
        } else {
            System.out.println("The array is full, you cannot add more value.");
        }
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < crtSize; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    public double average() {
        double average = sum() / crtSize;
        return average;
    }

    public double maximum() {
        double max = myArray[0];
        for (int i = 1; i < crtSize; i++) {
            if(myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public double minimum() {
        double min = myArray[0];
        for (int i = 0; i < crtSize; i++) {
            if(myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }
}
