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
public class Course {
    private Title aTitle;
    private Content aContent;
    private Teacher aTeacher;
    private Degree aDegree;
    private static  Course aCourse;

    private Course() {
    }

    public static Course getaCourse() {
        if(aCourse == null)
            aCourse = new Course();
        return aCourse;
    }

    public void setaDegree(Degree aDegree) {
        this.aDegree = aDegree;
    }
    public void view(String tData, String cData, String hData){
        this.aTitle = this.aDegree.getTitle();
        this.aContent = this.aDegree.getContent();
        this.aTeacher = this.aDegree.getTeacher();
        System.out.println("View Course Data ...");
        this.aTitle.view(tData);
        this.aContent.view(cData);
        this.aTeacher.view(hData);
        System.out.println("======================================");
        
    }
    
}
