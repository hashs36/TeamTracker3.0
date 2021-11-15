package PageMod;

public class testt {
	public static void main(String[] args) {
		
		int i=1,j=1,ct=0,n=0;
		while(n<5) {
			ct=0;
			j=1;
			while ( j<=i ) {
				if( i % j == 0 ) {
					ct++;
				}
					j++;
					
				
			}
				if (ct == 1)	{
					System.out.println("prime number %d"+i);
					
					n++;
				}
				i++;
			}
		}
	}
	
	
	


