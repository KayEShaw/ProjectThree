package abstractFactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class LegatoMidiEventFactory implements MidiEventFactory{
	public MidiEvent CreateNoteOn(int t, int n, int v, int c) {
		MidiEvent midi = null;
		try {
		ShortMessage on = new ShortMessage();
		on.setMessage(ShortMessage.NOTE_ON, c, n, v);
		midi = new MidiEvent(on, t);
		}
		catch(InvalidMidiDataException e) {
			e.printStackTrace();
		}
		return midi;
	}
	public MidiEvent CreateNoteOff(int t, int n, int v, int c) {
		MidiEvent midi = null;
		try {
		ShortMessage off = new ShortMessage();
		//for legato increase the existing duration by 80 ticks
		off.setMessage(ShortMessage.NOTE_OFF, c, n, 0);
		midi = new MidiEvent(off, (t + 80));
		}
		catch(InvalidMidiDataException e) {
			e.printStackTrace();
		}
		return midi;
	}
}
