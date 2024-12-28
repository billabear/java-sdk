# PricesApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPrice**](PricesApi.md#createPrice) | **POST** /product/{productId}/price | Create
[**listPrice**](PricesApi.md#listPrice) | **GET** /product/{productId}/price | List

<a name="createPrice"></a>
# **createPrice**
> createPrice(body, productId)

Create

Create a price

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PricesApi apiInstance = new PricesApi();
Price body = new Price(); // Price | 
String productId = "productId_example"; // String | The id of the product to retrieve
try {
    apiInstance.createPrice(body, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#createPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Price**](Price.md)|  |
 **productId** | **String**| The id of the product to retrieve |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPrice"></a>
# **listPrice**
> InlineResponse20011 listPrice(productId, limit, lastKey)

List

List all prices

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PricesApi apiInstance = new PricesApi();
String productId = "productId_example"; // String | The id of the product to retrieve
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
try {
    InlineResponse20011 result = apiInstance.listPrice(productId, limit, lastKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#listPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| The id of the product to retrieve |
 **limit** | **Integer**| How many items to return at one time (max 100) | [optional]
 **lastKey** | **String**| The key to be used in pagination to say what the last key of the previous page was | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

