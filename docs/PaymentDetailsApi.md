# PaymentDetailsApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeFrontendPaymentDetails**](PaymentDetailsApi.md#completeFrontendPaymentDetails) | **POST** /customer/{customerId}/payment-methods/frontend-payment-token | Complete Frontend Detail Collection
[**deletePaymentDetails**](PaymentDetailsApi.md#deletePaymentDetails) | **DELETE** /payment-methods/{paymentDetailsId} | Delete
[**deletePaymentDetailsCustomer**](PaymentDetailsApi.md#deletePaymentDetailsCustomer) | **DELETE** /customer/{customerId}/payment-methods/{paymentDetailsId} | Delete With Customer
[**getPaymentDetails**](PaymentDetailsApi.md#getPaymentDetails) | **GET** /payment-methods/{paymentDetailsId} | Fetch
[**listPaymentDetails**](PaymentDetailsApi.md#listPaymentDetails) | **GET** /customer/{customerId}/payment-methods | List Customer&#x27;s Payment Details
[**makeDefaultPaymentDetails**](PaymentDetailsApi.md#makeDefaultPaymentDetails) | **POST** /payment-methods/{paymentDetailsId}/default | Make Default
[**makeDefaultPaymentDetailsCustomer**](PaymentDetailsApi.md#makeDefaultPaymentDetailsCustomer) | **POST** /customer/{customerId}/payment-methods/{paymentDetailsId}/default | Make Default With Customer
[**startFrontendPaymentDetails**](PaymentDetailsApi.md#startFrontendPaymentDetails) | **GET** /customer/{customerId}/payment-methods/frontend-payment-token | Start Frontend Detail Collection

<a name="completeFrontendPaymentDetails"></a>
# **completeFrontendPaymentDetails**
> PaymentDetails completeFrontendPaymentDetails(body, customerId)

Complete Frontend Detail Collection

Complete frontend payment details

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PaymentDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentDetailsApi apiInstance = new PaymentDetailsApi();
FrontendToken body = new FrontendToken(); // FrontendToken | 
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    PaymentDetails result = apiInstance.completeFrontendPaymentDetails(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentDetailsApi#completeFrontendPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FrontendToken**](FrontendToken.md)|  |
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**PaymentDetails**](PaymentDetails.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePaymentDetails"></a>
# **deletePaymentDetails**
> String deletePaymentDetails(paymentDetailsId)

Delete

Delete Payment Details

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PaymentDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentDetailsApi apiInstance = new PaymentDetailsApi();
String paymentDetailsId = "paymentDetailsId_example"; // String | The id of the payment details
try {
    String result = apiInstance.deletePaymentDetails(paymentDetailsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentDetailsApi#deletePaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDetailsId** | **String**| The id of the payment details |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePaymentDetailsCustomer"></a>
# **deletePaymentDetailsCustomer**
> String deletePaymentDetailsCustomer(customerId, paymentDetailsId)

Delete With Customer

Delete Payment Details

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PaymentDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentDetailsApi apiInstance = new PaymentDetailsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
String paymentDetailsId = "paymentDetailsId_example"; // String | The id of the payment details
try {
    String result = apiInstance.deletePaymentDetailsCustomer(customerId, paymentDetailsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentDetailsApi#deletePaymentDetailsCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |
 **paymentDetailsId** | **String**| The id of the payment details |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentDetails"></a>
# **getPaymentDetails**
> PaymentDetails getPaymentDetails(paymentDetailsId)

Fetch

Fetch the payment cards

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PaymentDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentDetailsApi apiInstance = new PaymentDetailsApi();
String paymentDetailsId = "paymentDetailsId_example"; // String | The id of the payment details
try {
    PaymentDetails result = apiInstance.getPaymentDetails(paymentDetailsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentDetailsApi#getPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentDetailsId** | **String**| The id of the payment details |

### Return type

[**PaymentDetails**](PaymentDetails.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPaymentDetails"></a>
# **listPaymentDetails**
> InlineResponse2005 listPaymentDetails(customerId)

List Customer&#x27;s Payment Details

List all customers &lt;br&gt;&lt;br&gt;Added in version 1.1

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PaymentDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentDetailsApi apiInstance = new PaymentDetailsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2005 result = apiInstance.listPaymentDetails(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentDetailsApi#listPaymentDetails");
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

<a name="makeDefaultPaymentDetails"></a>
# **makeDefaultPaymentDetails**
> String makeDefaultPaymentDetails(customerId, paymentDetailsId)

Make Default

Delete Payment Details

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PaymentDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentDetailsApi apiInstance = new PaymentDetailsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
String paymentDetailsId = "paymentDetailsId_example"; // String | The id of the payment details
try {
    String result = apiInstance.makeDefaultPaymentDetails(customerId, paymentDetailsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentDetailsApi#makeDefaultPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |
 **paymentDetailsId** | **String**| The id of the payment details |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="makeDefaultPaymentDetailsCustomer"></a>
# **makeDefaultPaymentDetailsCustomer**
> String makeDefaultPaymentDetailsCustomer(customerId, paymentDetailsId)

Make Default With Customer

Delete Payment Details

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PaymentDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentDetailsApi apiInstance = new PaymentDetailsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
String paymentDetailsId = "paymentDetailsId_example"; // String | The id of the payment details
try {
    String result = apiInstance.makeDefaultPaymentDetailsCustomer(customerId, paymentDetailsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentDetailsApi#makeDefaultPaymentDetailsCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |
 **paymentDetailsId** | **String**| The id of the payment details |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startFrontendPaymentDetails"></a>
# **startFrontendPaymentDetails**
> FrontendToken startFrontendPaymentDetails(customerId)

Start Frontend Detail Collection

Start frontend payment details

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.PaymentDetailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentDetailsApi apiInstance = new PaymentDetailsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    FrontendToken result = apiInstance.startFrontendPaymentDetails(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentDetailsApi#startFrontendPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**FrontendToken**](FrontendToken.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

