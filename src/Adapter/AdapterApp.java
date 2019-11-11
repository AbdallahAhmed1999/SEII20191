/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author aashgar
 */
public class AdapterApp {
    public static void main(String[] args) {
        Grading aGrading = new Grading();
        System.out.println("Grades: "+
                aGrading.computeGrade(99.1, 77.77, 81.01));
    }
}
