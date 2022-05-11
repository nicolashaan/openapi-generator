/**
 * Example
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.Media
import org.openapitools.client.models.PhotoAllOf

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param type 
 * @param mediaKey 
 * @param height 
 * @param width 
 * @param url 
 * @param altText 
 */

data class Photo (

    @Json(name = "type")
    override val type: kotlin.String,

    @Json(name = "media_key")
    override val mediaKey: kotlin.String? = null,

    @Json(name = "height")
    override val height: kotlin.String? = null,

    @Json(name = "width")
    override val width: kotlin.String? = null,

    @Json(name = "url")
    val url: java.net.URI? = null,

    @Json(name = "alt_text")
    val altText: kotlin.String? = null

) : Media, Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

