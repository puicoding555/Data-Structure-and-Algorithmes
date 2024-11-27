public class Lab1Task4 {
    public static void main(String[] args) {
        int arr[] = getData(3);
        printArr(arr);
        int sum = calculateSum(arr);
        System.out.println("sum = " + sum);
        //printarr 
    }
    //method printarr
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //method getdata int
    public static int[] getData(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (i + 1) * 2 + 3;
        }
        return arr;
    }

    public static int calculateSum(int[] arr) { //sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}