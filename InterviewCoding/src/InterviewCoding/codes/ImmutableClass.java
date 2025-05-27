package InterviewCoding.codes;

public final class ImmutableClass {//class should be final
    private final String name;  //fields should be private and final
    private final int age;

    //Initialization should be onlu with Constructor
    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Only getters, no setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
 // Main method to test the class
    public static void main(String[] args) {
    	ImmutableClass person = new ImmutableClass("Alice", 25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
