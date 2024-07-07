public class TreeSet{
  public static void main (String[] args){
    TreeSet<> ts = new TreeSet<>(); // each element is repeated once

    // Like the hashset but ordered // same as dictinarry ordered // O(log(n))
    //values could be repeaated 
    TreeSet<Character> tset1 = new TreeSet<> ();
    
    tset1.add('a');
    tset1.add('n');
    tset1.add('b');

    TreeSet<Integer> tset = new TreeSet<> ();
    tset.add(10);
    tset.remove(10);
    tset.contains(10); //boolean
    
    tset.ceiling(10); //finding te fist elemt that's  higher or equal to 10
    tset.floor(10); //finding te fist elemt that's  lower or equal to 10
    //if it doesn't exist it returns (-1)
    tset.ceiling(10); //returns null if there's no element higher or equal to 10
    
    //removes and returns the elements in the first or last position in the tree
    tset.pollFirst();
    tset.pollLast();
    
    for(Integer i : tset){
      System.out.println(tset.get(i));
    }
    
  }
}
