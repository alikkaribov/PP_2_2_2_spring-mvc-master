package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {
	/*@GetMapping(value = "/cars")
	public String printCars(ModelMap model) {
		List<String> cars = new ArrayList<>();
		cars.add("Cars list:");
		model.addAttribute("cars", Arrays.asList(
				new Car("BMW", 585, 7000000),
				new Car("Audi", 640, 6500000),
				new Car("Lada", 105, 850000),
				new Car("Honda", 280, 1450000),
				new Car("Nissan", 280, 2000000)
		));
		return "cars.html";
	}*/
	private final CarServiceImpl carService;

	public CarsController(CarServiceImpl carService) {
		this.carService = carService;
	}


	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, ModelMap model) {
		model.addAttribute("cars", carService.getCarsList(count));
		return "cars";
	}

}