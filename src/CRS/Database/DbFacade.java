/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import CRS.Applogic.Student;
import java.util.List;

/**
 *
 * @author aashgar
 */
public class DbFacade {
    private DbUser aDbUser;
    private DbStudent aDbStudent;
    private static DbFacade aDbFacade;

    private DbFacade() {
        this.aDbUser = new DbUser();
        this.aDbStudent = new DbStudent();
    }

    public static DbFacade getaDbFacade() {
        if(aDbFacade == null)
            aDbFacade = new DbFacade();
        return aDbFacade;
    }
    public boolean verifyUser(String userName, String password){
        return this.aDbUser.verifyUser(userName, password);
    }
    public void addStudent(Student aStudent){
        this.aDbStudent.addStudent(aStudent);
    }
     public List<Student> getStudents(){
         return this.aDbStudent.getStudents();
     }
    
}
