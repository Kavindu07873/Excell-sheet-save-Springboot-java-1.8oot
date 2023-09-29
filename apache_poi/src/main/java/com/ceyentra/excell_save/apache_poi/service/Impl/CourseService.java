package com.ceyentra.excell_save.apache_poi.service.Impl;


import com.ceyentra.excell_save.apache_poi.entity.Course;
import com.ceyentra.excell_save.apache_poi.repository.CourseRepository;
import com.ceyentra.excell_save.apache_poi.service.Impl.ExcelUploadService;
import lombok.AllArgsConstructor;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Service
public class CourseService {

    private CourseRepository courseRepository;

    public void generateExcel(HttpServletResponse response) throws IOException {
        List<Course> courses = courseRepository.findAll();

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Course Info");
        HSSFRow row = sheet.createRow(0);

        row.createCell(0).setCellValue("ID");
        row.createCell(1).setCellValue("Name");
        row.createCell(2).setCellValue("Address");


        int dataRowIndex = 1;

        for (Course course : courses){
            HSSFRow dataRow = sheet.createRow(dataRowIndex);
            dataRow.createCell(0).setCellValue(course.getId());
            dataRow.createCell(1).setCellValue(course.getCname());
            dataRow.createCell(2).setCellValue(course.getAddress());
            dataRowIndex ++;
        }

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

    public void saveCoursesToDatabase(MultipartFile file){
        if(ExcelUploadService.isValidExcelFile(file)){

            try {
                List<Course> courses = ExcelUploadService.getCustomerDataFromExcel(file.getInputStream());
                this.courseRepository.saveAll(courses);
            } catch (IOException e) {
                throw  new IllegalArgumentException("The file is not a valid excel file");
            }
        }
    }


    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

}
