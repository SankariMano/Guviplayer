import java.util.Scanner;
public class Fact {public static void main(String args[]) 
{
Scanner s=new Scanner(System.in);
Integer a=s.nextInt();
System.out.println("Enter number:"+a);
if(a==0)
{
	System.out.println(1);
}else
{
int b=1;
for(int i=1;i<=a;i++)
{
	b=b*i;
}

System.out.println(b);
}
}
}
