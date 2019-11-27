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
public class BeefDecorator extends PizzaDecorator {
     public BeefDecorator(PizzaConfig decoratedPizza) {
        super(decoratedPizza);
    }
     @Override
    public double price() {
        return decoratedPizza.price()+400;
    }

    @Override
    public String ingridients() {
        return decoratedPizza.ingridients()+addBeef();
    }
    public String addBeef(){
      return "Beef ";  
    }
    
    
}
