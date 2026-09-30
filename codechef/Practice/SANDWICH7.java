// Problem: SANDWICH7
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/START258D/problems/SANDWICH7
// Solved on: 2026-09-30T14:57:08.011Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    
		int b=sc.nextInt();
		int h=sc.nextInt();
		int c=sc.nextInt();
		
	    int pair = (b/2);
	    if(pair<(h+c)){
	        System.out.println(pair);
	    }
        else{
            System.out.println(h+c);
        }
	}
}
