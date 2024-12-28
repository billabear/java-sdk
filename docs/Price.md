# Price

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**amount** | **Integer** |  | 
**currency** | **String** | Three-letter ISO currency code. Must be upper-case | 
**externalReference** | **String** |  |  [optional]
**recurring** | **Boolean** |  | 
**schedule** | [**ScheduleEnum**](#ScheduleEnum) | Required if recurring is true |  [optional]
**includingTax** | **Boolean** | If the price is including tax. If false tax will be added on top of the price. |  [optional]
**_public** | **Boolean** |  |  [optional]
**metric** | [**Metric**](Metric.md) |  |  [optional]

<a name="ScheduleEnum"></a>
## Enum: ScheduleEnum
Name | Value
---- | -----
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;
ONE_OFF | &quot;one-off&quot;
