# Invoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**number** | **String** |  |  [optional]
**currency** | **String** |  |  [optional]
**customer** | [**Customer**](Customer.md) |  |  [optional]
**taxTotal** | **Integer** |  |  [optional]
**subTotal** | **Integer** |  |  [optional]
**amountDue** | **Integer** |  |  [optional]
**paid** | **Boolean** |  |  [optional]
**payLink** | **String** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**paidAt** | **String** |  |  [optional]
**dueDate** | **String** |  |  [optional]
**billerAddress** | [**Address**](Address.md) |  |  [optional]
**payeeaddress** | [**Address**](Address.md) |  |  [optional]
**lines** | [**List&lt;InvoiceLines&gt;**](InvoiceLines.md) |  |  [optional]
