package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 10/10/2016.
 */
public class ShortPalindrome {


    public String longestPalindrome(String s) {
        String res = "";
        int currLength = 0;
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s,i-currLength-1,i)){
                res = s.substring(i-currLength-1,i+1);
                currLength = currLength+2;
            }
            else if(isPalindrome(s,i-currLength,i)){
                res = s.substring(i-currLength,i+1);
                currLength = currLength+1;
            }
        }
        return res;
    }

    public boolean isPalindrome(String s, int begin, int end){
        if(begin<0) return false;
        while(begin<end){
            if(s.charAt(begin++)!=s.charAt(end--)) return false;
        }
        return true;
    }

    public int countShortPalindrome(String str){
        char[] s = str.toCharArray();
        int count = 0;
        int l = s.length;
        for(int i = 0; i < l - 3; i++){
            int[] arr = new int[26];
            for(int j=i+1; j < l ; j++ ){
                if(s[i] == s[j]){
                    for(int m=0;m<26;m++){
                        if(arr[m] > 1){
                            count = (count + (arr[m]*(arr[m] - 1))/2)%1000000007;
                        }
                    }
                }
                char character = s[j];
                System.out.println("char: " + character);
                int number = character;
                System.out.println("number: " + number);
                arr[number - 97]++;
                System.out.println("arr[number - 97]: " + arr[number - 97]);
            }
        }
        System.out.println(count);
        return 0;
    }

    public int Mix(int a, int b){
        return a*26 + b;
    }

    public int countShortPalindrome2(String str){
        char[] s = str.toCharArray();
        int[] arr = new int[26];
        int[] carr = new int[26];
        int[] pairArr = new int[26*26];
        int ans = 0;

        for(char ch: s){
            int v = ch - 'a';
            ans = (ans + carr[v]) % 1000000007;

            for(int nc = 0; nc < 26; nc++){
                carr[nc] = (carr[nc] + pairArr[Mix(nc,v)]) % 1000000007;
            }

            for(int nc = 0; nc < 26; nc++){
                int idx = Mix(nc,v);
                pairArr[idx] = (pairArr[idx] + arr[nc]) % 1000000007;
            }
            arr[v]++;
        }
        System.out.println(ans);


        return 0;
    }

    public static void main(String[] args) {
        ShortPalindrome sp = new ShortPalindrome();
        //String ss = "ghhggh";
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();

        //sp.countShortPalindrome(ss);
        sp.countShortPalindrome2(ss);
    }
}
