# CustomersApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSeatsSubscriptions**](CustomersApi.md#addSeatsSubscriptions) | **POST** /subscription/{subscriptionId}/seats/add | Add Seats
[**applyVoucherToCustomer**](CustomersApi.md#applyVoucherToCustomer) | **POST** /customer/{customerId}/voucher | Apply voucher
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** /customer | Create
[**createCustomerUsageLimit**](CustomersApi.md#createCustomerUsageLimit) | **POST** /customer/{customerId}/uasge-limit | Create Usage Limit
[**customerCustomerIdUasgeLimitLimitIdDelete**](CustomersApi.md#customerCustomerIdUasgeLimitLimitIdDelete) | **DELETE** /customer/{customerId}/uasge-limit/{limitId} | Delete Usage Limit
[**disableCustomer**](CustomersApi.md#disableCustomer) | **POST** /customer/{customerId}/disable | Disable Customer
[**enableCustomer**](CustomersApi.md#enableCustomer) | **POST** /customer/{customerId}/enable | Enable Customer
[**getActiveForCustomer**](CustomersApi.md#getActiveForCustomer) | **GET** /customer/{customerId}/subscription/active | List Customer Active Subscriptions
[**getAllCustomers**](CustomersApi.md#getAllCustomers) | **GET** /customer | List
[**getCustomerById**](CustomersApi.md#getCustomerById) | **GET** /customer/{customerId} | Detail
[**getCustomerCosts**](CustomersApi.md#getCustomerCosts) | **GET** /customer/{customerId}/costs | Usage Cost Estimate
[**getCustomerLimitsById**](CustomersApi.md#getCustomerLimitsById) | **GET** /customer/{customerId}/limits | Fetch Customer Limits
[**getCustomerUsageLimitsById**](CustomersApi.md#getCustomerUsageLimitsById) | **GET** /customer/{customerId}/uasge-limit | Fetch Customer Usage Limits
[**getForCustomer**](CustomersApi.md#getForCustomer) | **GET** /customer/{customerId}/subscription | List Customer Subscriptions
[**getInvoicesForCustomer**](CustomersApi.md#getInvoicesForCustomer) | **GET** /customer/{customerId}/invoices | List Customer Invoices
[**getPaymentsForCustomer**](CustomersApi.md#getPaymentsForCustomer) | **GET** /customer/{customerId}/payment | List Customer Payments
[**getRefundsForCustomer**](CustomersApi.md#getRefundsForCustomer) | **GET** /customer/{customerId}/refund | List Customer Refunds
[**listPaymentDetails**](CustomersApi.md#listPaymentDetails) | **GET** /customer/{customerId}/payment-methods | List Customer&#x27;s Payment Details
[**removeSeatsSubscriptions**](CustomersApi.md#removeSeatsSubscriptions) | **POST** /subscription/{subscriptionId}/seats/remove | Remove Seats
[**updateCustomer**](CustomersApi.md#updateCustomer) | **PUT** /customer/{customerId} | Update

<a name="addSeatsSubscriptions"></a>
# **addSeatsSubscriptions**
> InlineResponse20013 addSeatsSubscriptions(body, subscriptionId)

Add Seats

Adds seats to a per seat subscription&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 1.1.4&lt;/strong&gt;

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
SeatsAddBody body = new SeatsAddBody(); // SeatsAddBody | 
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    InlineResponse20013 result = apiInstance.addSeatsSubscriptions(body, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#addSeatsSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SeatsAddBody**](SeatsAddBody.md)|  |
 **subscriptionId** | **String**| The id of the subscription to retrieve |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="applyVoucherToCustomer"></a>
# **applyVoucherToCustomer**
> applyVoucherToCustomer(body, customerId)

Apply voucher

Apply Voucher to Customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
VoucherCode body = new VoucherCode(); // VoucherCode | 
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    apiInstance.applyVoucherToCustomer(body, customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#applyVoucherToCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VoucherCode**](VoucherCode.md)|  |
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomer"></a>
# **createCustomer**
> Customer createCustomer(body)

Create

Create a customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
Customer body = new Customer(); // Customer | 
try {
    Customer result = apiInstance.createCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)|  |

### Return type

[**Customer**](Customer.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
CustomerIdUasgelimitBody body = new CustomerIdUasgelimitBody(); // CustomerIdUasgelimitBody | 
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    UsageLimit result = apiInstance.createCustomerUsageLimit(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createCustomerUsageLimit");
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
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
String usageLimitId = "usageLimitId_example"; // String | The id of the usage limit
try {
    apiInstance.customerCustomerIdUasgeLimitLimitIdDelete(customerId, usageLimitId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#customerCustomerIdUasgeLimitLimitIdDelete");
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

<a name="disableCustomer"></a>
# **disableCustomer**
> disableCustomer(customerId)

Disable Customer

Disable customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    apiInstance.disableCustomer(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#disableCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableCustomer"></a>
# **enableCustomer**
> enableCustomer(customerId)

Enable Customer

Enable a customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    apiInstance.enableCustomer(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#enableCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActiveForCustomer"></a>
# **getActiveForCustomer**
> InlineResponse2008 getActiveForCustomer(customerId)

List Customer Active Subscriptions

List all Active customer subscriptions

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2008 result = apiInstance.getActiveForCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getActiveForCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllCustomers"></a>
# **getAllCustomers**
> InlineResponse200 getAllCustomers(limit, lastKey, email, country, reference, externalReference, companyName)

List

List all customers

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
String email = "email_example"; // String | The email to search for
String country = "country_example"; // String | The country code to search for
String reference = "reference_example"; // String | The reference to search for
String externalReference = "externalReference_example"; // String | The external reference to search for
String companyName = "companyName_example"; // String | The company name to search for
try {
    InlineResponse200 result = apiInstance.getAllCustomers(limit, lastKey, email, country, reference, externalReference, companyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getAllCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many items to return at one time (max 100) | [optional]
 **lastKey** | **String**| The key to be used in pagination to say what the last key of the previous page was | [optional]
 **email** | **String**| The email to search for | [optional]
 **country** | **String**| The country code to search for | [optional]
 **reference** | **String**| The reference to search for | [optional]
 **externalReference** | **String**| The external reference to search for | [optional]
 **companyName** | **String**| The company name to search for | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerById"></a>
# **getCustomerById**
> Customer getCustomerById(customerId)

Detail

Info for a specific customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    Customer result = apiInstance.getCustomerById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**Customer**](Customer.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2001 result = apiInstance.getCustomerCosts(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerCosts");
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

<a name="getCustomerLimitsById"></a>
# **getCustomerLimitsById**
> InlineResponse2002 getCustomerLimitsById(customerId)

Fetch Customer Limits

Limits for a specific customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2002 result = apiInstance.getCustomerLimitsById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerLimitsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2005 result = apiInstance.getCustomerUsageLimitsById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerUsageLimitsById");
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

<a name="getForCustomer"></a>
# **getForCustomer**
> InlineResponse2008 getForCustomer(customerId)

List Customer Subscriptions

List all customer subscriptions&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 1.1&lt;/strong&gt;

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2008 result = apiInstance.getForCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getForCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoicesForCustomer"></a>
# **getInvoicesForCustomer**
> InlineResponse2006 getInvoicesForCustomer(customerId)

List Customer Invoices

List Customer Invoices

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2006 result = apiInstance.getInvoicesForCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getInvoicesForCustomer");
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
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
String name = "name_example"; // String | The name to search for
try {
    InlineResponse2004 result = apiInstance.getPaymentsForCustomer(customerId, limit, lastKey, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getPaymentsForCustomer");
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
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
String name = "name_example"; // String | The name to search for
try {
    InlineResponse2003 result = apiInstance.getRefundsForCustomer(customerId, limit, lastKey, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getRefundsForCustomer");
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

<a name="listPaymentDetails"></a>
# **listPaymentDetails**
> InlineResponse2007 listPaymentDetails(customerId)

List Customer&#x27;s Payment Details

List all customers &lt;br&gt;&lt;br&gt;Added in version 1.1

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2007 result = apiInstance.listPaymentDetails(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#listPaymentDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSeatsSubscriptions"></a>
# **removeSeatsSubscriptions**
> InlineResponse20013 removeSeatsSubscriptions(body, subscriptionId)

Remove Seats

Remove seats to a per seat subscription&lt;br&gt;&lt;br&gt;&lt;strong&gt;Since 1.1.4&lt;/strong&gt;

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
SeatsRemoveBody body = new SeatsRemoveBody(); // SeatsRemoveBody | 
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    InlineResponse20013 result = apiInstance.removeSeatsSubscriptions(body, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#removeSeatsSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SeatsRemoveBody**](SeatsRemoveBody.md)|  |
 **subscriptionId** | **String**| The id of the subscription to retrieve |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> Customer updateCustomer(body, customerId)

Update

Update a customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

CustomersApi apiInstance = new CustomersApi();
Customer body = new Customer(); // Customer | 
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    Customer result = apiInstance.updateCustomer(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Customer**](Customer.md)|  |
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**Customer**](Customer.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

