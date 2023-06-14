import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // Create variables and Scanner object
        final double pearPrice = 2.14, applePrice = 3.67,
                     tomatoPrice = 1.11, bananaPrice = 0.95,
                     eggplantPrice = 5.0;
        int amountOfPear, amountOfApple, amountOfTomato,
            amountOfBanana, amountOfEggPlant;
        double totalPrice;
            Scanner input = new Scanner(System.in);
        
    //Getting values of variables from user
        System.out.println("Enter amount of pear in kg's: ");
        amountOfPear = input.nextInt();
        System.out.println("Enter amount of apple in kg's: ");
        amountOfApple = input.nextInt();
        System.out.println("Enter amount of tomato in kg's: ");
        amountOfTomato = input.nextInt();
        System.out.println("Enter amount of banana in kg's: ");
        amountOfBanana = input.nextInt();
        System.out.println("Enter amount of eggplant in kg's: ");
        amountOfEggPlant = input.nextInt();
    // Calculating total price and print to screen    
        totalPrice = (pearPrice * amountOfPear) + (applePrice * amountOfApple) 
        + (tomatoPrice * amountOfTomato) + (bananaPrice * amountOfBanana)
        + (eggplantPrice * amountOfEggPlant);

        System.out.println("Total price => " + totalPrice);
    }
}
