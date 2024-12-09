package com.LottoWeb.LuckyLotto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.*;

@Controller
public class RandomController {

    java.util.Random rd = new java.util.Random();

    @GetMapping("/")
    public String firstPage() {
        return "button";
    }



    @GetMapping("/Random1")
    public String random1(Model model) {

        Set<Integer> lottoSet = new TreeSet<>();

        while(true) {
            int ranNum = rd.nextInt(45)+1;
            lottoSet.add(ranNum);

            if(lottoSet.size() == 6) {
                break;
            }
        }

        List<Integer> lottoList = new ArrayList<>(lottoSet);

        model.addAttribute("Number1",lottoList.get(0));
        model.addAttribute("Number2",lottoList.get(1));
        model.addAttribute("Number3",lottoList.get(2));
        model.addAttribute("Number4",lottoList.get(3));
        model.addAttribute("Number5",lottoList.get(4));
        model.addAttribute("Number6",lottoList.get(5));


        return "button1";
    }



    @PutMapping("/Random1")
    public String updateRandom(Model model) {

        Set<Integer> lottoSet = new TreeSet<>();

        while(true) {
            int ranNum = rd.nextInt(45)+1;
            lottoSet.add(ranNum);

            if(lottoSet.size() == 6) {
                break;
            }
        }

        List<Integer> lottoList = new ArrayList<>(lottoSet);

        model.addAttribute("Number1",lottoList.get(0));
        model.addAttribute("Number2",lottoList.get(1));
        model.addAttribute("Number3",lottoList.get(2));
        model.addAttribute("Number4",lottoList.get(3));
        model.addAttribute("Number5",lottoList.get(4));
        model.addAttribute("Number6",lottoList.get(5));


        return "button1";
    }

}
