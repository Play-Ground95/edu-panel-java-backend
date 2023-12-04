package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lectures/full-time")
@CrossOrigin
public class FullTimeLecturerHttpController {
    @PatchMapping("/ranks")
    public void FullTimeLecturesOrder(){
        System.out.println("fulltimelecureorder");
    }

    @GetMapping
    public void getAllFullTimeLectures(){
        System.out.println("getAllFullTimeLectures");
    }
}
