
public class Iphone implements IpodFeaturePlayer, PhoneFeatureCalls, WebFeatureBrowser {
	
	private String model;
	private String color;

	public Iphone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	@Override
	public void showPage(String url) {
		System.out.println("Displaying a page: " + url);
		
	}

	@Override
	public void addNewTab() {
		System.out.println("new tab has been openedd");
	}

	@Override
	public void updatePage() {
		System.out.println("Updated page");
		
	}

	@Override
	public void call(String number) {
		System.out.println("Calling to " +  number);		
	}

	@Override
	public void answerTheCall() {
		System.out.println("Answering the call");
		
	}

	@Override
	public void startVoicemail() {
		System.out.println("Starting voicemail");
		
	}

	@Override
	public void play() {
		System.out.println("Playing the song");
	}

	@Override
	public void pause() {
		System.out.println("Pausing the music");
		
	}

	@Override
	public void musicSelect(String music) {
		System.out.println("Selecting the music " + music);
		
	}
	
	
	
}