import java.util.Scanner;

public class falco {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int f;
        int ergebnis=1;
        System.out.println("bitte die positive zahl fuer die Fakultaet eingeben");
        f=cin.nextInt();
        if (f==0){
            System.out.println("ergenbiss = 1");
        }else if(f<=0){
            System.out.println("ungueltige zahl abbruch");
            return;
        }else{
            for (int i=f;i>=1;--i){
                ergebnis=ergebnis*f;
                f--;
            }
            System.out.println(ergebnis);
        }
    }
}
