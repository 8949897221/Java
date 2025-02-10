public class constructor{
    static int a=6;
    static void lpu(){
        System.out.println("I am in lpu");
    }
    static void lpu(int x){
        System.out.println(x);
    }
    public static void main(String arg[]){
        lpu();
        lpu(5);
        System.out.println(a);
    }
}