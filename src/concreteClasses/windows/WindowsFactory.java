package concreteClasses.windows;

import interfaces.AlertBox;
import interfaces.Button;
import interfaces.GUIElementsFactory;

public class WindowsFactory implements GUIElementsFactory {

    @Override
    public AlertBox createAlertBox() {
        return new WindowsAlertBox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
