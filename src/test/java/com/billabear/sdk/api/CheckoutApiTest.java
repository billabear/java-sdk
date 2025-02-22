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

package com.billabear.sdk.api;

import com.billabear.sdk.model.CheckoutBody;
import com.billabear.sdk.model.Error;
import com.billabear.sdk.model.InlineResponse201;
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
