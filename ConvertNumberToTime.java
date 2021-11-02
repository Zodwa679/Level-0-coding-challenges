public class ConvertNumberToTime {
    public static void main(String args[]) {
        System.out.println(convertNumberTime(71));
}
public static StringBuilder convertNumberTime(int number){
    int minutes = number % 60;
    int hours = (number - minutes )/60 ;

    String minutepluralCheck = ((minutes == 1 )? "minute" : "minutes"); 
    String hourPluralCheck = ((hours == 1) ? "hour " : "hours ");

   StringBuilder minuteText = new StringBuilder().append(minutes).append(' ').append(minutepluralCheck);
   StringBuilder hourText = new StringBuilder().append(hours).append(' ').append(hourPluralCheck);

   if(hours == 0) {
         return   minuteText; 
    }
    else if(minutes == 0){
        return hourText;
    }
   else {
        return (minutes >= 1) ? hourText.append(minuteText) : hourText; 
    }
}
    
}