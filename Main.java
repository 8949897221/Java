// import java.util.*;
// public class Main{
//     public static void main(String arg[]){
//         // int a=5;
//         // String b="6";
//         // System.out.println(a+Integer.parseInt(b));


//         // int a=5;
//         // Integer b=a;
//         // System.out.println(b);
//         Integer a=5;
//         int b=a;
//         System.out.println(b);

//     }
// }
// //Wrapper class is used to convert the string into integer
// //Primitive data   Wrapper class
// //int              Integer
// //float            Float
// //double           Double
// //char             Character
// //boolean          Boolean
// //long             Long
// //short            Short
// //byte             Byte

// //for initialising the stack with wrapper class 
// //Stack<Integer> s1=new Stack<>();
// //autoboxing =: converting primitive data type into wrapper class
// //unboxing =: converting wrapper class into primitive data type



// import java.util.*;
// public class Main{
//     public static void main(String arg[]){
//         Scanner s=new Scanner(System.in);
//         int a=s.nextInt();
//         int b=s.nextInt();
//         int c=s.nextInt();
//         if((a<b) && (b>c))
//             System.out.printf("%d is greater than %d  and %d",b,a,c);
//         else if((a<c)&&(c>b)){
//             System.out.printf("%d is greater than %d and %d",c,a,b);
//         }
//         else
//             System.out.printf("%d is greater than %d and %d",a,b,c);
        
//     }
// }


import java.util.*;
public class Main{
    public static void main(String arg[]){
        Scanner s=new Scanner (System.in);
        char a=s.next().charAt(0);
        switch(a){
            case '1':
                System.out.printf("Red");
                break;
             case '2':
                System.out.printf("Blue");
                break;
             case '3':
                System.out.printf("Yellow");
                break;
             case '4':
                System.out.printf("Orange");
                break;
            default:
                System.out.println("INvalid choice");
        }
        System.out.println("Hello");
    }
}