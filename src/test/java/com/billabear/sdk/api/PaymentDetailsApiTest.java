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

import com.billabear.sdk.model.Error;
import com.billabear.sdk.model.FrontendToken;
import com.billabear.sdk.model.InlineResponse2007;
import com.billabear.sdk.model.PaymentDetails;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PaymentDetailsApi
 */
@Ignore
public class PaymentDetailsApiTest {

    private final PaymentDetailsApi api = new PaymentDetailsApi();

    /**
     * Complete Frontend Detail Collection
     *
     * Complete frontend payment details
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void completeFrontendPaymentDetailsTest() throws Exception {
        FrontendToken body = null;
        String customerId = null;
        PaymentDetails response = api.completeFrontendPaymentDetails(body, customerId);

        // TODO: test validations
    }
    /**
     * Delete
     *
     * Delete Payment Details
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePaymentDetailsTest() throws Exception {
        String paymentDetailsId = null;
        api.deletePaymentDetails(paymentDetailsId);

        // TODO: test validations
    }
    /**
     * Delete With Customer
     *
     * Delete Payment Details
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePaymentDetailsCustomerTest() throws Exception {
        String customerId = null;
        String paymentDetailsId = null;
        api.deletePaymentDetailsCustomer(customerId, paymentDetailsId);

        // TODO: test validations
    }
    /**
     * Fetch
     *
     * Fetch the payment cards
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPaymentDetailsTest() throws Exception {
        String paymentDetailsId = null;
        PaymentDetails response = api.getPaymentDetails(paymentDetailsId);

        // TODO: test validations
    }
    /**
     * List Customer&#x27;s Payment Details
     *
     * List all customers &lt;br&gt;&lt;br&gt;Added in version 1.1
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listPaymentDetailsTest() throws Exception {
        String customerId = null;
        InlineResponse2007 response = api.listPaymentDetails(customerId);

        // TODO: test validations
    }
    /**
     * Make Default
     *
     * Delete Payment Details
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void makeDefaultPaymentDetailsTest() throws Exception {
        String customerId = null;
        String paymentDetailsId = null;
        api.makeDefaultPaymentDetails(customerId, paymentDetailsId);

        // TODO: test validations
    }
    /**
     * Make Default With Customer
     *
     * Delete Payment Details
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void makeDefaultPaymentDetailsCustomerTest() throws Exception {
        String customerId = null;
        String paymentDetailsId = null;
        api.makeDefaultPaymentDetailsCustomer(customerId, paymentDetailsId);

        // TODO: test validations
    }
    /**
     * Start Frontend Detail Collection
     *
     * Start frontend payment details
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void startFrontendPaymentDetailsTest() throws Exception {
        String customerId = null;
        FrontendToken response = api.startFrontendPaymentDetails(customerId);

        // TODO: test validations
    }
}
