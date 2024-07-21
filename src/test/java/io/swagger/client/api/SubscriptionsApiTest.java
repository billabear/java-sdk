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

import io.swagger.client.model.Error;
import io.swagger.client.model.InlineResponse20010;
import io.swagger.client.model.InlineResponse20011;
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.SeatsAddBody;
import io.swagger.client.model.SeatsRemoveBody;
import io.swagger.client.model.Subscription;
import io.swagger.client.model.SubscriptionIdCancelBody;
import io.swagger.client.model.SubscriptionIdExtendBody;
import io.swagger.client.model.SubscriptionIdPlanBody;
import io.swagger.client.model.SubscriptionIdPriceBody;
import io.swagger.client.model.SubscriptionStartBody;
import io.swagger.client.model.SubscriptionTrialBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SubscriptionsApi
 */
@Ignore
public class SubscriptionsApiTest {

    private final SubscriptionsApi api = new SubscriptionsApi();

    /**
     * Add Seats
     *
     * Adds seats to a per seat subscription&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 1.1.4&lt;/strong&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addSeatsSubscriptionsTest() throws Exception {
        SeatsAddBody body = null;
        String subscriptionId = null;
        InlineResponse20011 response = api.addSeatsSubscriptions(body, subscriptionId);

        // TODO: test validations
    }
    /**
     * Cancel Subscription
     *
     * Info for a specific subscription
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelSubscriptionTest() throws Exception {
        SubscriptionIdCancelBody body = null;
        String subscriptionId = null;
        String response = api.cancelSubscription(body, subscriptionId);

        // TODO: test validations
    }
    /**
     * Change Price
     *
     * Changes the price being used for a price. Useful for changing pricing schedule or just price.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void changeSubscriptionPriceTest() throws Exception {
        SubscriptionIdPriceBody body = null;
        String subscriptionId = null;
        InlineResponse20011 response = api.changeSubscriptionPrice(body, subscriptionId);

        // TODO: test validations
    }
    /**
     * Create Subscription
     *
     * Create subscription for a customer
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSubscriptionTest() throws Exception {
        SubscriptionStartBody body = null;
        String customerId = null;
        Subscription response = api.createSubscription(body, customerId);

        // TODO: test validations
    }
    /**
     * Change Subscription Plan
     *
     * Change the subscription plan for a customer
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void customerChangeSubscriptionPlanTest() throws Exception {
        SubscriptionIdPlanBody body = null;
        String subscriptionId = null;
        Subscription response = api.customerChangeSubscriptionPlan(body, subscriptionId);

        // TODO: test validations
    }
    /**
     * Extend Trial Subscription
     *
     * Extend a trial subscription so it&#x27;s converted from a trial to a normal subscription.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void extendTrialTest() throws Exception {
        SubscriptionIdExtendBody body = null;
        String subscriptionId = null;
        Subscription response = api.extendTrial(body, subscriptionId);

        // TODO: test validations
    }
    /**
     * List Customer Active Subscriptions
     *
     * List all Active customer subscriptions
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getActiveForCustomerTest() throws Exception {
        String customerId = null;
        InlineResponse2006 response = api.getActiveForCustomer(customerId);

        // TODO: test validations
    }
    /**
     * List Customer Subscriptions
     *
     * List all customer subscriptions&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 1.1&lt;/strong&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getForCustomerTest() throws Exception {
        String customerId = null;
        InlineResponse2006 response = api.getForCustomer(customerId);

        // TODO: test validations
    }
    /**
     * List Subscription Plans
     *
     * List all subscriptions plans
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listSubscriptionPlansTest() throws Exception {
        Integer limit = null;
        String lastKey = null;
        InlineResponse20010 response = api.listSubscriptionPlans(limit, lastKey);

        // TODO: test validations
    }
    /**
     * List
     *
     * List all subscriptions
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listSubscriptionsTest() throws Exception {
        Integer limit = null;
        String lastKey = null;
        InlineResponse2006 response = api.listSubscriptions(limit, lastKey);

        // TODO: test validations
    }
    /**
     * Remove Seats
     *
     * Remove seats to a per seat subscription&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 1.1.4&lt;/strong&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeSeatsSubscriptionsTest() throws Exception {
        SeatsRemoveBody body = null;
        String subscriptionId = null;
        InlineResponse20011 response = api.removeSeatsSubscriptions(body, subscriptionId);

        // TODO: test validations
    }
    /**
     * Detail
     *
     * Info for a specific subscription
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void showSubscriptionByIdTest() throws Exception {
        String subscriptionId = null;
        Subscription response = api.showSubscriptionById(subscriptionId);

        // TODO: test validations
    }
    /**
     * Start Trial Subscription For Customer
     *
     * Start subscription for a customer
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void startTrialTest() throws Exception {
        SubscriptionTrialBody body = null;
        String customerId = null;
        Subscription response = api.startTrial(body, customerId);

        // TODO: test validations
    }
}