class Amstrong
{
	public static void main(String[] arg)
	{
	int num1 = Integer.parseInt(arg[0]);
	
	
	int q1 = num1/10;
	int r1 =num1%10;
	int q2= q1/10;
	int r2= qxz1%10;
	int result1 = q2*100+r2*10+r1*1;
	int result2 = q2*q2*q2+r2*r2*r2+r1*r1*r1; 
	if(result1==result2)
	{
	System.out.println( "amstrong");
	}
	else
	System.out.println("not amstrong");
	}
	}
	