package stringsIntro_001;

import javax.swing.JOptionPane;

public class cesarCoder {

	// 0. define stuff
	//	 	0.0 string alphabet
	// 		0.1 string input
	// 		0.2 int key
	// 		0.3 string coded text
	// 		0.4 string key input
	// 		0.5 create msg to change before displaying stuff
	//
	// 1. input a message
	//	 	1.1 message WOOHOO
	//
	// 2. input a key
	//	 	2.0 shift the alphabet # of key
	// 		2.1 create JOP
	// 		2.2 create charAt(i) loop
	// 		2.3 create a wrap (for xyz... etc)
	// 		2.4 shift the charAt(i) loop over by the key
	//
	// 3. output a coded message
	//		3.1 JOP the output!

	public static void main(String[] args) {

		String msg = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String input = "";
		String output = "";
		int outputInt = 0;
		String keyInput = "";
		int key = 0;

		// USER INPUTS
		msg = "Please enter a message you wish to encode";
		input = JOptionPane.showInputDialog(msg);
		input = input.toLowerCase();

		msg = "Please enter a key to code the message with";
		keyInput = JOptionPane.showInputDialog(msg);
		key = Integer.parseInt(keyInput);

		// IN CASE OF ERROR
		msg = "Key: ";

		// ERROR CATCHER
		while (key > 26) {
			key -= 26;
			msg = "WARNING The key you put in was unresonable, \nso here's a resonable version: ";
		} // END OF ERROR CATCH

		// ***NEW VARIABLE***
		String shiftAlpha = alphabet.substring(26 - key, 26);

		shiftAlpha += alphabet.substring(0, 26 - key);

		// ENCODING LOOP
		for (int i = 0; i < input.length(); i++) {

			outputInt = shiftAlpha.indexOf(input.charAt(i));
			output += alphabet.charAt(outputInt);

		} // END OF ENCODING LOOP

		JOptionPane.showMessageDialog(null, msg + key + "\nUncoded Message: " + input + "\nCoded Message: " + output);

	} // end of main

} // end of class
