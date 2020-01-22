package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.entity.News;
import com.app.services.NewsService;

@Controller
@RequestMapping("/home")
public class HomeController 
{
	@Autowired
	NewsService newsService;
	
	@RequestMapping("/getNews")
	public String getNews(Model model)
	{
		System.out.println("inside News");
		List<News>list=newsService.getNews();
		System.out.println(list);
		model.addAttribute("newsList", list);
		return "news";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("/aboutUs")
	public String aboutUs()
	{
		return "aboutUs";
	}
}
