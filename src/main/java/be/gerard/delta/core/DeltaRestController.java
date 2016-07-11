package be.gerard.delta.core;

import be.gerard.delta.core.model.Version;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DeltaRestController
 *
 * @author bartgerard
 * @version v0.0.1
 */
@RestController
@RequestMapping("/rest/games")
public class DeltaRestController {

    @RequestMapping(value = "ping", method = RequestMethod.GET)
    public Version ping() {
        return new Version("delta");
    }

}
