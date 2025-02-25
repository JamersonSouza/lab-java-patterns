package tech.jamersondev.adapter_modern;

import tech.jamersondev.adapter_modern.interfaces.AudioPlayer;
import tech.jamersondev.adapter_modern.model.Mp3Player;
import tech.jamersondev.adapter_modern.model.WavePlayer;

public class MainPlayer {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();

        WavePlayer wavePlayer = new WavePlayer();

        AudioPlayer player = mp3Player::playMp3;
        System.out.println(player.play("mp3"));

        AudioPlayer playerWave = wavePlayer::playWave;
        System.out.println(playerWave.play("wave"));
    }
}
