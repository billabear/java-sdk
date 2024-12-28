# Metric

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**name** | **String** |  |  [optional]
**code** | **String** |  |  [optional]
**aggregationMethod** | [**AggregationMethodEnum**](#AggregationMethodEnum) |  |  [optional]
**aggregationProperty** | **String** |  |  [optional]
**filters** | [**List&lt;MetricFilter&gt;**](MetricFilter.md) |  |  [optional]

<a name="AggregationMethodEnum"></a>
## Enum: AggregationMethodEnum
Name | Value
---- | -----
COUNT | &quot;count&quot;
SUM | &quot;sum&quot;
LATEST | &quot;latest&quot;
UNIQUE_COUNT | &quot;unique_count&quot;
MAX | &quot;max&quot;
