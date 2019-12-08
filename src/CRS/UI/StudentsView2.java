/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.UI;
import CRS.Applogic.Student;
import CRS.Applogic.StudentModel;
import java.util.Comparator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aashgar
 */
public class StudentsView2 extends javax.swing.JPanel 
        implements Observer{
    private StudentModel aStudentModel;
    /**
     * Creates new form StudentsView2
     */
    public StudentsView2() {
        initComponents();
    }

    public void setStudentModel(StudentModel aStudentModel) {
        this.aStudentModel = aStudentModel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudents = new javax.swing.JTable();

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudents;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        List<Student> students = ((StudentModel) o).getStudents();
        students =students.stream()
                    .sorted(Comparator.comparing(Student::getMajor).reversed())
                    .collect(Collectors.toList());
        String[] title = {"Name", "Major", "Grade"};
        DefaultTableModel aDefaultTableModel = new DefaultTableModel(title,0);
        for(Student aStudent: students){
            Object[] row = {aStudent.getName(),aStudent.getMajor(),aStudent.getGrade()};
            aDefaultTableModel.addRow(row);
        }
        jTableStudents.setModel(aDefaultTableModel);
    }
}