package firstpart;

import java.util.Scanner;

public class SumOfFractions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci kesri daxil edin.......");
        System.out.println("Sureti daxil edin......");
        int birinciSuret=scanner.nextInt();
        System.out.println("Mexreci daxil edin......");
        int birinciMexrec=scanner.nextInt();
        while(birinciMexrec==0){
            System.out.println("Mexrec 0 ola bilmez!!!!!!");
            System.out.println("Sureti yeniden daxil edin......");
            birinciSuret = scanner.nextInt();
            System.out.println("Mexreci daxil edin......");
            birinciMexrec = scanner.nextInt();
        }
        System.out.println("Ikinci kesri daxil edin.......");
        System.out.println("Sureti daxil edin......");
        int ikinciSuret=scanner.nextInt();
        System.out.println("Mexrevi daxil edin.....");
        int ikinciMexrec=scanner.nextInt();
        while(ikinciMexrec==0){
            System.out.println("Mexrec 0 ola bilmez!!!!!!");
            System.out.println("Sureti yeniden daxil edin......");
            ikinciSuret= scanner.nextInt();
            System.out.println("Mexreci yeniden daxil edin......");
            ikinciMexrec=scanner.nextInt();
        }
        System.out.println("Emeliyyati qeyd edin.......");
        String emeliyyat=scanner.next();
        System.out.println("Cavab");
        System.out.println(calculateFractions(birinciSuret,birinciMexrec,ikinciSuret,ikinciMexrec,emeliyyat));

    }
    private static String calculateFractions(int birinciSuret,int birinciMexrec,int ikinciSuret,int ikinciMexrec,String emeliyyat){
        int mexrec = birinciMexrec * ikinciMexrec;
        int ilkCem = birinciSuret * ikinciMexrec;
        int ikinciCem = ikinciSuret * birinciMexrec;
        int suret = 0;
        if (emeliyyat.equalsIgnoreCase("cixma") || emeliyyat.equals("-")) {
            suret = ilkCem - ikinciCem;
        } else if (emeliyyat.equalsIgnoreCase("toplama") || emeliyyat.equals("+")) {
            suret = ilkCem + ikinciCem;
        }
        return suret + "," + mexrec;
    }
}
