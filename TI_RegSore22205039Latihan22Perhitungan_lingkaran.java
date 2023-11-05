package ti_regsore.pkg22205039.latihan22.perhitungan_lingkaran;
/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Program perhitungan lingkaran
*/
import java.util.Scanner;
public class TI_RegSore22205039Latihan22Perhitungan_lingkaran {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double jari,luas,keliling;
        System.out.println("========= PERHITUNGAN LINGKARAN ========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        int diameter = input.nextInt();
        System.out.println("========= HASIL PERHITUNGAN LINGKARAN ========");
        if(diameter >= 0){
            jari = diameter / 2;
            luas = Math.PI * Math.pow(jari, 2);
            keliling = 2 * Math.PI * jari;
            
            System.out.println("Jari Jari Lingkaran : " + jari);
            System.out.println("Luas Lingkaran : " + luas);
            System.out.println("Keliling Lingkaran : " + keliling);
        }
    }
}
