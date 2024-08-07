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
import io.swagger.client.model.InlineResponse2008;
import io.swagger.client.model.Product;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ProductsApi
 */
@Ignore
public class ProductsApiTest {

    private final ProductsApi api = new ProductsApi();

    /**
     * Create
     *
     * Create a product
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createProductTest() throws Exception {
        Product body = null;
        String response = api.createProduct(body);

        // TODO: test validations
    }
    /**
     * List
     *
     * List all products
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listProductTest() throws Exception {
        Integer limit = null;
        String lastKey = null;
        String name = null;
        InlineResponse2008 response = api.listProduct(limit, lastKey, name);

        // TODO: test validations
    }
    /**
     * Detail
     *
     * Info for a specific product
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void showProductByIdTest() throws Exception {
        String productId = null;
        Product response = api.showProductById(productId);

        // TODO: test validations
    }
    /**
     * Update
     *
     * Update a product
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateProductTest() throws Exception {
        String productId = null;
        Product response = api.updateProduct(productId);

        // TODO: test validations
    }
}
