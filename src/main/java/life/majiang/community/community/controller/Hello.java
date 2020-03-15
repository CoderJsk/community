package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：Mr.Ji;
 * @date:2020/3/15;
 * @description:
 */

@RestController
public class Hello {

   @GetMapping("/hello")
    public String Hello(@RequestParam(name = "name")String name, Model model) {
    model.addAttribute("name",name);
    return "hello";
  }


}
