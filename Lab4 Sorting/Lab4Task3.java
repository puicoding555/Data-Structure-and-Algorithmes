public class Lab4Task3 {
    public static void main(String[] args) {
        int data[] = { 38 ,27 ,43 ,3 ,9 ,82 ,10};
        int[] d1 = data.clone();
        int[] d2 = data.clone();
        int[] d3 = data.clone();
        System.out.println("++++++ Bubble sort ++++++");
        bbSort(d1);
        System.out.println("++++++ Selection sort ++++++");
        selectionSort(d2);
        System.out.println("++++++ Insertion sort ++++++");
        insertSort(d3);
        // Lab4Task1.printArray(d1);
        // Lab4Task1.printArray(d2);
        // Lab4Task1.printArray(d3);
    }

    //BubleSort
    public static void bbSort(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(i + ":");
            Lab4Task1.printArray(arr);
        }
    }

    //SelectionSort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            System.out.print(i + ":");
            Lab4Task1.printArray(arr);
        }
 
    }

    //InsertSort
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
 
            int key = arr[i];
            int j = i - 1;
            while ((j > -1) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
               
            }
            arr[j + 1] = key;
            System.out.print(i + ":");
            Lab4Task1.printArray(arr);
        }
    }
}
 
 