public class ReturnMaximum
{
   public static void main(String[] args){
    System.out.println(findmaximum(4,9,4,5,40,7));
   }
   public static int findmaximum(int ... args){
    int maximumNumber = Integer.MIN_VALUE;

    for (int i = 0; i < args.length; i++) {
      if(args[i] > maximumNumber) {
          maximumNumber = args[i];
      }
    }
    return maximumNumber;
  }
}
  
 


  