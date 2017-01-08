public class Odmocnina {
	public static double tretiOdmocnina(double a, double x) {
		double tipnute;
		double rozdil = 1;
		double toleranceChyb = 0.00001;
    
	   	while (rozdil > toleranceChyb) {
			   tipnute = x - (( x * x * x ) - a ) / ( 3 * x * x );
			   rozdil = Math.abs(( tipnute - x ) / x);
			   x = tipnute;
		  }
    
		      return x;
	}
	public static void main(String[] args) {
		double Cislo = Double.parseDouble(args[0]);
		double tip = Cislo / 3;
		double y = tretiOdmocnina(Cislo, tip);
    String odmocnina = String.format("%.2f", y);
		System.out.println( "Treti odmocnina z " + Cislo + " je " + odmocnina ); 
	}
}