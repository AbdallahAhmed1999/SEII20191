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
public class DecoratorApp {
    public static void main(String[] args) {
        Program aProgram = new DbCourse(
              new AlgoCourse(
               new SeCourse(
                   new SeCourse(
                       new Student("Ahmad")))));
      aProgram.view();
        
    }
}
