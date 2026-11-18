// Problem: UNPALIN
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/START265A/problems/UNPALIN
// Solved on: 2026-11-18T14:34:22.675Z


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static boolean isPalindrome(int[] a, int x) {
        int l = 0;
        int r = a.length - 1;

        while (l < r) {

            while (l < r && a[l] == x) {
                l++;
            }

            while (l < r && a[r] == x) {
                r--;
            }

            if (a[l] != a[r]) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int l = 0;
            int r = n - 1;

            while (l < r && a[l] == a[r]) {
                l++;
                r--;
            }

            if (l >= r) {
                System.out.println("NO");
            }
            else if (!isPalindrome(a, a[l])) {
                System.out.println("YES " + a[l]);
            }
            else if (!isPalindrome(a, a[r])) {
                System.out.println("YES " + a[r]);
            }
            else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
