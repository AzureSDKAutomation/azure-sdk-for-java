/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2016_04_01.implementation;

import com.microsoft.azure.management.dns.v2016_04_01.OperationStatus;
import com.microsoft.azure.management.dns.v2016_04_01.HttpStatusCode;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response to a Zone Delete operation.
 */
public class ZoneDeleteResultInner {
    /**
     * Users can perform a Get on Azure-AsyncOperation to get the status of
     * their delete Zone operations.
     */
    @JsonProperty(value = "azureAsyncOperation")
    private String azureAsyncOperation;

    /**
     * Possible values include: 'InProgress', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /**
     * Possible values include: 'Continue', 'SwitchingProtocols', 'OK',
     * 'Created', 'Accepted', 'NonAuthoritativeInformation', 'NoContent',
     * 'ResetContent', 'PartialContent', 'MultipleChoices', 'Ambiguous',
     * 'MovedPermanently', 'Moved', 'Found', 'Redirect', 'SeeOther',
     * 'RedirectMethod', 'NotModified', 'UseProxy', 'Unused',
     * 'TemporaryRedirect', 'RedirectKeepVerb', 'BadRequest', 'Unauthorized',
     * 'PaymentRequired', 'Forbidden', 'NotFound', 'MethodNotAllowed',
     * 'NotAcceptable', 'ProxyAuthenticationRequired', 'RequestTimeout',
     * 'Conflict', 'Gone', 'LengthRequired', 'PreconditionFailed',
     * 'RequestEntityTooLarge', 'RequestUriTooLong', 'UnsupportedMediaType',
     * 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired',
     * 'InternalServerError', 'NotImplemented', 'BadGateway',
     * 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     */
    @JsonProperty(value = "statusCode")
    private HttpStatusCode statusCode;

    /**
     * The requestId property.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * Get users can perform a Get on Azure-AsyncOperation to get the status of their delete Zone operations.
     *
     * @return the azureAsyncOperation value
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set users can perform a Get on Azure-AsyncOperation to get the status of their delete Zone operations.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     * @return the ZoneDeleteResultInner object itself.
     */
    public ZoneDeleteResultInner withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

    /**
     * Get possible values include: 'InProgress', 'Succeeded', 'Failed'.
     *
     * @return the status value
     */
    public OperationStatus status() {
        return this.status;
    }

    /**
     * Set possible values include: 'InProgress', 'Succeeded', 'Failed'.
     *
     * @param status the status value to set
     * @return the ZoneDeleteResultInner object itself.
     */
    public ZoneDeleteResultInner withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get possible values include: 'Continue', 'SwitchingProtocols', 'OK', 'Created', 'Accepted', 'NonAuthoritativeInformation', 'NoContent', 'ResetContent', 'PartialContent', 'MultipleChoices', 'Ambiguous', 'MovedPermanently', 'Moved', 'Found', 'Redirect', 'SeeOther', 'RedirectMethod', 'NotModified', 'UseProxy', 'Unused', 'TemporaryRedirect', 'RedirectKeepVerb', 'BadRequest', 'Unauthorized', 'PaymentRequired', 'Forbidden', 'NotFound', 'MethodNotAllowed', 'NotAcceptable', 'ProxyAuthenticationRequired', 'RequestTimeout', 'Conflict', 'Gone', 'LengthRequired', 'PreconditionFailed', 'RequestEntityTooLarge', 'RequestUriTooLong', 'UnsupportedMediaType', 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired', 'InternalServerError', 'NotImplemented', 'BadGateway', 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     *
     * @return the statusCode value
     */
    public HttpStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set possible values include: 'Continue', 'SwitchingProtocols', 'OK', 'Created', 'Accepted', 'NonAuthoritativeInformation', 'NoContent', 'ResetContent', 'PartialContent', 'MultipleChoices', 'Ambiguous', 'MovedPermanently', 'Moved', 'Found', 'Redirect', 'SeeOther', 'RedirectMethod', 'NotModified', 'UseProxy', 'Unused', 'TemporaryRedirect', 'RedirectKeepVerb', 'BadRequest', 'Unauthorized', 'PaymentRequired', 'Forbidden', 'NotFound', 'MethodNotAllowed', 'NotAcceptable', 'ProxyAuthenticationRequired', 'RequestTimeout', 'Conflict', 'Gone', 'LengthRequired', 'PreconditionFailed', 'RequestEntityTooLarge', 'RequestUriTooLong', 'UnsupportedMediaType', 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired', 'InternalServerError', 'NotImplemented', 'BadGateway', 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     *
     * @param statusCode the statusCode value to set
     * @return the ZoneDeleteResultInner object itself.
     */
    public ZoneDeleteResultInner withStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the ZoneDeleteResultInner object itself.
     */
    public ZoneDeleteResultInner withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

}
