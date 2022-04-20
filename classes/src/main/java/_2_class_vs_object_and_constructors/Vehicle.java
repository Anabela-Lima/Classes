package _2_class_vs_object_and_constructors;

public class Vehicle  {
        // new Vehicle()  we want to call a construcor of vehicle class

        // passing a string

    //   1 usage-- this constructor will be passed to the vehicle (in main )  that has a storage box for no arguments

        public Vehicle() {
                System.out.println("NO-arg constructor, hardcoded message");
        }

     // how  a constructor differs from the main method:   public static void main(String[] args) {}     -


   // 2 usage ---- this constructor will be passed to vehicle in main that has a storage box for strings

        public Vehicle(String message) {
                System.out.println(message);
        }

}
