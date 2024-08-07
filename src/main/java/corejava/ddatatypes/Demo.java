package corejava.ddatatypes;

public class Demo {
    public static void main(String[] args) {
        int x=5;
        int y=7;
        int z=4;
        boolean result=x<y && x<z;
        System.out.println(result);
        boolean resultor=x<y || x<z;
        System.out.println(resultor);
    }
}
