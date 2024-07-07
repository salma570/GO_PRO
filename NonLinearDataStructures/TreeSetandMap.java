public class TreeSetandMap{
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








//like hashmap but it just ordered 
// complexity O(log(n))

    
    TreeMap<Integer , Integer> tmo = new TreeMap<>();

    tmo.put(10,10);
    tmo.put(12,-1);
    tmo.put(9, 10);
    //values could be overritten 
int mapbal =0;

    // to avoid exception not found key use:
    if(tmo.containsKey(13))
      mapbal = tmo.get(13);

tmo.containsvalue(13);
    tmo.remove(10);
    int ceil = tmo.ceilingKey(-1); //get smallest value
    int floor = tmo.floorKey(-1); //get smallest value




    //looping on a tree set

      for(Integer i : treeMap.keySet()){
        System.out.println(tmp.key(), tmp.value());
      }





















    
  }
}
