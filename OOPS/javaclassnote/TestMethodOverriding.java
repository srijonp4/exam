public class TestMethodOverriding {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        Dog husky = new Dog();
        husky.eat();
    }

}
class Animal{
    public void eat(){
        System.out.println("animal eating");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
       System.out.println("dog eating");
   }
}