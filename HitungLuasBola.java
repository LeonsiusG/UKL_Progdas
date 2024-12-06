import java.util.Scanner;

public class HitungLuasBola {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("masukkan berapa jari jarinya : ");
        int jari = s.nextInt();
        luasbola(jari);


    }
        public static void luasbola(int jari){
        double PHI = 3.14;
        System.out.println("RUMUS : 4 x 3.14 x r x r");
        double hitung = 4*PHI*jari*jari;
        System.out.println("hasil = "+hitung);
        }

    }
