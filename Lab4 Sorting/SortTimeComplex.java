public class SortTimeComplex {
    static int[] arraygen(int n) {
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
 
        }
        return arr;
    } // arraygen
 
    static void arrayprint(int arr[]) {
        for (int i : arr) {
            System.out.print(i + "\t");
        } // for
        System.out.println();
    } // arrayprint
 
    static void bbsort(int[] arr) {
        int n = arr.length;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                } // if
            } // for i
              // arrayprint(arr);
        } // for k
    }// bbsort
 
    static void inssort(int a[]) {
        int m, i;
        for (int j = 1; j < a.length; j++) {
            i = 0;
            while (a[j] > a[i]) {
                i++;
            }
            m = a[j];
            for (int k = 0; k <= j - i - 1; k++) {
                a[j - k] = a[j - k - 1];
            }
            a[i] = m;
            // arrayprint(a);
        }
    }// inssort
 
    static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];
        // System.out.println("pivot= " + pivot);
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
 
    static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            // System.out.println("Left index= " + index);
            quickSort(arr, left, index - 1);
            // printArray(arr);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }// quickSort
 
    public static void main(String args[]) {
        int n = 65536;
        int a[] = arraygen(n);
        long startTime = System.nanoTime();
        bbsort(a);
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println("bbsort:" + time + " ns");
 
        a = arraygen(n);
        startTime = System.nanoTime();
        inssort(a);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("inssort:" + time + " ns");
 
        a = arraygen(n);
        startTime = System.nanoTime();
        quickSort(a, 0, a.length - 1);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("qsort:" + time + " ns");
    } // main
} // class