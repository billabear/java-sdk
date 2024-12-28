# SubscriptionsApi

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSeatsSubscriptions**](SubscriptionsApi.md#addSeatsSubscriptions) | **POST** /subscription/{subscriptionId}/seats/add | Add Seats
[**cancelSubscription**](SubscriptionsApi.md#cancelSubscription) | **POST** /subscription/{subscriptionId}/cancel | Cancel Subscription
[**changeSubscriptionPrice**](SubscriptionsApi.md#changeSubscriptionPrice) | **POST** /subscription/{subscriptionId}/price | Change Price
[**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /customer/{customerId}/subscription/start | Create Subscription
[**customerChangeSubscriptionPlan**](SubscriptionsApi.md#customerChangeSubscriptionPlan) | **POST** /subscription/{subscriptionId}/plan | Change Subscription Plan
[**extendTrial**](SubscriptionsApi.md#extendTrial) | **POST** /subscription/{subscriptionId}/extend | Extend Trial Subscription
[**getActiveForCustomer**](SubscriptionsApi.md#getActiveForCustomer) | **GET** /customer/{customerId}/subscription/active | List Customer Active Subscriptions
[**getForCustomer**](SubscriptionsApi.md#getForCustomer) | **GET** /customer/{customerId}/subscription | List Customer Subscriptions
[**listSubscriptionPlans**](SubscriptionsApi.md#listSubscriptionPlans) | **GET** /subscription/plans | List Subscription Plans
[**listSubscriptions**](SubscriptionsApi.md#listSubscriptions) | **GET** /subscription | List
[**removeSeatsSubscriptions**](SubscriptionsApi.md#removeSeatsSubscriptions) | **POST** /subscription/{subscriptionId}/seats/remove | Remove Seats
[**showSubscriptionById**](SubscriptionsApi.md#showSubscriptionById) | **GET** /subscription/{subscriptionId} | Detail
[**startTrial**](SubscriptionsApi.md#startTrial) | **POST** /customer/{customerId}/subscription/trial | Start Trial Subscription For Customer

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
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SeatsAddBody body = new SeatsAddBody(); // SeatsAddBody | 
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    InlineResponse20013 result = apiInstance.addSeatsSubscriptions(body, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#addSeatsSubscriptions");
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

<a name="cancelSubscription"></a>
# **cancelSubscription**
> cancelSubscription(body, subscriptionId)

Cancel Subscription

Info for a specific subscription

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionIdCancelBody body = new SubscriptionIdCancelBody(); // SubscriptionIdCancelBody | 
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    apiInstance.cancelSubscription(body, subscriptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#cancelSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionIdCancelBody**](SubscriptionIdCancelBody.md)|  |
 **subscriptionId** | **String**| The id of the subscription to retrieve |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeSubscriptionPrice"></a>
# **changeSubscriptionPrice**
> InlineResponse20013 changeSubscriptionPrice(body, subscriptionId)

Change Price

Changes the price being used for a price. Useful for changing pricing schedule or just price.

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionIdPriceBody body = new SubscriptionIdPriceBody(); // SubscriptionIdPriceBody | 
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    InlineResponse20013 result = apiInstance.changeSubscriptionPrice(body, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#changeSubscriptionPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionIdPriceBody**](SubscriptionIdPriceBody.md)|  |
 **subscriptionId** | **String**| The id of the subscription to retrieve |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSubscription"></a>
# **createSubscription**
> Subscription createSubscription(body, customerId)

Create Subscription

Create subscription for a customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionStartBody body = new SubscriptionStartBody(); // SubscriptionStartBody | 
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    Subscription result = apiInstance.createSubscription(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#createSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionStartBody**](SubscriptionStartBody.md)|  |
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerChangeSubscriptionPlan"></a>
# **customerChangeSubscriptionPlan**
> Subscription customerChangeSubscriptionPlan(body, subscriptionId)

Change Subscription Plan

Change the subscription plan for a customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionIdPlanBody body = new SubscriptionIdPlanBody(); // SubscriptionIdPlanBody | 
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    Subscription result = apiInstance.customerChangeSubscriptionPlan(body, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#customerChangeSubscriptionPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionIdPlanBody**](SubscriptionIdPlanBody.md)|  |
 **subscriptionId** | **String**| The id of the subscription to retrieve |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extendTrial"></a>
# **extendTrial**
> Subscription extendTrial(body, subscriptionId)

Extend Trial Subscription

Extend a trial subscription so it&#x27;s converted from a trial to a normal subscription.

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionIdExtendBody body = new SubscriptionIdExtendBody(); // SubscriptionIdExtendBody | 
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    Subscription result = apiInstance.extendTrial(body, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#extendTrial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionIdExtendBody**](SubscriptionIdExtendBody.md)|  |
 **subscriptionId** | **String**| The id of the subscription to retrieve |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
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
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2008 result = apiInstance.getActiveForCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getActiveForCustomer");
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
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    InlineResponse2008 result = apiInstance.getForCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getForCustomer");
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

<a name="listSubscriptionPlans"></a>
# **listSubscriptionPlans**
> InlineResponse20012 listSubscriptionPlans(limit, lastKey)

List Subscription Plans

List all subscriptions plans

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
try {
    InlineResponse20012 result = apiInstance.listSubscriptionPlans(limit, lastKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#listSubscriptionPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many items to return at one time (max 100) | [optional]
 **lastKey** | **String**| The key to be used in pagination to say what the last key of the previous page was | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSubscriptions"></a>
# **listSubscriptions**
> InlineResponse2008 listSubscriptions(limit, lastKey)

List

List all subscriptions

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
Integer limit = 56; // Integer | How many items to return at one time (max 100)
String lastKey = "lastKey_example"; // String | The key to be used in pagination to say what the last key of the previous page was
try {
    InlineResponse2008 result = apiInstance.listSubscriptions(limit, lastKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#listSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| How many items to return at one time (max 100) | [optional]
 **lastKey** | **String**| The key to be used in pagination to say what the last key of the previous page was | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SeatsRemoveBody body = new SeatsRemoveBody(); // SeatsRemoveBody | 
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    InlineResponse20013 result = apiInstance.removeSeatsSubscriptions(body, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#removeSeatsSubscriptions");
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

<a name="showSubscriptionById"></a>
# **showSubscriptionById**
> Subscription showSubscriptionById(subscriptionId)

Detail

Info for a specific subscription

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String subscriptionId = "subscriptionId_example"; // String | The id of the subscription to retrieve
try {
    Subscription result = apiInstance.showSubscriptionById(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#showSubscriptionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **String**| The id of the subscription to retrieve |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startTrial"></a>
# **startTrial**
> Subscription startTrial(body, customerId)

Start Trial Subscription For Customer

Start subscription for a customer

### Example
```java
// Import classes:
//import BillaBear.ApiClient;
//import BillaBear.ApiException;
//import BillaBear.Configuration;
//import BillaBear.auth.*;
//import io.swagger.client.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
SubscriptionTrialBody body = new SubscriptionTrialBody(); // SubscriptionTrialBody | 
String customerId = "customerId_example"; // String | The id of the customer to retrieve
try {
    Subscription result = apiInstance.startTrial(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#startTrial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionTrialBody**](SubscriptionTrialBody.md)|  |
 **customerId** | **String**| The id of the customer to retrieve |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

