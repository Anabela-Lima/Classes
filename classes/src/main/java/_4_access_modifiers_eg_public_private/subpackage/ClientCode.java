package _4_access_modifiers_eg_public_private.subpackage;

import _4_access_modifiers_eg_public_private.ServiceCode_Vehicle;

public class ClientCode {
    
    public static void main(String[] args) {
        // client code creates objects and uses it method /properties
        ServiceCode_Vehicle serviceCodevehicle = new ServiceCode_Vehicle();

        // ServiceCode_Vehicle = the class , serviceCodevehicle= class name
        // We have defined variable name as serviceCodevehicle
        // ServiceCode_Vehicle(); means we are creating class with no arguments

        serviceCodevehicle.startEngine();
        String kind = serviceCodevehicle.kind;
        System.out.println(kind);

        serviceCodevehicle.



    }
}

