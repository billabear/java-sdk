# SubscriptionStartBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionPlan** | [**UUID**](UUID.md) | The ID for the subscription plan to be used (Can also be the code name) | 
**paymentDetails** | [**UUID**](UUID.md) | The Id for the customer&#x27;s payment details to be used |  [optional]
**cardToken** | **String** | A stripe card token that&#x27;s been created using Stripe&#x27;s js sdk. It&#x27;ll create the payment details for the customer. |  [optional]
**price** | [**UUID**](UUID.md) | The ID for the price to be used |  [optional]
**schedule** | [**ScheduleEnum**](#ScheduleEnum) | The schedule of the plan that is to be started. Only used if price isn&#x27;t given. Requires currency as well. |  [optional]
**currency** | **String** | The currency of the plan that is to be started. Only used if price isn&#x27;t given. Requires schedule as well. |  [optional]
**seatNumbrers** | **Integer** |  |  [optional]
**denyTrial** | [**Bool**](Bool.md) |  |  [optional]
**metadata** | **Object** | Any metadata you want to add to a subscription |  [optional]

<a name="ScheduleEnum"></a>
## Enum: ScheduleEnum
Name | Value
---- | -----
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;
ONE_OFF | &quot;one-off&quot;
