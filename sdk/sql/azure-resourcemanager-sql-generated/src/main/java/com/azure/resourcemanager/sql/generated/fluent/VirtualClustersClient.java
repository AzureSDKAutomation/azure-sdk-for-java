// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.generated.fluent.models.UpdateManagedInstanceDnsServersOperationInner;
import com.azure.resourcemanager.sql.generated.fluent.models.VirtualClusterInner;
import com.azure.resourcemanager.sql.generated.models.VirtualClusterUpdate;

/** An instance of this class provides access to all the operations defined in VirtualClustersClient. */
public interface VirtualClustersClient {
    /**
     * Synchronizes the DNS server settings used by the managed instances inside the given virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UpdateManagedInstanceDnsServersOperationInner updateDnsServers(String resourceGroupName, String virtualClusterName);

    /**
     * Synchronizes the DNS server settings used by the managed instances inside the given virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable managed database resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UpdateManagedInstanceDnsServersOperationInner> updateDnsServersWithResponse(
        String resourceGroupName, String virtualClusterName, Context context);

    /**
     * Gets a list of all virtualClusters in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtualClusters in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualClusterInner> list();

    /**
     * Gets a list of all virtualClusters in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all virtualClusters in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualClusterInner> list(Context context);

    /**
     * Gets a list of virtual clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual clusters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of virtual clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual clusters in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualClusterInner getByResourceGroup(String resourceGroupName, String virtualClusterName);

    /**
     * Gets a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualClusterName, Context context);

    /**
     * Deletes a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualClusterName);

    /**
     * Deletes a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualClusterName, Context context);

    /**
     * Deletes a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualClusterName);

    /**
     * Deletes a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualClusterName, Context context);

    /**
     * Updates a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @param parameters The requested virtual cluster resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL virtual cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualClusterInner>, VirtualClusterInner> beginUpdate(
        String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters);

    /**
     * Updates a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @param parameters The requested virtual cluster resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL virtual cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualClusterInner>, VirtualClusterInner> beginUpdate(
        String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters, Context context);

    /**
     * Updates a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @param parameters The requested virtual cluster resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL virtual cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualClusterInner update(String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters);

    /**
     * Updates a virtual cluster.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param virtualClusterName The name of the virtual cluster.
     * @param parameters The requested virtual cluster resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL virtual cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualClusterInner update(
        String resourceGroupName, String virtualClusterName, VirtualClusterUpdate parameters, Context context);
}
