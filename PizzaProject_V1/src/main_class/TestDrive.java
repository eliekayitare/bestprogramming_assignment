package MainClass;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import domain_classes.OptionSet;
import domain_classes.PizzaConfig;

/**
 *
 * @author kayitare
 */
public class TestDrive {

  StringBuilder build = new StringBuilder();
   
    public static void main(String[] args) {

        // calling menue method
        new TestDrive().menue();

    }
    
  PizzaConfig conf = new PizzaConfig();
   PizzaConfig pizza = new PizzaConfig();
 
    public void menue() {
        System.out.println("______________________________");
        System.out.println("Welcome to Camellia Restaurant");
        System.out.println("_______________________________");
        double totalPrice = 0.0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Pizza Name You Want to Order : ");    
        String selected = scanner.nextLine();
        pizza.setName(selected );
        System.out.println("Pizza Name Ordered : " + pizza.getName());
        System.out.println("_________________________________");
        System.out.println("Select Pizza Size Order  ");
        System.out.println("__________________________________");
        System.out.println("Press 1: For Large  :4500Rwf");
        System.out.println("Press 2: For Medium  :3000Rwf"); // SIZE OF ORDERD PIZZA
        System.out.println("Press 3: For Small  :1000Rwf");
        System.out.println("_______________________________");
        double price=0.0;
        System.out.print("\nPress any Number to make Pizza size : ");
        int size = scanner.nextInt();
        System.out.println("________________________________________");
        switch (size) {
            case 1:
                pizza.setSize("Large");
                pizza.setBaseprice(4500);
                price=4500;
                break;

            case 2:
                pizza.setSize("Medium");
                pizza.setBaseprice(3000);
                price=3000;
                break;

            case 3:
                pizza.setSize("Small");
                pizza.setBaseprice(1000);
                price=1000;
  
        }

        boolean terminate = false;
        while(!terminate){
        System.out.println("TYPE 'Y' OR 'N' IF YOU WANT DELIVERY [1000 Rwf for Delivery]");
        System.out.println("_______________________________________________________________");
        System.out.print  ("Type here : ");
        String d = scanner.next();
        System.out.println("_________________________________________________________________");

        if (d.toUpperCase().equals("Y")) {
              
            totalPrice = price+1000;
            double amount =1000;
            pizza.setDelivery(amount);
            System.out.println("Total Price is: "+totalPrice);
            terminate =true;
        }

        else if (d.toUpperCase().equals("N")) {
         
            totalPrice = price;
            double amount =0.0;
            System.out.println("Total Price is : "+totalPrice);
            pizza.setDelivery(amount);
            terminate =true;
        }else{
            System.err.println("WRONG NUMBER ENTERED");
            terminate = false;
        }
        }
        
        
        meatOrVegetableOptionSet(pizza,totalPrice);
    }

    public void meatOrVegetableOptionSet(PizzaConfig config,double totalPrice) {

        boolean terminated = false;
        Scanner scan = new Scanner(System.in);

        String category = "";

        while (!terminated) {
            System.out.println("______________________");
            System.out.println("Press 1. For Meat");
            System.out.println("Press 2. For Vegetable");
            System.out.println("_______________________");
            System.out.print("Enter Your Choice : ");
            switch (scan.nextInt()) {

                case 1:
                    String[] meatChoosen = meat();
                    category = "meat";
                    terminated = true;
                    config.setOptionsets(category, meatChoosen, totalPrice);
                case 2:
                    String[] vegetableChoosen = vegetable();
                    category = "vegetable";
                    terminated = true;
                    config.setOptionsets(category,vegetableChoosen, totalPrice);
               requestedOrdering();
            }

        }
    }

    public String[] meat() {
        String arrayOfMeat[] = new String[12];
        boolean terminated = false;

        Scanner scan = new Scanner(System.in);

        while (!terminated) {
            System.out.println("_____________________________________________");
            System.out.println("               Meat Menu                    ");
            System.out.println("______________________________________________");
            System.out.println("Press 1 For Peperoni");
            System.out.println("Press 2 For Ham");
            System.out.println("Press 3 For Beef");
            System.out.println("Press 4 For Anchovy");
            System.out.println("_______________________________________________");
            System.out.println("Press 5 For Vegetable Menu");
            System.out.println("________________________________________________");
            System.out.print  ("Enter Your Choice : ");
            switch (scan.nextInt()) {
                case 1:
                    build.append("Peperoni").append(" ");
                    break;
                case 2:
                     build.append("Ham").append(" ");
                    break;
                case 3:
                    build.append("Beef").append(" ");
                    break;
                case 4:
                    build.append("Anchovy").append(" ");
                    break;
                case 5:

                    terminated = true;
                    break;
            }

        }
        return arrayOfMeat;

    }
    // Method for VegetableOptions


    public String[] vegetable() {
        int size=1;
        String arrayOfVegetable[] = new String[20];
        int i = 0;
        boolean terminated = false;

        Scanner scan = new Scanner(System.in);
        while (!terminated) {
            System.out.println("____________________________________________");
            System.out.println("              VEGETABLE MENU                ");
            System.out.println("_____________________________________________");
            System.out.println("Press 1 For Union");
            System.out.println("Press 2 For Tomatoes");
            System.out.println("Press 3 For Pineaple");
            System.out.println("Press 4 For Mushroom");
            System.out.println("Press 5 For Meat Menu");
            System.out.println("_______________________________________________");
            System.out.println("Press 6 TO Finish Order");
            System.out.println("________________________________________________");
            System.out.print  ("Enter Your Choice : ");
            switch (scan.nextInt()) {
                case 1:
                    build.append("Union").append(" ");
                    break;
                case 2:
                    build.append("Tomatoes").append(" ");
                    break;
                case 3:
                    build.append("Pineaple").append(" ");
                    break;
                case 4:
                    build.append("Mushroom").append(" ");
                    break;        
                case 5:
                    meat();
                    break;
                case 6:
                    terminated = true;
                    break;
            }
        }
        return arrayOfVegetable;
    }
    public void requestedOrdering()
    {
        System.out.println("__________________________________________________________");
        System.out.println("YOUR ORDERED PIZZA DETAILS");
        System.out.println("___________________________________________________________");
        System.out.println("Pizza Name: "+pizza.getName());
        System.out.println("Pizza Size: "+pizza.getSize());
        System.out.println("Pizza Price: "+pizza.getBaseprice());
        double basePrice = pizza.getBaseprice();
        System.out.println("Pizza Derrivering Charge:"+pizza.getDelivery());
        Double deriver = pizza.getDelivery();
        System.out.println("______________________________________________________");
        System.out.println("Ordered Pizza Details :"+pizza.getName()+"  "+build);
        double totalAmount = basePrice + deriver;
        System.out.println("______________________________________________________");
        System.out.println("Total Amount To Pay :"+totalAmount);
        System.out.println("______________________________________________________");
        System.out.println("Thank You For Ordering Pizza With Camellia Restaurant");
        System.out.println("_______________________________________________________");

    }

    
}
