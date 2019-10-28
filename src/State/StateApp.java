/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author aashgar
 */
public class StateApp {
    public static void main(String[] args) {
        Context aContext = new Context();
        State openState = new OpenState(aContext);
        openState.doAction();
        
        State closeState = new CloseState(aContext);
        closeState.doAction();
        
        System.out.println(aContext.getaState());
    }
}
