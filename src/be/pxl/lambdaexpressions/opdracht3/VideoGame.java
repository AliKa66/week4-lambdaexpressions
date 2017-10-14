package be.pxl.lambdaexpressions.opdracht3;

import java.util.ArrayList;
import java.util.List;

public class VideoGame {

	private String name;
	private double price;
	private double rating;
	private List<String> genres;

	{
		genres = new ArrayList<>();
	}

	public VideoGame(String name, double price, double rating, String[] genres) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		setGenres(genres);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public ArrayList<String> getGenres() {
		return (ArrayList<String>) genres;
	}

	public void setGenres(String[] genres) {
		for (String genre : genres) {
			this.genres.add(genre.toLowerCase());
		}
	}
}
