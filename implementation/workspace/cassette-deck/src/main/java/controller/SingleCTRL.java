package controller;

import java.io.File;
import model.Cassette;
import model.CassetteDeck;

public class SingleCTRL extends SimulationCTRL {

    public void ejectFn() {
        System.out.println("*EJECT BUTTON PRESSED*");
        cassetteDeck.getDeck().eject();
    }

    public void insertFn() {
        System.out.println("*INSERT BUTTON PRESSED*");
        File songFile = null;
        if(!cassetteDeck.getDeck().getHolder().hasCassette()) {
        	fileLoader = new FileLoader();
        	songFile = fileLoader.openFile();
        }
        cassetteDeck.getDeck().insert(new Cassette(songFile));
    }

    public void flipFn() {
        System.out.println("*FLIP BUTTON PRESSED*");
    }
    
    public void resetCounterFn() {
    	
    }

    public void playFn() {
        System.out.println("*PLAY BUTTON PRESSED*");
        cassetteDeck.getDeck().play();
    }

    public void pauseFn() {
        System.out.println("*PAUSE BUTTON PRESSED*");
        cassetteDeck.getDeck().pause();
    }

    public void stopFn() {
        System.out.println("*STOP BUTTON PRESSED*");
        cassetteDeck.getDeck().stop();
    }

    public void fastRewindFn() {
        System.out.println("*FAST REWIND BUTTON PRESSED*");
        cassetteDeck.getDeck().fastRewind();
    }

    public void fastForwardFn() {
        System.out.println("*FAST FORWARD BUTTON PRESSED*");
        cassetteDeck.getDeck().fastForward();
    }
    
    public void previousSongFn() {
    	
    }
    
    public void nextSongFn() {
    	
    }

    public void recordFn() {
        System.out.println("*RECORD BUTTON PRESSED*");
        cassetteDeck.getDeck().record();
    }

    public void init(CassetteDeck cassetteDeck) {
        this.cassetteDeck = cassetteDeck;
        if (!cassetteDeck.hasSpeakers()) {

        }
        if (!cassetteDeck.hasRecorder()) {
//            playerAndRecorderSP.getItems().remove(1);
        }
        if (!cassetteDeck.hasMicrophone()) {

        }
        if (!cassetteDeck.hasAutoReverse()) {

        }
        if (!cassetteDeck.hasSongDetection()) {

        }
    }
}
