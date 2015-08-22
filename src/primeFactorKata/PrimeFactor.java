package primeFactorKata;

import java.util.ArrayList;

public class PrimeFactor {

    public static ArrayList<Integer> findPrimes(int p) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        while(p % 2 == 0)
        {
        	factors.add(2);
            p /= 2;
        }
        while(p != 1)
        {
        	for(int i = 3; i <= p; i++)
        	{
        		if(p % i == 0)
        		{
        			factors.add(i);
        			p /= i;
        			break;
        		}
        	}
        }
        return factors; 
    }
}