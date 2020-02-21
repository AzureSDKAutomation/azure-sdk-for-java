/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.rest.RestException;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Exception thrown for an invalid response with ErrorContractInner
 * information.
 */
public class ErrorContractInnerException extends RestException {
    /**
     * Initializes a new instance of the ErrorContractInnerException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public ErrorContractInnerException(final String message, final Response<ResponseBody> response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ErrorContractInnerException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param body the deserialized response body
     */
    public ErrorContractInnerException(final String message, final Response<ResponseBody> response, final ErrorContractInner body) {
        super(message, response, body);
    }

    @Override
    public ErrorContractInner body() {
        return (ErrorContractInner) super.body();
    }
}
