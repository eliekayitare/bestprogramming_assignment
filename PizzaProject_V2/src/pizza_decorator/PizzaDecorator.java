/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_decorator;

/**
 *
 * @author kayitare
 */
import interfaces.PizzaConfig;
public class PizzaDecorator implements PizzaConfig {
         protected PizzaConfig decoratedPizza;

    public PizzaDecorator(PizzaConfig decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
     
    @Override
    public double price() {
        return decoratedPizza.price();
    }

    @Override
    public String ingridients() {
        return decoratedPizza.ingridients();
    }

    @Override
    public String name() {
       
        return decoratedPizza.name();
    }

    @Override
    public String size() {
        return decoratedPizza.size();
    }
}
