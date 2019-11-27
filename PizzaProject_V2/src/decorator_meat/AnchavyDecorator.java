package decorator_meat;

import interfaces.PizzaConfig;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayitare
 */
public class AnchavyDecorator extends pizza_decorator.PizzaDecorator {
      public AnchavyDecorator(PizzaConfig decoratedPizza) {
        super(decoratedPizza);
    }
     @Override
    public double price() {
        return decoratedPizza.price()+600;
    }

    @Override
    public String ingridients() {
        return decoratedPizza.ingridients()+addAnchavy();
    }
    public String addAnchavy(){
      return "Anchavy ";  
    }
}
