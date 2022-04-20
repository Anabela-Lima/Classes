package Brewery;

public class Brewery_Client {

    // Let us declare a main method = Details

    public static void main (String[] args) {
/*
    // Create a class  called Brewery and create a  new Brewery

        Brewery brewery_details = new Brewery("");

    // Add info through setters
/*
        brewery_details.setLocation("2 , compass West Rd, London ");
        brewery_details.setName(" Oscar's Brewery");
        brewery_details.setType(" Craft Breweries ");


        // print details of Brewery

        System.out.println("1. Location: " + brewery_details.getLocation());
        System.out.println( "2. Name: " + brewery_details.getName());
        System.out.println(("3. Type: " + brewery_details.getType()));

        // next we set the values in brewery.java file

*/
//--------------------------------------------Method 2 printing using constructor

        // Now let us try to generate output using Constructors;

        // First go to Brewery.java and generate the to-string method

        // then write the following code for the constructor:


        Brewery brewery = new Brewery( "Oscar's Brewery", " 2  compass West Rd, London", "Craft Breweries ");

        System.out.println(brewery);






    }

}
