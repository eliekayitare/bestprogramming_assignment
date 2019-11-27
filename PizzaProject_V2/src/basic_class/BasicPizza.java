/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_class;
import interfaces.PizzaConfig;

/**
 *
 * @author kayitare
 */

public class BasicPizza  implements PizzaConfig  {
 @Override
    public double price() {
        return 200;
    }

    @Override
    public String ingridients() {
        return "";
    }

    @Override
    public String name() {
        return " Pizza Name         :";
    }

    @Override
    public String size() {
       return " Pizza Size         :"; 
    }


    
}
