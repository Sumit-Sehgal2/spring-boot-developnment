package com.react.sumit.Dto;

import java.util.Set;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoviesDto {
	
	@NotBlank(message = "filed must be filled")
	private Integer MovieId;
	
	@NotBlank(message = "filed must be filled")
	private String Title;
	@NotBlank(message = "filed must be filled")
	private String DirectorName;
	@NotBlank(message = "filed must be filled")
	private String StudioName;
	
	private Set<String>MovieCast;
	@NotBlank(message = "filed must be filled")
	private Integer RelaeseYear;
	@NotBlank(message = "filed must be filled")
	private String Poster;
	@NotBlank(message = "please provide posetr url")
	private String moviesurl;

}
