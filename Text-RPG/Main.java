import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		// Game variables
		String[] enemies = { "Zombie", "Mutant", "Ghoul" };
		String[] bossEnemies = { "Abodminable Snowman", "Dragon", "Manbearpig", "Giant Cave Spider"};
		int maxEnemyHealth = 50;
		int enemyHealth = 0;
		int enemyAttackDamage = 25;
		String input = "";
		String enemy = "";

		System.out.println("###########################################");
		System.out.println("     # A Text Based Role Playing Game #     ");
		System.out.println("###########################################");

		// Player variables
		int maxHealth = 100;
		int health = 100;
		int attackDmg = 50;
		int numBandages = 3;
		int bandageHealAmount = 25;
		int bandageDropChance = 50;
		int scrapDropChance = 50;
		int numScrap = 0;
		boolean dead = false;
		boolean ran = false;
		boolean shopping = false;
		boolean inCave = false;

		// Game Status
		boolean running = true;

		// Label
		GAME: while (running) {
			inCave = false;
			if(Math.random() < .1) {
				System.out.println("You stumble across the mouth of a cave. Would you like to \n\t1. Enter the cave \n\t2. Continue exploring the wasteland");
				input = in.nextLine();
				switch(input) {
				case "1" :
					enemyHealth = rand.nextInt(maxEnemyHealth) + 100;
					enemy = bossEnemies[rand.nextInt(enemies.length)];
					System.out.println("\n\tA " + enemy + " Has Appeared. \n");
					inCave = true;
					break;
				case "2" :
					inCave = false;	
					break;
				}

			} else if(!inCave) {

			enemyHealth = rand.nextInt(maxEnemyHealth);
			enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\n\t" + "A " + enemy + " Has Appeared.\n");

			}

			while (enemyHealth > 0) {

				System.out.println("\t" + enemy + "'s Health: " + enemyHealth);
				System.out.println("\n\tSurvivor Health: " + health);
				System.out.println("\n\t1. Attack");
				System.out.println("\t2. Bandage");
				System.out.println("\t3. Flee");
				System.out.println("\n\t###########################################");

				input = in.nextLine();
				switch(input) {
				case "1":
					int damageDealt = rand.nextInt(attackDmg);
					int damageTaken = rand.nextInt(enemyAttackDamage);

					enemyHealth -= damageDealt;
					health -= damageTaken;

					System.out.println("\t# You Attack The " + enemy + " For " + damageDealt + " Damage.");
					System.out.println("\n\t# You Recieved " + damageTaken + " Damage.");

					if (health < 1) {
						System.out.println("\t You Drop Dead, Yet Another Victim To The Wasteland.");
						dead = true;
					}
					break;
				case "2":
					if (numBandages > 0) {
						if((health + bandageHealAmount) <= maxHealth){
						health += bandageHealAmount;
						numBandages--;
						System.out.println("\t> You Applied A Bandage, Healed For: " + bandageHealAmount + "."
								+ "\n\t> You Now Have " + health + " Health." + "\n\t> You Now Have " + numBandages
								+ " Bandages Left.\n");
						} else if((health + bandageHealAmount) > maxHealth){
							health = maxHealth;
							numBandages--;
							System.out.println("\t> You Applied A Bandage, Healed To Max Health."
							+ "\n\t> You Now Have " + numBandages + " Bandages Left.\n");
						} else {
							System.out.println("\t> You Have No Bandages.");
						}
					}
						break;
				case "3":
					System.out.println("\t> You run away from the " + enemy); //ERROR: Takes you back to same enemy
					ran = true;
					break;
				default:
					System.out.println("\tInvalid command\n");
				}
			}// End of while (enemyhealth > 0) loop

			if (dead) {
				running = false;
				break;
			}else if(!dead && !ran) {
				System.out.println("\n\t" + enemy + " was defeated!");
				System.out.println("\n\tYou Have " + health + " Health Left");

				// If the random number is less than drop chance it drops

				if (rand.nextInt(100) < scrapDropChance) {
					numScrap++;
					System.out.println("\n\tThe " + enemy + " Dropped A Piece Of Scrap.");
				}
				System.out.println("\n\tYou Have " + numScrap + " Piece(s) Of Scrap.\n");
				if (rand.nextInt(100) < bandageDropChance) {
					numBandages++;
					System.out.println("\tThe " + enemy + " Dropped A Bandage\n ");
					System.out.println("\tYou Now Have " + numBandages + " Bandages ");
				}

				System.out.println("\n\t###########################################\n");
				System.out.println("\t1. Continue Fighting");
				System.out.println("\t2. Go to shop");
				System.out.println("\t3. Return Home");
				System.out.println("\n\t###########################################");
				input = in.nextLine();

				while (!input.equals("1") && !input.equals("2")) {
					System.out.println("\nInvalid Input\n");
					input = in.nextLine();
				}
					switch(input) {
					case "1":
						System.out.println("\n\tYou Continue Wandering The Wasteland.\n");
						System.out.println("\n\t###########################################");
						break;
					case "2":
						System.out.println("You enter the shop.");
						do {
							System.out.println("\nWhat would you like to do? You have" + numScrap + "piece(s) of scrap"
									+ "\n\t1. Increase max health by 50.    5 scrap"
									+ "\n\t2. Increase max attack damage by 50.    5 scrap"
									+ "\n\t3. Buy 1 bandage.   1 scrap");
							input = in.nextLine();
							switch (input) {
							case "1" :
								if(numScrap >= 5) {
									numScrap -= 5;
									maxHealth += 50;
									System.out.println("Max health increased to " + maxHealth);
									System.out.println("You now have " + numScrap + " piece(s) of scrap");
								} else {
									System.out.println("Sorry, not enough scrap.");
								}
								break;
							case "2" :
								if(numScrap >= 5) {
									attackDmg += 50;
									numScrap -= 5;
									System.out.println("Max attack damage increased to " + attackDmg); //Could switch to a weapon or single attack damage method
									System.out.println("You now have " + numScrap + " piece(s) of scrap");
								} else {
									System.out.println("Sorry, not enough scrap.");
								}
								break;
							case "3" :
								if(numScrap >= 1) {
									numScrap -= 1;
									numBandages += 1;
									System.out.println("You now have " + numScrap + " piece(s) of scrap and " + numBandages + "bandage(s)");
								} else {
									System.out.println("Sorry, not enough scrap.");
								}
								break;


							} //end switch
							System.out.println("Would you like to keep shopping? (yes/no)");
							input = in.nextLine().trim().toLowerCase();
							while(!(input.equals("yes") || input.equals("no"))) {
								System.out.println("Incorrect input. Please try again!");
								input = in.nextLine();
							}
							if(input.equals("yes")) {
								shopping = true;
							} else {
								shopping = false;
							}
						} while (shopping);
						break;
					case "3":
						System.out.println("\nYou Return Home.\n");
						break;
					}
				}
			}
		} // end of while(running)
	}
