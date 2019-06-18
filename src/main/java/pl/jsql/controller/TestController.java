package pl.jsql.controller;

import it.jsql.connector.controller.JSQLController;
import it.jsql.connector.dto.JSQLConfig;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestController extends JSQLController {

    private final String API_URL = "https://test-provider.jsql.it/api/jsql";

    @Override
    public String getProviderUrl(){
        return API_URL;
    }

    @Override
    public JSQLConfig getConfig() {
        return new JSQLConfig("dawid.senko@jsql.it", "production-dawid.senko@jsql.it");
    }

}
