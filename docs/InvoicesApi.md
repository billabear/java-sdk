# InvoicesApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chargeInvoice**](InvoicesApi.md#chargeInvoice) | **POST** /invoice/{invoiceId}/charge | Charge Invoice
[**downloadInvoice**](InvoicesApi.md#downloadInvoice) | **GET** /invoice/{invoiceId}/download | Download Invoice
[**getInvoicesForCustomer**](InvoicesApi.md#getInvoicesForCustomer) | **GET** /customer/{customerId}/invoices | List Customer Invoices

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
//import com.billabear.sdk.api.InvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

InvoicesApi apiInstance = new InvoicesApi();
String invoiceId = "invoiceId_example"; // String | The id of the invoice
try {
    InlineResponse20014 result = apiInstance.chargeInvoice(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#chargeInvoice");
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
//import com.billabear.sdk.api.InvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

InvoicesApi apiInstance = new InvoicesApi();
String invoiceId = "invoiceId_example"; // String | The id of the invoice
try {
    File result = apiInstance.downloadInvoice(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#downloadInvoice");
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
//import com.billabear.sdk.api.InvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

InvoicesApi apiInstance = new InvoicesApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2006 result = apiInstance.getInvoicesForCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getInvoicesForCustomer");
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

