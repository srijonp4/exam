
/*Upcasting
If the reference variable of Parent class refers to the object of Child class, it is known as upcasting.*/


public class TestRuntimePolymorphism {
    public static void main(String[] args) {
        Bike R1 = new SuperBike();//upcasting
        R1.speed();
    }
}
class Bike{
    public void speed(){
        System.out.println("Riding a bike at a speed of 60KMph ");
    }
}
class SuperBike extends Bike{
    public void speed(){
        System.out.println("Riding a superbike at 180 KMph");
    }
}

