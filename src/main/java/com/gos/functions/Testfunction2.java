package com.gos.functions;

import java.util.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with HTTP Trigger.
 */
public class Testfunction2 {
    /**
     * This function listens at endpoint "/api/testfunction2". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/testfunction2
     * 2. curl {your host}/api/testfunction2?name=HTTP%20Query
     */
    @FunctionName("serviceBusMonitor")
    public void logServiceBusMessage(
            @ServiceBusQueueTrigger(name = "msg", queueName = "%queueName%", connection = "AzureServiceBusConnection")
            final String message,
            final ExecutionContext context
    ) {
        context.getLogger().info("Message is received: " + message);
    }

}
