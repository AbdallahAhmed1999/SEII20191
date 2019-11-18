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
public class Order implements OrderItem{
    private OrderItem[] items;

    public Order() {
        items = new OrderItem[]{new Bread(), new Cheese(), new Tea()};
    }
    
    @Override
    public void accept(OrderItemVisitor anItemVisitor) {
        anItemVisitor.visit(this);
        for(OrderItem orderItem: items)
            orderItem.accept(anItemVisitor);
    }
}
