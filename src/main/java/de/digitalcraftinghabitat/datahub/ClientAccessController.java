package de.digitalcraftinghabitat.datahub;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by christopher on 28/08/15.
 */
@RestController
public class ClientAccessController {

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String getActivity() {
        return "Greetings from /client";
    }

}
