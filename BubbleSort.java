package SortingAlgrthms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 4, 2, 6, 1, 5, 9, 3, 7, 12 };
		System.out.print("Before sorting the array is ");
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.print("After sorting the array is ");
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) 
	{
		for (int i = 0; i <= a.length; i++) 
		{
			for (int j = 0; j < a.length - 1 - i; j++) 
			{
				if (a[i] > a[j + 1]) {
					int temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

	}

}
