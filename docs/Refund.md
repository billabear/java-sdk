# Refund

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**amount** | **Integer** |  |  [optional]
**currency** | **String** | Three-letter ISO currency code. Must be upper-case |  [optional]
**externalReference** | **String** |  |  [optional]
**comment** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | **String** |  |  [optional]
**payment** | [**Paths1paymentgetresponses200contentapplication1jsonschemapropertiesdataitems**](Paths1paymentgetresponses200contentapplication1jsonschemapropertiesdataitems.md) |  |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**billingAdmin** | [**BillingAdmin**](BillingAdmin.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
STARTED | &quot;started&quot;
REJECTED | &quot;rejected&quot;
AUTHORISED | &quot;authorised&quot;
ISSUED | &quot;issued&quot;
