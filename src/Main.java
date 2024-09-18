import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor to initialize the name and age of the person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for the name field
    public String getName() {
        return name;
    }

    // Getter for the age field
    public int getAge() {
        return age;
    }

    // Overriding the compareTo method to compare persons based on age
    @Override
    public int compareTo(Person other) {

        int nameComp = this.name.compareTo(other.name);
        if (nameComp != 0) {
            return nameComp;
        }
        return Integer.compare(this.age, other.age);
    }

    // Overriding toString for better output readability
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // List of persons
        List<Person> persons = new ArrayList<>();

        // Encapsulated objects created with the Person constructor
        persons.add(new Person("Alex", 27));
        persons.add(new Person("Bo", 28));
        persons.add(new Person("Chris", 56));
        persons.add(new Person("David", 45));
        persons.add(new Person("Amy", 22));
        persons.add(new Person("Fergus", 24));

        // Sorting the list of persons based on their age
        Collections.sort(persons);

        // Display the sorted persons list
        for (Person person : persons) {
            System.out.println(person);
        }

        // List of names (strings)
        List<String> names = new ArrayList<>();

        // Add names to the list
        names.add("Christian");
        names.add("Michael");
        names.add("Richard");
        names.add("Sarah");
        names.add("James");
        names.add("John");

        // Sorting the list of names alphabetically
        Collections.sort(names);

        // Display the sorted names list
        for (String name : names) {
            System.out.println(name);
        }

        if (!names.isEmpty()) {
            System.out.println("Sorted names list:");
            for (String name : names) {
                System.out.println(name);
            }
        } else {
            System.out.println("No names in the list.");
        }
    }
}
