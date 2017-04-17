/*
 * Name: Jack Brashier
 * Date: 04/12/2017
 * Purpose: To demonstrate understanding of and ability to create classes in Java.
 */
public class Person {
    String name;
    double height;
    String uName;
    String pWord;
    Address address;
    String language;
    int age;

    /**Default constructors of name John and age 35.*/
    public Person() {
        this.name = "John";
        this.age = 35;
    }
    /**Custom constructor allows setting of name and age variables*/
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //methods:

    /**Returns the name of the Person*/
    public String getName() { return name; }

    /**Returns the age of the Person*/
    public int getAge() { return age; }

    /**Sets a new name for the Person*/
    public void setName(String name) {
        this.name = name;
    }

    /**Sets a new age for the Person*/
    public void setAge(int age) { this.age = age; }

    /**Returns a string detailing name and age of the Person*/
    public String toString() {
        String output = (this.name + " is " + this.age + ".");
        return output;
    }

    /**Returns true or false depending on whether Persons are equal*/
    public boolean equals(Person personB) {
        if ((this.getName() == personB.getName()) && (this.getAge() == personB.getAge())) {
            return true;
        } else {
            return false;
        }
    }

    /**Returns true or false depending on whether Persons have the same name*/
    public boolean sameName(Person personB) {
        if (this.getName() == personB.getName()) {
            return true;
        } else {
            return false;
        }
    }

    /**Returns true or false depending on whether Persons have the same age.*/
    public boolean sameAge(Person personB) {
        if (this.getAge() == personB.getAge()) {
            return true;
        } else {
            return false;
        }
    }

    /**Returns the name of the person that is older*/
    public String older(Person personB) {
        String returnString;
        if (this.getAge() > personB.getAge()) {
            returnString = this.getName() + " is the older of the two.";
        } else if (this.getAge() < personB.getAge()) {
            returnString = personB.getName() + " is the older of the two.";
        } else {
            returnString = "Neither is older than the other.";
        }
        return returnString;
    }

    /**Returns the name of the Person that is younger*/
    public String younger(Person personB) {
        String returnString;
        if (this.getAge() > personB.getAge()) {
            returnString = personB.getName() + " is the younger of the two.";
        } else if (this.getAge() < personB.getAge()) {
            returnString = this.getName() + " is the younger of the two.";
        } else {
            returnString = "Neither is younger than the other.";
        }
        return returnString;
    }
}