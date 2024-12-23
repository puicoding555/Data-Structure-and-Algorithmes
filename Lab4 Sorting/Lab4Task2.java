public class Lab4Task2 {
    public static void main(String[] args) {
        int data[] = { 4, 2, 3, 9, 8, 1, 6, 5 };
        Lab4Task1.printArray(data);
        
        int temp; //+temp
        for (int i = 0; i < data.length; i++) {
            int id = findMin(data, i);
            temp = data[i];
            data[i] = data[id];
            data[id] = temp;
            Lab4Task1.printArray(data);//+data
        }
    }// main

    public static int findMin(int[] d, int n) {
        int min = d[n];
        int id = n;
        for (int i = n + 1; i < d.length; i++) {
            if (d[i] < min) {
                min = d[i];
                id = i;
            }
        }
        return id;
    }
}
