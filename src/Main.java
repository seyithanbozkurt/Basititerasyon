import java.lang.Math;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static double mutlakHata = 0.00001;

    static double fonk(double x){
        return Math.sin(x) - (x / 2);
    }
    public static void main(String[] args) {
        double a=4.0;
        double b=1.0;
        int sayac=0;

        while(true){
            double fonk_a=fonk(a);
            double fonk_b=fonk(b);

            double c = a - (( b - a) / (fonk_b - fonk_a)) *fonk_a;
            System.out.println("sayac:" + sayac + " " + "a: " + a+ " " + "b:" + b + " " + "Yeni kök değeri:" + c);

            if(mutlakHata > Math.abs(c - b) || sayac==100){
                System.out.println("Kök yaklaşık değer: " + c);
                break;
            }
            else{
                b = c;
                sayac++;
            }
        }
    }
}