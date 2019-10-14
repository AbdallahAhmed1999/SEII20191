/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author aashgar
 */
public class FactoryApp {
    public static void main(String[] args) {
        Student aStudent = Factory.getStudent("it");
        aStudent.showData();
        
        aStudent = Factory.getStudent("eng");
        aStudent.showData();
    }
    
}
