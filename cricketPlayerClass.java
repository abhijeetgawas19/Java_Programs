/*
* Create a class cricket player, accept the details of the players and display the average runs scored by the player
* */


import java.util.Scanner;

public class cricketPlayerClass {
    private int code;
    private String name;
    private int runs;
    private int innings;
    private int notout;

    // Constructor
    cricketPlayerClass(int code, String name,int runs,int innings, int notout)
    {
        this.code = code;
        this.name = name;
        this.runs = runs;
        this.innings = innings;
        this.notout = notout;
    }

    public void averageRuns()
    {
        long averageRunsScored = this.runs/this.innings;
        System.out.println(this.name+" scored an on average "+averageRunsScored);
    }

    public static void main(String [] args)
    {
        // Get User Information
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Player code");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name of Player");
        String name = sc.nextLine();
        System.out.println("Enter the Runs Scored");
        int score = sc.nextInt();
        System.out.println("Enter the Innings Played");
        int inn = sc.nextInt();
        System.out.println("Enter the No of Time Player is not Out");
        int notout = sc.nextInt();

        // Create Object of Class
        cricketPlayerClass obj = new cricketPlayerClass(code,name,score,inn,notout);
        obj.averageRuns();
    }

}
