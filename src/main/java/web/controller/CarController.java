package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;


@Controller
public class CarController {
	@Autowired
	private final CarService service;
	public CarController(CarService service) {
		this.service = service;
	}
	@GetMapping("/cars")
	public String getCar(Model model, @RequestParam(value = "count", required = false) Integer count) {
		model.addAttribute("carList", service.getCarList(count));
		return "cars";
	}
}