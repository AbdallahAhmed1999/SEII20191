/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author aashgar
 */
public class SmallObserver extends Observer{

    public SmallObserver(Source aSource) {
        super(aSource);
    }

    @Override
    public void update() {
        System.out.println(this.aSource.getData().toLowerCase());
    }
    
}
