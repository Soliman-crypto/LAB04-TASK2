import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        String you = sc.next();

        System.out.print("Other person's name: ");
        String other = sc.next();

        Person anyone = new Person(you, 21, false);
        Person otherPerson = new Person(other, 12, true);

        System.out.println("Exercise 2a:");
        int nameComparisonResult = anyone.compareTo(otherPerson);
        if (nameComparisonResult == 0) {
            System.out.println("You have the same name.");
        } else if (nameComparisonResult > 0) {
            System.out.println("Your name is longer.");
        } else {
            System.out.println("The other person's name is longer than yours.");
        }

        System.out.println("Exercise 2b:");
        Person[] people = {
                new Person("Ahmed", 21, false),
                new Person("Amr", 32, true),
                new Person("Joe", 22, false)
        };
        Person maxPerson = GenericMaxElement.FindTheMaxElement(people, Person::compareByAge);

        System.out.println("Max element: " + maxPerson.getName());
        System.out.println(maxPerson.getName() + " has the highestage among all the people in the array.");
    }
}