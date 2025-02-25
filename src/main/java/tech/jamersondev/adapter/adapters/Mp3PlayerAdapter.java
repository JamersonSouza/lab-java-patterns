package tech.jamersondev.adapter.adapters;

import tech.jamersondev.adapter.interfaces.AudioPlayer;
import tech.jamersondev.adapter.model.Mp3Player;

public class Mp3PlayerAdapter implements AudioPlayer {
    private final Mp3Player mp3Player;

    public Mp3PlayerAdapter(Mp3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public String play(String filetype) {
        return mp3Player.playMp3(filetype);
    }
}
