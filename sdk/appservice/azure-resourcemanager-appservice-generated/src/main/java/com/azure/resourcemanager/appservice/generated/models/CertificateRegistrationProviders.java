// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of CertificateRegistrationProviders. */
public interface CertificateRegistrationProviders {
    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource
     * provider.
     *
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    PagedIterable<CsmOperationDescription> listOperations();

    /**
     * Description for Implements Csm operations Api to exposes the list of available Csm Apis under the resource
     * provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.generated.models.DefaultErrorResponseErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata.
     */
    PagedIterable<CsmOperationDescription> listOperations(Context context);
}
