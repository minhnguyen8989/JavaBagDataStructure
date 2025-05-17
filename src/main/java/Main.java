public class Main {
    public static void main(String[] args) {

        Bag<String> myBag = new Bag<>();

        myBag.add("apple");
        myBag.add("banana");
        myBag.add("apple");
        myBag.add("orange");
        myBag.add("banana");
        myBag.add("grape");

        System.out.println("Bag contents: " + myBag);
        System.out.println("Bag contains 'apple': " + myBag.contains("apple"));
        System.out.println("Bag contains 'kiwi': " + myBag.contains("kiwi"));
        System.out.println("Count of 'banana': " + myBag.count("banana"));
        System.out.println("Count of 'apple': " + myBag.count("apple"));

        myBag.remove("banana");

        System.out.println("Bag contents after removing one 'banana': " + myBag);
        System.out.println("Bag contains 'banana': " + myBag.contains("banana"));
        System.out.println("Count of 'banana': " + myBag.count("banana"));
    }
}
