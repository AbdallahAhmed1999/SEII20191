/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author aashgar
 */
public interface OrderItemVisitor {
    public void visit(Bread aBread);
    public void visit(Cheese aCheese);
    public void visit(Tea aTea);
    public void visit(Order anOrder);
}
