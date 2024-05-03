import java.lang.*;
public class myclass 

{

public myclass()
{
}


public static void main(String[] args)
{
  System.out.println("Main is working");

}

private int priv; // private access
    // methods to access priv
     void setpriv(int i) // set priv’s value
    {
          priv = i;
     }

    int getpriv( )// get priv’s value
   {
         return priv;
    }


public static int st = 10;
int c;
int cc;
char d;
boolean b1;
Boolean b2;
public int sqrA(int a,int b)
{
return(a*a);
}
public int sqrB(int a,int b)
{
return(b*b);
}
public int add(int a,int b)
{
System.out.println("Hi ");
return(a+b);
}
public int sub(int a,int b)
{
return(a-b);
}
public int divide(int a,int b)
{
return(a/b);
}
public int multiply(int a,int b)
{
return(a*b);
}
public final String concat1(String a,String b)
{
return(a+b);
}
public String concat(String a)
{
return(a+" test");
}

public String concat(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p,String q,String r,String s,String t,String u,String v,String w,String x,String y,String z)
{
return(a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z);
}

public byte[] blb(byte[]  b2)
{
return(b2);
}


public void typs(Boolean p1,byte p2, short p3, int p4, long p5, float p6, double p7,byte[] p8,char p9,boolean p10)
{

}

public byte bytepr(byte  b2)
{
return(b2);
}

public boolean bool(boolean  b2)
{
return(b2);
}

public Boolean blb(Boolean  b2)
{
return(b2);
}

public char concat(char a)
{
return(a);
}

public void voidd()
{

}

}