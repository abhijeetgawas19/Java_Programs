/*
    Question 1:
    Write a java program for cricket player.
    The program should accept details from user.
    Player code, Player Name, Runs Scored, Innings Played, Innings Remaining Not out.
    The program should do
    a. Enter Details of Players
    b. Display average of single player
    c. Display average of all players
*/



public class Cricket {
    private int playerCode;
    private String playerName;
    private int runsScored;
    private int inningsPlayed;
    private int notOutInn;

    // Default Constructor
    public Cricket()
    {
        this.playerCode = 0;
        this.playerName = "ABC";
        this.runsScored = 10;
        this.inningsPlayed = 10;
        this.notOutInn = 5;
    }
    // Parameterized Constructor
    public Cricket(int playerCode, String playerName, int runScored, int inningsPlayed, int notOutInn)
    {
        this.playerCode = playerCode;
        this.playerName = playerName;
        this.runsScored = runScored;
        this.inningsPlayed = inningsPlayed;
        this.notOutInn = notOutInn;
    }
    // Function 1: Find Average of Only One Player
    public void averageRuns()
    {
        long averageRunsScored = this.runsScored / this.inningsPlayed;
        System.out.println(this.playerName+" scored "+this.runsScored+" runs at average "+averageRunsScored);
    }
    public static void averageRuns(Cricket Obj[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            long averageRunsScored = Obj[i].runsScored / Obj[i].inningsPlayed;
            System.out.println(Obj[i].playerName+" scored "+Obj[i].runsScored+" runs at average "+averageRunsScored);
        }
    }

}

// Main Class 
import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        int n,i;
        int code,innings,notOut,runs;
        String name;
        System.out.println("Enter the No of Records");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        // Create Array of Object
        Cricket obj[] = new Cricket[n];
        // Enter the Details
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the Code");
            code = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Name");
            name = sc.nextLine();
            System.out.println("Enter the Runs");
            runs = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Innings");
            innings = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the NotOut Innings");
            notOut = Integer.parseInt(sc.nextLine());
            // Initialization of Contents
            obj[i] = new Cricket(code,name,runs,innings,notOut);
        }
        // Average of 1 Player
        obj[0].averageRuns();
        // Average of All Player
        Cricket.averageRuns(obj,n);
    }
}

