package pdpodev4;

import java.math.BigInteger;            //Buyuk sayilar icin BigInteger kutuphanesi 

public class islem implements Runnable  //İslem sınıfı Runnable interface'inden impement edilir
{

    private BigInteger sayi1;

    private String sayi2;

    private String sayiTut;

    private BigInteger sonuc=new BigInteger("0");  

    private BigInteger carpim= new BigInteger("1"); 

    BigInteger x;int y;int i;
 

    public islem(BigInteger sayi1, String sayi2,int y, int i)
    {
   
        this.sayi1=sayi1;
   
        this.sayi2=sayi2;
   
        this.i=i;
  
        this.y=y;
    }   

    
    public BigInteger getSonuc()
    {
    
        return sonuc;
    
    }

    private synchronized void ekleFonk(BigInteger S)
    {
    
        sonuc=sonuc.add(S);
        
    }
    @Override
    
    public void run()
    {             
        for( ;i<=sayi2.length();i++)
        {
            sayiTut=sayi2.substring(y,i);
    
            x= new BigInteger(String.valueOf(sayiTut));
            
            carpim = sayi1.multiply(x);
            
            ekleFonk(carpim);
            
            y=y+4;
            
            i+=3;       
        }
        
    }    
}




