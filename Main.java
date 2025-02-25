import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : input.toCharArray()) {
            charCount[c]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}