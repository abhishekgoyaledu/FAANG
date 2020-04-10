package hashing_and_hash_tables;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class InflightEntertainmentSystem
{
    public static void main(final String... strings) {
        final int[] movieLengths = { 2, 4 };
        final int flightLength = 6;
        System.out.println(canTwoMoviesFillFlightUsingHashing(movieLengths, flightLength));
    }
    
    public static boolean canTwoMoviesFillFlight(final int[] movieLengths, final int flightLength) {
        Arrays.sort(movieLengths);
        int i = 0;
        int j = movieLengths.length - 1;
        while (i < j) {
            if (movieLengths[i] + movieLengths[j] > flightLength) {
                --j;
            }
            else {
                if (movieLengths[i] + movieLengths[j] >= flightLength) {
                    return true;
                }
                ++i;
            }
        }
        return false;
    }
    
    public static boolean canTwoMoviesFillFlightUsingHashing(final int[] movieLengths, final int flightLength) {
        final Set<Integer> movieLengthsSeen = new HashSet<Integer>();
        for (final int firstMovieLength : movieLengths) {
            final int matchingSecondMovieLength = flightLength - firstMovieLength;
            if (movieLengthsSeen.contains(matchingSecondMovieLength)) {
                return true;
            }
            movieLengthsSeen.add(firstMovieLength);
        }
        return false;
    }
}