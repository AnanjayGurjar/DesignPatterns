package concreteClasses.mac;

import interfaces.AlertBox;
import interfaces.Button;
import interfaces.GUIElementsFactory;

public class MacFactory implements GUIElementsFactory {
    @Override
    public AlertBox createAlertBox() {
        return new MacAlertBox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
