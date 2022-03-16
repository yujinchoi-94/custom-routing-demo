package com.example.customruntimeroutingdemo.router;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import java.util.function.Function;
import org.springframework.stereotype.Component;

@Component
public class SecondRouter implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    public SecondRouter() {
    }

    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent) {
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setStatusCode(200);
        responseEvent.setBody("success");
        return responseEvent;
    }
}
