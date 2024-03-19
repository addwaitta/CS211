package labDigitMath;

import java.util.Arrays;

public class runner {

	public static void main(String[] args) {
		methods a = new methods();
		System.out.println("Thousands place of "+13562+": "+a.thouPlace1(13562));
		System.out.println("Thousands place of "+719825+": "+a.thouPlace2(719825));
		int[] numbers = {3527, 98, 902351, 3, -3527, -98, -902351};
		for (int i:numbers) 
			System.out.println("digitCount("+i+"): "+a.digitCount(i));
		for (int i:numbers) 
			System.out.println("digitCountRecursive("+i+"): "+a.digitCountRecurs(i));
		for (int i=0;i<=10;i++) 
			System.out.println("bunnyEars2("+i+"): "+a.bunnyEars2(i));
		String[] strings = { "xxhixx", "xhixhix", "hi", "hihih", "h", "", "ihihihihih", "ihihihihihi", "hiAAhi12hi", "xhixhxihihhhih", "ship" };
		for (String i: strings)
			System.out.println("countHi("+i+"): "+a.countHi(i));
		int[][] arrays = { {1, 6, 4}, {1, 4}, {6}, {}, {6, 2, 2}, {2, 5}, {1, 9, 4, 6, 6}, {2, 5, 6} };
		for (int[] i: arrays)
			System.out.println("array6("+ Arrays.toString(i)+",0): "+a.array6(i, 0));
	}
	
}
