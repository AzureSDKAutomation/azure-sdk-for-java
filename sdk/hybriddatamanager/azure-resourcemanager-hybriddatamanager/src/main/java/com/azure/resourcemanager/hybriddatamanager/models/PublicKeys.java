// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PublicKeys. */
public interface PublicKeys {
    /**
     * This method gets the list view of public keys, however it will only have one element.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    PagedIterable<PublicKey> listByDataManager(String resourceGroupName, String dataManagerName);

    /**
     * This method gets the list view of public keys, however it will only have one element.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publicKey Collection.
     */
    PagedIterable<PublicKey> listByDataManager(String resourceGroupName, String dataManagerName, Context context);

    /**
     * This method gets the public keys.
     *
     * @param publicKeyName Name of the public key.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public key.
     */
    PublicKey get(String publicKeyName, String resourceGroupName, String dataManagerName);

    /**
     * This method gets the public keys.
     *
     * @param publicKeyName Name of the public key.
     * @param resourceGroupName The Resource Group Name.
     * @param dataManagerName The name of the DataManager Resource within the specified resource group. DataManager
     *     names must be between 3 and 24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return public key.
     */
    Response<PublicKey> getWithResponse(
        String publicKeyName, String resourceGroupName, String dataManagerName, Context context);
}
