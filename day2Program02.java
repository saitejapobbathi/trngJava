import java.util.Scanner;
class program02
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1=scob.nextInt();//15
int inc=scob.nextInt();//3
int i=0;//variable declaration
i=0;//initialization
while(i<=num1)
{
	System.out.print(i+",");
	i=i+inc;
}//while loop

}//main()
}//program11
//+,-,*,1,%