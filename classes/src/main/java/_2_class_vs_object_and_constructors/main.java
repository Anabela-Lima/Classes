package _2_class_vs_object_and_constructors;
//constructing objects

public class main {
    public static void main(String[] args) {

        // ----------------vehicle 2 is created using a constructor with String param (constructor with string)

        // look at constructors file- we passed the constructor with string message to the vehicle that has
        // a box for storage of strings - which is vehicle 2

        Vehicle vehicle2= new Vehicle("A message passed to a constructor");                         //vehicle1 is a reference variable that points to
                                                                // java memory- what is its class? =Vehicle



        // -----------------vehicle 1 is created using a no-arg constructor (constructor with no argument)
        // we will pass a non string

        Vehicle vehicle1 = new Vehicle();



    }
}
