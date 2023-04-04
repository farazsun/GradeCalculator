/*
* [GradeCalculator].java
* Author: [Ryan Cullen]
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting
* of source code at any time for this project is prohibited.
 */

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Opening the scanner and naming it scan.
		
		System.out.println("Grading Scale:");
		System.out.println("A\t90 - 100");
		System.out.println("B\t80 - 89");
		System.out.println("C\t70 - 79");
		System.out.println("D\t60 - 69");
		System.out.println("F\tbelow 60");
		// This will output the grading scale for the grade calculator to the user.
	
		System.out.print("What letter grade do you want to achieve for the course?");
		String desiredLetterGrade = scan.next();
		// This will ask the user to input the letter grade that they want and store it as
		// desiredLetterGrade which will be used later after calculating current score.
		
		if (!desiredLetterGrade.equals("A") && !desiredLetterGrade.equals("B") && !desiredLetterGrade.equals("C") && !desiredLetterGrade.equals("D") 
				&& !desiredLetterGrade.equals("F")) {
			System.out.println("The input is invalid.");
		// If the desired letter grade is not A, B, C, D, or F, the grade calculator will not
		// execute.
		}
		else { // If the desired letter grade IS A, B, C, D, or F, the program executes.
		
			System.out.println("Enter percentage weights below.");
			System.out.print("Exam 1:\t\t");
			int weightOfExam1 = scan.nextInt();
			System.out.print("Exam 2:\t\t");
			int weightOfExam2 = scan.nextInt();
			System.out.print("Final Exam:\t");
			int weightOfFinalExam = scan.nextInt();
			System.out.print("Labs:\t\t");
			int weightOfLabs = scan.nextInt();
			System.out.print("Projects:\t");
			int weightOfProjects = scan.nextInt();
			System.out.print("Participation:\t");
			int weightOfParticipation = scan.nextInt();
			System.out.print("Quizzes:\t");
			int weightOfQuizzes = scan.nextInt();
			// These are the weights of each graded item inputted by the user.
		
			int doTheWeightsAddUpTo100 = weightOfExam1 + weightOfExam2 + weightOfFinalExam 
					+ weightOfLabs + weightOfProjects + weightOfParticipation + weightOfQuizzes;
			// This is the calculation to determine if the weights add up to 100.
		
			int exam1Score = 0; int exam2Score = 0; int finalExamScore = 0; int labAverage = 0; int projectAverage = 0;
			int participationScore = 0; int quizAverage = 0;
			// I am assigning a value of 0 to graded items. If the user knows the score, then the user will input the score. Inputting the score
			// will occur later and be the new value assigned to that graded item. If the user does not know the score, then the exam score will
			// remain equal to 0, so it won't affect the current score calculation.
		
			int knownWeightOfExam1 = 0; int knownWeightOfExam2 = 0; int knownWeightOfFinalExam = 0; int knownWeightOfLabs = 0; 
			int knownWeightOfProjects = 0; int knownWeightOfParticipation = 0; int knownWeightOfQuizzes = 0;
			// The known weights will be used when calculating total known grade weight for the current score calculation. If the user does not
			// know the score, then these values will remain 0. If the user knows the score, the graded item is known, so it will be included in
			// total known grade weight calculation.
		
			if (doTheWeightsAddUpTo100 != 100) {
				System.out.println("Weights don't add up to 100, program exiting...");
			}
			// If the weights inputted don't equal 100, the program will not execute and inform the user the program is exiting.
		
			else {
				// If the weights inputted equal 100, the program will execute.
				System.out.print("Do you know your exam 1 score?");
				String exam1ScoreYesOrNo = scan.next();
				// User will input whether the user knows the exam 1 score.
			
				if (exam1ScoreYesOrNo.equalsIgnoreCase("y") || exam1ScoreYesOrNo.equalsIgnoreCase("yes")) {
					System.out.print("Score received on exam 1:");
					exam1Score = scan.nextInt();
					// If the user knows the exam 1 score, then the user will input y or yes (case doesn't matter). Then the score of exam 1 will
					// have a new value assigned to it (input), and the user will be asked if they know exam 2 score. If the user inputs anything
					// besides y or yes (case doesn't matter), then the user is not asked about exam 2 or the final exam.
					
					knownWeightOfExam1 = weightOfExam1;
					// Since the user knows and inputs the score for exam 1, the graded item is considered known, so the known weight of
					// exam 1 will equal the weight of exam 1 (inputted by the user earlier). If the exam score is not known, its known weight
					// will remain 0 and not affect the calculation of total known grade weight later.
					
					System.out.print("Do you know your exam 2 score?");
					String exam2ScoreYesOrNo = scan.next();
					// Since the user inputs the exam 1 score, the user will be asked if the user knows the exam 2 score.
				
					if (exam2ScoreYesOrNo.equalsIgnoreCase("y") || exam2ScoreYesOrNo.equalsIgnoreCase("yes")) {
						System.out.print("Score received on exam 2:");
						exam2Score = scan.nextInt();
						// User will input y or yes (case doesn't matter) if the user knows the exam 2 score. If the user doesn't know it, the user
						// will not be asked for the score or if the user knows the final exam. If the user knows it, the user inputs the score.
						
						knownWeightOfExam2 = weightOfExam2;
						// Since the user knows and inputs the score, the graded item is considered known, so the known weight of exam 2 will be
						// included in calculating the total known grade weight.
						
						System.out.print("Do you know your final exam score?");
						String finalExamScoreYesOrNo = scan.next();
						// User will input y or yes (case doesn't matter) if the user knows the final exam score.
					
						if (finalExamScoreYesOrNo.equalsIgnoreCase("y") || finalExamScoreYesOrNo.equalsIgnoreCase("yes")) {
							System.out.print("Score received on final exam:");
							// If the user inputs y or yes (case doesn't matter), the user will be asked for the final exam score. If the user
							// doesn't know the score, then the user is not asked for the final exam score.
							
							finalExamScore = scan.nextInt();
							knownWeightOfFinalExam = weightOfFinalExam;
							// Since the final exam score is known and inputted, the graded item is considered known, so the
							// known weight of the final exam will be included in calculating the total known grade weight.
						}
					}
				}
	
			System.out.print("Do you know your lab average?");
			String labAverageYesOrNo = scan.next();
			// Asking user if the user knows the lab average.
			
			if (labAverageYesOrNo.equalsIgnoreCase("y") || labAverageYesOrNo.equalsIgnoreCase("yes")) {
				System.out.print("Average lab grade:");
				// If the user inputs y or yes (case doesn't matter), the user is asked for the lab average. Since the graded item is known, the
				// known weight of labs will be included in the total known grade weight later. If the user doesn't know and inputs anything but y
				// or yes, then the user is asked about project average. 
				
				labAverage = scan.nextInt();
				knownWeightOfLabs = weightOfLabs;
				// Since the lab average is known and inputted, the known weight of labs will equal the weight inputted by the user earlier and
				// be included in the total known grade weight.
			}
			
			System.out.print("Do you know your project average?");
			String projectAverageYesOrNo = scan.next();
			// Asking user if the user knows the project average.
			
			if (projectAverageYesOrNo.equalsIgnoreCase("y") || projectAverageYesOrNo.equalsIgnoreCase("yes")) {
				System.out.print("Average project grade:");
				projectAverage = scan.nextInt();
				knownWeightOfProjects = weightOfProjects;
				// If the user inputs y or yes (case doesn't matter), the user is asked for the project average. If it's inputted, it is a known
				// graded item, so the weight will be included in the total known grade weight.
			}
			
			System.out.print("Do you know your participation average?");
			String participationGradeYesOrNo = scan.next();
			// Asking the user if the user knows the participation average.
			
			if (participationGradeYesOrNo.equalsIgnoreCase("y") || participationGradeYesOrNo.equalsIgnoreCase("yes")) {
				System.out.print("Average participation grade:");
				participationScore = scan.nextInt();
				knownWeightOfParticipation = weightOfParticipation;
				// If the user inputs y or yes (case doesn't matter), the user is asked for the participation average. If it's inputted, it is a 
				// known graded item, so the weight will be included in the total known grade weight by setting it equal to the weight inputted. 
			}
			
			System.out.print("Do you know your quiz average?");
			String quizAverageYesOrNo = scan.next();
			// Asking the user if the user knows the quiz average.
			
			if (quizAverageYesOrNo.equalsIgnoreCase("y") || quizAverageYesOrNo.equalsIgnoreCase("yes")) {
				System.out.print("Average quiz grade:");
				quizAverage= scan.nextInt();
				knownWeightOfQuizzes = weightOfQuizzes;
				// If the user inputs y or yes (case doesn't matter), the user is asked for the quiz average. If it's inputted, it is a known
				// graded item, so the weight will be included in the total known grade weight by setting it equal to the weight inputted earlier.
			}
			
			int totalKnownGradeWeight = knownWeightOfExam1 + knownWeightOfExam2 + knownWeightOfFinalExam + knownWeightOfLabs
					+ knownWeightOfProjects + knownWeightOfParticipation + knownWeightOfQuizzes;
			// The total known grade weight is the sum of the known weights of each graded item. The known weight of each graded item is 0 if the
			// graded item score is not known. If the graded item score is inputted, then it is known, and the known weight of the known graded
			// item equals the inputted weight by the user.
			
			double currentScoreForExam1 = (double) (weightOfExam1 * exam1Score) / totalKnownGradeWeight;
			double currentScoreForExam2 = (double) (weightOfExam2 * exam2Score) / totalKnownGradeWeight;
			double currentScoreForFinalExam = (double) (weightOfFinalExam * finalExamScore) / totalKnownGradeWeight;
			double currentScoreForLabAverage = (double) (weightOfLabs * labAverage) / totalKnownGradeWeight;
			double currentScoreForProjectAverage = (double) (weightOfProjects * projectAverage) / totalKnownGradeWeight;
			double currentScoreForParticipation = (double) (weightOfParticipation * participationScore) / totalKnownGradeWeight;
			double currentScoreForQuizAverage = (double) (weightOfQuizzes * quizAverage) / totalKnownGradeWeight;
			// Using the formula provided in the lab to calculate the current score for each graded item. The scores for each graded item is 0 if 
			// the user does not input a score, so then the current score for that graded item will be 0 and not affect the current score.
			
			double currentScore = currentScoreForExam1 + currentScoreForExam2 + currentScoreForFinalExam + 
					currentScoreForLabAverage + currentScoreForProjectAverage + currentScoreForParticipation +
					currentScoreForQuizAverage;
			// Adding all of the current scores for each graded item to get the current score.
			
			System.out.printf("Current grade score:%.2f",currentScore);
			// Using printf to output the current score variable to 2 decimal places.
			
			String currentLetter = "";
			// Defining the variable which will have a value assigned to it depending on which condition is true below.
			
			if (currentScore >= 90.00) {
				currentLetter = "A";
				// If the current score is above 90, it is an A.
			}
			else if (currentScore >= 80.00 && currentScore < 90.00) {
				currentLetter = "B";
				// If the current score is between 80-89, it is a B.
			}
			else if (currentScore >= 70.00 && currentScore < 80.00) {
				currentLetter = "C";
				// If the current score is between 70-79, it is a C.
			}
			else if (currentScore >= 60.00 && currentScore < 70.00) {
				currentLetter = "D";
				// If the current score is between 60-69, it is a D.
			}
			else {
				currentLetter = "F";
				// If the conditions in each if above are not met, then the score must be below 60. If the current score is less than 60, it is a F.
			}
			System.out.println();
			System.out.println("Your current letter grade:" +currentLetter);
			// Printing the current letter grade to the user. The current grade score and letter grade will be outputted to the user. The following
			// statements below the letter grade statement might be outputted. It depends on which condition is met.
			
			if ((totalKnownGradeWeight == 100) && (desiredLetterGrade.equals(currentLetter))) {
				System.out.println("Congratulations! You received the " + currentLetter + " that you wanted!");
			}
			// If the current letter (based on the current score) is the same as the letter grade the user desires, and all of the graded items are
			// known, then the user got the grade they wanted. Since all items are known (total known grade weight == 100), the grade can't change.
			
			else if ((totalKnownGradeWeight == 100) && (!desiredLetterGrade.equals(currentLetter))) {
				System.out.println("Unfortunately, a grade of " + desiredLetterGrade + " is not possible.");
			}
			// If the user knows all of the graded items' scores (total known grade weight == 100), then the grade can't change. If the user's
			// current letter does not equal the user's desired letter, then, since the grade can't change, it is not possible to get the desired
			// letter grade.
			
			else { // The else branch is executed if the total known grade weight does not equal 100. This means there are items with scores that 
				// are not known, so the grade can change.
				
				double finalOverallScore = 0;
			// Defining the finalOverallScore variable that will have a value assigned to it depending on which if condition is true below.
			
				if (desiredLetterGrade.equals("A")) {
				finalOverallScore = 90.00;
				// Minimum for an A is a 90.
				}
				
				else if (desiredLetterGrade.equals("B")) {
				finalOverallScore = 80.00;
				// Mininimum for a B is a 80.
				}
				
				else if (desiredLetterGrade.equals("C")) {
				finalOverallScore = 70.00;
				// Minimum for a C is a 70.
				}
				
				else if (desiredLetterGrade.equals("D")) {
				finalOverallScore = 60.00;
				// Minimum for a D is a 60.
				}
				else if (desiredLetterGrade.equals("F")) {
					finalOverallScore = 0;
					// Chances are nobody wants a F, but just in case a F is inputted for desired letter grade, the final overall score is 0 
					// since the minimum for a F is 0. 
				}
						
				// Below, I broke the formula for avgToFinalLetterGrade up into 3 values (value1, value2, value3).
				
				double value1 = (double) 100 * finalOverallScore;
				// value1 is the first part of the numerator of the formula for avgToFinalLetterGrade.
				
				double value2 = (double) currentScore * totalKnownGradeWeight;
				// currentScore = sum of (weight of graded item * score of graded item) / totalKnownGradeWeight
				// The second part of the numerator in the avgToFinalLetterGrade = sum of (weight of graded item * score of graded item)
				// When multiplying the current score by the total known grade weight, the total known grade weights cancel out leaving just
				// the numerator of current score. 
				
				double value3 = (double) 100 - totalKnownGradeWeight;
				// value3 is the denominator of the formula for avgToFinalLetterGrade.
				
				double avgToFinalLetterGrade = (value1 - value2) / value3;
				// This is the formula given to calculate avgToFinalLetterGrade. Like noted before, I just broke the formula up into value1, value2,
				// and value3 to make it easier to understand.
			
				if ((avgToFinalLetterGrade <= 100.00) && (avgToFinalLetterGrade >= 0)) {
					System.out.print("In order to receive a grade of " + desiredLetterGrade + ",\nyou need to score an average greater than\nor equal to ");
					System.out.printf("%.2f", avgToFinalLetterGrade);
					System.out.print(" in the rest of the grade items.");
					// If the average to final letter grade is less than or equal to 100, but also not negative, then it's possible to achieve the
					// desired letter grade. The print statement tells the user the average of the remaining unknown items needed to do so.
				}
				
				else if (avgToFinalLetterGrade > 100.00) {
					System.out.print("Unfortunately, a grade of " + desiredLetterGrade + " is not possible.");
					// It's impossible to score above a 100 on the graded items, so it's impossible to get an average over a 100. Therefore, if the
					// avgToFinalLetterGrade is above 100, it is impossible to get the letter grade that the user desires.
				}
				else if (avgToFinalLetterGrade < 0) {
					System.out.print("You will receive at least a grade of " + desiredLetterGrade + ".");
					// Since the total known grade weight can't exceed 100, the denominator of avgToFinalLetterGrade can't be negative.
					// Therefore, the numerator must be negative, meaning value2 > value1. The sum of the scores times weights for graded items
					// with known scores is higher than the mininimum score needed to get the desired letter grade (value1).
					// Therefore, it is 100% certain that the user will definitely get at least the desired letter grade.
				}
				
			scan.close();
					
				}
			}
		}
	}
}
			
