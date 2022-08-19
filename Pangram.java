package in.ineuron.main;
import java.util.*;
//WAP to check if the String is a Pangram or not

public class Pangram {
    public static void main(String[] args) {
        
        String s1 = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
        s1 = s1.replace(" ", "");
        char y[] = s1.toCharArray();
        int size = y.length;
        
        int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int i = 0;
        while(i != size)
        {
        	int index= y[i]-65;
        	
        	a[index]=1;
        	++i;
        }
        i = 0;
        while(i !=26)
        {
        	if(a[i]==1)
        	{
        		++i;
        	}
        	else
        	{
        		System.out.println("Non Pangram");
        		System.exit(0);
        	}
        }
        System.out.println("Pangram");
    }

    }



