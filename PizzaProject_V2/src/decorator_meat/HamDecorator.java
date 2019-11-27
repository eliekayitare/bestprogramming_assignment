/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_meat;

import interfaces.PizzaConfig;

/**
 *
 * @author kayitare
 */
public class HamDecorator extends pizza_decorator.PizzaDecorator {
     public HamDecorator(PizzaConfig decoratedPizza) {
        super(decoratedPizza);
    }
    
     @Override
    public double price() {
        return decoratedPizza.price()+550;
    }

    @Override
    public String ingridients() {
        return decoratedPizza.ingridients()+addHam();
    }
    public String addHam(){
      return "Ham ";  
    }
    
    
}
