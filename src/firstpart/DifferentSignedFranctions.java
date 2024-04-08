package firstpart;

import java.util.Scanner;

public class DifferentSignedFranctions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci kesrin isaresini daxil edin.....");
        String birinciKesr=scanner.next();
        System.out.println("Ededleri daxil edin.......");
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
        System.out.println("Ikinci kesrin isaresini daxil edin.....");
        String ikinciKesr=scanner.next();
        System.out.println("Ededleri daxil edin.......");
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
        System.out.println(calculateFractions(birinciKesr,birinciSuret,birinciMexrec,ikinciKesr,ikinciSuret,ikinciMexrec,emeliyyat));
    }
    private static String calculateFractions(String birinciKesr,int birinciSuret,int birinciMexrec,String ikinciKesr,int ikinciSuret,int ikinciMexrec,String emeliyyat){

        int suret=0;
        if((birinciKesr.equals("-") || birinciKesr.equalsIgnoreCase("menfi")) && (ikinciKesr.equals("-") || ikinciKesr.equalsIgnoreCase("menfi")) ){
            birinciSuret=(-1)*birinciSuret;
            ikinciSuret=(-1)*ikinciSuret;
        } else if((birinciKesr.equals("-") || birinciKesr.equalsIgnoreCase("menfi"))  ){
            birinciSuret=(-1)*birinciSuret;
        } else if ((ikinciKesr.equals("-") || ikinciKesr.equalsIgnoreCase("menfi")))
        {  ikinciSuret=(-1)*ikinciSuret;
        }
        int mexrec=birinciMexrec*ikinciMexrec;
        int ilkCem=birinciSuret*ikinciMexrec;
        int ikinciCem=ikinciSuret*birinciMexrec;
        if(emeliyyat.equalsIgnoreCase("cixma") || emeliyyat.equals("-")){
            suret=ilkCem-ikinciCem;
        } else if(emeliyyat.equalsIgnoreCase("toplama") || emeliyyat.equals("+")){
            suret=ilkCem+ikinciCem;
        }
        return suret+","+mexrec;
    }
}
