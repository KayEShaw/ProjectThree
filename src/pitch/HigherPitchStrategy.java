package pitch;

public class HigherPitchStrategy implements PitchStrategy{
	
	/**
	 * This method overrides the instance created in 
	 * PitchStrategy and uses it here to increase
	 * the pitch by 2 semitones
	 */
	@Override
	public int modifyPitch(int note) {
		return note += 2; 
	} 
}
 