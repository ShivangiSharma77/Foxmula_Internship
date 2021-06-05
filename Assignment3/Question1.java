/**
* program to calculate frequency of each element of an array.
* @author  Shivangi Sharma
* 
*/

package com.foxmula.DailyTask3;
import java.util.*;

public class Occurence {
void values(int arr[],int num){

Scanner sc= new Scanner(System.in);
System.out.println("Enter Values");
for (int i=0;i<num;i++)
	{
        arr[i]=sc.nextInt();
	}	
	    }

void Frequency(int arr[]) {
HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i=0;i<arr.length;i++) 
			{ 
			hashMap.put(arr[i],(hashMap.get(arr[i])==null) ? 1:hashMap.get(arr[i])+1);
			}
System.out.println("Frequency ");
	  for (HashMap.Entry<Integer, Integer> i:hashMap.entrySet()) 
	  	{
		System.out.print("("+i.getKey()+i.getValue()+")");
		}			
                          }
	
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
	
System.out.print("Number of Values");
		int num=sc.nextInt();
		int arr[]=new int[num];
Occurence obj=new Occurence();
obj.values(arr, num);
obj.Frequency(arr);
}
