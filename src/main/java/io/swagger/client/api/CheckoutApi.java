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

import BillaBear.ApiCallback;
import BillaBear.ApiClient;
import BillaBear.ApiException;
import BillaBear.ApiResponse;
import BillaBear.Configuration;
import BillaBear.Pair;
import BillaBear.ProgressRequestBody;
import BillaBear.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CheckoutBody;
import io.swagger.client.model.Error;
import io.swagger.client.model.InlineResponse201;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutApi {
    private ApiClient apiClient;

    public CheckoutApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CheckoutApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createCheckout
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCheckoutCall(CheckoutBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/checkout";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCheckoutValidateBeforeCall(CheckoutBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createCheckout(Async)");
        }
        
        com.squareup.okhttp.Call call = createCheckoutCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Checkout
     * Create checkout&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 2024.01&lt;/strong&gt;
     * @param body  (required)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse201 createCheckout(CheckoutBody body) throws ApiException {
        ApiResponse<InlineResponse201> resp = createCheckoutWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Checkout
     * Create checkout&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 2024.01&lt;/strong&gt;
     * @param body  (required)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse201> createCheckoutWithHttpInfo(CheckoutBody body) throws ApiException {
        com.squareup.okhttp.Call call = createCheckoutValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Checkout (asynchronously)
     * Create checkout&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 2024.01&lt;/strong&gt;
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCheckoutAsync(CheckoutBody body, final ApiCallback<InlineResponse201> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createCheckoutValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
