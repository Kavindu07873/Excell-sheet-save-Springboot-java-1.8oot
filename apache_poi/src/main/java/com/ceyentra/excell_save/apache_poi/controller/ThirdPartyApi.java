//package com.ceyentra.excell_save.apache_poi.controller;
//
//import com.ceyentra.excell_save.apache_poi.dto.oauthValueDTO;
//import com.ceyentra.excell_save.apache_poi.service.ThirdpartyApiInterface;
//import lombok.val;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/ThirdPartyApi")
//public class ThirdPartyApi {
//
//
//    @GetMapping
//    @RequestMapping("/Hello")
//    public String hello(){
//        return "Hello World";
//    }
//
//    @GetMapping(value = "/callThirdPartyApiHello")
//    private String getThirdPartyApiHello(@RequestParam String name){
//        String BaseUrl = "http://localhost:8080/ThirdPartyApi/";
//        String uri = BaseUrl+name;
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri ,String.class);
//                return result;
//    }
//
////    @PostMapping
////    private String oauthAccess(@ModelAttribute oauthValueDTO oauthValueDTO){
////
////        oauthValueDTO.getUsername();
////        oauthValueDTO.getPassword();
////        oauthValueDTO.getPassword();
////
////        String url = "https://b2b-et-test.ceyentra.lk/b2b-api/oauth/token";
////
////        HttpHeaders headers = new HttpHeaders();
////        headers.setBasicAuth("B2B_USER", "");
////        RestTemplate restTemplate = new RestTemplate();
////
////        ResponseEntity<String> response = restTemplate.exchange(
////                url,
////                HttpMethod.POST,
////
////                builder.toUriString(),
////                requestEntity,
////                ApiResponse.class
////        );
////        return response;
////    }
//
//
////    @Autowired
////    private ThirdpartyApiInterface postService;
////    @PostMapping("/getPosts")
////    List<Map<String,Object>> getAllPosts(){
////        return   postService.getPosts();
////    }
//
//}
