public class Lab4Task1 {
    public static void main(String[] args) {
    int data[]= {4,2,3,9,8,1,0,5};
    int tmp = 0;
    printArray(data);
    for(int i = 0; i< data.length; i++){
    for(int j = data.length-2; j >= 0; j--){
    if (data[j+1] > data[j] ){
    tmp = data[j];
    data[j] = data[j+1];
    data[j+1] = tmp;
    }// if
    }// j
    System.out.print(i + ": ");
    printArray(data);
    }// i
    }//main
    public static void printArray(int num[]){
    for(int a = 0; a < num.length; a++){
    System.out.print(num[a]+ " ");
    }
    System.out.println();
    }//printArray
    }// class