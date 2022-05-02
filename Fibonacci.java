public class Fibonacci
{
    public static int fib(int n)
    {
        //System.out.println("Test");  
        int temp1=0;
        int temp2=1;
        int count=0;
        for(int i=0;i<=n;i++)
        {
            count=temp1+temp2;
            temp1=temp2;
            temp2=count;
        }
        return(count);
    }
    public static int fib1(int f)
    {
        //System.out.println("Test1"); 
        int temp1=0;
        int temp2=1;
        int count=0;
        int count1=1;
        boolean flag=true;

        while(count < f)
        {
            count=temp1+temp2;
            temp1=temp2;
            temp2=count;
            count1++;
            
        }
        System.out.println("Count1="+count1);
        if(count==f)
        {
            System.out.println("It is a Fibonacci number");  
            flag=true;

        }
        else
        {
            
        System.out.println("It is not a Fibonacci number");
        flag=false;
        
    }
    if(flag==false)
    {
        return count1;
    }
   else
   {
       return 0;
   }
         
    }
public static void main(String[] args )
{
    //System.out.println("Hello world");
    int n=fib(5);
    System.out.println("Fib of nth no."+n);
    int f=fib1(0);
    if(f>0)
    {
        System.out.println("Fib index no.:"+f);

    }
}   
}