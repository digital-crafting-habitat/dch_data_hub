package de.digitalcraftinghabitat.datahub;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MappingController {

    @RequestMapping("/mapping")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        RedisEntry redisEntry = new RedisEntry();
        redisEntry.setKey("myKey");
        model.addAttribute("redisEntry" , redisEntry);
        return "mapping";
    }

}