public class ConvertTempereture {
    public static void main(String args[]) {
        System.out.println(convertCelsiusToFahrenheit(30));
        System.out.print(convertFahrenheitToCelsius(86));
        

    }

public static int convertCelsiusToFahrenheit(int celsius) {
    return (celsius * 9 / 5) + 32;
    }
   
    
public static int convertFahrenheitToCelsius(int fahrenheit){
    return (fahrenheit - 32 )* 5/9;
    }
}