import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in); //creates scanner object
        System.out.println("What political party do you support? Democrats, Republicans, or Independent(D,R,or I): ");
        String party = userInput.nextLine(); //reads user input

        //tests user input for party initials
        if (party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (party.equals("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an Independent Man");
        }
        else
        {
            System.out.println("You chose a different party");
        }
    }
}