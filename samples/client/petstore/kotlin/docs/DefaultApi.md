# DefaultApi

All URIs are relative to *http://api.example.xyz/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](DefaultApi.md#list) | **GET** /data/video | 


<a name="list"></a>
# **list**
> Video list(videoId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val videoId : kotlin.String = videoId_example // kotlin.String | The id of the video
try {
    val result : Video = apiInstance.list(videoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#list")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#list")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **kotlin.String**| The id of the video |

### Return type

[**Video**](Video.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

