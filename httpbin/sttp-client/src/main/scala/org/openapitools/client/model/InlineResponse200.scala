/**
 * httpbin
 * An unofficial OpenAPI definition for [httpbin.org](https://httpbin.org).
 *
 * The version of the OpenAPI document: 1.0-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import java.sql.Timestamp
import org.openapitools.client.core.ApiModel

case class InlineResponse200(
  now: Timestamp,
  urls: Seq[String]
) extends ApiModel


