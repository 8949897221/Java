public class Main2{
enum lpu{
    RED,GREEN,BLUE,WHITE;
}
public static void main(String arg[]){
    lpu.values();
    for(lpu i:lpu.values()){
        System.out.println(i);
    }
}}
