package corejava.ddatatypes;

public class ifelse {
    public static void main(String[] args) {

        int m1 = 70, m2 = 50, average=70;
        if (m1 > 60 && m2 > 60) {
            System.out.println("pASS");
        } else if(average>60) {
            System.out.println("cleared only one subject");
        }
    }
}