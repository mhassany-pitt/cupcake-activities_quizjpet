public class Tester {

   public static void main(String[] args) {
        DoublyLinkedList runningShoes = new DoublyLinkedList();
        runningShoes.insertAtStart("New Balance");
        runningShoes.insertAtStart("Saucony");
        runningShoes.insertAtStart("Salomon");
        runningShoes.insertAtStart("39");
        runningShoes.mysteryMethod();
        System.out.println(runningShoes);
   }
}