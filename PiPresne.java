public class PiPresne {
   	public static void main(String[] args) {
      double a = 999999999;
      double d = 2;
      double x = 360/(2*a);
      double o = (double) d*a*(Math.sin ( Math.toRadians(x)));
      double pi = o / d ;
      System.out.print ( "Pi = ");
      System.out.print (String.valueOf(pi));
            
  }
}      