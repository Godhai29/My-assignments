package abstraction;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
	Automation auto=new Automation();
	auto.python();
	auto.Selenium();
	auto.java();
	auto.ruby();
	}
	public void Selenium() {
		System.out.println("Selenium is a testing tool");
		}
   public void java() {
		System.out.println("Java is a programming language");
		}

	@Override
	public void ruby() {
		System.out.println("Ruby is also a programming language");
		}
}
