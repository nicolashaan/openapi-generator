# org.openapitools.client - Kotlin client library for Example

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://api.example.xyz/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**list**](docs/DefaultApi.md#list) | **GET** /data/video | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.Media](docs/Media.md)
 - [org.openapitools.client.models.Photo](docs/Photo.md)
 - [org.openapitools.client.models.PhotoAllOf](docs/PhotoAllOf.md)
 - [org.openapitools.client.models.Video](docs/Video.md)
 - [org.openapitools.client.models.VideoAllOf](docs/VideoAllOf.md)
 - [org.openapitools.client.models.VideoAllOfNonPublicMetrics](docs/VideoAllOfNonPublicMetrics.md)
 - [org.openapitools.client.models.VideoAllOfOrganicMetrics](docs/VideoAllOfOrganicMetrics.md)
 - [org.openapitools.client.models.VideoAllOfPromotedMetrics](docs/VideoAllOfPromotedMetrics.md)
 - [org.openapitools.client.models.VideoAllOfPublicMetrics](docs/VideoAllOfPublicMetrics.md)
 - [org.openapitools.client.models.VideoAllOfVariants](docs/VideoAllOfVariants.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
