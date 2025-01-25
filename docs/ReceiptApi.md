# ReceiptApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadReceipt**](ReceiptApi.md#downloadReceipt) | **GET** /receipt/{receiptId}/download | Download Receipt

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
//import com.billabear.sdk.api.ReceiptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ReceiptApi apiInstance = new ReceiptApi();
String receipt = "receipt_example"; // String | The id of the receipt
try {
    File result = apiInstance.downloadReceipt(receipt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceiptApi#downloadReceipt");
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

