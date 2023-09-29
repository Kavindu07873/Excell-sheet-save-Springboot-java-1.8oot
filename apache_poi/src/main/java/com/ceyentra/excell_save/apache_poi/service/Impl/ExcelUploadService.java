package com.ceyentra.excell_save.apache_poi.service.Impl;

import com.ceyentra.excell_save.apache_poi.entity.Course;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ExcelUploadService {
    public static boolean isValidExcelFile(MultipartFile file){
        return Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" );
    }

    public static List<Course> getCustomerDataFromExcel(InputStream inputStream){
        List<Course> courses =new ArrayList<>();


        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Courses");

            int rowIndex =0;
            for (Row row : sheet){
                if(rowIndex == 0){
                    rowIndex++;
                    continue;
                }

                Iterator<Cell> cellIterator= row.iterator();
                int cellIndex = 0;

                Course course = new Course();
                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
//                    System.out.println(cell.getNumericCellValue());

                    switch (cellIndex) {
                        case 0 :
                            course.setId((long) cell.getNumericCellValue());
                            break;

                        case 1 :
                            course.setCname(cell.getStringCellValue());
                            break;

                        case 2 :
                            course.setAddress(cell.getStringCellValue());
                            break;

                        default:
                            break;
                    }
                    cellIndex++;
                }
                courses.add(course);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return courses;
    }

}
