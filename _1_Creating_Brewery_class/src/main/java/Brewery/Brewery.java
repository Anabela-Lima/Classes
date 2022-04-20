package Brewery;

public class Brewery {

    // Let us set characteristics for Brewery

    private String Name;
    private String Location;
    private String Type;

/*
    // Generate getters and setters


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
*/
    // Generating using constructor

  // create a constructor

    // if we want to pass out the object through the sout i.e. to print we must use the to-string method


    @Override
    public String toString() {
        return "Brewery{" +
                "Name='" + Name + '\'' +
                ", Location='" + Location + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }

    // creating the constructor
    public Brewery(String name, String location, String type) {
        Name = name;
        Location = location;
        Type = type;

  // Implement to-string method

        // to do that press command + n then click to-string
        // Note : it moves to the top before constructor












    }

}
