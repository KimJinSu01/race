package com.race.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.race.dto.RaceProdVo;
import com.race.service.RaceProdServiceImpl;



@Controller
@RequestMapping("/main")
public class MainController {

	@Autowired
	private RaceProdServiceImpl raceProdService;

	public void setProductSvc(RaceProdServiceImpl raceProdService) {
		this.raceProdService = raceProdService;
	}

	@RequestMapping("/index")
	public String mainForm(Model model) {
		String url = "main/index";
		List<RaceProdVo> prodList = null;
		try {
			prodList = raceProdService.selectAll();
			System.out.println("prodList : "+prodList);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		model.addAttribute("prodList", prodList);
		return url;
	}


}
