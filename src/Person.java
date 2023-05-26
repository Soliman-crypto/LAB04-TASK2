public class Person implements Comparable<Person> {
    private int age;
    private String name;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

    public int compareByAge(Person person) {
        return Integer.compare(this.age, person.age);
    }
}