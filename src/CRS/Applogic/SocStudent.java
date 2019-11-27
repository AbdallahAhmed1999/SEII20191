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
public class SocStudent implements StudentType{

    @Override
    public double calcGrade(double mid, double lab, double fin) {
        return mid*0.40 + lab*0.10 + fin*0.50;
    }
}
