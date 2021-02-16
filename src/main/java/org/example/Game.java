package org.example;

import java.util.Scanner;

public class Game {

    private Track[] tracks = new Track[3];


    public void start() {
        System.out.println("Welcome");
        int playerCount = getPlayerCountFromUser();
        initializerTracks();
        displayTracks();
    }


    public void initializerTracks() {
        Track track1 = new Track();
        track1.setName("Imola");
        track1.setLenght(3500);
        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Suzuka");
        track2.setLenght(4100);

        tracks[1] = track2;


    }

    private void displayTracks() {
        System.out.println("Available tracks:");

        // classic for Loop
        for (int i = 0; i < tracks.length; i++)
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLenght());

            }
    }



        private String getVehicleNameFromUser () {
            System.out.println("Please enter vehicle name");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }


        private int getPlayerCountFromUser () {
            System.out.println("Please enter number of players");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
    }

