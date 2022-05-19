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
public class Book {
	String BookName;
	String BookAuthor;
	int BookPrice;
	
	public Book(String BookNmae, String BookAuthor, int BookPrice) {
		super();
		this.BookName = BookName;
		this.BookAuthor = BookAuthor;
		this.BookPrice = BookPrice;
		}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getBookAuthor() {
		return BookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return BookPrice;
	}

	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	
	}
public class BookPriceCompare implements Comparator {
	
	public int compare (Object o1,Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;

			if(b1.BookPrice == b2.BookPrice)
				return 0;
			else if(b1.BookPrice > b2.BookPrice)
				return 1;
			else
				return -1;
}
}
public class BookNameCompare implements Comparator {
	public int compare(Object o1, Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		
		return b1.BookName.compareTo(b2.BookName);
	}
}



