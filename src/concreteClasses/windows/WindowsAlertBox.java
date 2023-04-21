package concreteClasses.windows;

import interfaces.AlertBox;

public class WindowsAlertBox implements AlertBox {

    @Override
    public void showAlertBox() {
        System.out.println("please update to the latest windows 11");
    }
}
