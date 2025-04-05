package abstractFactory;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	/**
	 * creates a factory of type LegatoMidiEventFactory since it implements MidiEvent factory it is the same type
	 */
	@Override
	public MidiEventFactory createFactory() {
		MidiEventFactory factory = new LegatoMidiEventFactory();
		return factory;
	}
	
}
