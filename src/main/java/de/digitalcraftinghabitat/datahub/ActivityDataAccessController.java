package de.digitalcraftinghabitat.datahub;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by christopher on 10/08/15.
 */
@RestController
public class ActivityDataAccessController {


    /**
     * @return current value
     */
    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public String getActivity() {
        return "Greetings from Spring Boot!";
    }

    /**
     * @return current value
     */
    @RequestMapping(value = "/activity", method = RequestMethod.PUT)
    public String setValue(@RequestParam("size") String iconSize ) {
        return "Greetings from Spring Boot! value " + iconSize;
    }
}
