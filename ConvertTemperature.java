public class ConvertTemperature {
    public static void main(String args[]) {
        System.out.println(convertCelsiusToFahrenheit(30));
        System.out.print(convertFahrenheitToCelsius(86));
        

    }

public static double convertCelsiusToFahrenheit(int celsius) {
    return (celsius * 9 / 5) + 32;
    }
   
    
public static double convertFahrenheitToCelsius(int fahrenheit){
    return (fahrenheit - 32 )* 5/9;
    }
}