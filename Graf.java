public class Graf {   
     public static void main(String args[]) {       // zaèátek èásti kódu z 9. lekce
        int[] hodnoty = new int[100];
        int pocetHodnot = 0;
        int max = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextInt()) {
            int cislo = sc.nextInt();
            if (cislo < 0) {
                continue;
            }
            hodnoty[pocetHodnot] = cislo;
            if (cislo > max) {
                max = cislo;
            }
             
            pocetHodnot++;
            if (pocetHodnot == hodnoty.length) {
                break;
            }
        }
         
        double prepocet = 120. / max;         // konec èásti kódu z 9. lekce
                   
          System.out.print ("<?xml version=\"1.0\"?> <svg xmlns=\"http://www.w3.org/2000/svg\" ");
          int a = pocetHodnot * 28 ;
          System.out.println ( " width=\" " + a + "\" height=\" 120 \"  viewBox=\"0 0 " + a + " 120 \"> ");
         for (int i = 0; i < pocetHodnot; i++) {
           double h = (double) hodnoty[i] *  prepocet; 
           int b = 10 + (i * 25);
           double c = 110 - h;
           System.out.println ( "<rect x=\" " + b +" \" y=\" " + c + " \" width=\"20\" height=\" " + h + " \" fill=\"blue\" stroke=\"black\" stroke-width=\"2\"/>");
          }
           System.out.print ("</svg>");
      
     }
}