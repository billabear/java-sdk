# SubscriptionTrialBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionPlan** | [**UUID**](UUID.md) | The ID for the subscription plan to be used (Can also be the code name) | 
**cardToken** | **String** | A stripe card token that&#x27;s been created using Stripe&#x27;s js sdk. It&#x27;ll create the payment details for the customer. |  [optional]
**seatNumbrers** | **Integer** |  |  [optional]
**trialLengthDays** | **Integer** |  |  [optional]
