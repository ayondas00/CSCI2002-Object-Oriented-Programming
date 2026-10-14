package JavaProject;

public class Main {
    public static void main(String[] args) {
    		SmartTV tvMedia = new SmartTV();
    		SmartTV tvInternet = new SmartTV();

    		SmartSpeaker speakerMedia = new SmartSpeaker();
    		SmartSpeaker speakerInternet = new SmartSpeaker();

        tvMedia.playMedia();
        tvInternet.connectInternet();

        speakerMedia.playMedia();
        speakerInternet.connectInternet();
    }
}
