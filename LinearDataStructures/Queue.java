public class Queue{
  public static void main (String [] args){
    
// queue is a linked list 
    Queue<Integer> qu = new LinkedList<>();
    // Displaying the Queue
        System.out.println("Queue elements: " + queue);
    qu.add();
    qu.poll(); //poll() method is also used to remove the head and return it. 
    qu.peak(); // doesn't remove just returns the last value on peak
    qu.size();
    qu.addLast();
    qu.addFirst();
    qu.remove();
    qu.removeFirst();
    qu.removeLast();
    

    //display all
    while (!qu.isEmpty()){
      System.out.print(qu.poll);
    }








    
  }
}
