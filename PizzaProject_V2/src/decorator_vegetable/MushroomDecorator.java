/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_vegetable;

import interfaces.PizzaConfig;
import pizza_decorator.PizzaDecorator;

/**
 *
 * @author kayitare
 */
public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(PizzaConfig decoratedPizza) {
        super(decoratedPizza);
    }
    
   @Override
    public double price() {
        return decoratedPizza.price()+300;
    }

    @Override
    public String ingridients() {
        return decoratedPizza.ingridients()+addMushroom();
    }
    public String addMushroom(){
      return "Mushroom ";  
    }
    }