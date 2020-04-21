package com.szf.movie.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.szf.movie.domain.Movie;
import com.szf.movie.service.MovieService;
import com.szf.movie.vo.MovieVO;

/**
 * 
 * @ClassName: MovieServiceImplTest 
 * @Description: 单元测试
 * @author: 宋圳峰
 * @date: 2020年4月18日 下午7:18:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class MovieServiceImplTest {
	@Resource
	private MovieService movieService;
	@Test
	public void testGetMovieList() {
		PageInfo<Movie> info = movieService.getMovieList(1, 3, new MovieVO());
		System.out.println(info);
	}

}
