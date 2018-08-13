
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M E G A S T A R
 */
public class CobaOperasiString {
    public static void main(String[] args)
    {
        // Intial Commit
        
        String identitas = "Muhamamad Khoirul Anam / XRPL3 / 25";
        System.out.println("Identitas : "+ identitas);
        
        String x = "Operasi";
        System.out.println("isi variabel x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong " + y.isEmpty());
        
        // Coba method leght%isEmpty
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "opersi";
        System.out.println("isi varibel z : "+ z);
        System.out.println("isi x sama dengan z (Case sensitive): "
                + x.equals(z));
        
        String r = "opreasi";
        System.out.println("isi variabel r : "+ r);
        System.out.println("isi x sama dengan r (Case sensitive): "
                + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive): "
                + x.equalsIgnoreCase(r));
        
        // Cobe method equals & equalsInoreCase
        
        System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("isi x sama dengan z (Case Sensitive): "
                + x.compareTo(z));
        System.out.println("isi x sama dengan r (Case Sensitive): "
                + x.compareTo(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive): "
                + x.compareToIgnoreCase(r));
        
        String s = "operasi";
        System.out.println("isi variabel s : " + s);
        System.out.println("isi x sama dengan s (Case Sensitive): "
                + x.compareTo(s));
        
        //Coba Method compareTo & compareTolgnoreCase
        
        System.out.println("pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("isi variabel x besar semua : "+ x.toUpperCase());
        System.out.println("isi variabel x kecil semua : "+ x.toLowerCase());
        
        String t = "    operasi string    ";
        System.out.println("isi variabel t : \""+ t +"\"");
        System.out.println("isi variabel t tanpa spasi : \""+ t.trim() +"\"");
        
        System.out.println("gabungkan isi variabel x dan r : "+ x.concat(r));
        
        // Coba method contains, toUpperCase, toLowerCase, trim&concat.
        
        System.out.println("karakter mulai posisi 3 di variable x : "
                + x.substring(3));
        
        System.out.println("karakter mulai posisi 3-5 di variable x : "
                + x.substring(3,6)); 
        
        String tclean = t.trim();
        System.out.println("isi variabel tclean : "+ t.trim());
        System.out.println("rubah 'i' jadi 'E' di variabel tclean : "
                + tclean.replace("i","E"));
        
        String[] arrT = tclean.split(" ");
        System.out.println("pecah kata di variable tclean : "
                + tclean.replace("i","E"));
        for(int i=0;i<arrT.length;i++)
            System.out.println(arrT[i]);
        
        String[] arrTr = tclean.split("r");
        System.out.println("pecah berdasarkan huruf 'r' di variable tclean : "
                + tclean.replace("i","E"));
        for(int i=0;i<arrTr.length;i++)
            System.out.println(arrTr[i]);
        
        // Coa method substring, replace, & split
        
        double d = 1545454000;
        System.out.println(String.format("Uang saya %,.4f", d));
        
        System.out.println(String.format(Locale.forLanguageTag("in-ID"),
                "Uang saya Rp %,.2f", d));
        
        // Coba method format
    }
    
}
