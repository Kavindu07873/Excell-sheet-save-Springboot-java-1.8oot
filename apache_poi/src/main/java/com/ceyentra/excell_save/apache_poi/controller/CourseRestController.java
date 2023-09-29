package com.ceyentra.excell_save.apache_poi.controller;

import com.ceyentra.excell_save.apache_poi.entity.Course;
import com.ceyentra.excell_save.apache_poi.service.Impl.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("courses")
public class CourseRestController {

//    @Autowired
    private CourseService courseService;

    @GetMapping("/excel")
    public void  generateExcelReport(HttpServletResponse response) throws IOException {

        response.setContentType("application/octet-stream");

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename = courses.xls";

        response.setHeader(headerKey , headerValue);

        courseService.generateExcel(response);
    }
//
//    @PostMapping("/upload-course-data")
//    public ResponseEntity<Map<String ,String>> uploadCustomersData(@RequestParam("file")MultipartFile file){
//        this.courseService.saveCoursesToDatabase(file);
//        Map<String, String> responseMap = new HashMap<>();
//        responseMap.put("Message", "Customers data uploaded and saved to database successfully");
//        return ResponseEntity.ok(responseMap);
//    }

//    @PostMapping("/upload-course-data")
//    public ResponseEntity<?> uploadCustomersData(@RequestParam("file")MultipartFile file){
//        this.courseService.saveCoursesToDatabase(file);
//        return ResponseEntity
//                .ok(Map.of("Message" , " Customers data uploaded and saved to database successfully"));
//    }
        @PostMapping("/upload-course-data")
    public ResponseEntity<Map<String ,String>> uploadCustomersData(@RequestParam("file")MultipartFile file){
        this.courseService.saveCoursesToDatabase(file);
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("Message", "course data uploaded and saved to database successfully");
        return ResponseEntity.ok(responseMap);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getCourse(){
        return new ResponseEntity<>(courseService.getCourses() , HttpStatus.FOUND);
    }
}
