
public class App {

	public static void main(String[] args) {

		
		Iphone cell = new Iphone("v1.0", "black");
		
		cell.play();
		cell.pause();
		cell.musicSelect("Star wars theme");
		cell.call("+55 85 8888-9999");
		cell.answerTheCall();
		cell.startVoicemail();
		cell.showPage("www.google.com");
		cell.addNewTab();
		cell.updatePage();
	}

}
