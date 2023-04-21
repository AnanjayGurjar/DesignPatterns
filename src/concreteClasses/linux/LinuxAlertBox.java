package concreteClasses.linux;

import interfaces.AlertBox;

public class LinuxAlertBox implements AlertBox {

    @Override
    public void showAlertBox() {
        System.out.println("please update linux to latest version 20.1.0");
    }
}
