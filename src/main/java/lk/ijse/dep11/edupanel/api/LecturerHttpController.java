package lk.ijse.dep11.edupanel.api;

import jakarta.validation.Valid;
import lk.ijse.dep11.edupanel.to.request.LectureRequestTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lectures")
@CrossOrigin
public class LecturerHttpController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "multipart/form-data", produces = "application/json")
    public  void createNewLecturer(@ModelAttribute @Valid LectureRequestTO lecture){
        //System.out.println("create lecture");
        System.out.println(lecture);




    }
    @PatchMapping("/{lecture-id}")
    public void updateLeactureDetails(){
        System.out.println("update lecture");

    }
    @DeleteMapping("/{lecture-id}")
    public void deleteLecture(){
        System.out.println("delete lecture");

    }

    @GetMapping
    public  void getAlllectures(){
        System.out.println("getalllectures");
    }

}
