package taxibooking.sumit.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
	private Integer bookid;
	private String bookname;
	private String bookAuth;
	private Double bookcoast;
	

}
