/*
* program to calculate frequency of each element of an array and then sort by value
* @author  Shivangi Sharma
* 
*/

package com.foxmula.DailyTask3;
import java.util.*;

public class Sorting {
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
		System.out.println("Sorted Array");
		sortElements(hashMap);
                }
		
void sortElements(HashMap<Integer,Integer> hashMap) {
List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(hashMap.entrySet());
Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

public int compare(Map.Entry<Integer, Integer> FirstElement,Map.Entry<Integer, Integer> SecondElement)
	        {
	        return (FirstElement.getValue()).compareTo(SecondElement.getValue());
		}
		});
          for (Map.Entry<Integer, Integer> out : list)
	        {
		System.out.print( "+out.getKey() +" "+out.getValue()+");
		}
	  }
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number of Elements you want to insert in an array: ");
int num=sc.nextInt();
int arr[]=new int[num];
Sorting obj =new Sorting();
		obj.values(arr, num);
		obj.Frequency(arr);
	
		}
}
