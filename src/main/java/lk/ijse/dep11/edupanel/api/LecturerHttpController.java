package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lectures")
@CrossOrigin
public class LecturerHttpController {
    @PostMapping("/{lecture-id}")
    public  void createNewLecturer(){
        System.out.println("create lecture");

    }
    @PatchMapping("/{lecture-id}")
    public void updateLeactureDetails(){
        System.out.println("update lecture");

    }
    @DeleteMapping
    public void deleteLecture(){
        System.out.println("delete lecture");

    }

    @GetMapping
    public  void getAlllectures(){
        System.out.println("getalllectures");
    }

}
