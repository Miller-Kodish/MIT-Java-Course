package com.mit.trainingDayFour;

public class iPod extends Apple implements MusicPlayer {   // Can implement multiple interfaces in a single class (comma-separated), can only extend one class
    // Must implement ALL methods
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void resume() {
        System.out.println("Resumed");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public void rewind() {
        System.out.println("Rewinding");
    }

    @Override
    public void fastForward() {
        System.out.println("Fast-Forwarding");
    }
}
