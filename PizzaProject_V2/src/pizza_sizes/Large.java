/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_sizes;

import interfaces.PizzaConfig;

/**
 *
 * @author kayitare
 */
public class Large extends pizza_decorator.PizzaDecorator {
    public Large(PizzaConfig decoratedPizza) {
        super(decoratedPizza);
    }
     @Override
    public String size() {
        return decoratedPizza.size()+" Large";
    } 
}
