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

import org.openapitools.client.model.OneOfstringinteger
import org.openapitools.client.core._
import alias._
import sttp.client._
import sttp.model.Method

object StatusCodesApi {

  def apply(baseUrl: String = "https://httpbin.org")(implicit serializer: SttpSerializer) = new StatusCodesApi(baseUrl)
}

class StatusCodesApi(baseUrl: String)(implicit serializer: SttpSerializer) {

  import Helpers._
  import serializer._

  /**
   * Expected answers:
   *   code 0 :  (A response with the requested status code.)
   * 
   * @param statusCode The status code to return, or a weighted list of statuses to pick from, such as `200:4,500:0.3,418`.
   */
  def statusStatusCodeDelete(statusCode: Seq[OneOfstringinteger]): ApiRequestT[Unit] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/status/${statusCode}")
      .contentType("application/json")
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 0 :  (A response with the requested status code.)
   * 
   * @param statusCode The status code to return, or a weighted list of statuses to pick from, such as `200:4,500:0.3,418`.
   */
  def statusStatusCodeGet(statusCode: Seq[OneOfstringinteger]): ApiRequestT[Unit] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/status/${statusCode}")
      .contentType("application/json")
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 0 :  (A response with the requested status code.)
   * 
   * @param statusCode The status code to return, or a weighted list of statuses to pick from, such as `200:4,500:0.3,418`.
   */
  def statusStatusCodePatch(statusCode: Seq[OneOfstringinteger]): ApiRequestT[Unit] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/status/${statusCode}")
      .contentType("application/json")
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 0 :  (A response with the requested status code.)
   * 
   * @param statusCode The status code to return, or a weighted list of statuses to pick from, such as `200:4,500:0.3,418`.
   */
  def statusStatusCodePost(statusCode: Seq[OneOfstringinteger]): ApiRequestT[Unit] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/status/${statusCode}")
      .contentType("application/json")
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 0 :  (A response with the requested status code.)
   * 
   * @param statusCode The status code to return, or a weighted list of statuses to pick from, such as `200:4,500:0.3,418`.
   */
  def statusStatusCodePut(statusCode: Seq[OneOfstringinteger]): ApiRequestT[Unit] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/status/${statusCode}")
      .contentType("application/json")
      .response(asJson[Unit])

}

