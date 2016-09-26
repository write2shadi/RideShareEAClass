package mum.ea.controller;

import mum.ea.model.CarInfo;
import mum.ea.service.CarInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CarInfoController {

	private CarInfoService carInfoService;

	@RequestMapping(value = "/carInfo", method = RequestMethod.GET)
	public String loginPage(Model model) {

		return "carInfo";
	}

	// For add and update person both
	@RequestMapping(value = "/carInfo", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("carInfo") CarInfo carInfo) {

		if (carInfo.getId() == 0) {
			// new person, add it
			// this.carInfoService.addCarInfo(carInfo);
		} else {
			// existing person, call update
			// this.personService.updatePerson(p);
		}

		return "redirect:/userInfo";

	}

}
