package com.szf.movie.service;

import com.github.pagehelper.PageInfo;
import com.szf.movie.domain.Movie;
import com.szf.movie.vo.MovieVO;

public interface MovieService {
	PageInfo<Movie> getMovieList(Integer pageNum,Integer pageSize,MovieVO movieVO);
}
