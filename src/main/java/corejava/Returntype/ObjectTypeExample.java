package corejava.Returntype;

public class ObjectTypeExample {

    public static void main(String[] args) {
        ObjectTypeExample example = new ObjectTypeExample();
        String greeting = example.getGreeting();
        System.out.println("Greeting: " + greeting);
    }

    public String getGreeting() {
        return "Hello, world!";
    }
}
