public class Main {
    public static void main(String[] args) {

        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("23.5°F = " + converter.celsiusToFahrenheit(23.5) + " °F");
        System.out.println("74.3°F = " + converter.fahrenheitToCelsius(74.3) + " °C");
    }
}
