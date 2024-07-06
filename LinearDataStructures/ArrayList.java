public class ArrayList{
  public static void main(String[] args){


    int [] a = new int [6];
    a[0] = 3;
    a[1]=62;
    a[2]=9;

    Shuffle(a);
    Arrays.sort(a);

    // using Array list s>> resisable arrays in java

    ArrayList<Integer> al = new ArrayList<>();

    al.add(5);
    al.add(6);
    al.add(7);

    al.get(0);
    System.out.println(al);
    Collections.sort(al);
    al.indexOf(5); // O(n)

    //change element type al.set(index, new);
    al.set(0,21);
    al.remove();
    al.size();
    al.clear();
    //print all the array elements
    for(int i =0; i<al.size(); i++){
      System.out.println(al.get(i));
    }
    //use for each to print all elements in a given array list

    /*
    for(type_in_arraylist i:al )
    */
    for (int i : al) {
      System.out.println(i);

    
    //summ All numbers
    int s = 0;
    for(int i=0; i<al.size();i++){
      c+=al.get(i);


      // view array list methods https://www.w3schools.com/java/java_ref_arraylist.asp 
      
    }

    



    
  }
}
