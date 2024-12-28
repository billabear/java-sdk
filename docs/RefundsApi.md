# RefundsApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRefundsForCustomer**](RefundsApi.md#getRefundsForCustomer) | **GET** /customer/{customerId}/refund | List Customer Refunds
[**listRefund**](RefundsApi.md#listRefund) | **GET** /refund | List
[**showRefundById**](RefundsApi.md#showRefundById) | **GET** /refund/{refundId} | Detail

<a name="getRefundsForCustomer"></a>
# **getRefundsForCustomer**
> InlineResponse2003 getRefundsForCustomer(customerId, limit, lastKey, name)

List Customer Refunds

List Customer Refund

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.RefundsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RefundsApi apiInstance = new RefundsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
String name = "name_example"; // String | The name to search for
try {
    InlineResponse2003 result = apiInstance.getRefundsForCustomer(customerId, limit, lastKey, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundsApi#getRefundsForCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |
 **limit** | **Integer**| How many items to return at one time (max 100) | [optional]
 **lastKey** | **String**| The key to be used in pagination to say what the last key of the previous page was | [optional]
 **name** | **String**| The name to search for | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRefund"></a>
# **listRefund**
> InlineResponse2003 listRefund(limit, lastKey, name)

List

List all refund

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.RefundsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RefundsApi apiInstance = new RefundsApi();
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
String name = "name_example"; // String | The name to search for
try {
    InlineResponse2003 result = apiInstance.listRefund(limit, lastKey, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundsApi#listRefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many items to return at one time (max 100) | [optional]
 **lastKey** | **String**| The key to be used in pagination to say what the last key of the previous page was | [optional]
 **name** | **String**| The name to search for | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showRefundById"></a>
# **showRefundById**
> Refund showRefundById(refundId)

Detail

Info for a specific Refund

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.RefundsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

RefundsApi apiInstance = new RefundsApi();
String refundId = "refundId_example"; // String | The id of the refund
try {
    Refund result = apiInstance.showRefundById(refundId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundsApi#showRefundById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refundId** | **String**| The id of the refund |

### Return type

[**Refund**](Refund.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

