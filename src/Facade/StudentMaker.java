/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aashgar
 */
public class StudentMaker{
    private Student itStudnet;
    private Student artStudnet;
    private Student eduStudnet;
    private Student engStudnet;
    private static StudentMaker aMaker;

    private StudentMaker() {
        itStudnet = new ItStudent();
        artStudnet = new ArtStudent();
        engStudnet = new EngStudent();
        eduStudnet = new EdeStudent();
    }

    public static StudentMaker getaMaker() {
        if(aMaker == null)
            aMaker = new StudentMaker();
        return aMaker;
    }
    public void viewIT(){
        itStudnet.view();
    }
    public void viewART(){
        artStudnet.view();
    }
    public void viewEng(){
        engStudnet.view();
    }
    public void viewEdu(){
        eduStudnet.view();
    }

   
    
    
}
