package JavaProject;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartphoneDevice implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Smartphone takes a photo.");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone plays music.");
    }
}

public class Smartphone {
    public static void main(String[] args) {
    	SmartphoneDevice phone = new SmartphoneDevice();

        phone.takePhoto();
        phone.playMusic();
    }
}
