package week3Javabasics;
import java.util.HashSet;
import java.util.Set;
public class FindIntersectioninList {

	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		for (Integer integer : a) {
			set1.add(integer);
		}System.out.println(set1);
		for (Integer integer1 : b) {
			set2.add(integer1);
		}System.out.println(set2);
	set1.retainAll(set2);
	System.out.println(set1);
	}
		}