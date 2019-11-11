/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author aashgar
 */
public class Student implements Program{
    private String name;

    public Student(String name) {
        this.name = name;
    }
    
    @Override
    public void view() {
        System.out.println("Student: "+this.name);
    }
}
