import java.util.Scanner;

class Wind {
    public double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(0.16, windSpeed);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature : ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the Wind Speed : ");
        double windSpeed = scanner.nextDouble();

        Wind w1 = new Wind();
        System.out.println(w1.calculateWindChill(temperature, windSpeed));
    }
}
