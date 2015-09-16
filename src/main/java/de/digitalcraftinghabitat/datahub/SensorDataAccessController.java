package de.digitalcraftinghabitat.datahub;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by christopher on 10/08/15.
 */
@RestController
public class SensorDataAccessController {

    @RequestMapping(value = "/sensor", method = RequestMethod.GET)
    public String getActivity() {
        return "Greetings from /sensor";
    }


}
