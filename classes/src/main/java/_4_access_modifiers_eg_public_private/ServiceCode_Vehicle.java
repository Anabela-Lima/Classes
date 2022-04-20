package _4_access_modifiers_eg_public_private;
/* UML class DIAGRAM - graphical rep of classes

      +------------------------+
      |        ClassName       |    <- name of class
      +------------------------+
      |  +   propname: Type      |    <- properties of section : property is a string
      +------------------------+
      |  +  methodName: returnType |    <- methods section: string, boolean (returns true or false) void  (returns nothing)
      +-----------------------+

-------------------  specifying on uml diagram, the access modifier -----------------------------------

+ public    : will be visible everywhere in the code no  matter package or class

 hash symbol =  protected = package private+

 tilda symbol = default (package private)

 - private   : inside a specific package

-----------------------------------
Lets create the class below

      +--------------------+
      |        Vehicle     |    <- name of class
      +--------------------+
      |     Kind:String    |    <- properties of section : property is a string
      +--------------------+
      | startEngine():void |    <- methods section   : method name here is void, doesnt return anything
      +--------------------+

  */


   // step 1: specify name of class
     public class ServiceCode_Vehicle {


    // step 2: specify property

    String kind = "A hardcoded value of the kind of property";    // we didnt use access modifier, so java uses default =package private

    // step 3: specify method
    //  our method is not supposed to return anything

     void startEngine() {
        System.out.println(("The engine has started!"));

    }

}
