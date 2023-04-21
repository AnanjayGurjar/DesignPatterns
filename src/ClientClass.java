import concreteClasses.OperatingSystem;
import concreteClasses.ShowUpdateFactory;

import java.util.Random;

public class ClientClass {
    //provides interface for creating families of related or dependent objects without specifying their concrete class
    //factory pattern constructs single object
    //abstract factory construct multiple object
    public static void main(String[] args) {
        OperatingSystem os = getOSFromConfig();
        ShowUpdateFactory showUpdate = new ShowUpdateFactory(os);
        showUpdate.updateOS();
    }

    private static OperatingSystem getOSFromConfig(){
        Random r= new Random();
        int osType = r.nextInt()%3;
        if(osType == 1){
            return OperatingSystem.LINUX;
        }else if(osType == 2){
            return OperatingSystem.MACOS;
        }else{
            return OperatingSystem.WINDOWS;
        }
    }
}
