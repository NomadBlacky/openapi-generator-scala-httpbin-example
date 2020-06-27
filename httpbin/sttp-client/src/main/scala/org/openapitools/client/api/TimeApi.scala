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
package org.openapitools.client.api

import org.openapitools.client.model.AnyOfstring
import org.openapitools.client.model.AnyOfstringnumber
import org.openapitools.client.model.InlineResponse200
import org.openapitools.client.model.TimestampWrapper
import org.openapitools.client.core._
import alias._
import sttp.client._
import sttp.model.Method

object TimeApi {

  def apply(baseUrl: String = "https://httpbin.org")(implicit serializer: SttpSerializer) = new TimeApi(baseUrl)
}

class TimeApi(baseUrl: String)(implicit serializer: SttpSerializer) {

  import Helpers._
  import serializer._

  /**
   * Expected answers:
   *   code 200 : TimestampWrapper (OK)
   *   code 500 :  (oops)
   * 
   * @param machineTimestamp 
   */
  def parseMachineTimestampGet(machineTimestamp: AnyOfstringnumber): ApiRequestT[TimestampWrapper] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/parse/${machine-timestamp}")
      .contentType("application/json")
      .response(asJson[TimestampWrapper])

  /**
   * Expected answers:
   *   code 200 : InlineResponse200 (OK)
   */
  def rootGet(): ApiRequestT[InlineResponse200] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/")
      .contentType("application/json")
      .response(asJson[InlineResponse200])

  /**
   * Expected answers:
   *   code 200 : TimestampWrapper (OK)
   *   code 500 :  (oops)
   * 
   * @param humanTimestamp 
   */
  def whenHumanTimestampGet(humanTimestamp: AnyOfstring): ApiRequestT[TimestampWrapper] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/when/${human-timestamp}")
      .contentType("application/json")
      .response(asJson[TimestampWrapper])

}
