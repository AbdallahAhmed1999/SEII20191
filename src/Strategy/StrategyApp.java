/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author aashgar
 */
public class StrategyApp {
    public static void main(String[] args) {
        Grading aGrading = new Grading(new ItStudent());
        System.out.printf("Grade is:%10.2f\n",aGrading.computeGrade(99, 77, 99));
        aGrading.setaStudent(new ArtStudent());
        System.out.printf("Grade is:%10.2f\n",aGrading.computeGrade(99, 77, 99));
    }
}
