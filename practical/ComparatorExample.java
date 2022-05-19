package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book("Java","Games Josling",2300));
		al.add(new Book("PHP","Games ",300));
		al.add(new Book("DotNet"," XYZ",5300));
		al.add(new Book("HTML"," ABC",3200));
		al.add(new Book("Bootstrap"," DEF",2000));
		al.add(new Book("Angular"," HJK",4000));

		System.out.println("Sorting by BookPrice");
		Collections.sort(al,new BookPriceCompare());
		Iterator<Book> itr = al.iterator();
		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			System.out.println(b.BookName+ " " +b.BookAuthor+" "+b.BookPrice);
		}
		System.out.println("----------------------");
		System.out.println("Sorting by BookName");
		Collections.sort(al, new BookNameCompare());
		Iterator<Book> itr1 = al.iterator();
		while(itr1.hasNext()) {
			Book b = (Book) itr1.next();
			System.out.println(b.BookName + " " + b.BookAuthor + " " + b.BookPrice);
			}
		//sorting on basic of bookname
		Comparator<Book> c = Comparator.comparing(Book::getBookName);
		Collections.sort(al,c);
		System.out.println("Sorting by BookName");
		for(Book b: al) {
			System.out.println(b.BookName+ " " +b.BookAuthor+" "+b.BookPrice);
		}
		//sorting on basis of bookprice
		Comparator<Book> c1 = Comparator.comparing(Book::getBookPrice);
		Collections.sort(al,c1);
		System.out.println("Sorting by BookPrice");
		for(Book b: al) {
			System.out.println(b.BookName+ " " +b.BookAuthor+" "+b.BookPrice);
	}
	}
}
