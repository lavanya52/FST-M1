package activites;

abstract class Book {
	String title;

	public abstract void setTitle(String s);

	public String getTitle() {
		return title;
	}

}

class MyBook extends Book {

	// TODO Auto-generated method stub

	public void setTitle(String title) {

		this.title = title;
	}

}

public class Activity5 {
	public static void main(String[] args) {
		MyBook b = new MyBook();
		b.setTitle("Two States");
		System.out.println("title="+b.getTitle());
	}

}
