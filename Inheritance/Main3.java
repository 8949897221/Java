class A{
    A(){
        System.out.println("parent");
    }
    A(int x){
        System.out.println(x+2);
    }
}
class B extends A{
    B(){
        System.out.println("child");
    }
    B(int y){
        System.out.println(y+3);
    }
}
public class Main3{
    public static void main(String[] args){
        new B();
        new B(5);
    }
}