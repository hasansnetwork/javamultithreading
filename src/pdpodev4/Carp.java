package pdpodev4;

import java.math.BigInteger;


public class Carp 
{
 
    private BigInteger sayi1;

    private String sayi2;

    private String sayiTut;

    private BigInteger sonuc=new BigInteger("0");  

    private BigInteger carpim= new BigInteger("1"); 

    BigInteger x;int y=0;
    

    public Carp(BigInteger sayi1, String sayi2)
    

    {
 
       this.sayi1=sayi1;
  
       this.sayi2=sayi2;
    
       this.sonuc=sonuc;
    
    }   
    public void carp()
    {
    
        for(int i=1;i<=sayi2.length();i++)
        {
        sayiTut=sayi2.substring(y,i);
                
        x= new BigInteger(String.valueOf(sayiTut));     
    
        carpim = sayi1.multiply(x);
        
        sonuc=sonuc.add(carpim);
        
        y++;         
       
        }
    //    System.out.println(sonuc);
    }
}
