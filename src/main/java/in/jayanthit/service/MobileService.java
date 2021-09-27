package in.jayanthit.service;

import java.util.List;
import java.util.Optional;

import in.jayanthit.entity.Mobile;

public interface MobileService {
	
	public List<Mobile> findAll();
	
	public List<Mobile> getBrand(String brand);
	
	public List<Mobile> getRam(String ram);
	
	public List<Mobile> getPrice(Integer price);
	
	public List<Mobile> getPriceLessThanEqual(Integer price);
	
	public List<Mobile> getPriceGraterThanEqual(Integer price);

	List<Mobile> getPriceOrBrandOrRam(Integer price, String brand, String ram);
	
	
	
	
	

}
