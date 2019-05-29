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

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public IJSQLService getJsqlService() {
        return new JSQLService(applicationContext, "==XxPiAgZ3bAX6ZbbcvcbT6wqrPdJqQDXi+mBTK/zZTw==L818RZMBZ1mnOnOoSdMZ", "4qjHbugc2M4+L4KNCeDhOA==");
    }

    @Override
    public JSQLConfig getConfig() {
        return null;
    }
}
