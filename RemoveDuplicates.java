package week3Javabasics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
		
String text = "We learn java basics as part of java sessions in java week1";
String[] split=text.split(" ");
List<String> lst=new ArrayList<String>();
Set<String> set=new HashSet<String>();
System.out.println(set);
for (String string : split) {
	set.add(string);
	lst.add(string);
}
	System.out.println(lst);
	System.out.println(set);
	String dupli="   ";
	for (String string : set) {
		dupli += "   "+string;
	}
	System.out.println(dupli); //remove duplicate
	}}
