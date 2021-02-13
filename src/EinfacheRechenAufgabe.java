public class EinfacheRechenAufgabe {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.printf("%d + %d = %d \n", a,b, (a+b));
        System.out.printf("%d - %d = %d \n", a,b, (a-b));
        System.out.printf("%d * %d = %d \n", a,b, (a*b));
        System.out.printf("%d / %d = %d \n", a,b, (a/b));
        System.out.println();
        double c = 260.4;
        double d = 43.8;
        System.out.printf("%.2f + %.2f = %.2f \n", c,d, (c+d));
        System.out.printf("%.2f + %.2f = %.2f \n", c,d, (c-d));
        System.out.printf("%.2f + %.2f = %.2f \n", c,d, (c*d));
        System.out.printf("%.2f + %.2f = %.2f \n", c,d, (c/d));
    }
}
