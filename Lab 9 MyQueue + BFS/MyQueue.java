public class MyQueue {
    private Object[] elementData;
    private int size;
    private int front;

    public MyQueue(int n) {
        elementData = new Object[n];
        size = 0;
        front = 0;
    }

    public void enqueue(Object obj) {
        if (size < elementData.length) {
            int b = (front + size) % elementData.length;
            elementData[b] = obj;
            size++;
        }
    }

    public Object dequeue() {
        Object obj = peek();
        elementData[front] = null;
        front++;
        size--;
        return obj;
    }

    public String toString() {
        String answer = "";
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] != null) {
                answer = answer + elementData[i] + ",";
            }
        }
        return answer;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object peek() {
        if (isEmpty())
        {
            return "Program Terminated";
        }
        return elementData[front];
    }


}