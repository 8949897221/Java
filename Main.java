// You are using Java
class A{
    final void lpu(){
        System.out.println("abc");
        
        //Note: final method cannot override 
    }
}
class B extends A{
    void lpu(){
        super.lpu();
        System.out.println("xyz");
    }
}
public class Main{
    public static void main(String arg[]){
        B obj=new B();
        obj.lpu();
    }
}