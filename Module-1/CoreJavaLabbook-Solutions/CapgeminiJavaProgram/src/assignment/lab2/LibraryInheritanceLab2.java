package assignment.lab2;

abstract class Item {
	private int idn;
	private String title;
	private int noOfCopies;

	/**
	 * @param idn
	 * @param title
	 * @param noOfCopies
	 */
	public Item(int idn, String title, int noOfCopies) {
		this.idn = idn;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

	// getter and setter functions
	public int getIdn() {
		return idn;
	}

	public void setIdn(int idn) {
		this.idn = idn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void addItem() {
		
	}

	public void deleteItem() {

	}

	public void getAllItems() {

	}

	public void checkIn() {

	}

	public void checkOut() {

	}

}




abstract class WrittenItem extends Item {
	private String author;

	/**
	 * @param idn
	 * @param title
	 * @param noOfCopies
	 * @param author
	 */
	public WrittenItem(int idn, String title, int noOfCopies, String author) {
		super(idn, title, noOfCopies);
		this.author = author;
	}

	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


}






class Book extends WrittenItem {

	/**
	 * @param idn
	 * @param title
	 * @param noOfCopies
	 * @param author
	 */
	public Book(int idn, String title, int noOfCopies, String author) {
		super(idn, title, noOfCopies, author);
	}

	
	public void getBooks() {

	}
	
	public void addBook(Book b) {

	}
}






class JournalPaper extends WrittenItem {
	private int yearpub;

	/**
	 * @param idn
	 * @param title
	 * @param noOfCopies
	 * @param author
	 * @param yearpub
	 */
	public JournalPaper(int idn, String title, int noOfCopies, String author, int yearpub) {
		super(idn, title, noOfCopies, author);
		this.yearpub = yearpub;
	}

	/**
	 * @return the yearpub
	 */
	public int getYearpub() {
		return yearpub;
	}

	/**
	 * @param yearpub
	 *            the yearpub to set
	 */
	public void setYearpub(int yearpub) {
		this.yearpub = yearpub;
	}

}

abstract class MediaItem extends Item {
	private int data;


	/**
	 * @param idn
	 * @param title
	 * @param noOfCopies
	 * @param data
	 */
	public MediaItem(int idn, String title, int noOfCopies, int data) {
		super(idn, title, noOfCopies);
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

}

class Video extends MediaItem {

	private String video_director;
	private String video_genre;
	private String video_year;
	/**
	 * @param idn
	 * @param title
	 * @param noOfCopies
	 * @param data
	 * @param video_director
	 * @param video_genre
	 * @param video_year
	 */
	public Video(int idn, String title, int noOfCopies, int data, String video_director, String video_genre,
			String video_year) {
		super(idn, title, noOfCopies, data);
		this.video_director = video_director;
		this.video_genre = video_genre;
		this.video_year = video_year;
	}
	
	public String getVideo_director() {
		return video_director;
	}

	public void setVideo_director(String video_director) {
		this.video_director = video_director;
	}

	public String getVideo_genre() {
		return video_genre;
	}

	public void setVideo_genre(String video_genre) {
		this.video_genre = video_genre;
	}

	public String getVideo_year() {
		return video_year;
	}

	public void setVideo_year(String video_year) {
		this.video_year = video_year;
	}

}

class CD extends MediaItem {
	private String cd_artist;
	private String cd_genre;
	
	/**
	 * @param idn
	 * @param title
	 * @param noOfCopies
	 * @param data
	 * @param cd_artist
	 * @param cd_genre
	 */
	public CD(int idn, String title, int noOfCopies, int data, String cd_artist, String cd_genre) {
		super(idn, title, noOfCopies, data);
		this.cd_artist = cd_artist;
		this.cd_genre = cd_genre;
	}


	/**
	 * @return the cd_artist
	 */
	public String getCd_artist() {
		return cd_artist;
	}

	/**
	 * @param cd_artist
	 *            the cd_artist to set
	 */
	public void setCd_artist(String cd_artist) {
		this.cd_artist = cd_artist;
	}

	/**
	 * @return the cd_genre
	 */
	public String getCd_genre() {
		return cd_genre;
	}

	/**
	 * @param cd_genre
	 *            the cd_genre to set
	 */
	public void setCd_genre(String cd_genre) {
		this.cd_genre = cd_genre;
	}

}

public class LibraryInheritanceLab2 {
	public static void main(String[] args) {
		
	}
}
