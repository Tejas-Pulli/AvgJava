import java.util.Scanner;
class Average
{
 	public static void main(String[] args)
 	{ 
  	Scanner  a = new Scanner(System.in);
	int i=0;
	int avg=0;
	
  
	System.out.println("Enter Number of Terms: "); 
    	int b = a.nextInt();

	System.out.println("Enter Numbers: ");  
	while(i<b)
	{
    		
    		avg = avg+a.nextInt();
		i++;
	}
		avg=avg/b;
	System.out.printf("Average = %d ",avg);  

	}

}