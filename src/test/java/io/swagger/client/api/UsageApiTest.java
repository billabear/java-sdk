/*
 * BillaBear
 * The REST API provided by BillaBear
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@billabear.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.CustomerIdUasgelimitBody;
import io.swagger.client.model.Error;
import io.swagger.client.model.Event;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.UsageLimit;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UsageApi
 */
@Ignore
public class UsageApiTest {

    private final UsageApi api = new UsageApi();

    /**
     * Create Usage Limit
     *
     * Create Usage Limit for the custoemr
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCustomerUsageLimitTest() throws Exception {
        CustomerIdUasgelimitBody body = null;
        String customerId = null;
        UsageLimit response = api.createCustomerUsageLimit(body, customerId);

        // TODO: test validations
    }
    /**
     * Create Event
     *
     * Creates an event that is used for usage billing
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createEventTest() throws Exception {
        Event body = null;
        api.createEvent(body);

        // TODO: test validations
    }
    /**
     * Delete Usage Limit
     *
     * Delete Usage Limit for the custoemr
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void customerCustomerIdUasgeLimitLimitIdDeleteTest() throws Exception {
        String customerId = null;
        String usageLimitId = null;
        api.customerCustomerIdUasgeLimitLimitIdDelete(customerId, usageLimitId);

        // TODO: test validations
    }
    /**
     * Usage Cost Estimate
     *
     * The estimated costs from usage based billing for a customer
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCustomerCostsTest() throws Exception {
        String customerId = null;
        InlineResponse2001 response = api.getCustomerCosts(customerId);

        // TODO: test validations
    }
    /**
     * Fetch Customer Usage Limits
     *
     * Usage Limits for a specific customer
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCustomerUsageLimitsByIdTest() throws Exception {
        String customerId = null;
        InlineResponse2005 response = api.getCustomerUsageLimitsById(customerId);

        // TODO: test validations
    }
}