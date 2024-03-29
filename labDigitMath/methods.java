package labDigitMath;

public class methods {
	public int thouPlace1(int x) {
		return (x/1000)%10;
	}
	public int thouPlace2(int x) {
		return (x%10000)/1000;
	}
	public int digitCount(int x) {
		int i=0;
		for (;Math.abs(x)>1;i++)
			x/=10;
		return i;
	}
	public int digitCountRecurs(int x) {
		if (Math.abs(x)>1)
			return 1+digitCountRecurs(x/10);
		else
			return 0;
	}
	public int bunnyEars2(int x) {
		if (x<1)
			return 0;
		else if (x%2==0)
			return 3+bunnyEars2(x-1);
		else 
			return 2+bunnyEars2(x-1);
	}
	public int countHi(String s) {
		int count=0;
		if (s.length()>1) {
			if (s.charAt(0)=='h')
				if(s.charAt(1)=='i')
					count++;
			return count+countHi(s.substring(1));
		}
		return 0;
	}
	public Boolean array6(int[] a,int ind) {
		if (a.length==0||ind>=a.length)
			return false;
		if (a[ind]==6)
			return true;
		return array6(a, ++ind);
	}
}
