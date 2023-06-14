class Animal{
public void move(){System.out.println("call from Animals class");}
}
class Wild extends Animal{
public void move(){System.out.println("call from wild class");}
}
class Pet extends Animal{
public void move(){System.out.println("call from pet class");}
}
class TestAnimal{
public static void main(String args[]){
Animal a=new Animal();
Animal w=new Dog();
Animal p=new Pet();
a.move();
w.move();
p.move();
}
}