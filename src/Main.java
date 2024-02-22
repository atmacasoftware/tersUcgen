import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int basamakSayisi;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değer alınması
        System.out.print("Basamak sayısı giriniz : ");
        basamakSayisi = input.nextInt();

        for(int i = basamakSayisi; i>=1 ;i--){
            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}