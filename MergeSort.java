package Sorts;

import java.util.Arrays;

public class MergeSort {
    public static void main(String a[]) {
        /*int array[] = {10, 8, 4, 80, 13, 1, 3, 11};
        String arr[] = getStringArray();
        mergeSort_srt(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
        }
        System.out.println();
        mergeSort_srt(arr, 0, arr.length - 1);
        for (String s : arr) {
            System.out.println("* " + s);
        }*/

        Player[] players = getPlayers();

        mergeSort_srt(players,0,players.length-1);

        for (Player p:players
             ) {
            System.out.println(p);
            System.out.println("==========================================================================");

        }
    }

    private static Player[] getPlayers() {
        Player[] players = new Player[7];
        players[0] = new Player("kholi","india",1,Position.OPENER,1000000.00);
        players[1] = new Player("dhoni","india",7,Position.WICKET_KEEPER,1000000.00);
        players[2] = new Player("root","eng",1,Position.ALL_ROUNDER,1000000.00);
        players[3] = new Player("abd","sa",1,Position.WICKET_KEEPER,1000000.00);
        players[4] = new Player("gayle","wi",1,Position.ALL_ROUNDER,750000.00);
        players[5] = new Player("starc","aus",1,Position.BOWLER,750000.00);
        players[6] = new Player("southee","nz",1,Position.BOWLER,500000.00);
        return players;
    }

    private static String[] getStringArray() {
        String arr[] = new String[10];
        arr[0] = "ramesh";
        arr[1] = "krishna";
        arr[2] = "rav";
        arr[3] = "amol";
        arr[4] = "ram";
        arr[5] = "ashis";
        arr[6] = "praka";
        arr[7] = "nitin";
        arr[8] = "chand";
        arr[9] = "gowtam";
        return arr;
    }

    public static void mergeSort_srt(int array[], int lo, int n) {
        int low = lo;
        int high = n;
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort_srt(array, low, middle);
        mergeSort_srt(array, middle + 1, high);
        int end_low = middle;
        int start_high = middle + 1;

        while ((lo <= end_low) && (start_high <= high)) {
            if (low<start_high && array[low] < array[start_high]) {
                low++;
            } else {
                int Temp = array[start_high];
                for (int k = start_high - 1; k >= low; k--) {
                    array[k + 1] = array[k];
                }
                array[low] = Temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }

    public static void mergeSort_srt(String array[], int lo, int n) {
        int low = lo;
        int high = n;
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort_srt(array, low, middle);
        mergeSort_srt(array, middle + 1, high);
        int end_low = middle;
        int start_high = middle + 1;

        while ((lo <= end_low) && (start_high <= high)) {
            if ((low<start_high) && (array[low].compareTo(array[start_high]) <= 0)) {
                low++;
            } else {
                String temp = array[start_high];
                for (int k = start_high - 1; k >= low; k--) {
                    array[k + 1] = array[k];
                }
                array[low] = temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }

    public static void mergeSort_srt(Player array[], int lo, int n) {
        int low = lo;
        int high = n;
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort_srt(array, low, middle);
        mergeSort_srt(array, middle + 1, high);
        int end_low = middle;
        int start_high = middle + 1;

        while ((lo <= end_low) && (start_high <= high)) {
            if ((low<start_high) && (array[low].compareTo(array[start_high]) <= 0)) {
                low++;
            } else {
                Player temp = array[start_high];
                for (int k = start_high - 1; k >= low; k--) {
                    array[k + 1] = array[k];
                }
                array[low] = temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }
}