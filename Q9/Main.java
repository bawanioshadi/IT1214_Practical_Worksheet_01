class TemperatureConverter {
    // Convert Celsius to Fahrenheit
    double toFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }
    
    // Convert Fahrenheit to Celsius
    double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
}

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        
        // Test conversions
        System.out.println("30 Celsius to Fahrenheit: " + converter.toFahrenheit(30));
        System.out.println("86 Fahrenheit to Celsius: " + converter.toCelsius(86));
        
        // Additional test cases
        System.out.println("0 Celsius to Fahrenheit: " + converter.toFahrenheit(0));
        System.out.println("100 Celsius to Fahrenheit: " + converter.toFahrenheit(100));
        System.out.println("32 Fahrenheit to Celsius: " + converter.toCelsius(32));
        System.out.println("212 Fahrenheit to Celsius: " + converter.toCelsius(212));
    }
}