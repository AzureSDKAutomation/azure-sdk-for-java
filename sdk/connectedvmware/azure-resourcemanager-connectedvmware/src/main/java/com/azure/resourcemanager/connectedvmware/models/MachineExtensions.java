// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of MachineExtensions. */
public interface MachineExtensions {
    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param name The name of the machine where the extension should be deleted.
     * @param extensionName The name of the machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String name, String extensionName);

    /**
     * The operation to delete the extension.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param name The name of the machine where the extension should be deleted.
     * @param extensionName The name of the machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String name, String extensionName, Context context);

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param name The name of the machine containing the extension.
     * @param extensionName The name of the machine extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    MachineExtension get(String resourceGroupName, String name, String extensionName);

    /**
     * The operation to get the extension.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param name The name of the machine containing the extension.
     * @param extensionName The name of the machine extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    Response<MachineExtension> getWithResponse(
        String resourceGroupName, String name, String extensionName, Context context);

    /**
     * The operation to get all extensions of a non-Azure machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param name The name of the machine containing the extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the Machine Extensions List Result.
     */
    PagedIterable<MachineExtension> list(String resourceGroupName, String name);

    /**
     * The operation to get all extensions of a non-Azure machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param name The name of the machine containing the extension.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the Machine Extensions List Result.
     */
    PagedIterable<MachineExtension> list(String resourceGroupName, String name, String expand, Context context);

    /**
     * The operation to get the extension.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    MachineExtension getById(String id);

    /**
     * The operation to get the extension.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Machine Extension.
     */
    Response<MachineExtension> getByIdWithResponse(String id, Context context);

    /**
     * The operation to delete the extension.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete the extension.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new MachineExtension resource.
     *
     * @param name resource name.
     * @return the first stage of the new MachineExtension definition.
     */
    MachineExtension.DefinitionStages.Blank define(String name);
}
