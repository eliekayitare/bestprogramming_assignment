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
public class TomatoDecorator extends PizzaDecorator{
 public TomatoDecorator(PizzaConfig decoratedPizza) {
        super(decoratedPizza);
    }
 
    @Override
    public double price() {
        return decoratedPizza.price()+230;
    }

    @Override
    public String ingridients() {
        return decoratedPizza.ingridients()+addTomatoes();
    }
    public String addTomatoes(){
      return "Tomatoes ";  
    }
}
