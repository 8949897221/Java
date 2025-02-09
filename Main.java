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


// import java.util.*;
// public class Main{
//     public static void main(String arg[]){
//         Scanner s=new Scanner (System.in);
//         char a=s.next().charAt(0);
//         switch(a){
//             case '1':
//                 System.out.printf("Red");
//                 break;
//              case '2':
//                 System.out.printf("Blue");
//                 break;
//              case '3':
//                 System.out.printf("Yellow");
//                 break;
//              case '4':
//                 System.out.printf("Orange");
//                 break;
//             default:
//                 System.out.println("INvalid choice");
//         }
//         System.out.println("Hello");
//     }
// }

import java.util.*;
public class Main{
    public static void main(String arg[]){
       
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.printf("Number is %d \n",a);
        int b=a;
        int count=0; 
        while(a>=1){
            a=a/10;
            count++;
            
        }
        System.out.printf("The no of digits in %d is %d",b,count);
    }
}
import java.util.*;
public class Main{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n22=n2;
        int rem1=0,rem2=0;
        int ctr=0;
        while(n1!=0){
            rem1=n1%10;
            while(n2!=0){
                rem2=n2%10;
            
            if(rem1==rem2)
            ctr++;
            n2=n2/10;}
        
        n1=n1/10;
        n2=n22;
        }
        System.out.println("No of common digits="+ctr);
    }
}
import java.util.*;
public class Main{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int rev=0;
        while(a!=0){
            int rem=a%10;
             rev=rev*10+rem;
            a=a/10;
            
        }
        System.out.println(rev);
    }
}
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


// import java.util.*;
// public class Main{
//     public static void main(String arg[]){
//         Scanner s=new Scanner (System.in);
//         char a=s.next().charAt(0);
//         switch(a){
//             case '1':
//                 System.out.printf("Red");
//                 break;
//              case '2':
//                 System.out.printf("Blue");
//                 break;
//              case '3':
//                 System.out.printf("Yellow");
//                 break;
//              case '4':
//                 System.out.printf("Orange");
//                 break;
//             default:
//                 System.out.println("INvalid choice");
//         }
//         System.out.println("Hello");
//     }
// }

import java.util.*;
public class Main{
    public static void main(String arg[]){
       
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.printf("Number is %d \n",a);
        int b=a;
        int count=0; 
        while(a>=1){
            a=a/10;
            count++;
            
        }
        System.out.printf("The no of digits in %d is %d",b,count);
    }
}
import java.util.*;
public class Main{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n22=n2;
        int rem1=0,rem2=0;
        int ctr=0;
        while(n1!=0){
            rem1=n1%10;
            while(n2!=0){
                rem2=n2%10;
            
            if(rem1==rem2)
            ctr++;
            n2=n2/10;}
        
        n1=n1/10;
        n2=n22;
        }
        System.out.println("No of common digits="+ctr);
    }
}
import java.util.*;
public class Main{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int rev=0;
        while(a!=0){
            int rem=a%10;
             rev=rev*10+rem;
            a=a/10;
            
        }
        System.out.println(rev);
    }
}
import java.util.*;

class NumberContainers {
    private Map<Integer, Integer> indexToNumber; // Maps index -> number
    private Map<Integer, TreeSet<Integer>> numberToIndices; // Maps number -> sorted indices

    public NumberContainers() {
        indexToNumber = new HashMap<>();
        numberToIndices = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexToNumber.containsKey(index)) {
            int oldNumber = indexToNumber.get(index);
            if (oldNumber != number) {
                numberToIndices.get(oldNumber).remove(index);
                if (numberToIndices.get(oldNumber).isEmpty()) {
                    numberToIndices.remove(oldNumber);
                }
            }
        }
        indexToNumber.put(index, number);
        numberToIndices.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        if (numberToIndices.containsKey(number) && !numberToIndices.get(number).isEmpty()) {
            return numberToIndices.get(number).first(); // Smallest index
        }
        return -1;
    }
}

/**
 * Example usage:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index, number);
 * int result = obj.find(number);
 */





