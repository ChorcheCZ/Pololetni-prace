public class Pi {
    private static boolean Kruh (double a, double b, double polomer) {
        return polomer * polomer >= a * a + b * b;
    }           
    public static void main(String[] args) {
        double polomer = 1;
        int vKruhu = 0;
        int dohromady = 0;
        for (int i = 0; i < 999999999; i++) {  
           double a = Math.random();
           double b = Math.random();
           dohromady += 1;
           if ( Kruh (a, b, polomer)) {
                vKruhu += 1;
            }
        } 
          double pi = ((double) vKruhu / (double) dohromady ) * 4;
          System.out.printf("Pi = %s" , pi);
    }
}      //Tento způsob se mi zdá dost nepřesný
