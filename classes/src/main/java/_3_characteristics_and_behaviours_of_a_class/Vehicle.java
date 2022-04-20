package _3_characteristics_and_behaviours_of_a_class;
/* UML- unified modern language  class DIAGRAM - graphical rep of classes

      +------------------------+
      |        ClassName       |    <- name of class
      +------------------------+
      |    propname: Type      |    <- properties of section : property is a string
      +------------------------+
      | methodName: returnType |    <- methods section: string, boolean (returns true or false) void  (returns nothing)
      +-----------------------+

--------------------------

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
     public class Vehicle {


    // step 2: specify property

    String kind = "A hardcoded value of the kind of property";

    // step 3: specify method

       // our method is not supposed to return anything

    void startEngine() {
        System.out.println(("The engine has started!"));

    }

}
