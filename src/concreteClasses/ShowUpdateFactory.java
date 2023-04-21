package concreteClasses;

import concreteClasses.linux.LinuxFactory;
import concreteClasses.mac.MacFactory;
import concreteClasses.windows.WindowsFactory;
import interfaces.AlertBox;
import interfaces.GUIElementsFactory;
import java.util.Scanner;

public class ShowUpdateFactory {
    private GUIElementsFactory elementsFactory;
    public ShowUpdateFactory(OperatingSystem os){
        if(os == OperatingSystem.WINDOWS){
            elementsFactory = new WindowsFactory();
        }else if(os == OperatingSystem.MACOS){
            elementsFactory = new MacFactory();
        }else{
            elementsFactory = new LinuxFactory();
        }
    }

    public void updateOS(){
        Scanner sc = new Scanner(System.in);
        elementsFactory.createAlertBox().showAlertBox();

        System.out.println("Do you want to proceed: (Y/N)");
        char c = sc.next().toUpperCase().charAt(0);

        if(c == 'Y'){
            elementsFactory.createButton().accept();
        }else{
            elementsFactory.createButton().reject();
        }
    }
}