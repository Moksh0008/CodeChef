// Problem: COPYCAT
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/START263A/problems/COPYCAT
// Solved on: 2026-11-04T14:32:19.721Z


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int ans = 0;

            for (int i = 0; i < N - 1; i++) {
                if (S.charAt(i) == '1' && S.charAt(i + 1) == '0') {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
