package tech.jamersondev.adapter.adapters;

import tech.jamersondev.adapter.interfaces.AudioPlayer;
import tech.jamersondev.adapter.model.WavePlayer;

public class WavePlayerAdapter implements AudioPlayer {

    private final WavePlayer wavePlayer;

    public WavePlayerAdapter(WavePlayer wavePlayer) {
        this.wavePlayer = wavePlayer;
    }

    @Override
    public String play(String filetype) {
        return wavePlayer.playWave(filetype);
    }
}
