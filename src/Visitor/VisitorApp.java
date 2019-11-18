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
public class VisitorApp {
    public static void main(String[] args) {
        OrderItem order = new Order();
        order.accept(new OrderItemVisitorView());
    }
}
