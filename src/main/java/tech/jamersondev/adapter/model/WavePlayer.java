package tech.jamersondev.adapter.model;

public class WavePlayer {
    public String playWave(String filename){
        return String.format("playing music in: %s", filename);
    }
}
