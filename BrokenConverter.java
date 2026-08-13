 public class BrokenConverter{
    public static void main(String[]args){
         double f = 100;
         double c = (f-32)* 5/9.0;
         System.out.printf("%.1f°F = %.1f°C",f,c);
    }
 }