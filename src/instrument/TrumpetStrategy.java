package instrument;

import javax.sound.midi.*;

public class TrumpetStrategy implements InstrumentStrategy{
	@Override
	public void applyInstrument(Track track, int channel) {
		
		try {
			/**
			 * Creating a ShortMessage is needed to tell the MIDI program what event 
			 * we're sending,  in this case we're doing a program change which is
			 * changing the instrument 
			 */
			ShortMessage shortMessage = new ShortMessage(); 
			
			/**
			 * program change = changing instrument 
			 * channel = which channel the change applies to 
			 * 56 = MIDI number for Trumpet
			 * 0 = ignored empty spot
			 */
			shortMessage.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 56, 0); 
			
			/**
			 * Create MidiEvent, set tick to 0, which is the start of the track 
			 */
			MidiEvent event = new MidiEvent(shortMessage, 0);
			
			/**
			 * add MidiEvent created to the track in order to be played 
			 */
			track.add(event);
			
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}

	}
}
