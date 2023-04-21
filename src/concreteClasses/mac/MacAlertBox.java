package concreteClasses.mac;

import interfaces.AlertBox;

public class MacAlertBox implements AlertBox {

    @Override
    public void showAlertBox() {
        System.out.println("update to latest mac-os");
    }
}
