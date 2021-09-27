package in.jayanthit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.jayanthit.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Serializable> {
	
	public List<Mobile> findByBrand(String brand);
	
	public List<Mobile> findByRamContaining(String ram);
	
	public List<Mobile> findByPrice(Integer price);
	
	public List<Mobile> findByPriceIsLessThanEqual(Integer price);
	
	public List<Mobile> findByPriceIsGreaterThanEqual(Integer price);
	
	public List<Mobile> findByPriceOrBrandOrRam(Integer price,String brand,String ram);
	
	
	
	
	
	
	
		 
		
		
		
		
	

}
