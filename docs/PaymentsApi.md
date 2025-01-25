# PaymentsApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chargeInvoice**](PaymentsApi.md#chargeInvoice) | **POST** /invoice/{invoiceId}/charge | Charge Invoice
[**downloadInvoice**](PaymentsApi.md#downloadInvoice) | **GET** /invoice/{invoiceId}/download | Download Invoice
[**downloadReceipt**](PaymentsApi.md#downloadReceipt) | **GET** /receipt/{receiptId}/download | Download Receipt
[**getInvoicesForCustomer**](PaymentsApi.md#getInvoicesForCustomer) | **GET** /customer/{customerId}/invoices | List Customer Invoices
[**getPaymentsForCustomer**](PaymentsApi.md#getPaymentsForCustomer) | **GET** /customer/{customerId}/payment | List Customer Payments
[**listPayment**](PaymentsApi.md#listPayment) | **GET** /payment | List
[**refundPayment**](PaymentsApi.md#refundPayment) | **POST** /payment/{paymentId}/refund | Refund Payment

<a name="chargeInvoice"></a>
# **chargeInvoice**
> InlineResponse20014 chargeInvoice(invoiceId)

Charge Invoice

Attempts to charge a card that is on file for the invoice amount

### Example
```java
// Import classes:
//import com.billabear.sdk.invoker.ApiClient;
//import com.billabear.sdk.invoker.ApiException;
//import com.billabear.sdk.invoker.Configuration;
//import com.billabear.sdk.invoker.auth.*;
//import com.billabear.sdk.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentsApi apiInstance = new PaymentsApi();
String invoiceId = "invoiceId_example"; // String | The id of the invoice
try {
    InlineResponse20014 result = apiInstance.chargeInvoice(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#chargeInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| The id of the invoice |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadInvoice"></a>
# **downloadInvoice**
> File downloadInvoice(invoiceId)

Download Invoice

Returns the pdf blob for the invoice

### Example
```java
// Import classes:
//import com.billabear.sdk.invoker.ApiClient;
//import com.billabear.sdk.invoker.ApiException;
//import com.billabear.sdk.invoker.Configuration;
//import com.billabear.sdk.invoker.auth.*;
//import com.billabear.sdk.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentsApi apiInstance = new PaymentsApi();
String invoiceId = "invoiceId_example"; // String | The id of the invoice
try {
    File result = apiInstance.downloadInvoice(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#downloadInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| The id of the invoice |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="downloadReceipt"></a>
# **downloadReceipt**
> File downloadReceipt(receipt)

Download Receipt

Returns the pdf blob for the Receipt

### Example
```java
// Import classes:
//import com.billabear.sdk.invoker.ApiClient;
//import com.billabear.sdk.invoker.ApiException;
//import com.billabear.sdk.invoker.Configuration;
//import com.billabear.sdk.invoker.auth.*;
//import com.billabear.sdk.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentsApi apiInstance = new PaymentsApi();
String receipt = "receipt_example"; // String | The id of the receipt
try {
    File result = apiInstance.downloadReceipt(receipt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#downloadReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receipt** | **String**| The id of the receipt |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="getInvoicesForCustomer"></a>
# **getInvoicesForCustomer**
> InlineResponse2006 getInvoicesForCustomer(customerId)

List Customer Invoices

List Customer Invoices

### Example
```java
// Import classes:
//import com.billabear.sdk.invoker.ApiClient;
//import com.billabear.sdk.invoker.ApiException;
//import com.billabear.sdk.invoker.Configuration;
//import com.billabear.sdk.invoker.auth.*;
//import com.billabear.sdk.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentsApi apiInstance = new PaymentsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2006 result = apiInstance.getInvoicesForCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getInvoicesForCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentsForCustomer"></a>
# **getPaymentsForCustomer**
> InlineResponse2004 getPaymentsForCustomer(customerId, limit, lastKey, name)

List Customer Payments

List Customer Payment

### Example
```java
// Import classes:
//import com.billabear.sdk.invoker.ApiClient;
//import com.billabear.sdk.invoker.ApiException;
//import com.billabear.sdk.invoker.Configuration;
//import com.billabear.sdk.invoker.auth.*;
//import com.billabear.sdk.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentsApi apiInstance = new PaymentsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
String name = "name_example"; // String | The name to search for
try {
    InlineResponse2004 result = apiInstance.getPaymentsForCustomer(customerId, limit, lastKey, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentsForCustomer");
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

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPayment"></a>
# **listPayment**
> InlineResponse2009 listPayment(limit, lastKey, name)

List

List all payment

### Example
```java
// Import classes:
//import com.billabear.sdk.invoker.ApiClient;
//import com.billabear.sdk.invoker.ApiException;
//import com.billabear.sdk.invoker.Configuration;
//import com.billabear.sdk.invoker.auth.*;
//import com.billabear.sdk.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentsApi apiInstance = new PaymentsApi();
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
String name = "name_example"; // String | The name to search for
try {
    InlineResponse2009 result = apiInstance.listPayment(limit, lastKey, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#listPayment");
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

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="refundPayment"></a>
# **refundPayment**
> refundPayment(body, paymentId)

Refund Payment

Issue a refund for payment

### Example
```java
// Import classes:
//import com.billabear.sdk.invoker.ApiClient;
//import com.billabear.sdk.invoker.ApiException;
//import com.billabear.sdk.invoker.Configuration;
//import com.billabear.sdk.invoker.auth.*;
//import com.billabear.sdk.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

PaymentsApi apiInstance = new PaymentsApi();
IssueRefundPayment body = new IssueRefundPayment(); // IssueRefundPayment | 
String paymentId = "paymentId_example"; // String | The id of the payment
try {
    apiInstance.refundPayment(body, paymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#refundPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IssueRefundPayment**](IssueRefundPayment.md)|  |
 **paymentId** | **String**| The id of the payment |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

