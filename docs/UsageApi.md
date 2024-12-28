# UsageApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerUsageLimit**](UsageApi.md#createCustomerUsageLimit) | **POST** /customer/{customerId}/uasge-limit | Create Usage Limit
[**createEvent**](UsageApi.md#createEvent) | **POST** /events | Create Event
[**customerCustomerIdUasgeLimitLimitIdDelete**](UsageApi.md#customerCustomerIdUasgeLimitLimitIdDelete) | **DELETE** /customer/{customerId}/uasge-limit/{limitId} | Delete Usage Limit
[**getCustomerCosts**](UsageApi.md#getCustomerCosts) | **GET** /customer/{customerId}/costs | Usage Cost Estimate
[**getCustomerUsageLimitsById**](UsageApi.md#getCustomerUsageLimitsById) | **GET** /customer/{customerId}/uasge-limit | Fetch Customer Usage Limits

<a name="createCustomerUsageLimit"></a>
# **createCustomerUsageLimit**
> UsageLimit createCustomerUsageLimit(body, customerId)

Create Usage Limit

Create Usage Limit for the custoemr

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UsageApi apiInstance = new UsageApi();
CustomerIdUasgelimitBody body = new CustomerIdUasgelimitBody(); // CustomerIdUasgelimitBody | 
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    UsageLimit result = apiInstance.createCustomerUsageLimit(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#createCustomerUsageLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerIdUasgelimitBody**](CustomerIdUasgelimitBody.md)|  |
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**UsageLimit**](UsageLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEvent"></a>
# **createEvent**
> createEvent(body)

Create Event

Creates an event that is used for usage billing

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UsageApi apiInstance = new UsageApi();
Event body = new Event(); // Event | 
try {
    apiInstance.createEvent(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#createEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Event**](Event.md)|  |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerCustomerIdUasgeLimitLimitIdDelete"></a>
# **customerCustomerIdUasgeLimitLimitIdDelete**
> customerCustomerIdUasgeLimitLimitIdDelete(customerId, usageLimitId)

Delete Usage Limit

Delete Usage Limit for the custoemr

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UsageApi apiInstance = new UsageApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
String usageLimitId = "usageLimitId_example"; // String | The id of the usage limit
try {
    apiInstance.customerCustomerIdUasgeLimitLimitIdDelete(customerId, usageLimitId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#customerCustomerIdUasgeLimitLimitIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |
 **usageLimitId** | **String**| The id of the usage limit |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCustomerCosts"></a>
# **getCustomerCosts**
> InlineResponse2001 getCustomerCosts(customerId)

Usage Cost Estimate

The estimated costs from usage based billing for a customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UsageApi apiInstance = new UsageApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2001 result = apiInstance.getCustomerCosts(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getCustomerCosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerUsageLimitsById"></a>
# **getCustomerUsageLimitsById**
> InlineResponse2005 getCustomerUsageLimitsById(customerId)

Fetch Customer Usage Limits

Usage Limits for a specific customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

UsageApi apiInstance = new UsageApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2005 result = apiInstance.getCustomerUsageLimitsById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getCustomerUsageLimitsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

