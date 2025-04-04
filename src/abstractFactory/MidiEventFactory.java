package abstractFactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

public interface MidiEventFactory {
	/**
	 * creates an on note with the assigned variables
	 * @param tick
	 * @param note
	 * @param velocity
	 * @param channel
	 * @return MidiEvent
	 * @throws InvalidMidiDataException
	 */
MidiEvent CreateNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	/**
	 * creates an off note with the assigned variables
	 * @param tick
	 * @param note
	 * @param velocity
	 * @param channel
	 * @return
	 * @throws InvalidMidiDataException
	 */
MidiEvent CreateNoteOff(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
}
