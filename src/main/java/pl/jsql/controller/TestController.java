package pl.jsql.controller;

import it.jsql.connector.controller.JSQLController;
import it.jsql.connector.dto.JSQLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestController extends JSQLController {

    @Override
    public JSQLConfig getConfig() {
        return new JSQLConfig("dawid.senko@jsql.it", "dawid.senko@jsql.it");
    }

}
