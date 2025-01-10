import java.util.Arrays;

public class ArrayCollectionquiz {
    private Object[] elementData;
    private int size;

    public ArrayCollectionquiz(int n) {
        elementData = new Object[n];
        size = 0; // Initialize size to 0
    }

    public int search(Object obj) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(obj)) {
                return i; // Return the index
            }
        }
        return -1; // Return -1 if not found
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)); // Use Arrays.toString for brevity
    }

    public void add(Object obj) {
        if (size >= elementData.length) {
            resize(); // Automatically resize the array if full
        }
        elementData[size++] = obj;
    }

    private void resize() {
        elementData = Arrays.copyOf(elementData, elementData.length * 2); // Double the size of the array
    }
}
