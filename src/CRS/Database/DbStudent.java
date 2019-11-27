/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import CRS.Applogic.Student;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class DbStudent {
    private Statement aStatement;
    public void addStudent(Student aStudent){
        DbConnection aDbConnection = DbConnection.getaDbConnection();        
        try {
            this.aStatement = aDbConnection.getStatement();
            String sql="Insert into Students(name,major,grade) Values('"+
                aStudent.getName() +"','"+
                aStudent.getMajor()+"',"+
                aStudent.getGrade()+")";
            this.aStatement.executeUpdate(sql);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
