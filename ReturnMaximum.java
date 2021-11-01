import java.util.Scanner;
public class ReturnMaximum
{
   public static void main(String[] args)
   { System.out.println(findmaximum());

   }
  public static int  findmaximum(){
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
