
import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dogru ve yanlis sayisini girin:");
        int dogru = sc.nextInt();
        int yanlis = sc.nextInt();
        
        if (20 < dogru || dogru < 0 || 20 < yanlis || yanlis < 0 || dogru+yanlis > 20) {
            System.out.println("Yanlıs giris yapildi!");
        } else {
            
            int bos = (20-(dogru+yanlis));
            
            double net = (dogru-(yanlis/4));
            
            System.out.println("Sonucunuz: "+dogru+" dogru, "+yanlis+" yanlis, "+bos+" bos. Netiniz: "+net);
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
