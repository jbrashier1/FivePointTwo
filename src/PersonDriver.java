/**
 * Created by jackbrashier on 4/12/17.
 */
public class PersonDriver {
    public static void main(String [] args) {

        Person Jack = new Person ("Jack", 18);
        Person Violet = new Person("Violet", 15);
        System.out.println("(getName and getAge) " + Jack.getName() + " is " + Jack.getAge());
        System.out.println("(getName and getAge) " + Violet.getName() + " is " + Violet.getAge());
        Violet.setName("Sister");
        System.out.println("(setName, getName, and getAge) " + Violet.getName() + " is " + Violet.getAge());
        System.out.println("(Jack.toString()) " + Jack.toString());
        System.out.println("(Jack.equals(Violet)) " + Jack.equals(Violet));
        System.out.println("(Jack.sameName(Violet)) " + Jack.sameName(Violet));
        System.out.println("(Jack.sameAge(Violet)) " + Jack.sameAge(Violet));
        System.out.println("(Jack.older(Violet)) " + Jack.older(Violet));
        System.out.println("(Jack.younger(Violet)) " + Jack.younger(Violet));
    }
}
