package meli.ejerc;

import java.util.Arrays;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		// PROGRAMAR AQUI
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
		System.out.println("");
		String test1 = StringUtil.replicate('x',20);
		System.out.println(test1);

		String test2 = StringUtil.lpad("555",3,'0');
		System.out.println(test2);

		int[] flag1 = {1,2,3,4,5,6};
		String[] test3 = StringUtil.toStringArray(flag1);
		System.out.println(Arrays.toString(test3));

		String[] flag2 = {"1","2","3","4"};
		int[] test4 = StringUtil.toIntArray(flag2);
		System.out.println(Arrays.toString(test4));

		String[] flag3 = {"12345","12","123","1234"};
		int test5 = StringUtil.maxLength(flag3);
		System.out.println(test5);
	}

}
