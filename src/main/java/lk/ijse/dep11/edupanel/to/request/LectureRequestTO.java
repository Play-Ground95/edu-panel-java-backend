package lk.ijse.dep11.edupanel.to.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lk.ijse.dep11.edupanel.validation.LecturerImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LectureRequestTO {
 @NotBlank(message = "Name Cant be empty")
 @Pattern(regexp = "^[A-Za-z]+$", message = "Invalid Name")
   private String name;
 @NotBlank(message = "Designation Cant be empty")
 @Length(min = 2, message = "Invalid Designation")
    private String designation;
 @NotBlank(message = "Qualification Cant be empty")
 @Length(min = 2, message = "Invalid Qualification")
    private String qualifications;
 @NotBlank(message = "Type Cant be empty")
 @Pattern(regexp = "^(full-time|part-time)$",flags = Pattern.Flag.CASE_INSENSITIVE,message = "Invalid Type")
    private String type;
 @LecturerImage //can change the default values in image
    private MultipartFile picture;
    @Pattern(regexp = "^http[s]?://.+$",message = "Invalid Linkedin URL")
    private String linkedin;
}
