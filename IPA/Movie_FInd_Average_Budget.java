import java.util.*;

class Movie_FInd_Average_Budget {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of movie tobe entered:");
        int n = sc.nextInt();
        Movie mv[] = new Movie[n];
        System.out.println("Enter the details:");
        for (int i = 0; i < mv.length; i++) {
            int mId = sc.nextInt();
            sc.nextLine();
            String di = sc.nextLine();
            int ra = sc.nextInt();
            int bu = sc.nextInt();
            mv[i] = new Movie(mId, di, ra, bu);
        }
        sc.nextLine();
        System.out.println("Enter the director details:");
        String s = sc.nextLine();
        System.out.println("Enter the rating:");
        int rating = sc.nextInt();
        System.out.println("Enter the budget:");
        int budget = sc.nextInt();
        int result = findAvgBudgetByDirector(mv, s);
        if (result != 0) {
            System.out.println(result);
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Movie mv1 = getMovieByRatingBudget(mv, rating, budget);
        if (mv1 != null) {
            System.out.println(mv1.getMovie());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
        sc.close();
    }

    public static int findAvgBudgetByDirector(Movie mv[], String s) {
        int res = 0, count = 0;
        for (int i = 0; i < mv.length; i++) {
            if (mv[i].getDirector().equalsIgnoreCase(s)) {
                res += mv[i].getBudget();
                count++;
            }
        }
        if (count != 0) {
            return res / count;
        }
        return res;
    }

    public static Movie getMovieByRatingBudget(Movie mv[], int rat, int bud) {
        Movie mv2 = null;
        for (int i = 0; i < mv.length; i++) {
            if (mv[i].getBudget() == bud && mv[i].getRating() == rat && (bud % rat == 0)) {
                mv2 = mv[i];
                break;
            }
        }
        return mv2;
    }
}

class Movie {
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Movie(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovie() {
        return movieId;
    }

    public void setMovie(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
