import java.util.Scanner;

class adventureGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int gameStart = 1;
		boolean stop = false;
		String name;
		String input;

		System.out.print("Welcome! What is your name? (enter your name): ");
		name = sc.nextLine();

		System.out.print("Would you like to play a game? (enter 'yes' or 'no'): ");
		input = sc.nextLine();

		if (input.equalsIgnoreCase("yes"))
			stop = false;
		else if (input.equalsIgnoreCase("no"))
			stop = true;
		while (!stop) {
			switch (gameStart) {
			case 1:
				System.out.println(
						"Excellent!  You are walking across a field " + "and you encounter a fire breathing dragon!  "
								+ "What would you like to do? ('face the beast' or" + " 'run away'): ");
				String input1;
				input1 = sc.nextLine();

				if (input1.equalsIgnoreCase("face the beast"))
					System.out.println("Wow, pretty confident... well, okay!");
				else {
					stop = true;
					break;
				}
				gameStart = 2;
				break;

			case 2:
				System.out.println("You apporach the dragon.  You see he has __ heads" + " (enter '1', '2' or '3')");
				int heads;
				heads = sc.nextInt();
				sc.nextLine();
				if (heads == 1) {
					gameStart = 3;
				} else if (heads == 2) {
					gameStart = 4;
				} else if (heads == 3) {
					gameStart = 5;
				}
				break;

			case 3:
				System.out.println("The Dragon stares back intensely.");
				gameStart = 6;
				break;

			case 4:
				System.out.println("The creature has two heads!");
				gameStart = 6;
				break;

			case 5:
				System.out.println("No one has ever faced a 3-headed dragon before!");
				gameStart = 6;
				break;

			case 6:
				String weapon;
				String eyes;
				System.out.println("Choose your weapon: (enter any weapon of your choice): ");

				weapon = sc.nextLine();

				System.out.println("Armed with your " + weapon + ", you approach the dragon.");

				System.out.println("You can feel its fiery breath as you get closer"
						+ ", it stares at you with its ____ eyes. (enter 'red' or 'blue'): ");
				eyes = sc.nextLine();

				if (eyes.equalsIgnoreCase("red")) {
					gameStart = 7;

				} else {
					gameStart = 8;

				}
				break;
			case 7:
				System.out.println("Oh thank goodness! Red-eyed dragons are friendly.  "
						+ "You pet it and become friends.  You name the dragon___ " + "(enter a name): ");

				String dragon = sc.nextLine();
				System.out.println(name + " and " + dragon + " live happly ever after.");
				stop = true;
				break;

			case 8:
				System.out.println("Oh no blue eyed dragons are extremely aggressive."
						+ "  It kills you with its fire breath instantly");
				stop = true;
				break;
			}
		}
		System.out.println("Game Over!");
		sc.close();
	}
}
