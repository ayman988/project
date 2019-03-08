package sheet1;

public class myclass2 {

	public static void reverse(int a[]) {
		int temp,l=0,r=a.length-1;
		while(l<r)
		{
			temp=a[r];
			a[r]=a[l];
			a[l]=temp;
			r--;
			l++;	
		}
	}
	public static int[] sum(int a[]) {
		int i,n=a.length;
		int c[]=new int [2];
		c[0]=0;
		c[1]=0;
		for(i=0;i<n;i++)
		{
			if(a[i]%2==1)
			{
				c[1]=c[1]+a[i];
			}
			else
			{
				c[0]=c[0]+a[i];
			}
		}
		return c;
	}
	public static double average(int a[])
	{
	int i,n=a.length;
		double av=0;
		for(i=0;i<n;i++)
		{
			av=av+a[i];
		}
		av=av/n;
		return av;
	}
	
	public void move(int a[],int val)
	{
		int i,j,n=a.length;
		for(j=0;j<n;j++)
		{
			for(i=0;i<n-1;i++)
			{
			  if(a[i]==val)
			  {
				  a[i]=a[i+1];
				  a[i+1]=val;
			  }
			}	
		}
	}
  public static void transpose(int b[][])
  {
	  int i,j,c=b[0].length,r=b.length;
	  
	  int e[][]=new int[c][r];
	  for(i=0;i<c;i++)
	  {
		 for(j=0;j<r;j++)
		 {
			 e[i][j]=b[j][i];
		 }
	  } 
	 b=e;
	
  }
	public long fib(int n)
	{
		long f1=1,f2=0,f3=0;
		int i;
		for(i=1;i<n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		return f3;
	}
}
