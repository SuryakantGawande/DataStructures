package corejava.javaExample.aggregation;
public class Emp {
    int id;
    String name;
    EAddress address;

    public Emp(int id, String name,EAddress address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        EAddress address1=new EAddress("gzb","UP","india");
        EAddress address2=new EAddress("gno","UP","india");

        Emp e=new Emp(111,"varun",address1);
        Emp e2=new Emp(112,"arun",address2);

        e.display();
        e2.display();

    }
}