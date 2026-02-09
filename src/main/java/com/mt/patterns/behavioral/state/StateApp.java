package com.mt.patterns.behavioral.state;

public class StateApp {

    static void main() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        audioPlayer.play();
        audioPlayer.stop();
        audioPlayer.pause();
    }
}
