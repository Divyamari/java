    package CollectionEg;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedList;

	class 	bookassignmen {
	public static void main(String[] args) {
	Book m = new Book("Demian", 1, 262.59, "Fiction", "Hermann Herse ", 1919);
	Book m1 = new Book("Me Before You ", 2, 495.00, "Fiction", "Jojo Moyes ", 2012);
	Book m2 = new Book("The Little Prince ", 3, 162.21, "philosophical fiction", "Antoinc De Saiat-exupery ", 1943);
	Book m3 = new Book("I Decided To Live As Me", 4, 265.00, "illustrated essay", "Kim Soo Hyun", 2016);
	Book m4 = new Book("Living,Loving and Learning", 5, 135.00, "Literature", "Leo", 1982);
	Book m5 = new Book("The Power Of Words", 6, 170.00, "Illustrator", "Shin Dohyun and Yoon Naru", 2004);

	LinkedList<Book> b = new LinkedList<Book>();
	b.add(m);
	b.add(m1);
	b.add(m2);
	b.add(m3);
	b.add(m4);
	b.add(m5);
	System.out.println("Linked List Example");
	Iterator<Book> itr = b.iterator();
	while (itr.hasNext()) {
	Book a = (Book) itr.next();
	System.out.println(a.bookName +" - "+a.authorName+" - "+a.bookPrice+" - "+a.category+" - "+a.publishingYear+" - "+a.serialNo);
	}
	HashSet<Book> set=new HashSet<Book>();
	set.add(m);
	set.add(m1);
	set.add(m2);
	set.add(m3);
	set.add(m4);
	set.add(m5);
	System.out.println("Hash Set Example");
	Iterator<Book> itrr = b.iterator();
	while (itrr.hasNext()) {
	Book a1 = (Book) itrr.next();
	System.out.println(a1.bookName +" - "+a1.authorName+" - "+a1.bookPrice+" - "+a1.category+" - "+a1.publishingYear+" - "+a1.serialNo);
	}
	}
	}
	class Book {
	String bookName;
	long serialNo;
	double bookPrice;
	String category;
	String authorName;
	long publishingYear;
	public Book(String bookName, long serialNo, double d, String category,String authorName, long publishingYear) {
	this.bookName = bookName;
	this.serialNo = serialNo;
	this.bookPrice = d;
	this.category = category;
	this.authorName = authorName;
	this.publishingYear = publishingYear;
	}
	}
