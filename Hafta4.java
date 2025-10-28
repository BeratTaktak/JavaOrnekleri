package hafta4;

public class Hafta4 {

  public static void main(String[] args) {
     
      
      
      int n = 88;
      int ilk = 0;
      int ikinci = 1;
      
      System.out.print(ilk + "," + ikinci);
      for(int i = 3; i <= n; i++){
          int suanki = ilk + ikinci;
          System.out.print("," + suanki);
          
          ilk = ikinci;
          ikinci = suanki;
                  
      }
              
     
      
      
      
      
      
      
      
      
      
      
      
      
      /*
      int n,Toplam;
      Toplam = 1;
      n = 5;
      for (int a = 1; a <= n; a++){
          Toplam = Toplam * a;
      }
      System.out.println(Toplam);
      */
      
      
      
      
      
      
      
      
      
     /* 
      int n,Toplam;
      Toplam = 0;
      n = 30;
      for (int a = 1; a <= n; a++){
          Toplam = Toplam + a;
      }
      System.out.println(Toplam);
      */
              
      
      
      
      /*
      int  b = 0;
      for (int a = 1; a <= 100; a++){
           b = b + a;
      }
      System.out.println(b);
      */
      
      
     /*
     for(int a = 1; a < 100; a++){
         if(a % 3 == 0){
             System.out.println(a);
         }
         
     }    
     */
      
      
      
      
      
      
      
      
      
      /*
      for (int a = 1; a < 100000; a*=2) {
          System.out.println(a);
         
      }
      */
      
      
      
      
      
      /*
      for (int i = 1; i<=1000; i++){
          System.out.println("Merhaba Dünya");
      }
      */
      
      
      /*
      int sayac = 1;
      System.out.println(sayac);
      sayac++;
      System.out.println(sayac);
      sayac++;
      System.out.println(sayac);
      */
      
      
      
      
      
      
      
      
      
      
      
      
      
      /*
      int sayi = 6;
      if(sayi % 2 == 0){
          System.out.println("Çift");
      }
      else {
          System.out.println("Tek");
      }
      
      //yukarıdaki if else in altarnatifi
      
      String sonuc = (sayi % 2 == 0) ? "çift" : "Tek";
      System.out.println(sonuc);
      */
      
      
      
      
      
      
      
      
      
      
      
      
      
      /*
      int gun = 4;
      
      switch(gun){
          
      case 1 -> System.out.println("Pazartesi");
      case 2 -> System.out.println("Sali");
      case 3 -> System.out.println("Carsamba");
      case 4 -> System.out.println("Persembe");
      case 5 -> System.out.println("Cuma");
      case 6 -> System.out.println("Cumartesi");
      case 7 -> System.out.println("Pazar");
      default ->System.out.println("1-7 arasinda olmali");
      }
      */
      
      
      
      
      
      
      
      
    }

    
    
}
