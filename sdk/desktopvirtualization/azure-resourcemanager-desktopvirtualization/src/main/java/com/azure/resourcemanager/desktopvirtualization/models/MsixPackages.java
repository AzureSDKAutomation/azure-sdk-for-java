// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MsixPackages. */
public interface MsixPackages {
    /**
     * Get a msixpackage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param msixPackageFullName The version specific package full name of the MSIX package within specified hostpool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a msixpackage.
     */
    MsixPackage get(String resourceGroupName, String hostPoolName, String msixPackageFullName);

    /**
     * Get a msixpackage.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param msixPackageFullName The version specific package full name of the MSIX package within specified hostpool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a msixpackage.
     */
    Response<MsixPackage> getWithResponse(
        String resourceGroupName, String hostPoolName, String msixPackageFullName, Context context);

    /**
     * Remove an MSIX Package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param msixPackageFullName The version specific package full name of the MSIX package within specified hostpool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hostPoolName, String msixPackageFullName);

    /**
     * Remove an MSIX Package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param msixPackageFullName The version specific package full name of the MSIX package within specified hostpool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String hostPoolName, String msixPackageFullName, Context context);

    /**
     * List MSIX packages in hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of MSIX Package definitions.
     */
    PagedIterable<MsixPackage> list(String resourceGroupName, String hostPoolName);

    /**
     * List MSIX packages in hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of MSIX Package definitions.
     */
    PagedIterable<MsixPackage> list(String resourceGroupName, String hostPoolName, Context context);

    /**
     * Get a msixpackage.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a msixpackage.
     */
    MsixPackage getById(String id);

    /**
     * Get a msixpackage.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a msixpackage.
     */
    Response<MsixPackage> getByIdWithResponse(String id, Context context);

    /**
     * Remove an MSIX Package.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Remove an MSIX Package.
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
     * Begins definition for a new MsixPackage resource.
     *
     * @param name resource name.
     * @return the first stage of the new MsixPackage definition.
     */
    MsixPackage.DefinitionStages.Blank define(String name);
}
