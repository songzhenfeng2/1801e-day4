package com.szf.movie.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.szf.movie.domain.Movie;
import com.szf.movie.service.MovieService;
import com.szf.movie.vo.MovieVO;

@Controller
public class MovieController {
	@Resource
	private MovieService movieService;
	
	@RequestMapping("list")
	public String getMovieList(Model model,@RequestParam(defaultValue="1")Integer pageNum
			,@RequestParam(defaultValue="3")Integer pageSize,MovieVO movieVO) {
		
		PageInfo<Movie> info = movieService.getMovieList(pageNum, pageSize, movieVO);
		model.addAttribute("info", info);
		model.addAttribute("movieVO", movieVO);
		
		return "list";
	}
}
