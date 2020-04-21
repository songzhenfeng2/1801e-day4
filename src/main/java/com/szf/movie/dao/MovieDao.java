package com.szf.movie.dao;

import java.util.List;

import com.szf.movie.domain.Movie;
import com.szf.movie.vo.MovieVO;

public interface MovieDao {
	List<Movie> getMovieList(MovieVO movieVO);
}
