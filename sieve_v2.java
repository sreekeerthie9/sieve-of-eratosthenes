import java.util.*;
import java.lang.*;

class sieve_v2{
	public static void main(String [] args)
	{
		int range = 1000000000;
		long start;
		long end;
		boolean numbers[] = new boolean [range];
		int prime;
		int multiples;
		int inc;
		start = System.currentTimeMillis();
		int composite_ctr;
		numbers [ 0 ] = true;
		numbers [ 1 ] = true;
		prime = 2;
		inc= 2;
		composite_ctr = 2;
		for ( multiples = prime * prime; multiples < range; multiples+=inc)
		{
			numbers [ multiples ] = true;
			composite_ctr+=1;
		}
		for( prime = 3; prime * prime < range ; prime += 2)
		{
			inc=prime*2;
			for ( multiples = prime * prime; multiples < range; multiples+=inc)
			{
				if ( numbers [ multiples ] == false)
				{
				 numbers [ multiples ]  = true;
				composite_ctr+=1;
				}
			}
		}
			int primeCtr;
			primeCtr = 0;
	/*	for( int ind = 0; ind < range ; ind+=1)
			if ( numbers [ ind ] == false)
		       primeCtr++;*/
		   primeCtr = range - composite_ctr;
		end = System.currentTimeMillis();
			   
			 System.out.printf("%d -> %d %f", range, primeCtr, (end - start) /1000.0 );
		
	}
}