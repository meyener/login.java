import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * login
 */
public class login {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String name="Ekrem";
        String password="123abc";
        String a,b,newp,newp2;
        Scanner scn=new Scanner(System.in);
        System.out.println("Lütfen kullanici adini giriniz : ");
        a=scn.nextLine();
        System.out.println("lütfen şifreyi giriniz");
        b=scn.nextLine();

        if (a.equals(name) && b.equals(password)) 
        {   System.out.println("giriş başarili !!!");
            
        }
        else
        {
            System.out.println("Kullanici adi veya parola hatali !!!");
            System.out.println("Şifrenizi sifirlamak istermisiniz ??\nEvet için 1,\nhayir için 2 ye basin.");
            int c=scn.nextInt();
            if (c==1)
            {
                System.out.println("lütfen yeni şifrenizi girin : ");
                newp=scn.nextLine();
                System.out.println("lütfen yeni şifrenizi bir daha girin : ");
                newp2=scn.nextLine();
                if (newp==newp2) {
                    System.out.println("yeni şifre başariyla oluşturuldu.");
                    password=newp;
                }
                else{
                    System.out.println("şifreler eşleşmedi !!!");
                }
            

                
            }
            else if(c==2){
                System.out.println("iyi günler.");
            }
            else{
                System.out.println("hatalı sayı girdiniz!!!");
            }
        }System.out.println(password);

        

    }
}