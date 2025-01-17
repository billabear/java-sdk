# swagger-java-client

BillaBear
- API version: 1.0.0
  - Build date: 2024-07-21T17:32:45.393056317Z[Etc/UTC]

The REST API provided by BillaBear

  For more information, please visit [http://www.billabear.com/support](http://www.billabear.com/support)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import BillaBear.*;
import BillaBear.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CheckoutApi;

import java.io.File;
import java.util.*;

public class CheckoutApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://{customerId}.billabear.cloud/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CheckoutApi* | [**createCheckout**](docs/CheckoutApi.md#createCheckout) | **POST** /checkout | Create Checkout
*CustomersApi* | [**addSeatsSubscriptions**](docs/CustomersApi.md#addSeatsSubscriptions) | **POST** /subscription/{subscriptionId}/seats/add | Add Seats
*CustomersApi* | [**applyVoucherToCustomer**](docs/CustomersApi.md#applyVoucherToCustomer) | **POST** /customer/{customerId}/voucher | Apply voucher
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createCustomer) | **POST** /customer | Create
*CustomersApi* | [**disableCustomer**](docs/CustomersApi.md#disableCustomer) | **POST** /customer/{customerId}/disable | Disable Customer
*CustomersApi* | [**enableCustomer**](docs/CustomersApi.md#enableCustomer) | **POST** /customer/{customerId}/enable | Enable Customer
*CustomersApi* | [**getActiveForCustomer**](docs/CustomersApi.md#getActiveForCustomer) | **GET** /customer/{customerId}/subscription/active | List Customer Active Subscriptions
*CustomersApi* | [**getAllCustomers**](docs/CustomersApi.md#getAllCustomers) | **GET** /customer | List
*CustomersApi* | [**getCustomerById**](docs/CustomersApi.md#getCustomerById) | **GET** /customer/{customerId} | Detail
*CustomersApi* | [**getCustomerLimitsById**](docs/CustomersApi.md#getCustomerLimitsById) | **GET** /customer/{customerId}/limits | Fetch Customer Limits
*CustomersApi* | [**getForCustomer**](docs/CustomersApi.md#getForCustomer) | **GET** /customer/{customerId}/subscription | List Customer Subscriptions
*CustomersApi* | [**getInvoicesForCustomer**](docs/CustomersApi.md#getInvoicesForCustomer) | **GET** /customer/{customerId}/invoices | List Customer Invoices
*CustomersApi* | [**getPaymentsForCustomer**](docs/CustomersApi.md#getPaymentsForCustomer) | **GET** /customer/{customerId}/payment | List Customer Payments
*CustomersApi* | [**getRefundsForCustomer**](docs/CustomersApi.md#getRefundsForCustomer) | **GET** /customer/{customerId}/refund | List Customer Refunds
*CustomersApi* | [**listPaymentDetails**](docs/CustomersApi.md#listPaymentDetails) | **GET** /customer/{customerId}/payment-methods | List Customer&#x27;s Payment Details
*CustomersApi* | [**removeSeatsSubscriptions**](docs/CustomersApi.md#removeSeatsSubscriptions) | **POST** /subscription/{subscriptionId}/seats/remove | Remove Seats
*CustomersApi* | [**updateCustomer**](docs/CustomersApi.md#updateCustomer) | **PUT** /customer/{customerId} | Update
*InvoicesApi* | [**chargeInvoice**](docs/InvoicesApi.md#chargeInvoice) | **POST** /invoice/{invoiceId}/charge | Charge Invoice
*InvoicesApi* | [**downloadInvoice**](docs/InvoicesApi.md#downloadInvoice) | **GET** /invoice/{invoiceId}/download | Download Invoice
*InvoicesApi* | [**getInvoicesForCustomer**](docs/InvoicesApi.md#getInvoicesForCustomer) | **GET** /customer/{customerId}/invoices | List Customer Invoices
*PaymentDetailsApi* | [**completeFrontendPaymentDetails**](docs/PaymentDetailsApi.md#completeFrontendPaymentDetails) | **POST** /customer/{customerId}/payment-methods/frontend-payment-token | Complete Frontend Detail Collection
*PaymentDetailsApi* | [**deletePaymentDetails**](docs/PaymentDetailsApi.md#deletePaymentDetails) | **DELETE** /payment-methods/{paymentDetailsId} | Delete
*PaymentDetailsApi* | [**deletePaymentDetailsCustomer**](docs/PaymentDetailsApi.md#deletePaymentDetailsCustomer) | **DELETE** /customer/{customerId}/payment-methods/{paymentDetailsId} | Delete With Customer
*PaymentDetailsApi* | [**getPaymentDetails**](docs/PaymentDetailsApi.md#getPaymentDetails) | **GET** /payment-methods/{paymentDetailsId} | Fetch
*PaymentDetailsApi* | [**listPaymentDetails**](docs/PaymentDetailsApi.md#listPaymentDetails) | **GET** /customer/{customerId}/payment-methods | List Customer&#x27;s Payment Details
*PaymentDetailsApi* | [**makeDefaultPaymentDetails**](docs/PaymentDetailsApi.md#makeDefaultPaymentDetails) | **POST** /payment-methods/{paymentDetailsId}/default | Make Default
*PaymentDetailsApi* | [**makeDefaultPaymentDetailsCustomer**](docs/PaymentDetailsApi.md#makeDefaultPaymentDetailsCustomer) | **POST** /customer/{customerId}/payment-methods/{paymentDetailsId}/default | Make Default With Customer
*PaymentDetailsApi* | [**startFrontendPaymentDetails**](docs/PaymentDetailsApi.md#startFrontendPaymentDetails) | **GET** /customer/{customerId}/payment-methods/frontend-payment-token | Start Frontend Detail Collection
*PaymentsApi* | [**chargeInvoice**](docs/PaymentsApi.md#chargeInvoice) | **POST** /invoice/{invoiceId}/charge | Charge Invoice
*PaymentsApi* | [**downloadInvoice**](docs/PaymentsApi.md#downloadInvoice) | **GET** /invoice/{invoiceId}/download | Download Invoice
*PaymentsApi* | [**downloadReceipt**](docs/PaymentsApi.md#downloadReceipt) | **GET** /receipt/{receiptId}/download | Download Receipt
*PaymentsApi* | [**getInvoicesForCustomer**](docs/PaymentsApi.md#getInvoicesForCustomer) | **GET** /customer/{customerId}/invoices | List Customer Invoices
*PaymentsApi* | [**getPaymentsForCustomer**](docs/PaymentsApi.md#getPaymentsForCustomer) | **GET** /customer/{customerId}/payment | List Customer Payments
*PaymentsApi* | [**listPayment**](docs/PaymentsApi.md#listPayment) | **GET** /payment | List
*PaymentsApi* | [**refundPayment**](docs/PaymentsApi.md#refundPayment) | **POST** /payment/{paymentId}/refund | Refund Payment
*PricesApi* | [**createPrice**](docs/PricesApi.md#createPrice) | **POST** /product/{productId}/price | Create
*PricesApi* | [**listPrice**](docs/PricesApi.md#listPrice) | **GET** /product/{productId}/price | List
*ProductsApi* | [**createProduct**](docs/ProductsApi.md#createProduct) | **POST** /product | Create
*ProductsApi* | [**listProduct**](docs/ProductsApi.md#listProduct) | **GET** /product | List
*ProductsApi* | [**showProductById**](docs/ProductsApi.md#showProductById) | **GET** /product/{productId} | Detail
*ProductsApi* | [**updateProduct**](docs/ProductsApi.md#updateProduct) | **PUT** /product/{productId} | Update
*ReceiptApi* | [**downloadReceipt**](docs/ReceiptApi.md#downloadReceipt) | **GET** /receipt/{receiptId}/download | Download Receipt
*RefundsApi* | [**getRefundsForCustomer**](docs/RefundsApi.md#getRefundsForCustomer) | **GET** /customer/{customerId}/refund | List Customer Refunds
*RefundsApi* | [**listRefund**](docs/RefundsApi.md#listRefund) | **GET** /refund | List
*RefundsApi* | [**showRefundById**](docs/RefundsApi.md#showRefundById) | **GET** /refund/{refundId} | Detail
*SubscriptionsApi* | [**addSeatsSubscriptions**](docs/SubscriptionsApi.md#addSeatsSubscriptions) | **POST** /subscription/{subscriptionId}/seats/add | Add Seats
*SubscriptionsApi* | [**cancelSubscription**](docs/SubscriptionsApi.md#cancelSubscription) | **POST** /subscription/{subscriptionId}/cancel | Cancel Subscription
*SubscriptionsApi* | [**changeSubscriptionPrice**](docs/SubscriptionsApi.md#changeSubscriptionPrice) | **POST** /subscription/{subscriptionId}/price | Change Price
*SubscriptionsApi* | [**createSubscription**](docs/SubscriptionsApi.md#createSubscription) | **POST** /customer/{customerId}/subscription/start | Create Subscription
*SubscriptionsApi* | [**customerChangeSubscriptionPlan**](docs/SubscriptionsApi.md#customerChangeSubscriptionPlan) | **POST** /subscription/{subscriptionId}/plan | Change Subscription Plan
*SubscriptionsApi* | [**extendTrial**](docs/SubscriptionsApi.md#extendTrial) | **POST** /subscription/{subscriptionId}/extend | Extend Trial Subscription
*SubscriptionsApi* | [**getActiveForCustomer**](docs/SubscriptionsApi.md#getActiveForCustomer) | **GET** /customer/{customerId}/subscription/active | List Customer Active Subscriptions
*SubscriptionsApi* | [**getForCustomer**](docs/SubscriptionsApi.md#getForCustomer) | **GET** /customer/{customerId}/subscription | List Customer Subscriptions
*SubscriptionsApi* | [**listSubscriptionPlans**](docs/SubscriptionsApi.md#listSubscriptionPlans) | **GET** /subscription/plans | List Subscription Plans
*SubscriptionsApi* | [**listSubscriptions**](docs/SubscriptionsApi.md#listSubscriptions) | **GET** /subscription | List
*SubscriptionsApi* | [**removeSeatsSubscriptions**](docs/SubscriptionsApi.md#removeSeatsSubscriptions) | **POST** /subscription/{subscriptionId}/seats/remove | Remove Seats
*SubscriptionsApi* | [**showSubscriptionById**](docs/SubscriptionsApi.md#showSubscriptionById) | **GET** /subscription/{subscriptionId} | Detail
*SubscriptionsApi* | [**startTrial**](docs/SubscriptionsApi.md#startTrial) | **POST** /customer/{customerId}/subscription/trial | Start Trial Subscription For Customer

## Documentation for Models

 - [Address](docs/Address.md)
 - [BillingAdmin](docs/BillingAdmin.md)
 - [CheckoutBody](docs/CheckoutBody.md)
 - [CheckoutItems](docs/CheckoutItems.md)
 - [CheckoutSubscriptions](docs/CheckoutSubscriptions.md)
 - [Customer](docs/Customer.md)
 - [Error](docs/Error.md)
 - [Feature](docs/Feature.md)
 - [FrontendToken](docs/FrontendToken.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2007Data](docs/InlineResponse2007Data.md)
 - [InlineResponse2007Receipts](docs/InlineResponse2007Receipts.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse201Lines](docs/InlineResponse201Lines.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceLines](docs/InvoiceLines.md)
 - [IssueRefundPayment](docs/IssueRefundPayment.md)
 - [Limit](docs/Limit.md)
 - [PaymentDetails](docs/PaymentDetails.md)
 - [Price](docs/Price.md)
 - [Product](docs/Product.md)
 - [ProductTaxType](docs/ProductTaxType.md)
 - [Refund](docs/Refund.md)
 - [SeatsAddBody](docs/SeatsAddBody.md)
 - [SeatsRemoveBody](docs/SeatsRemoveBody.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionIdCancelBody](docs/SubscriptionIdCancelBody.md)
 - [SubscriptionIdExtendBody](docs/SubscriptionIdExtendBody.md)
 - [SubscriptionIdPlanBody](docs/SubscriptionIdPlanBody.md)
 - [SubscriptionIdPriceBody](docs/SubscriptionIdPriceBody.md)
 - [SubscriptionPlan](docs/SubscriptionPlan.md)
 - [SubscriptionStartBody](docs/SubscriptionStartBody.md)
 - [SubscriptionTrialBody](docs/SubscriptionTrialBody.md)
 - [VoucherCode](docs/VoucherCode.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@billabear.com
