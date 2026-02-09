package com.mt.patterns.behavioral.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PauseState implements PlayerState {

    @Override
    public void play(AudioPlayer audioPlayer) {
        log.info("Playing ...");
        audioPlayer.setPlayerState(new PlayState());
    }

    @Override
    public void stop(AudioPlayer audioPlayer) {
        log.info("Stopping ...");
        audioPlayer.setPlayerState(new StopState());
    }

    @Override
    public void pause(AudioPlayer audioPlayer) {
        log.info("Already paused ...");
    }
}
