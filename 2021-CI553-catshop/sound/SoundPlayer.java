package sound;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import debug.DEBUG;

public class SoundPlayer {

	
	public void playSound(String id) {
		File f = new File("sound/" + id + ".wav");
		if(f.isFile()) {
			try {
				AudioInputStream setFile = AudioSystem.getAudioInputStream(f);
				Clip clip = AudioSystem.getClip();
				clip.open(setFile);
				clip.start();
			}
			catch(Exception e) {
				DEBUG.error("SoundPlayer", e.getMessage());
			}
		}
		else {
			DEBUG.error("SoundPlayer", "No sound files in the system");
		}
	}

}
