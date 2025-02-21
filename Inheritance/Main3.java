//Single inheritance
class A{
    void abc(){
        int a=5;
        System.out.println("abc");
    }
}
class B extends A{
    void xyz(){
        System.out.println(a);
        abc();
    }
}
public class Main3{
    public static void main(String arg[]){
        B obj=new B();
        obj.xyz();
        
    }
}