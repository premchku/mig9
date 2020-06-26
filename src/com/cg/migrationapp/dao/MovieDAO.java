package com.cg.migrationapp.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.migrationapp.dto.Booking;
import com.cg.migrationapp.dto.Theater;
import com.cg.migrationapp.exception.MovieException;

public interface MovieDAO {
	public ArrayList<String> getMovieNames() throws MovieException, SQLException;

	public ArrayList<Theater> searchMovie(String movieName)
			throws MovieException, SQLException;

	public int makeBooking(Booking booking, int theaterId)
			throws MovieException, SQLException;
}
