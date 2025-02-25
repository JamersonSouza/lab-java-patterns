package tech.jamersondev.adapter_modern.model;

public class Mp3Player {
    public String playMp3(String filename){
        return String.format("playing music in: %s", filename);
    }
}
