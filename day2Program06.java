import java.util.Scanner;
class program06
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num=scob.nextInt();//1
if(num==1){System.out.print("MONDAY");}
else if(num==2){System.out.print("TUESDAY");}
else if(num==3){System.out.print("WEDNESDAY");}
else if(num==4){System.out.print("THURSDAY");}
else if(num==5){System.out.print("FRIDAY");}
else if(num==6){System.out.print("SATURDAY");}
else if(num==7){System.out.print("SUNDAY");}
else {System.out.print("INVALID");}
}//main()
}//program06
