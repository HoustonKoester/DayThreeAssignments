import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Collections;
public class DayThree {

	public static void main(String[] args) {
		//1
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("Hi");
//		arr.add("Bye");
//		arr.add(null);
//		System.out.println(arr.get(0) + " : " + arr.get(1));
//		arr.set(2, arr.get(1));
//		arr.set(1, arr.get(0));
//		arr.set(0, arr.get(2));
//		arr.set(2, null);
//		System.out.println(arr.get(0) + " : " + arr.get(1));
		//2
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("Hi");
//		arr.add("Bye");
//		ArrayList<String> arr2 = (ArrayList<String>) arr.clone();
//		System.out.println(arr);
//		System.out.println(arr2);
		//3
//		LinkedList<String> arr = new LinkedList<String>();
//		arr.add("Hi");
//		arr.add("Bye");
//		arr.add("Try");
//		arr.add("Rye");
//		arr.add("Cry");
//		 ListIterator<String> iterate = arr.listIterator(arr.size());
//		 while(iterate.hasPrevious()) {
//			 System.out.println(iterate.previous());
//		 }
		//4
//		LinkedList<String> arr = new LinkedList<String>();
//		arr.add("Hi");
//		arr.add("Bye");
//		arr.add("Try");
//		arr.add("Rye");
//		arr.add("Cry");
//		arr.offerLast("Last");
//		System.out.println(arr);
		//5 unsure what form of "search" was being asked for so here's 3 various methods
//		LinkedList<String> arr = new LinkedList<String>();
//		arr.add("Hi");
//		arr.add("Bye");
//		arr.add("Try");
//		arr.add("Rye");
//		arr.add("Cry");
//		System.out.println(arr.indexOf("Try"));
//		System.out.println(arr.get(2));
//		ListIterator<String> iterate = arr.listIterator(0);
//		 while(iterate.hasNext()) {
//			 if(iterate.next() == "Try") {
//			 System.out.println(iterate.previous());
//			 iterate.next();
//			 } 
//		 }
		//6
//		LinkedList<String> arr = new LinkedList<String>();
//		arr.add("Hi");
//		arr.add("Bye");
//		arr.add("Try");
//		arr.add("Rye");
//		arr.add("Cry");
//		LinkedList<String> arr2 = new LinkedList<String>();
//		arr2.add("111");
//		arr2.add("222");
//		arr2.add("333");
//		arr2.add("444");
//		arr2.add("555");
//		arr.addAll(arr2);
//		System.out.println(arr);
		//7
//		ArrayList<Student> arr = new ArrayList<Student>();  
//		arr.add(new Student(1,"Gary", 23));
//		arr.add(new Student(4,"David", 22));
//		arr.add(new Student(3,"Amanda", 26));
//		arr.add(new Student(2,"John", 27));
//		Collections.sort(arr);
//		for(int i=0; i < arr.size(); i++) {
//			System.out.println("Name: " + arr.get(i).name + "\tRank: " + arr.get(i).rank + "\tAge: " + arr.get(i).age );
//		}
		//8
//		ArrayList<Student> arr = new ArrayList<Student>();  
//		arr.add(new Student(1,"Gary", 23));
//		arr.add(new Student(4,"David", 22));
//		arr.add(new Student(3,"Amanda", 26));
//		arr.add(new Student(2,"John", 27));
//		Collections.sort(arr, new RankCompare());
//		for(int i=0; i < arr.size(); i++) {
//			System.out.println("Name: " + arr.get(i).name + "\tRank: " + arr.get(i).rank + "\tAge: " + arr.get(i).age );
//		}
//		System.out.println();
//		Collections.sort(arr, new AgeCompare());
//		for(int i=0; i < arr.size(); i++) {
//			System.out.println("Name: " + arr.get(i).name + "\tRank: " + arr.get(i).rank + "\tAge: " + arr.get(i).age );
//		}
		//9
//		int charcount = 0;
//	    try {  
//            Reader reader = new FileReader(System.getProperty("user.dir") + "/randText.txt");  
//            int data = reader.read();  
//            while (data != -1) {  
//                System.out.print((char) data);  
//                charcount += 1;
//                data = reader.read(); 
//                
//            }  
//            reader.close();  
//        } catch (Exception ex) {  
//            System.out.println(ex.getMessage());  
//        }
//	    System.out.println();
//	    System.out.println("There are: " + charcount + " Characters in that file including newlines");
		//10
//		Squarer sqr = (a) -> (a*a);
//		System.out.println(sqr.square(10));
	}
	
	//interface for 10's lambda
	interface Squarer{  
	    public int square(int a);  
	}  
}

