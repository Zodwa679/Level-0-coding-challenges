import java.util.Scanner;
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
  
 


  /*public static int  findmaximum(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the total of your numbers: ");
      int numbers = sc.nextInt();
      int maximum = Integer.MIN_VALUE;
      System.out.println("Please enter " + numbers + " numbers.");
      for(int a = 0; a < numbers; a++)
      {
         int current = sc.nextInt();
         if(current > maximum)
         {
            maximum = current;
         }
      }
      sc.close();
     return  maximum;
   }
}
*/