import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("THE GUESSING GAME");
        System.out.println("\nLevel 2");
        System.out.println("\nIn this level you will guess a number between 1 and 100");
        System.out.println("\nLevel 3");
        System.out.println("\nIn this level you will guess a number based off your own minimum and maximum values");
        System.out.println("\nLevel 4");
        System.out.println("\nIn this level you will guess a number based off your own minimum and maximum values but with 10 guesses");
        System.out.println("\nLevel 5");
        System.out.println("\nIn this level the computer will play against itself");

        String inputLevel;
        String level2 = "2";
        String level3 = "3";
        String level4 = "4";
        String level5 = "5";
        System.out.println("\nWHICH LEVEL DO YOU WANT TO PLAY");
        inputLevel = sc.nextLine();

        //level 2
        if (inputLevel.equals(level2)){
            int num = (int)(100 * Math.random()) + 1;
            int guess;
            System.out.println("Please guess the number between 1-100");

            do {
                System.out.println("Guess the number");
                guess = sc.nextInt();
                if (num == guess){
                    System.out.println("Correct guess");
                } else if (guess < num){
                    System.out.println("Too Low");
                } else if (guess > num){
                    System.out.println("Too High");
                }
            } while (!(guess == num));

        }
        //level3

        int nottru = 10;
        while(nottru == 10){
            if (inputLevel.equals(level3)){
                int mini, max;
                System.out.println("Please Enter A Minimum Value");
                mini = sc.nextInt();
                System.out.println("Please Enter A Maximum Value");
                max = sc.nextInt();
                if(max < mini){
                    System.out.println("Invaild Maximum");
                    System.out.println("Please Enter A Maximum Value");
                    max = sc.nextInt();
                }
                int num3 =  (int)( Math.random()* (max - mini + 1))+ mini ;
                int guess3;
                int playagn;

                do {
                    System.out.println("Guess the number");
                    guess3 = sc.nextInt();
                    if (num3 == guess3){
                        System.out.println("Correct guess");
                    } else if (guess3 < num3){
                        System.out.println("Too Low");
                    } else if (guess3 > num3){
                        System.out.println("Too High");
                    }
                } while (!(guess3 == num3));
                System.out.println("Do You Want To Play Again? Press 1 For Yes And 0 For No");
                playagn = sc.nextInt();

                if (playagn == 0){
                    nottru = 9;
                }

            }
        }
        //level4
        int tru = 10;

        do {
            if ((inputLevel.equals(level4))){
                int guesses = 10;
                int num4;
                int mini, max;
                System.out.println("Please Enter A Minimum Value");
                mini = sc.nextInt();
                System.out.println("Please Enter A Maximum Value");
                max = sc.nextInt();
                if(max < mini){
                    System.out.println("Invaild Maximum");
                    System.out.println("Please Enter A Maximum Value");
                    max = sc.nextInt();
                }
                num4 =  (int)( Math.random()* (max - mini + 1))+ mini ;
                int guess4;
                int playagn4;

                do {
                    System.out.println("Guess the number");
                    guess4 = sc.nextInt();
                    if (num4 == guess4) {
                        System.out.println("Correct guess");
                    } else if (guess4 < num4){
                        System.out.println("Too Low");
                        guesses = guesses - 1;
                        System.out.println("Guesses: " + guesses);
                    } else if (guess4 > num4){
                        System.out.println("Too High");
                        guesses = guesses - 1;
                        System.out.println("Guesses: " + guesses);
                    }
                } while (!(guess4 == num4));
                System.out.println("Do You Want To Play Again? Press 1 For Yes And 0 For No");
                playagn4 = sc.nextInt();
                if (playagn4 == 0){
                    tru = 15;
                }
            }
        }while(tru == 15);

        //Level4+
        boolean condo5 = false;
        while(!condo5){
            if (inputLevel.equals(level5)){
                int games;
                int totalscore;
                System.out.println("Please enter the number of games you would like the computer to play");
                games = sc.nextInt();
                do{
                    int comp1score = 0;
                    int comp2score = 0;
                    totalscore = comp1score + comp2score;
                    int high = 1 + (int)(999 * Math.random());
                    int low = 1 + (int)(100 * Math.random());
                    int number = (int)( Math.random()* (high - low + 1))+ low ;
                    int guesshigh = 1 + (int)(999 * Math.random());
                    int guesslow = 1 + (int)(999 * Math.random());
                    int computerguess = (int)( Math.random()* (guesshigh - guesslow + 1))+ guesslow ;
                    System.out.println("The computer guessed " + computerguess);
                    if (computerguess == number){
                        System.out.print("Computer 1 is correct");
                        comp1score = comp1score + 1;
                    } else if (computerguess < number){
                        System.out.println("Too Low");
                    } else if (computerguess > number){
                        System.out.println("Too High");
                    }
                    totalscore = comp1score + comp2score;
                }while (games == totalscore);
            }
        }
    }
}

