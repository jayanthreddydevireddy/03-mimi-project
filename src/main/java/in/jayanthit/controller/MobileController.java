package in.jayanthit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.jayanthit.entity.Mobile;
import in.jayanthit.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	private MobileService mobileService;

	@GetMapping("/mobiles")
	public List<Mobile> fildAllMobiles(Mobile mobile) {
		List<Mobile> findAll = mobileService.findAll();
		return findAll;
	}

	@GetMapping("/mobiles/{brand}")
	public List<Mobile> findbyMobiles(@PathVariable String brand) {
		List<Mobile> brands = mobileService.getBrand(brand);
		
		return brands;
	}

	@GetMapping("/mobiles/({ram}")
	public List<Mobile> findByRam(@PathVariable String ram) {
		List<Mobile> mobileRam = mobileService.getRam(ram);
		return mobileRam;
	}

	@GetMapping("/mobilesPrice/{price}")
	public List<Mobile> fingByPrice(@PathVariable Integer price) {
		List<Mobile> prises = mobileService.getPrice(price);
		return prises;
	}

	@GetMapping("/mobilePriceLessThanEqual/{price}")
	public List<Mobile> findByPriceLessThanEqual(@PathVariable Integer price) {
		List<Mobile> lessThanEqual = mobileService.getPriceLessThanEqual(price);
		return lessThanEqual;
	}
	
	@GetMapping("/mobilePriceGreaterThanEqqual/{price}")
	public List<Mobile> findByPriceGreaterThanEqual(@PathVariable Integer price){
		List<Mobile> priceGraterThanEqual = mobileService.getPriceGraterThanEqual(price);
		return priceGraterThanEqual;
		
	}
	@GetMapping("/selectOptions/{brand,ran,price}")
	public List<Mobile> findByBrandOrRamOrPrice(String brand, String ram, Integer price){
		List<Mobile> priceOrBrandOrRam = mobileService.getPriceOrBrandOrRam(price, brand, ram);
		return priceOrBrandOrRam;
		
	}

}
