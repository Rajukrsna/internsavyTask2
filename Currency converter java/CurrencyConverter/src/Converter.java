import java.util.*;
 class Currency
{
    
     public static void main(String[] args)
    {
        int a;
        do{

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice of Conversion");
        System.out.println("Enter 1 for Rupees to Dollar Conversion");
        System.out.println("Enter 2 for Dollar to Rupees Conversion");
        System.out.println("Enter 3 for Rupees to Euro Conversion");
        System.out.println("Enter 4 for Euro to Rupees Conversion");
        System.out.println("Enter 5 to exit");
         a=sc.nextInt();
        System.out.println("Enter your Amount");
         double y=sc.nextDouble();
        
    
    
switch(a)
{
    case 1:{
        rupeestodollar(y);
        break;
    }
    case 2:{
     dollartorupees(y);
     break;
    }
    case 3:
    {
       rupeestoeuro(y);
       break;
    }
    case 4:
    {
eurotorupees(y);
break;
    }
    case 5:
    {
        System.out.println("thankyou");
    }
}
        }while(a!=5);

}
public static  void rupeestodollar(double amt)
{
    System.out.println("1 Rupees = " + 0.013 + " Dollar");
    System.out.println(amt+"Rupees =" +(amt*0.013)+"Dollar");
}
public static void dollartorupees(double amt)
{
    System.out.println("1 Dollar = " + 79.37 + " Ruppe");
    System.out.println(amt+"Dollar=" +(amt*79.37)+"Ruppe");
}
public static void rupeestoeuro(double amt)
{
    System.out.println("1 Ruppe = " + 0.012 + " Euro");
    System.out.println(amt+"Rupees =" +(amt*0.012)+"Euro");
}
public static void eurotorupees(double amt)
{
    System.out.println("1 Euro = " + 90.09+ " Rupees");
    System.out.println(amt+"Rupees =" +(amt*90.09)+"Rupees");
}
}
