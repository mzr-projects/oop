package com.mt.patterns.behavioral.state;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class AudioPlayer {

    private PlayerState playerState;

    public AudioPlayer() {
        /*
        * We start with stop-state
        * */
        this.playerState = new StopState();
    }

    public void play() {
        playerState.play(this);
    }

    public void stop() {
        playerState.stop(this);
    }

    public void pause() {
        playerState.pause(this);
    }
}
