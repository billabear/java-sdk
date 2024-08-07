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

import io.swagger.client.model.CheckoutBody;
import io.swagger.client.model.Error;
import io.swagger.client.model.InlineResponse201;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CheckoutApi
 */
@Ignore
public class CheckoutApiTest {

    private final CheckoutApi api = new CheckoutApi();

    /**
     * Create Checkout
     *
     * Create checkout&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 2024.01&lt;/strong&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCheckoutTest() throws Exception {
        CheckoutBody body = null;
        InlineResponse201 response = api.createCheckout(body);

        // TODO: test validations
    }
}
