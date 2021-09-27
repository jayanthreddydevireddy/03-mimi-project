package in.jayanthit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Table(name="MOBILES")
@Entity
@Data
public class Mobile {
	
	@javax.persistence.Id
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="BRAND")
	private String brand;
	
	@Column(name="RAM")
	private String ram;
	
	@Column(name="PRICE")
	private Integer price;
	
}
