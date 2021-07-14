// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MarketplaceRegistrationDefinitions. */
public interface MarketplaceRegistrationDefinitions {
    /**
     * Gets a list of the marketplace registration definitions for the marketplace identifier.
     *
     * @param scope The scope of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the marketplace registration definitions for the marketplace identifier.
     */
    PagedIterable<MarketplaceRegistrationDefinition> list(String scope);

    /**
     * Gets a list of the marketplace registration definitions for the marketplace identifier.
     *
     * @param scope The scope of the resource.
     * @param filter The filter query parameter to filter marketplace registration definitions by plan identifier,
     *     publisher, version etc.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the marketplace registration definitions for the marketplace identifier.
     */
    PagedIterable<MarketplaceRegistrationDefinition> list(String scope, String filter, Context context);

    /**
     * Get the marketplace registration definition for the marketplace identifier.
     *
     * @param scope The scope of the resource.
     * @param marketplaceIdentifier The Azure Marketplace identifier. Expected formats:
     *     {publisher}.{product[-preview]}.{planName}.{version} or {publisher}.{product[-preview]}.{planName} or
     *     {publisher}.{product[-preview]} or {publisher}).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the marketplace registration definition for the marketplace identifier.
     */
    MarketplaceRegistrationDefinition get(String scope, String marketplaceIdentifier);

    /**
     * Get the marketplace registration definition for the marketplace identifier.
     *
     * @param scope The scope of the resource.
     * @param marketplaceIdentifier The Azure Marketplace identifier. Expected formats:
     *     {publisher}.{product[-preview]}.{planName}.{version} or {publisher}.{product[-preview]}.{planName} or
     *     {publisher}.{product[-preview]} or {publisher}).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the marketplace registration definition for the marketplace identifier.
     */
    Response<MarketplaceRegistrationDefinition> getWithResponse(
        String scope, String marketplaceIdentifier, Context context);
}
