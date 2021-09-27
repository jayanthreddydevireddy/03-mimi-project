package in.jayanthit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.jayanthit.entity.Mobile;
import in.jayanthit.repository.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileRepository mobileRepo;

	@Override
	public List<Mobile> findAll() {
		List<Mobile> mobiles = mobileRepo.findAll();
		mobiles.forEach(mobile->{
			System.out.println(mobile); 
		});
		return mobiles;
	}

	@Override
	public List<Mobile> getBrand(String brand) {
		List<Mobile> brands = mobileRepo.findByBrand(brand);
		if (brands!=null) {
			return brands;
		}
		return null;
	}

	@Override
	public List<Mobile> getRam(String ram) {
		List<Mobile> mobileRam = mobileRepo.findByRamContaining(ram);
		if (mobileRam!=null) {
			return mobileRam;
		}
		return null;
	}

	@Override
	public List<Mobile> getPrice(Integer price) {
		List<Mobile> prices = mobileRepo.findByPrice(price);
		return prices;
		
	}

	@Override
	public List<Mobile> getPriceLessThanEqual(Integer price) {
		List<Mobile> lessThanEqual = mobileRepo.findByPriceIsLessThanEqual(price);
		
		return lessThanEqual;
	}

	@Override
	public List<Mobile> getPriceGraterThanEqual(Integer price) {
		List<Mobile> greaterThanEqual = mobileRepo.findByPriceIsGreaterThanEqual(price);
		return greaterThanEqual;
	}

	@Override
	public List<Mobile> getPriceOrBrandOrRam(Integer price, String brand, String ram) {
		List<Mobile> priceOrBrandOrRam = mobileRepo.findByPriceOrBrandOrRam(price, brand, ram);
		return priceOrBrandOrRam;
	}

	
	

	

	
	

	

}
