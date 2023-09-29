//package com.ceyentra.excell_save.apache_poi.service.Impl;
//
//import com.ceyentra.excell_save.apache_poi.service.ThirdpartyApiInterface;
//import lombok.val;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class ThirdPartyApi implements ThirdpartyApiInterface {
//    String baseUrl = "https://jsonplaceholder.typicode.com/";
//
//    StringBuilder stringBuilder  = new StringBuilder(baseUrl);
//
//    String POST  = "/posts";
//
////    String POSTBYID  = "/posts/";
//
//    //    @Autowired
//    private RestTemplate restTemplate;
//
//    @Override
//    public List<Map<String, Object>> getPosts() {
//        HttpEntity<Void> httpEntity  = new HttpEntity<>(gethttpHeaders());
//        String url = stringBuilder.append(POST).toString();
//        val response  =  restTemplate.exchange(url , HttpMethod.POST ,httpEntity,List.class); ;
//        return  response.getBody();
//    }
//    private HttpHeaders gethttpHeaders(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        return headers;
//    }
//}
