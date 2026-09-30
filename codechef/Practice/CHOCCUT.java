// Problem: CHOCCUT
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/START258D/problems/CHOCCUT
// Solved on: 2026-09-30T15:05:07.745Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		int x=sc.nextInt();
		int y=sc.nextInt();
		
	    if(((x*y)%2)==0){
	        System.out.println("Yes");
	    }
        else{
            System.out.println("No");
        }}
	}
}
