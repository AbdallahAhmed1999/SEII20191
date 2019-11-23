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
public class ObserverApp {
    public static void main(String[] args) {
        Source aSource = new Source();
        Observer smallObserver = new SmallObserver(aSource);
        Observer largeObserver = new LargeObserver(aSource);
        aSource.setData("SW Design");
        aSource.setData("Test");
    }
 
}
