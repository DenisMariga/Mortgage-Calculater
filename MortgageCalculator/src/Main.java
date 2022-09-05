import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte month=12;
        final byte percentage = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle =scanner.nextInt();
        System.out.print("Enter Annual Interest Rate: ");
        float interest = (scanner.nextFloat()/percentage)/month;
        System.out.print("Period in Years: ");
        float years = scanner.nextFloat()*month;
        float mortgage = (float) (principle*(interest* Math.pow(1+interest,years)/(Math.pow(1+interest,years)-1)));
        System.out.println("Mortgage: "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
}