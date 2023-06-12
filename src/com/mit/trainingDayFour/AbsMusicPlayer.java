package com.mit.trainingDayFour;

public abstract class AbsMusicPlayer implements MusicPlayer {  // Used to implement abstraction
    // At least one method should have body

    public final void play() {   // Final means no child class can override it
        System.out.println("Playing");
    }

//    public abstract void resume();
//
//    public abstract void stop();    // If not going to implement method, add the keyword "abstract" (if not implementing MusicPlayer Class)
//
//    public abstract void rewind();
//
//    public abstract void fastForward();

    public static void main(String[] args) {

    }
}
