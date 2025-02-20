import java.util.*;
public class Main1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        int maxarea=0;
        while(i<j){
            int area=Math.min(a[i],a[j])*(j-i);
            if(area>maxarea){
                maxarea=area;
            }
            if(a[i]<a[j]){
                i++;
            }
            else{
                j--;
            }
            
        }
        System.out.println(maxarea);
    }
}