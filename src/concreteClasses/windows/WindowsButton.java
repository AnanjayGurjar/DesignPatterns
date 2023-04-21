package concreteClasses.windows;

import interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void accept() {
        System.out.println("windows is starting update");
    }

    @Override
    public void reject() {
        System.out.println("update request from windows is rejected");
    }
}
