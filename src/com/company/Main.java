import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution {

    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int i;
        int a[]=new int[n];
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int l=a[j];
                    a[j]=a[j+1];
                    a[j+1]=l;
                }
            }
        }
        System.out.println(a[k-1]);
    }
}