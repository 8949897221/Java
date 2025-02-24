// // You are using Java
// class A{
//     final void lpu(){
//         System.out.println("abc");
        
//         //Note: final method cannot override 
//     }
// }
// class B extends A{
//     void lpu(){
//         super.lpu();
//         System.out.println("xyz");
//     }
// }
// public class Main{
//     public static void main(String arg[]){
//         B obj=new B();
//         obj.lpu();
//     }
// }

// You are using Java
public class Main{
    void lpu(int x){
        System.out.println(x);
    }
    void lpu(int x,int y){
        System.out.println(x+y);
    }
    public static void main(String arg[]){
        Main obj=new Main();
        obj.lpu(5);
        obj.lpu(5,3);
    }
}