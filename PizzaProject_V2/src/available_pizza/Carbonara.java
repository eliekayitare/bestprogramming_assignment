/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package available_pizza;
import interfaces.PizzaConfig;
/**
 *
 * @author kayitare
 */
public class Carbonara extends pizza_decorator.PizzaDecorator {
     public Carbonara(PizzaConfig decoratedPizza) {
        super(decoratedPizza);
    }

     @Override
    public String name() {  
        return decoratedPizza.name()+" Carbonara";
    }

    
}
