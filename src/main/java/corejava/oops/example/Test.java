package corejava.oops.example;
class Patient{
    private int id;
   private String name;
   private String ssn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

public class Test {
    public static void main(String args[]){
        Patient pa=new Patient();
        pa.setId(101);
        pa.setName("Suryakant Gawnade");
        pa.setSsn("dfbhhn");
        System.out.println(pa.getId()+" "+pa.getName()+" "+pa.getSsn());
    }

}
