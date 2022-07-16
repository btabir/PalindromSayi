package Metotlar;

public class PalindromSayi {

    static boolean isPalindrom(int number){
        int temp = number,reserveNumber=0,lastNumber;
        while (temp!=0){

          //  System.out.println("Sayi = "+temp);

            lastNumber = temp%10;
           // System.out.println("Son Basamak = "+lastNumber);

            reserveNumber=(reserveNumber*10)+lastNumber;  //10la carpma sebebi,sonuna basamak eklemek+lastnumber
          //  System.out.println("Yeni Sayi = "+reserveNumber);

            temp/=10;
          //  System.out.println("Yeni Temp = "+temp);

          //  System.out.println("------------------------");

        }
        if (number==reserveNumber)

            return true;//eger iften sonra tek satırlık bir kod varsa suslu paranteze gerek yok
        else
            return false;
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(1441));
    }
}
