# SubscriptionIdCancelBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**when** | [**WhenEnum**](#WhenEnum) |  | 
**refundType** | [**RefundTypeEnum**](#RefundTypeEnum) |  | 
**date** | [**LocalDate**](LocalDate.md) |  |  [optional]
**comment** | **String** |  |  [optional]

<a name="WhenEnum"></a>
## Enum: WhenEnum
Name | Value
---- | -----
END_OF_RUN | &quot;end-of-run&quot;
INSTANTLY | &quot;instantly&quot;
SPECIFIC_DATE | &quot;specific-date&quot;

<a name="RefundTypeEnum"></a>
## Enum: RefundTypeEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
FULL | &quot;full&quot;
PRORATE | &quot;prorate&quot;
