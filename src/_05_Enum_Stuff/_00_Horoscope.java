package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {

	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac sign) {
		switch (sign) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "u r aries");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "u r taurus");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "u r gemini");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "u r cancer");
			break;

		case LEO:
			JOptionPane.showMessageDialog(null, "u r leo");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "u r virgo");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "u r libra");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "u r scorpio");
			break;

		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "u r sagittarius");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "u r capricorn");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "u r aquarius");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "u r pisces");
			break;
		default:
			JOptionPane.showMessageDialog(null, "u r fake news");
			break;
		}
		//TAURUS, GEMINI, CANCER, LEO, VIRGO, 
		//LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac[] options = Zodiac.values();

		int input = JOptionPane.showOptionDialog(null, "wats ur sign", "Custom Buttons", 0, -1, null,
				options, 0);

		Zodiac choice = options[input];
		horoscope(choice);
	}

}
