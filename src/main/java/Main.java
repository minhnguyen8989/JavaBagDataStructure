public class Main {
    public static void main(String[] args) {

        Bag<String> myBag1 = new Bag<>();

        myBag1.add("apple");
        myBag1.add("banana");
        myBag1.add("apple");
        myBag1.add("orange");
        myBag1.add("banana");
        myBag1.add("grape");

        Bag<String> myBag2 = new Bag<>();
        myBag2.add("banana");
        myBag2.add("cherry");
        myBag2.add("banana");

        System.out.println("Bag1 contents: " + myBag1);
        System.out.println("Bag2 contents: " + myBag2);

        System.out.println("Bag1 count of banana: " + myBag1.count("banana"));
        System.out.println("Bag2 count of apple: " + myBag2.count("apple"));

        System.out.println("Number element of bag1: " + myBag1.size() + " elements: ");
        System.out.println("Number element of bag2: " + myBag2.size() + " elements: ");

        myBag1.merge(myBag2);
        System.out.println("Bag1 after merge with Bag2: " + myBag1);
        System.out.println("Number element of mergeBag: " + myBag1.size() + " elements: ");

        Bag<String> distinctBag = myBag1.distinct();
        System.out.println("Distinct elements in the merged bag: " + distinctBag);
        System.out.println("Number element of distinctBag: " + distinctBag.size() + " elements: ");

    }
}
