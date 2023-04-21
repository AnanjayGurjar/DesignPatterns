package concreteClasses.linux;

import interfaces.AlertBox;
import interfaces.Button;
import interfaces.GUIElementsFactory;

public class LinuxFactory implements GUIElementsFactory {
    @Override
    public AlertBox createAlertBox() {
        return new LinuxAlertBox();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
