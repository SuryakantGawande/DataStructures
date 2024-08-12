package java8;


interface X {
    default void adding() {
        System.out.println("adding X");
    }
}

interface Y {

    default void adding() {
        System.out.println("adding Y");
    }

}

public class DefaultExample implements X, Y {

    public static void main(String[] args) {

        DefaultExample df = new DefaultExample();
        df.adding();
    }
    @Override
    public void adding() {
        Y.super.adding();
    }
}
