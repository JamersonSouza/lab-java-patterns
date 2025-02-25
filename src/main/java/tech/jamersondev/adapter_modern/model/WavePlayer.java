package tech.jamersondev.adapter_modern.model;

public class WavePlayer {
    public String playWave(String filename){
        return String.format("playing music in: %s", filename);
    }
}
