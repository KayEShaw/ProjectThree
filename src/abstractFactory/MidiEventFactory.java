package abstractFactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

public interface MidiEventFactory {
MidiEvent CreateNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
MidiEvent CreateNoteOff(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
}
