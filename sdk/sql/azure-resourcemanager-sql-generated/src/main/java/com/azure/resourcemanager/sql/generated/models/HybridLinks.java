// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of HybridLinks. */
public interface HybridLinks {
    /**
     * Gets a list of hybrid links in instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of hybrid links in instance.
     */
    PagedIterable<HybridLink> listByInstance(String resourceGroupName, String managedInstanceName);

    /**
     * Gets a list of hybrid links in instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of hybrid links in instance.
     */
    PagedIterable<HybridLink> listByInstance(String resourceGroupName, String managedInstanceName, Context context);

    /**
     * Gets a hybrid link for the given distributed availability group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param distributedAvailabilityGroupName The distributed availability group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a hybrid link for the given distributed availability group.
     */
    HybridLink get(String resourceGroupName, String managedInstanceName, String distributedAvailabilityGroupName);

    /**
     * Gets a hybrid link for the given distributed availability group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param distributedAvailabilityGroupName The distributed availability group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a hybrid link for the given distributed availability group.
     */
    Response<HybridLink> getWithResponse(
        String resourceGroupName, String managedInstanceName, String distributedAvailabilityGroupName, Context context);

    /**
     * Drops a hybrid link between box and Sql Managed Instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param distributedAvailabilityGroupName The distributed availability group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hybrid link between box and Sql Managed Instance.
     */
    HybridLink delete(String resourceGroupName, String managedInstanceName, String distributedAvailabilityGroupName);

    /**
     * Drops a hybrid link between box and Sql Managed Instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param distributedAvailabilityGroupName The distributed availability group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hybrid link between box and Sql Managed Instance.
     */
    HybridLink delete(
        String resourceGroupName, String managedInstanceName, String distributedAvailabilityGroupName, Context context);

    /**
     * Gets a hybrid link for the given distributed availability group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a hybrid link for the given distributed availability group.
     */
    HybridLink getById(String id);

    /**
     * Gets a hybrid link for the given distributed availability group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a hybrid link for the given distributed availability group.
     */
    Response<HybridLink> getByIdWithResponse(String id, Context context);

    /**
     * Drops a hybrid link between box and Sql Managed Instance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hybrid link between box and Sql Managed Instance.
     */
    HybridLink deleteById(String id);

    /**
     * Drops a hybrid link between box and Sql Managed Instance.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hybrid link between box and Sql Managed Instance.
     */
    HybridLink deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new HybridLink resource.
     *
     * @param name resource name.
     * @return the first stage of the new HybridLink definition.
     */
    HybridLink.DefinitionStages.Blank define(String name);
}
