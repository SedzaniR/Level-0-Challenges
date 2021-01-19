package tencodechallenges;
//task 07
public class temperatureConversion {
    public static void convertToFahrenheit(double celsius_temperature)
    {
        double converted_temperature = celsius_temperature * 1.8 + 32;

        //fahrenheit temperature is rounded off to one decimal point
        converted_temperature = Math.round(converted_temperature*10)/(double) 10;

        System.out.println(converted_temperature+ " Fahrenheit");
    }

    public static void convertToCelsius( double fahrenheit_temperature){

        double converted_temperature = ((double)5/(double)9) * (fahrenheit_temperature - 32);

        //celsius temperature is often converted to two decimal points
        converted_temperature = Math.round(converted_temperature * 100)/(double)100;

        System.out.println(converted_temperature+ " Degrees");
    }

    public static void main(String[] args){
        convertToFahrenheit(37);
        convertToCelsius(98.6);
    }
}
