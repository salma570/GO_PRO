public class Endless{
  public static void main (String [] args) throws Excepion{
    Scanner sc = new Scanner (System.in);
    // rtaking endless input

    //to slow down runnning progrm
    // exception thrown  
    
    Thread.sleep(3000); // sec num

    
    // comment it when submitting on code forces
    while(sc.ready()){ // existance of an input
      String s = sc.nextLine();
      System.out.println(s);
    }
// using bufferReaders
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    while(br.ready()){ // existance of an input
      String s = br.nextLine();
      System.out.println(s);
    }






    sc.close
  }
}
