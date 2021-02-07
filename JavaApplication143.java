package javaapplication143;
import java.util.Scanner;
public class JavaApplication143 
{
    private static int v;
    public static void Hcf(int l, int h)
    {
        for(v=l<h ? l : h ; v>1; v--)
        {
          if(l%v==0 && h%v==0)
          {
           break;
          }
        }
        System.out.println("The HCF of two numbers is = " + v);
    }
    public static void Lcm(int l, int h)
    {
        for(v=l>h ? l : h ; v<=l*h; v++)
        {
          if(v%l==0 && v%h==0)
          {
           break;
          }
        }
        System.out.println("The LCM of two numbers is = " + v);
    }
    public static void main(String[] args) 
    {
        Scanner is=new Scanner(System.in);
        int l,m;
        System.out.println(" Press 1 : to check the HCF of two numbers: \n Press 2 : to cehck the Lcm of two numbers: \n Press 3 : to exit the program:");
        m=is.nextInt();
        System.out.println("Enter a first number:");
        l=is.nextInt();
        int h;
        System.out.println("Enter a second number:");
        h=is.nextInt();
        if(m==1)
        {
        Hcf(l,h);
        }
        else if(m==2)
        {
        Lcm(l,h);
        }
        else if(m==3)
        {
         System.exit(m);
        }
    }
}