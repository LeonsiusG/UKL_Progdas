import java.util.Scanner; 

public class MenghitungDiskon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        System.out.print("Masukkan total belanja: ");
        double totalBelanja = s.nextDouble();  
        
        double diskon = 0;  
        double totalBayar;  

        if (totalBelanja < 100000) {
            diskon = 0;  
        } else if (totalBelanja >= 100000 && totalBelanja <= 200000) {
            diskon = 10;  
        } else if (totalBelanja > 200000) {
            diskon = 20; 
        }
        
        totalBayar = totalBelanja - (totalBelanja * diskon / 100);  

        System.out.println("Total belanja: " + totalBelanja);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Total yang harus dibayar: " + totalBayar);

        s.close();  
    }
}
