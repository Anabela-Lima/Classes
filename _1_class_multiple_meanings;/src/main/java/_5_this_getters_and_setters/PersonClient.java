package _5_this_getters_and_setters;

public class PersonClient {
    public static void main(String[] args) {



        Person person1 = new Person();

        person1.setName("Collin ");
        person1.setMobile("01338892823");
        person1.setAge(30);



        System.out.println("The person's age is: " + person1.getName());
        System.out.println("The person's mobile is : " + person1.getMobile());
        System.out.println("The person's age is : " + person1.getAge());

        // generating using a constructor - first use a to-string implementation  on person.java file

        // dont forget to input the arguments in correct order that we have our characteristics set i.e. string, string
        // int order

         Person person2 = new Person("Ana", "0776576542", 20);


         System.out.println( "See below the output from using a constructor with string and int arguments ");

        System.out.println(person2);




    }
}
