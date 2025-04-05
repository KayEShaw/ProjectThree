package pitch;

public interface PitchStrategy {
	/**
	 * This interface declares a method to be used in implementing classes
	 * @param note; helps implementing classes to change the pitch of the music
	 * 				by increasing or decreasing the note
	 */
	int modifyPitch(int note);
}
