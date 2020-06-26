package com.cg.migrationapp.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.migrationapp.dao.MovieDAO;
import com.cg.migrationapp.dao.MovieDAOImpl;
import com.cg.migrationapp.dto.Booking;
import com.cg.migrationapp.dto.Theater;
import com.cg.migrationapp.exception.MovieException;

public class MovieServiceImpl implements MovieService {
	MovieDAO movieDAO;

	public MovieServiceImpl() {
		movieDAO = new MovieDAOImpl();
	}

	public ArrayList<String> getMovieNames() throws MovieException, SQLException {
		System.out.println("Good");
		return movieDAO.getMovieNames();
	}

	@Override
	public ArrayList<Theater> searchMovie(String movieName)
			throws MovieException, SQLException {
		return movieDAO.searchMovie(movieName);
	}
	
	public int makeBooking(Booking booking, int theaterId)
			throws MovieException, SQLException {
		return movieDAO.makeBooking(booking, theaterId);
	}
}
