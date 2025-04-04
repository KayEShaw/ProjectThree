package abstractFactory;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	@Override
	public MidiEventFactory createFactory() {
		MidiEventFactory factory = new StaccatoMidiEventFactory();
		return factory;
	}
	
}
