package calculator;

import java.util.Scanner;


class Calculator {
public static void main(String [] args)

{
	Calculator cal=new Calculator();
	Scanner input = new Scanner(System.in);

    int loop,select,close;
    double x,y;
    System.out.println("If you press the following key,You may calculate the following functions");
    System.out.println(".........................................................................................");
    System.out.println("\t\t1.ADD\t\t\t2.SUBTRACTION\t\t3.MULTIPLICATION\n\t\t4.DIVISION\t\t5.MODULUS\t\t6.SQUARE");
    System.out.println("\t\t7.FACTORIAL\t\t8.POWER(x^y)\t\t9.SQUARE ROOT\n\t\t10.nPr & nCr\t\t11.COSX\t\t\t12.SinX");
    System.out.println("\t\t13.e^x\t\t\t14.e^-x\t\t\t15.EQUATIONS\n\t\t16.NUMBER CONVERSION");
    
    System.out.println("\t\t0.Exit");
    System.out.println(".........................................................................................");
    System.out.println("\nSelect your option : \n");
    
    while(true) {
    	select=input.nextInt();

    if(select==1)
    {
        System.out.println("Give 2 values : \n\n");
        x=input.nextDouble();
        y=input.nextDouble();
        double add;
        add=x+y;
        System.out.println(add);
        System.out.println("Select your option : \n");
    }
    else if(select==2)
    {
    	System.out.println("Give 2 values : \n\n");
        x=input.nextDouble();
        y=input.nextDouble();
        double subtract=x-y;
        System.out.println(subtract);
        System.out.println("Select your option : \n");
    }

    else if(select==3)
    {
    	System.out.println("Give 2 values : \n\n");
        x=input.nextDouble();
        y=input.nextDouble();
        double multiplication;
        multiplication=x*y;
        System.out.println(multiplication);
        System.out.println("Select your option : \n");
    }
    else if(select==4)
    {
    	System.out.println("Give 2 values : \n\n");
        x=input.nextDouble();
        y=input.nextDouble();
        double division;
        division=x/y;
        System.out.println(division);
        System.out.println("Select your option : \n");
    }

    else if(select==5)
    {
    	System.out.println("Give 2 values : \n\n");
    	int c,d,mod;
        c=input.nextInt();
        d=input.nextInt();
        mod=c%d;
        System.out.println(mod);
        System.out.println("Select your option : \n");
    }

    else if(select==6)
    {
    	System.out.println("Give 2 values : \n\n");
        x=input.nextDouble();
    
        double square;
        square=x*x;
        System.out.println(square);
        System.out.println("Select your option : \n");
    }

    else if(select==7)
    {
    System.out.println("Give 2 values : \n\n");
	int i,fact=1,n;
	n=input.nextInt();
	for(i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
	System.out.println("Select your option : \n");
}
else if(select==8)
{
   int n,var,po;
  int val = 1;
  System.out.println("Give the Integer and then its power : \n\n");
  var=input.nextInt();
  po=input.nextInt();
  for (n=0; n<po; n++) {

    val = var*val;
  }
  System.out.println(val);
  System.out.println("Select your option : \n");
}
else if(select==9)
{
	double num;
	System.out.println("Give a value : \n\n");
    num=input.nextDouble();
  
    double prev=0,cur=1;
     while(prev!=cur)
      {   prev=cur;
          cur=0.5*(prev+(num/prev));
       }

    System.out.println(cur);
    System.out.println("Select your option : \n");

}
else if(select==10)
{
	
	
	System.out.print("Enter n and r: ");
	int n = input.nextInt();
	int r = input.nextInt();
	System.out.println("nCr = "+fact(n)/fact(r)/fact(n-r));
	System.out.println("nPr = "+fact(n)/fact(n-r));
	System.out.println("Select your option : \n");
	}
else if(select==11) {
	int n,x1,i,j;
   	double sign,cosx,fact;

	System.out.println("Enter the value of angle(in degrees)\n");
	x=input.nextDouble();

	x1=(int)x;
	x=x*(3.142/180.0);

	cosx=1;
	sign=-1;
	for(i=2;i<=1000;i=i+2)
   	{
		 fact=1;
		 for(j=1;j<=i;j++)
		 {
			fact=fact*j;
        	 }
		
		 cosx=cosx+(Math.pow(x,i)/fact)*sign;
      		 sign=sign*(-1);
	 }
	 System.out.println(cosx);
	System.out.println("Select your option : \n");

	
}
    
else if (select==13)
{
	int n,count;
    double term,sum;
    System.out.println("Enter value of x\n");
    x=input.nextDouble();
    n=1;
    term=1;
    sum=1;
    count=1;
    
    while(n<=100)
    {
        term=term*(x/n);
        sum=sum+term;
        count=count+1;
        if(term<0.0000000001)
            n=999999999;
        else n=n+1;     
    }
    System.out.println(sum);
    System.out.println("Select your option : \n");
}
    
else if (select ==14)
{
	int n,count,sign=-1;
    double term,sum;
    System.out.println("Enter value of x\n");
    x=input.nextDouble();
    n=1;
    term=1;
    sum=1;
    count=1;
    
    while(n<=100)
    {
        term=term*(x/n);
        sum=sum+term*sign;
        sign=sign*(-1);
        count=count+1;
        if(term<0.0000000001)
            n=999999999;
        else n=n+1;       
    }
    System.out.println(sum);
    System.out.println("Select your option : \n");
}

else if(select==12)
{
    int n,x1,i,j;
	double sign,sinx,fact;
System.out.println("Enter the value of angle(in degrees)\n");
x=input.nextDouble();

x1=(int)x;

x=x*(3.142/180.0); /* Degrees to radians*/

sinx=x;

sign=-1;

for(i=3;i<=1000;i=i+2)
	{
	 fact=1;

	 for(j=1;j<=i;j++)
	 {
		fact=fact*j;
    	 }

	 sinx=sinx+(Math.pow(x, i)/fact)*sign;
  		 sign=sign*(-1);
 }
 System.out.println(sinx);
 System.out.println("Select your option : \n");
}
    
else if (select==15)
{
	System.out.println("Solve for the following types of equations:(Select your options) ");
	System.out.println("1. a1x+b1y+c1=0 \n   a2x+b2y+c2=0 \n");
	System.out.println("2. ax2+bx+c=0");
	int opt1;
	opt1=input.nextInt();
	if(opt1==1)
	{
		double a1,b1,c1,a2,b2,c2;
        System.out.println("a1x+b1y+c1=0\nGive value of a1,b1,c1");
        a1=input.nextDouble();
        b1=input.nextDouble();
        c1=input.nextDouble();
        System.out.println("a2x+b2y+c2=0\nGive value of a2,b2,c2");
        a2=input.nextDouble();
        b2=input.nextDouble();
        c2=input.nextDouble();
        x=(b1*c2-b2*c1)/(a1*b2-a2*b1);
        y=(c1*a2-c2*a1)/(a1*b2-a2*b1);
        System.out.println(x+"   "+y);
        System.out.println("Select your option : \n");
	}
	else if(opt1==2)
	{
        double a,b,c,x1,x2,dis;
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        dis=b*b-4*a*c;
        if(dis>=0)
        {
         x1=(-b+(Math.sqrt(b*b-4*a*c)))/(2.0*a);
         x2=(-b-(Math.sqrt(b*b-4*a*c)))/(2.0*a);
         System.out.println(x1+"   "+x2);
         System.out.println("Select your option : \n");
        }
        else{
            System.out.println("Imaginary Root !!!");
            System.out.println("Select your option : \n");
        }       

	}
		
}

else if (select==16)
{
	System.out.println("Conversion To: Press following no for following Conversion :");
	System.out.println("1.Decimal to Binary \n2.Binary to Decimal");
	int conv;
	conv=input.nextInt();
	if(conv==1)
	{
    int dec;
    System.out.println("Give Decimal number :");
    dec=input.nextInt();
    cal.printBinaryFormat(dec);
    System.out.println();
    System.out.println("Select your option : \n");
}
	
	else if(conv==2)
	{
		
	    long k,l;
	    System.out.println("Give Binary numbers : ");
	    l=input.nextLong();
	    k=cal.toDecimal(l);
	    System.out.println(k);
	    System.out.println("Select your option : \n");
	}
}
    
    
else if(select==0){
	System.out.println("Thanks for using my calculator !!!");
	System.out.println(".............................................................................");
	break;
}
	    
    }
    
    
    
}
static long fact(int n)
{
if(n==0)return 1;
return n*fact(n-1);
}

public void printBinaryFormat(int number){
    int binary[] = new int[25];
    int index = 0;
    while(number > 0){
        binary[index++] = number%2;
        number = number/2;
    }
    for(int i = index-1;i >= 0;i--){
        System.out.print(binary[i]);
    }
}

public static long toDecimal(long n) {
    long d = 0; // decimal representation
    int i = 0; // power we're going to raise n to
    while (n != 0) {
        int r = (int)(n % 10); // remainder
        if (r != 0)
            d += (long)Math.pow(2, i); // raise 2 to the i and add it to the sum
        ++i;
        n /= 10; // reduce n
    }
    return d;
}



}
