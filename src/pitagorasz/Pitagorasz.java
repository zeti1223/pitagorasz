package pitagorasz;
import java.util.Scanner;
public class Pitagorasz {

    public static void main(String[] args) {
        System.out.println("Ez a program kiszamolja a derekszogu haromszog oldalainak hosszat.");
        System.out.println("befogok");
        Integer bef1, bef2;
        Scanner bemenetScan = new Scanner(System.in);
        System.out.print("elso befogo erteke: ");
        bef1=bemenetScan.nextInt();
        System.out.print("masodik befogo erteke: ");
        bef2=bemenetScan.nextInt();
        System.out.println("A derkszogu haromszog befogoi: "+bef1+" és "+bef2+" egyseg");
        double atfogo;
        atfogo=Math.sqrt(Math.pow(bef1, 2)+Math.pow(bef2, 2));
        System.out.println("az atfogo erteke: " +atfogo);
        atfogo=Math.floor(atfogo*1000)/1000;
        System.out.println("Az atfogo 3 tizedesjegy pontossagal: " +atfogo);
    }
    
}
