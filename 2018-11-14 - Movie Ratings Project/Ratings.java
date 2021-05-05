
/**
 * Movie Ratings Lab
 *
 * @author (J. Sigman)
 * @version (11/14/2018)
 */
public class Ratings {
    public static double averageRatingByReviewer(int [][] ratings, int reviewerIndex) {
        if (reviewerIndex<0 || reviewerIndex>ratings[reviewerIndex].length)
            return -1;
        double avg=0.0;
        for (int i=0; i<ratings[reviewerIndex].length; i++) {
            avg+=ratings[reviewerIndex][i];
        }
        avg/=ratings[0].length;
        return avg;
    }
    public static int aboveX(int [][] ratings, int x) {
        int above=0;
        for (int i=0; i<ratings.length; i++) {
            for (int j=0; j<ratings[i].length; j++) {
                if (ratings[i][j]>x) {
                    above+=1;
                }
            }
        }
        return above;
    }
    public static double averageRating(int [][] ratings, int movieIndex) {
        if (movieIndex<0 || movieIndex>ratings.length)
            return -1;
        double avg=0.0;
        for (int i=0; i<ratings.length; i++) {
            avg+=ratings[i][movieIndex];
        }
        avg/=ratings.length;
        return avg;
    }
    public static void main (String [] args) {
        int[][] ratings = {
        {4,6,2,5},
        {7,9,4,8},
        {6,9,3,7}
        };
        double test1 = averageRatingByReviewer(ratings, -2);
        int test2 = aboveX(ratings,8);
        double test3 = averageRating(ratings, 1);
        System.out.println("Result for function averageRatingByReviewer: " + test1);
        System.out.println("Result for function aboveX: " + test2);
        System.out.println("Result for function averageRating: " + test3);
    }
}
