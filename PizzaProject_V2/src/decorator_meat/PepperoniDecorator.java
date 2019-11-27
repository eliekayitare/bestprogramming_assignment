/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_meat;

import interfaces.PizzaConfig;
import pizza_decorator.PizzaDecorator;

/**
 *
 * @author kayitare
 */
public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(PizzaConfig decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public double price() {
        return decoratedPizza.price()+200;
    }

    @Override
    public String ingridients() {
        return decoratedPizza.ingridients()+addPepperoni();
    }
    public String addPepperoni(){
      return "Pepperoni ";  
    }
    
}
