
public class Scitani {
  	public static void main(String[] args) {
		  java.util.Random Random = new java.util.Random();
		
		    for (int i = 0; i < 10; i++) {
			     int x = Random.nextInt(20);
		    	 int y = Random.nextInt(20 - x);
			
		      System.out.printf("%d + %d =\n", x, y);				
		    }
	   }
}