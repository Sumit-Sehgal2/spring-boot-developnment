package com.react.sumit.Entity;
import java.util.*;

import jakarta.annotation.Nullable;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "movies_data")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movies {
	@Id
	@Column(nullable =false,length = 300)
	@NotBlank(message = "filed must be filled")
	private Integer MovieId;
	@Column(nullable =false,length = 300)
	@NotBlank(message = "filed must be filled")
	private String Title;
	@Column(nullable =false,length = 300)
	@NotBlank(message = "filed must be filled")
	private String DirectorName;
	@Column(nullable =false,length = 300)
	@NotBlank(message = "filed must be filled")
	private String StudioName;
	@ElementCollection
	@CollectionTable(name = "movieCast")
	private Set<String>MovieCast;
	@Column(nullable =false,length = 300)
	@NotBlank(message = "filed must be filled")
	private Integer RelaeseYear;
	@Column(nullable =false,length = 300)
	@NotBlank(message = "filed must be filled")
	private String Poster;
	
	

}
