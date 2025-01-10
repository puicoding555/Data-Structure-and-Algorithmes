public class Mainquiz {
    public static void main(String[] args) {
        ArrayCollection collection = new ArrayCollection(3);

        collection.add(4);
        collection.add(5);
        collection.add(8);
        System.out.println(collection); // Output: [4, 5, 8]

        collection.add(10); // Automatically resizes the array
        System.out.println(collection); // Output: [4, 5, 8, 10]

        System.out.println(collection.search(5)); // Output: 1
        System.out.println(collection.search(99)); // Output: -1
    }
}
