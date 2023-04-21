package concreteClasses.linux;

import interfaces.Button;

public class LinuxButton implements Button {

    @Override
    public void accept() {
        System.out.println("linux is starting update");
    }

    @Override
    public void reject() {
        System.out.println("update request from linux is rejected");
    }
}
