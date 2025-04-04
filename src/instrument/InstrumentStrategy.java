package instrument;

import javax.sound.midi.Track;

public interface InstrumentStrategy {
	/**
	 * This method
	 * @param track; the music we're adding to the MIDI event
	 * @param channel; where the instrument is assigned, each
	 * 					instrument is assigned to a spot
	 */
	void applyInstrument(Track track, int channel); 
}
 