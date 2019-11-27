/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Applogic;

/**
 *
 * @author aashgar
 */
public class Grading {
    private StudentType aStudentType;

    public Grading(String type) {
        if(type.equalsIgnoreCase("Information Technology") ||
               type.equalsIgnoreCase("Engineering") )
            this.aStudentType = new SciStudent();
        else if(type.equalsIgnoreCase("Art") ||
               type.equalsIgnoreCase("Education") ||
                type.equalsIgnoreCase("Business Administration"));
            this.aStudentType = new SocStudent();
    }
    public double compGrade(double mid, double lab, double fin){
        return this.aStudentType.calcGrade(mid, lab, fin);
    }
         
    
}
