package oops;
class IndianBank{
    float getRateOfInterest(){return 0;}
}
class SBI2 extends IndianBank{
    float getRateOfInterest2(){return 8.4f;}
}
class ICICI2 extends IndianBank{
    float getRateOfInterest2(){return 7.3f;}
}
class AXIS2 extends IndianBank{
    float getRateOfInterest2(){return 9.7f;}
}
class TestPolymorphism{
    public static void main(String args[]){
        IndianBank b;
        b=new SBI2();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI2();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS2();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
}