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
public class DipDegree implements Degree{

    @Override
    public Title getTitle() {
        return new DipTitle();
    }

    @Override
    public Content getContent() {
        return new DipContent();
    }

    @Override
    public Teacher getTeacher() {
        return new DipTeacher();
    }
    
}
