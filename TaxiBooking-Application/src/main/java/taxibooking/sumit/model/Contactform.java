package taxibooking.sumit.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Contactform {
    private String id;
    
    @NotEmpty(message = "Name must be filled")
    @Size(min = 3, max = 40, message = "Name must be between 3 and 40 characters")
    @Pattern(regexp = "^[A-Z][a-z]+\\s[A-Z][a-z]+$", message = "Name must be in the format 'Firstname Lastname'")
    private String name;
    
    @NotEmpty(message = "Email must be filled")
    @Size(min = 5, max = 60, message = "Email must be between 5 and 60 characters")
    @Email(message = "Email should be valid")
    private String email;
    
    @NotEmpty(message = "Phone number must be filled")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits")
    private String phone;
    
    @NotEmpty(message = "Message must be filled")
    @Size(min = 5, max = 600, message = "Message must be between 5 and 600 characters")
    private String message;
}
