package be.pxl.lambdaexpressions.opdracht3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GameBrowser {

	private GameCollection collection;

	public GameBrowser(GameCollection collection) {
		this.collection = collection;
	}

	public ArrayList<VideoGame> showGamesForSearch(String search) {
		ArrayList<VideoGame> searchingGames = collection.selectGames(new Predicate<VideoGame>() {

			@Override
			public boolean test(VideoGame t) {
				return t.getName().toLowerCase().indexOf(search.toLowerCase()) != -1;
			}
		});
		return searchingGames;
	}

	public ArrayList<VideoGame> showFreeGames() {
		ArrayList<VideoGame> searchingGames = collection.selectGames(d -> d.getPrice() == 0);
		return searchingGames;
	}

	public ArrayList<VideoGame> showGamesInGenre(String genre) {
		ArrayList<VideoGame> searchingGames = collection.selectGames(s -> s.getGenres().contains(genre.toLowerCase()));
		return searchingGames;
	}
}
