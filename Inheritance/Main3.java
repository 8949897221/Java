class A{
    int x=5;
}
class B{
    int y=6;
    void display(){
        System.out.println(new A().x+y);
    }
}
public class Main3{
    public static void main(String arg[]){
        new B().display();
        obj.display();
    }
}