package com.mt.patterns.behavioral.state;

/*
* This interface defines the transition methods and then the individual concrete implementations will decide
* how to behave with the transitions
* */
public interface PlayerState {

    void play(AudioPlayer audioPlayer);
    void stop(AudioPlayer audioPlayer);
    void pause(AudioPlayer audioPlayer);
}
