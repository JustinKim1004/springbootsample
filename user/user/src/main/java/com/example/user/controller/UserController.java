package com.example.user.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.user.bean.TravelBean;
import com.example.user.bean.UserBean;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping(value = "/login", params = {"UserId", "Password"})
    public String submitLoginByGet(Model model, @RequestParam(value = "UserId") String userid,
                                            @RequestParam(value = "Password") String password) {
        model.addAttribute("Name", userid);
        return "welcome";
    }    

    // https://velog.io/@faulty337/Spring-GET-POST-%EC%9E%90%EC%9B%90-%EB%B0%9B%EA%B8%B0
    @PostMapping(value = "/login")
    public String submitLoginByPost(Model model, @RequestParam(value = "UserId") String userid,
                                                @RequestParam(value = "Password") String password) {
        model.addAttribute("Name", userid);
        return "welcome";
    }

    @PostMapping(value = "/login/bean")
    public String submitLoginByPostBean(Model model, UserBean user) {
        model.addAttribute("Name", user.getUserId());
        return "welcome";
    }

    @GetMapping(value = "/travel")
    public String travel(Model model) {
        return "travel_list";
    }

    @GetMapping(value = "/travel/{id}")
    public String travel(Model model, @PathVariable("id") String id) {
        model.addAttribute("Id", id);
        return "travel_detail";
    }

    @GetMapping(value = "/travel/v2/{id}")
    public String travelv2(Model model, @PathVariable("id") String id) {
        model.addAttribute("Id", id);
        if (id.equalsIgnoreCase("123")) {
            model.addAttribute("TravelImageUrl", "https://image.hanatour.com/usr/cms/resize/400_0/2016/12/19/10000/854690ab-5c8e-48f3-aefa-c1ed4085c2d0.png");
            model.addAttribute("TravelTitle", "규슈 3,4일 #100% 출발확정 #온천 여행 #유후인 산책");
            model.addAttribute("TravelArea", "유후,벳푸,후쿠오카,다자이후,구마모토,오이타");
            model.addAttribute("TravelPeriod", "3/4일");
            model.addAttribute("TravelPrice", "539,900~");
        } else if (id.equalsIgnoreCase("456")) {
            model.addAttribute("TravelImageUrl", "https://image.hanatour.com/usr/cms/resize/400_0/2020/01/23/10000/9a28c458-ee80-4890-bc49-8ebb3bf96383.jpg");
            model.addAttribute("TravelTitle", "튀르키예(터키) 일주 8~10일 #베스트셀러 #이스탄불 시내호텔1박 #루프탑레스토랑 #동굴호텔");
            model.addAttribute("TravelArea", "터키 국내선 이동으로 편안한 장거리 이동, 이스탄불 시내호텔, 루프탑 레스토랑, 동굴호텔, 온천호텔 등으로 구성된 터키일주 BEST 상품");
            model.addAttribute("TravelPeriod", "9/10/12일");
            model.addAttribute("TravelPrice", "2,919,000~");
        }
        return "travel_detail_v2";
    }

    static List<TravelBean> TravelBeanList = Arrays.asList(
        new TravelBean(1, "규슈 3,4일 #100% 출발확정 #온천 여행 #유후인 산책", "유후,벳푸,후쿠오카,다자이후,구마모토,오이타", "3/4일", "539,900~", "https://image.hanatour.com/usr/cms/resize/400_0/2016/12/19/10000/854690ab-5c8e-48f3-aefa-c1ed4085c2d0.png"),
        new TravelBean(2, "튀르키예(터키) 일주 8~10일 #베스트셀러 #이스탄불 시내호텔1박 #루프탑레스토랑 #동굴호텔", "터키 국내선 이동으로 편안한 장거리 이동, 이스탄불 시내호텔, 루프탑 레스토랑, 동굴호텔, 온천호텔 등으로 구성된 터키일주 BEST 상품", "9/10/12일", "2,919,000~", "https://image.hanatour.com/usr/cms/resize/400_0/2020/01/23/10000/9a28c458-ee80-4890-bc49-8ebb3bf96383.jpg")
    );

    @GetMapping(value = "/travel/v3")
    public String travelv2(Model model) {
        model.addAttribute("TravelList", TravelBeanList);
        return "travel_list_v3";
    }

    @GetMapping(value = "/travel/v3/{id}")
    public String travelv3(Model model, @PathVariable("id") Integer id) {
        for (TravelBean item : TravelBeanList) {
            if (item.getId() == id) {
                model.addAttribute("TravelItem", item);
                return "travel_detail_v3";
            }
        }
        return "travel_not_found";
    }
}
