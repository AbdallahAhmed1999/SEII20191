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
public class Factory {
    public static Student getStudent(String type){
        if(type.equalsIgnoreCase("IT"))
            return new ItStudent();
        else if (type.equalsIgnoreCase("ENG"))
            return new EngStudent();
        else if(type.equalsIgnoreCase("ART"))
            return new ArtStudent();
        else
            return new ItStudent();
    }
    
}
