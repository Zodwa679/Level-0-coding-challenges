public class ConvertNumberToTime {
    public static void main(String args[]) {
        System.out.println(convertNumberTime(65));
}
public static String convertNumberTime(int number){
    int minutes = number % 60;
    int hours = (number - minutes )/60 ;

    String minutepluralCheck = ((minutes == 1 )? "minute" : "minutes"); 
    String hourPluralCheck = ((hours == 1) ? "hour " : "hours ");

   String minuteText = minutes + ' ' + minutepluralCheck;
    String hourText = hours + ' ' + hourPluralCheck;

   if(hours == 0) {
         return  hourText + minuteText; 
    }
   else {
        return (minutes >= 0) ? hourText + minuteText : hourText; 
    }
}
    
}