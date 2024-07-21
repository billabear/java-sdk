# SubscriptionIdPlanBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**when** | [**WhenEnum**](#WhenEnum) |  | 
**plan** | [**UUID**](UUID.md) | The ID for the subscription plan to be used |  [optional]
**price** | [**UUID**](UUID.md) | The ID for the price to be used | 

<a name="WhenEnum"></a>
## Enum: WhenEnum
Name | Value
---- | -----
INSTANTLY | &quot;instantly&quot;
NEXT_CYCLE | &quot;next-cycle&quot;
