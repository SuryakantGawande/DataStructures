package java8.useof_lambda;
@FunctionalInterface
interface Employee{
    String getName();
}
public class Main {
    public static void main(String[] args) {
        Employee javaDeveloper =() -> "Java Developer: Suryakant Gawande";
        System.out.println(javaDeveloper.getName());

        Employee tester =() ->"Software Tester:Uday Kadalkar";
        System.out.println(tester.getName());
    }
}
