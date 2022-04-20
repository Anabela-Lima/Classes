package _5_this_getters_and_setters;

public class Person {

        // Set Characteristics

        private String name;
        private String mobile;
        private int age;

     // had to create  constructor with empty argument so I can run the person 1 and person 2 without commenting them
    // out individually as program thought I was trying to pass characteristics of datatypes string and ints through a
    // no argument constructor

    public Person() {

    }


    // creating a constructor for no argument person 1



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    // Construcor-------------------------

    // to string implementation
    // hit command n

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                '}';
    }

        public Person(String name, String mobile, int age) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
    }

  }
