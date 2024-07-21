# InlineResponse2007Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**amount** | **Integer** |  |  [optional]
**currency** | **String** | Three-letter ISO currency code. Must be upper-case |  [optional]
**externalReference** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**createdAt** | **String** |  |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**receipts** | [**List&lt;InlineResponse2007Receipts&gt;**](InlineResponse2007Receipts.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
COMPLETED | &quot;completed&quot;
DISPUTED | &quot;disputed&quot;
PARTIALLY_REFUNDED | &quot;partially_refunded&quot;
FULLY_REFUNDED | &quot;fully_refunded&quot;
