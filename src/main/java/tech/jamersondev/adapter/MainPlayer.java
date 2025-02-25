package tech.jamersondev.adapter;

import tech.jamersondev.adapter.adapters.Mp3PlayerAdapter;
import tech.jamersondev.adapter.adapters.WavePlayerAdapter;
import tech.jamersondev.adapter.interfaces.AudioPlayer;
import tech.jamersondev.adapter.model.Mp3Player;
import tech.jamersondev.adapter.model.WavePlayer;

public class MainPlayer {
    public static void main(String[] args) {
        AudioPlayer player = new Mp3PlayerAdapter(new Mp3Player());
        System.out.println(player.play("mp3"));

        AudioPlayer wavePlayer = new WavePlayerAdapter(new WavePlayer());
        System.out.println(player.play("wave"));
    }
}
