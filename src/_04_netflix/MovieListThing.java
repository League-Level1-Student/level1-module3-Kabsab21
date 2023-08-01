package _04_netflix;

public class MovieListThing {
	public static void main(String[] args) {
		Movie movie1 = new Movie("bangermovie",5);
		Movie movie2 = new Movie("greatmovie",4);
		Movie movie3 = new Movie("goodmovie",3);
		Movie movie4 = new Movie("okmovie",2);
		Movie movie5 = new Movie("badmovie",1);
		System.out.println(movie1.getTicketPrice());
		NetflixQueue list = new NetflixQueue();
		list.addMovie(movie1);
		list.addMovie(movie2);
		list.addMovie(movie3);
		list.addMovie(movie4);
		list.addMovie(movie5);
		list.printMovies();
		System.out.println("The best movie is "+list.getBestMovie());
		System.out.println("The second best movie is "+list.getMovie(1));
	}
}
