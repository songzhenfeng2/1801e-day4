package com.szf.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.szf.movie.dao.MovieDao;
import com.szf.movie.domain.Movie;
import com.szf.movie.service.MovieService;
import com.szf.movie.vo.MovieVO;
@Service
public class MovieServiceImpl implements MovieService {
	@Resource
	private MovieDao movieDao;

	@Override
	public PageInfo<Movie> getMovieList(Integer pageNum, Integer pageSize, MovieVO movieVO) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		List<Movie> list = movieDao.getMovieList(movieVO);
		PageInfo<Movie> info = new PageInfo<Movie>(list);
		return info;
	}
	

}
