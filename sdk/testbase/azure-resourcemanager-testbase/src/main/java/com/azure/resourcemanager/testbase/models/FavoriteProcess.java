// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of FavoriteProcess. */
public interface FavoriteProcess {
    /**
     * Deletes a favorite process for a specific package.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param favoriteProcessResourceName The resource name of a favorite process in a package. If the process name
     *     contains characters that are not allowed in Azure Resource Name, we use 'actualProcessName' in request body
     *     to submit the name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String testBaseAccountName, String packageName, String favoriteProcessResourceName);

    /**
     * Deletes a favorite process for a specific package.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param favoriteProcessResourceName The resource name of a favorite process in a package. If the process name
     *     contains characters that are not allowed in Azure Resource Name, we use 'actualProcessName' in request body
     *     to submit the name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        String favoriteProcessResourceName,
        Context context);

    /**
     * Gets a favorite process for a Test Base Package.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param favoriteProcessResourceName The resource name of a favorite process in a package. If the process name
     *     contains characters that are not allowed in Azure Resource Name, we use 'actualProcessName' in request body
     *     to submit the name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a favorite process for a Test Base Package.
     */
    FavoriteProcessResource get(
        String resourceGroupName, String testBaseAccountName, String packageName, String favoriteProcessResourceName);

    /**
     * Gets a favorite process for a Test Base Package.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param favoriteProcessResourceName The resource name of a favorite process in a package. If the process name
     *     contains characters that are not allowed in Azure Resource Name, we use 'actualProcessName' in request body
     *     to submit the name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a favorite process for a Test Base Package.
     */
    Response<FavoriteProcessResource> getWithResponse(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        String favoriteProcessResourceName,
        Context context);

    /**
     * Gets a favorite process for a Test Base Package.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a favorite process for a Test Base Package.
     */
    FavoriteProcessResource getById(String id);

    /**
     * Gets a favorite process for a Test Base Package.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a favorite process for a Test Base Package.
     */
    Response<FavoriteProcessResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a favorite process for a specific package.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a favorite process for a specific package.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FavoriteProcessResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new FavoriteProcessResource definition.
     */
    FavoriteProcessResource.DefinitionStages.Blank define(String name);
}
