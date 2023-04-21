package concreteClasses.mac;

import interfaces.Button;

public class MacButton implements Button {
    @Override
    public void accept() {
        System.out.println("Mac is starting update");

    }

    @Override
    public void reject() {
        System.out.println("update request from Mac is rejected");
    }
}
