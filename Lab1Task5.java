public class Lab1Task5{
    public static void main(String[] args) {
        int arr[] = getData(3); //arr 3
        printArr(arr);
        //sum 
        int sum = calculateSum(arr);
        System.out.println("sum = " + sum);
        //sum avg
        double avg = calculateAverage(arr);
        System.out.println("average = " + avg);
    }

    //scanner
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //data arr
    public static int[] getData(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (i + 1) * 2 + 3; //num 5, 8, 9
        }
        return arr;
    }

    //method sum 
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //method avg
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }
}