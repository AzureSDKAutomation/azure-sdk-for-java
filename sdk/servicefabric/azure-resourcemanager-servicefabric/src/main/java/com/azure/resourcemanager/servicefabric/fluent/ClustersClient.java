// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.servicefabric.fluent.models.ClusterInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ClusterListResultInner;
import com.azure.resourcemanager.servicefabric.fluent.models.UpgradableVersionPathResultInner;
import com.azure.resourcemanager.servicefabric.models.ClusterUpdateParameters;
import com.azure.resourcemanager.servicefabric.models.UpgradableVersionsDescription;

/** An instance of this class provides access to all the operations defined in ClustersClient. */
public interface ClustersClient {
    /**
     * Get a Service Fabric cluster resource created or in the process of being created in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Get a Service Fabric cluster resource created or in the process of being created in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric cluster resource created or in the process of being created in the specified resource
     *     group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Create or update a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param parameters The cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Create or update a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param parameters The cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, ClusterInner parameters, Context context);

    /**
     * Create or update a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param parameters The cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(String resourceGroupName, String clusterName, ClusterInner parameters);

    /**
     * Create or update a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param parameters The cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(String resourceGroupName, String clusterName, ClusterInner parameters, Context context);

    /**
     * Update the configuration of a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param parameters The parameters which contains the property value and property name which used to update the
     *     cluster configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginUpdate(
        String resourceGroupName, String clusterName, ClusterUpdateParameters parameters);

    /**
     * Update the configuration of a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param parameters The parameters which contains the property value and property name which used to update the
     *     cluster configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginUpdate(
        String resourceGroupName, String clusterName, ClusterUpdateParameters parameters, Context context);

    /**
     * Update the configuration of a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param parameters The parameters which contains the property value and property name which used to update the
     *     cluster configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(String resourceGroupName, String clusterName, ClusterUpdateParameters parameters);

    /**
     * Update the configuration of a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param parameters The parameters which contains the property value and property name which used to update the
     *     cluster configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(
        String resourceGroupName, String clusterName, ClusterUpdateParameters parameters, Context context);

    /**
     * Delete a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Delete a Service Fabric cluster resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets all Service Fabric cluster resources created or in the process of being created in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterListResultInner listByResourceGroup(String resourceGroupName);

    /**
     * Gets all Service Fabric cluster resources created or in the process of being created in the resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterListResultInner> listByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Gets all Service Fabric cluster resources created or in the process of being created in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterListResultInner list();

    /**
     * Gets all Service Fabric cluster resources created or in the process of being created in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Service Fabric cluster resources created or in the process of being created in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterListResultInner> listWithResponse(Context context);

    /**
     * If a target is not provided, it will get the minimum and maximum versions available from the current cluster
     * version. If a target is given, it will provide the required path to get from the current cluster version to the
     * target version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of intermediate cluster code versions for an upgrade or downgrade.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UpgradableVersionPathResultInner listUpgradableVersions(String resourceGroupName, String clusterName);

    /**
     * If a target is not provided, it will get the minimum and maximum versions available from the current cluster
     * version. If a target is given, it will provide the required path to get from the current cluster version to the
     * target version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param versionsDescription The upgrade path description with target version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of intermediate cluster code versions for an upgrade or downgrade.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UpgradableVersionPathResultInner> listUpgradableVersionsWithResponse(
        String resourceGroupName,
        String clusterName,
        UpgradableVersionsDescription versionsDescription,
        Context context);
}
