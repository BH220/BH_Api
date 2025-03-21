package bh_soft.api.Authorization.web;

import bh_soft.api.Authorization.service.AuthorizationService;
import bh_soft.api.Authorization.vo.ProgramVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class AuthorizationController {
    @Autowired
    private AuthorizationService authorizationService;

    @GetMapping("/get/test")
    public Map<String, String> getCurrentTime() {
        // 현재 시간 구하기
        LocalDateTime now = LocalDateTime.now();

        // 시간 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 결과를 Map에 담아서 반환
        Map<String, String> response = new HashMap<>();
        response.put("now_time", now.format(formatter));

        return response;
    }

    @PostMapping("/post/test")
    public ProgramVo post_test(@RequestBody ProgramVo requestData) {
        // 받은 데이터를 처리하고, 응답을 반환
        //String message = "Received: " + requestData.getName() + ", Age: " + requestData.getAge();
        return requestData;
    }
//
//    @PostMapping(value = {"/", "/login"})
//    public String mbMngL(Model model) throws Exception {
//
////        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
////        if(ClipMap.get("language") == null || ClipMap.get("language").equals("ko_KR")) {
////        	localeResolver.setDefaultLocale(new Locale("ko_KR"));
////        }else {
////        	localeResolver.setDefaultLocale(new Locale("en"));
////        }
//
//        model.addAttribute("ClipMap", model);
//        return "layout.user-layer/user/loginF";
//    }
}
