# CheckoutApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCheckout**](CheckoutApi.md#createCheckout) | **POST** /checkout | Create Checkout

<a name="createCheckout"></a>
# **createCheckout**
> InlineResponse201 createCheckout(body)

Create Checkout

Create checkout&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 2024.01&lt;/strong&gt;

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
CheckoutBody body = new CheckoutBody(); // CheckoutBody | 
try {
    InlineResponse201 result = apiInstance.createCheckout(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#createCheckout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckoutBody**](CheckoutBody.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

