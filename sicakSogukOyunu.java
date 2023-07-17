/*Sıcak soğuk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin etmeye
çalışsın.Girilen sayıya göre artır azalt diye uyarsın
Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim kaçıncıda buldugunu belirt. */

import java.util.Scanner;

class sicakSogukOyunu
{
    public static void main(String[] args) 
    {
        Scanner veri= new Scanner(System.in);
        int sayi=(int)(Math.random()*100);
        int tahmin;
        int sayac=0;
        do
        {
            System.out.print("Tahmininizi giriniz:");
            tahmin=veri.nextInt();
            if(tahmin<sayi)
            {
                System.out.println("Tahmininiz sayidan az... Lütfen tahmininizi arttirin..");
                
            }
            else if(tahmin>sayi)
            {
                System.out.println("Tahmininiz sayidan fazla...Lütfen tahmininizi azaltin..");
            }

            sayac++;

        }while(sayi!=tahmin);
        System.out.println("Üretilen sayi: "+sayi);
        System.out.println(sayac+". seferde bildiniz.");
    }
}