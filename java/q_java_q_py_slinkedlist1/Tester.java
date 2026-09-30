public class Tester {

   public static void main(String[] args) {
        SLinkedList location = new SLinkedList();
        location.add("Denver");
        location.add("Austin");
        location.append("Seattle");
        System.out.println(location.pop());
        location.add("Chicago");
        location.add("Miami");
        location.add("41");
        System.out.println(location.index("Austin"));
        location.remove("41");
        System.out.println(location);
   }
}