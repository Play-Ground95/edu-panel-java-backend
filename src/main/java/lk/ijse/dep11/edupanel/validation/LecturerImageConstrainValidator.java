package lk.ijse.dep11.edupanel.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.web.multipart.MultipartFile;

public class LecturerImageConstrainValidator implements ConstraintValidator<LecturerImage, MultipartFile> {

    private long maximumFileSize;

    @Override
    public void initialize(LecturerImage constraintAnnotation) {
        maximumFileSize=constraintAnnotation.maximumFileSize();
    }


    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext constraintValidatorContext) {
        if (multipartFile.getSize()>maximumFileSize) return false;
        if (multipartFile.getContentType()==null) return  false;
        if (!multipartFile.getContentType().startsWith("image/")) return false;
        return true;
    }
}
