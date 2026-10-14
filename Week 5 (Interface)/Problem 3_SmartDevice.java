package JavaProject;

interface MediaPlayer {
    void playMedia();
}

interface InternetDevice {
    void connectInternet();
}

class SmartTV implements MediaPlayer, InternetDevice {
    @Override
    public void playMedia() {
        System.out.println("Smart TV is playing media.");
    }

    @Override
    public void connectInternet() {
        System.out.println("Smart TV connected to internet.");
    }
}

class SmartSpeaker implements MediaPlayer, InternetDevice {
    @Override
    public void playMedia() {
        System.out.println("Smart Speaker is playing music.");
    }

    @Override
    public void connectInternet() {
        System.out.println("Smart Speaker connected to internet.");
    }
}
