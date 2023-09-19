package Admin.model;

public class BookModel {
String BookName;
String BookPublisher;
String BookAuthor;
String BookImage;

public BookModel(String BookName,String BookPublisher,String BookAuthor,String BookImage) {
	this.BookName = BookName;		
	this.BookPublisher = BookPublisher;
	this.BookAuthor = BookAuthor;
	this.BookImage = BookImage;
}


public void setBookName(String BookName) {
	this.BookName = BookName;
}

public String getBookName() {
	return this.BookName;
}


public void setBookPublisher(String BookPublisher) {
	this.BookPublisher = BookPublisher;
}

public String getBookPublisher() {
	return this.BookPublisher;
}


public void setBookAuthor(String BookAuthor) {
	this.BookAuthor = BookAuthor;
}

public String getBookAuthor() {
	return this.BookAuthor;
}

public void setBookImage(String BookImage) {
	this.BookImage = BookImage;
}

public String getBookImage() {
	return this.BookImage;
}


}
