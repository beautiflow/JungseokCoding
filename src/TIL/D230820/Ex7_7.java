package TIL.D230820;

public class Ex7_7 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x="+c.getX());
    }
}

class Parent{
    int x = 100;

    Parent(){
        this(200);
    }

    Parent(int x){
        this.x = x;
    }

    int getX(){
        return x;
    }
}

class Child extends Parent{
    int x = 300;

    Child(){
        this(1000);
    }

    Child(int x){
        this.x = x;
    }
}
