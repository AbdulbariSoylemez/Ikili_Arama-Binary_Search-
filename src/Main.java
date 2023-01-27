public class Main {

    public static int İkiliArama(int dizi[],int a){
        int DiziBaş=0;// Dizinin 1. elemanını belirlemesi için DiziBaş diye bir değişken yaratık
        int DiziSon=dizi.length-1;// Dizinin son elemanını belirlemesi için DiziSon diye bir değişken yaratık

        while (DiziBaş<=DiziSon){// Diziniin elemanlarını gezmek için döngü yaratık

            int Ortanca=(DiziBaş+DiziSon)/2;// dizinin Orta elemanını bulmak için Ortanca diye değer yaratıldı Binary aramada dizideki verileri yarıya bölerek ilerler bu bölünmede ortadan başlıyor çünkü verileri yarıya bölmek için

            if (dizi[Ortanca]==a)  return Ortanca; // Dizideki orta elemanın aranan eleman olup olmadığına bakılıyor eğer aranan eleman ise Ortancayı döndür

            if (dizi[Ortanca]<a) DiziBaş=Ortanca+1;//Aranan değer sıarlı dizide oartanca indisten büyük ise Ortanca değerin bir fazlasını DiziBaş olarak ata

            else DiziSon=Ortanca-1;// eğer aranan sayı dizinin Ortanca indisinden küçük ise DiziSon değerini Ortancanın 1 eksiğine eşitle
        }
        return -1; // aranan değer dizide bülünmüyor ise -1 döndür
    }
    public static void main(String[] args) {
        Main arama=new Main();// Main sınıfından bir nesne oluştürdük

        int dizi[]={1,2,3,4,5,7,8,9,11,12,13,18};


        int sonuç=arama.İkiliArama(dizi,8);// Metotumuzu yazdık ve indislerini verdik

        if (sonuç==-1){// aranan eleman yok ise
            System.out.println("Arana sayı dizide yok");
        }
        else {
            System.out.println("Aranan sayı dizide "+sonuç+". İndiste");// dizide kaçoncı indiste olduğunu yazdırdık
        }

    }
}