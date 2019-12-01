/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import CRS.Applogic.Student;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
            String sql= "Insert into students(name,major,grade) values('"+
                    aStudent.getName() +"','"+
                    aStudent.getMajor()+"',"+
                    aStudent.getGrade()+")";
            this.aStatement.executeLargeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        DbConnection aDbConnection = DbConnection.getaDbConnection();
        try {
            this.aStatement = aDbConnection.getStatement();
            String sql="Select * From Students";
            ResultSet rs = this.aStatement.executeQuery(sql);
            while(rs.next()){
                Student aStudent = new Student();
                aStudent.setName(rs.getString("name"));
                aStudent.setMajor(rs.getString("major"));
                aStudent.setGrade(rs.getDouble("grade"));
                students.add(aStudent);
            }
            } catch (Exception ex) {
            ex.printStackTrace();
                }
        return students;
   }
}
