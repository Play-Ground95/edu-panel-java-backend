package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lectures/part-time")
@CrossOrigin
public class PartTimeLecturerHttpController {
    @PatchMapping("/ranks")
    public void PartTimeLecturesOrder(){
        System.out.println("PartTimeLecturesOrder");
    }

    @GetMapping
    public void getAllPartTimeLectures(){
        System.out.println("getAllPartTimeLectures");
    }
}
