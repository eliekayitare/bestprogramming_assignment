/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import available_pizza.Carbonara;
import available_pizza.Margherita;
import available_pizza.Marinnara;
import basic_class.BasicPizza;
import decorator_meat.AnchavyDecorator;
import decorator_meat.BeefDecorator;
import decorator_meat.HamDecorator;
import decorator_meat.PepperoniDecorator;
import decorator_vegetable.MushroomDecorator;
import decorator_vegetable.OnionDecorator;
import decorator_vegetable.TomatoDecorator;
import interfaces.PizzaConfig;
import java.util.Scanner;
import pizza_sizes.Large;
import pizza_sizes.Medium;
import pizza_sizes.Small;



/**
 *
 * @author Theophile
 */
public class TestPizza {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      PizzaConfig base = new BasicPizza();
      String pizzaName;
      int s;
      int n;
      do{
          System.out.println("                                    Pick Pizza Name                                         ");
          System.out.println("--------------------------------------------------------------------------------------------");
          System.out.println("Press 1 For Margherita | Press 2 For Marinnara | Press 3 For Carbonara | Press 4 For Display");
          System.out.println("---------------------------------------------------------------------------------------------");
          System.out.print ("                                    Please Choose : ");
          n = sc.nextInt();
          System.out.println("---------------------------------------------------------------------------------------------");
          switch(n){
              case 1:
          base = new Margherita(base);
          System.out.println("Pizza Name Picked : "+"Margherita");  // PIZZA NAME THAT USER PICKED
                        do{
          System.out.println("                 Pick Pizza Size                          ");
          System.out.println("----------------------------------------------------------");
          System.out.println("Press 1 For Small | Press 2 For Medium | Press 3 For Large");
          System.out.println("----------------------------------------------------------");
          System.out.print ("                  Please Choose : ");
          s = sc.nextInt();
          System.out.println("----------------------------------------------------------");
          switch(s){
              case 1:
          System.out.println("Pizza Size Picked : "+"Small");     // PIZZA SIZE THAT USER PICKED   
          base = new Small(base);
                  int ch;
       do{
        System.out.println("                       Make Your Choice                     ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press 0 For Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                     Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                               Meat Ingridients Option                                              ");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham | Press 0 For Back");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.print("                                 Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("----------------------------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                                    Vegetable Ingridients Option                                           ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes | Press 0 For Back ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.print("                                         Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else {
            System.out.println("Wrong Numer Entered");
        }
         
    }while(ch!=0);

                  break;
              case 2:                                                  // HERE SIZE
       
         System.out.println("Pizza Size Picked : "+"Medium");     // PIZZA SIZE THAT USER PICKED   
         base = new Medium(base);      
                  
                  
                  
                  
       do{
        System.out.println("                      Make Your Choice                      ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press 3 For Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                    Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                           Meat Ingridients Option                               ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                               Press 0 For Back                                  ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("                              Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                         Vegetable Ingridients Option                                  ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                             Press 0 For Back                                          ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("                               Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else {
            System.out.println("Wrong Number Entered");
        }
         
    }while(ch!=0);
                  
                  break;
              case 3:
          System.out.println("Pizza Size Picked : "+"Large");     // PIZZA SIZE THAT USER PICKED   
          base = new Large(base);    
                   do{
        System.out.println("                        Make Your Choice                    ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press For 3 Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                       Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                               Meat Ingridients Option                           ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                                  Press 0 For Back");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("                                   Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                          Vegetable Ingridients Option                                 ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                             Press 0 For Back ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("                               Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else {
            System.out.println("Wrong Number Entered");
        }
         
    }while(ch!=0);
                  break;
                  
       
      
             
      }
      }while(s!=0);
                        // CASE 1
                  break;
              case 2:
          base = new Marinnara(base);
          System.out.println("Pizza Name Picked : "+"Marinnara");
                        do{
          System.out.println("                                 Pick Pizza Size                             ");
          System.out.println("-----------------------------------------------------------------------------");
          System.out.println("Press 1 For Small | Press 2 For Medium | Press 3 For Large | Press 0 For Back");
          System.out.println("-----------------------------------------------------------------------------");
          System.out.print ("                                    Please Choose : ");
          s = sc.nextInt();
          System.out.println("------------------------------------------------------------------------------");
          switch(s){
              case 1:
          System.out.println("Pizza Size Picked : "+"Small");        
          base = new Small(base);     
                  int ch;
       do{
        System.out.println("                      Make Your Choice                      ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press 0 For Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                     Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                           Meat Ingridients Option                               ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                             Press 0 For Back                                    ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("                              Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                        Vegetable Ingridients Option                                   ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                             Press 0 For Back                                          ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("                             Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else {
            System.out.println("Wrong Number Entered");
        }
         
    }while(ch!=0);
    
      
                  break;
              case 2:
          System.out.println("Pizza Size Picked : "+"Medium");     // PIZZA SIZE THAT USER PICKED   
          base = new Medium(base);
       
       do{
        System.out.println("                         Make Your Choice                   ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press 0 For Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                       Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                         Meat Ingridients Option                                 ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                             Press 0 For Back                                    ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("                               Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                          Vegetable Ingridients Option ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                              Press 0 For Back ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("                                Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("----------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else {
            System.out.println("Wrong Number Entered");
        }
         
    }while(ch!=0);
                  
                  break;
              case 3:
          System.out.println("Pizza Size Picked : "+"Large");     // PIZZA SIZE THAT USER PICKED   
          base = new Large(base);   
                   do{
        System.out.println("                        Make Your Choice                    ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press 0 For Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                       Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("-------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                             Meat Ingridients Option                             ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                                Press 0 For Back                                 ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("                                Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                          Vegetable Ingridients Option                                 ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                              Press 0 For Back                                         ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("                               Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else{
           System.out.println("Wrong Number Entered");
        }
         
    }while(ch!=0);
                  break;
                  
       
      
             
      }
      }while(s!=0); 
                        // CASE 2
                  break;
              case 3:
          base = new Carbonara(base);
          System.out.println("Pizza Name Picked : "+"Carbonnara");        
                        do{
          System.out.println("                                 Pick Pizza Size                             ");
          System.out.println("-----------------------------------------------------------------------------");
          System.out.println("Press 1 For Small | Press 2 For Medium | Press 3 For Large | Press 0 For Back");
          System.out.println("-----------------------------------------------------------------------------");
          System.out.print ("                                   Please Choose : ");
          s = sc.nextInt();
          System.out.println("-----------------------------------------------------------------------------");
          switch(s){
              case 1:
          System.out.println("Pizza Size Picked : "+"Small");        
          base = new Small(base);        
                  int ch;
       do{
        System.out.println("                            Make Your Choice                ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press 0 For Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                          Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                         Meat Ingridients Option ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                            Press 0 For Back");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("                             Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("----------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                          Vegetable Ingridients Option                                 ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                                Press 0 For Back ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("                                Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else {
           System.out.println("Wrong Number Entered");
        }
         
    }while(ch!=0);
    
      
                  break;
              case 2:
           System.out.println("Pizza Size Picked : "+"Medium");     // PIZZA SIZE THAT USER PICKED   
          base = new Medium(base);        
       
       do{
        System.out.println("                             Make Your Choice               ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press 0 For Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                          Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                                Meat Ingridients Option ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                                   Press 0 For Back");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("                                   Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                          Vegetable Ingridients Option                                 ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                               Press 0 For Back                                        ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("                                Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else {
           System.out.println("Wrong Number Entered");
        }
         
    }while(ch!=0);
                  
                  break;
              case 3:
          System.out.println("Pizza Size Picked : "+"Large");     // PIZZA SIZE THAT USER PICKED   
          base = new Large(base);        
                   do{
        System.out.println("                           Make Your Choice                 ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Press 1 For Meat | Press 2 For Vegetables | Press 0 For Back");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("                          Make Your Choice : ");
        ch= sc.nextInt();
        System.out.println("------------------------------------------------------------");
        if(ch==1){
           
            int m;
        do{
        System.out.println("                            Meat Ingridients Option                              ");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Beef | Press 2 For Pepperoni | Press 3 For Anchavy | Press 4 For Ham");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                               Press 0 For Back");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("                                Make Your Choice : ");
        m = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        switch(m){
            case 1:
                System.out.println("Ingridient Beef Added ");
                base = new BeefDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Pepperoni Added ");
                base = new PepperoniDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Anchavy  Added ");
                base = new AnchavyDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Ham Added ");
                base = new HamDecorator(base);
                break;    
            case 0:
                
                break;    
            case 9:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(m!=0);   
        }else if(ch==2){

        int v;
        do{
        System.out.println("                           Vegetable Ingridients Option                                ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" Press 1 For Mushroom | Press 2 For Onion | Press 3 For Pineaple | Press 4 For Tomatoes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                                Press 0 For Back                                       ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("                                 Make Your Choice : ");
        v = sc.nextInt();
        System.out.println("---------------------------------------------------------------------------------------");
        switch(v){
            case 1:
                System.out.println("Ingridient Mushroom Added ");
                base = new MushroomDecorator(base);
                break;
            case 2:
                System.out.println("Ingridient Onion Added ");
                base = new OnionDecorator(base);
                break;
            case 3:
                System.out.println("Ingridient Pineaple Added ");
                base = new PepperoniDecorator(base);
                break;
            case 4:
                System.out.println("Ingridient Tomatoes Added ");
                base = new TomatoDecorator(base);
                break;    
            case 0:
                break;
            case 8:
                System.out.println("Wrong Number Entered !");
                default:
                    
        }
        
        }while(v!=0);
        
        }else {
            System.out.println("Wrong Number Entered");
        }
         
    }while(ch!=0);
                  break;
     
      }
      }while(s!=0);
                        // CASE 3
                  break;
              case 4:
                  display(base);
                  break;
              case 0:
                  default:
                      System.out.println("Wrong Number Entered");
          }

    }while(n!=0);
      }
        public static void display(PizzaConfig pizza) {
         System.out.println("-----------------------------------------------------------");
         System.out.println("                    ORDERED PIZZA                          ");
         System.out.println("-----------------------------------------------------------");
         System.out.println(pizza.name());
         System.out.println(pizza.size());
         System.out.println(" Pizza Ingridients  : "+pizza.ingridients());
         System.out.println(" Pizza Price To Pay : "+pizza.price());
         System.out.println("-----------------------------------------------------------");
     }   
    
}

