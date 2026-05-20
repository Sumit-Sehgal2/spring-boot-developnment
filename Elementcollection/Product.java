package com.react.sumit.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKey;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_dummydata")
public class Product {
	@Id
	private Integer prodId;
	private String prodcode;
	@ElementCollection
	@CollectionTable(name = "product_colors",joinColumns = @JoinColumn(name ="product_Id" ))
	@OrderColumn(name = "color_column")
	private List<String>colors;
	@ElementCollection
	@CollectionTable(
			name = "Set_table",
	      joinColumns = @JoinColumn(name="prodId"))
	private Set<String>models;
	@ElementCollection
	@CollectionTable(name = "product_details",
	joinColumns = @JoinColumn(name="mapId")
			)
	@MapKeyColumn(name = "code")
	private Map<String,String>details;
	

}
