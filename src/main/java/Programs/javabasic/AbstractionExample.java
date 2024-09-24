package Programs.javabasic;



abstract class School {
    abstract void admission();
}
class Branch extends School{

    @Override
    void admission() {
        System.out.println("Admission process completed");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        School schbrn=new Branch();
   schbrn.admission();
    }
}


