/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author aashgar
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {
        Course aCourse1 = Course.getaCourse();
        aCourse1.setaDegree(new BscDegree());
        aCourse1.view("SW Engineering 2", "Introduces design patterns ...","Abdelkareem Alashqar");
        
        Course aCourse2 = Course.getaCourse();
        aCourse2.setaDegree(new MscDegree());
        aCourse2.view("SW Engineering 2", "Introduces design patterns ...","Ahmad Maher");
        
        Course aCourse3 = Course.getaCourse();
        aCourse3.setaDegree(new PhdDegree());
        aCourse3.view("Software Security", "Introduces main Concepts of ...","Huda Naser");
    }
}
