package simple_programs;

public class GetSet {
    private String name;
    private int age;

    // Getter for 'name'
    public String netname() {
        return name;
    }

    // Setter for 'name'
    public void petname(String name) {
        this.name = name;
    }

    // Getter for 'age'
    public int netage() {
        return age;
    }

    // Setter for 'age'
    public void petage(int age) {
        // Adding a condition to ensure valid age
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive value!");
        }
    }

    public static void main(String[] args) {
        // Create an object of the Person class
        GetSet person = new GetSet();

        // Use setters to set values
        person.petname("Rahul");
        person.petage(25);

        // Use getters to retrieve values
        System.out.println("Name: " + person.netname());
        System.out.println("Age: " + person.netage());

        // Try setting an invalid age
        person.petage(-5); // This will print an error message
    }
    
}
