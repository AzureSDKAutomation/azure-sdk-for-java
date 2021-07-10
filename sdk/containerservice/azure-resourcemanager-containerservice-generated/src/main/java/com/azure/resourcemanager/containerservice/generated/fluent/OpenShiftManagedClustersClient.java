// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerservice.generated.fluent.models.OpenShiftManagedClusterInner;
import com.azure.resourcemanager.containerservice.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in OpenShiftManagedClustersClient. */
public interface OpenShiftManagedClustersClient {
    /**
     * Gets a list of OpenShift managed clusters in the specified subscription. The operation returns properties of each
     * OpenShift managed cluster.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of OpenShift managed clusters in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OpenShiftManagedClusterInner> list();

    /**
     * Gets a list of OpenShift managed clusters in the specified subscription. The operation returns properties of each
     * OpenShift managed cluster.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of OpenShift managed clusters in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OpenShiftManagedClusterInner> list(Context context);

    /**
     * Lists OpenShift managed clusters in the specified subscription and resource group. The operation returns
     * properties of each OpenShift managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List OpenShift Managed Clusters operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OpenShiftManagedClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists OpenShift managed clusters in the specified subscription and resource group. The operation returns
     * properties of each OpenShift managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List OpenShift Managed Clusters operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OpenShiftManagedClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the details of the managed OpenShift cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the managed OpenShift cluster with a specified resource group and name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenShiftManagedClusterInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Gets the details of the managed OpenShift cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the managed OpenShift cluster with a specified resource group and name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OpenShiftManagedClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Creates or updates a OpenShift managed cluster with the specified configuration for agents and OpenShift version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param parameters Parameters supplied to the Create or Update an OpenShift Managed Cluster operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShift Managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OpenShiftManagedClusterInner>, OpenShiftManagedClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String resourceName, OpenShiftManagedClusterInner parameters);

    /**
     * Creates or updates a OpenShift managed cluster with the specified configuration for agents and OpenShift version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param parameters Parameters supplied to the Create or Update an OpenShift Managed Cluster operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShift Managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OpenShiftManagedClusterInner>, OpenShiftManagedClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String resourceName, OpenShiftManagedClusterInner parameters, Context context);

    /**
     * Creates or updates a OpenShift managed cluster with the specified configuration for agents and OpenShift version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param parameters Parameters supplied to the Create or Update an OpenShift Managed Cluster operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShift Managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenShiftManagedClusterInner createOrUpdate(
        String resourceGroupName, String resourceName, OpenShiftManagedClusterInner parameters);

    /**
     * Creates or updates a OpenShift managed cluster with the specified configuration for agents and OpenShift version.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param parameters Parameters supplied to the Create or Update an OpenShift Managed Cluster operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShift Managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenShiftManagedClusterInner createOrUpdate(
        String resourceGroupName, String resourceName, OpenShiftManagedClusterInner parameters, Context context);

    /**
     * Updates an OpenShift managed cluster with the specified tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param parameters Parameters supplied to the Update OpenShift Managed Cluster Tags operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShift Managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OpenShiftManagedClusterInner>, OpenShiftManagedClusterInner> beginUpdateTags(
        String resourceGroupName, String resourceName, TagsObject parameters);

    /**
     * Updates an OpenShift managed cluster with the specified tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param parameters Parameters supplied to the Update OpenShift Managed Cluster Tags operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShift Managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OpenShiftManagedClusterInner>, OpenShiftManagedClusterInner> beginUpdateTags(
        String resourceGroupName, String resourceName, TagsObject parameters, Context context);

    /**
     * Updates an OpenShift managed cluster with the specified tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param parameters Parameters supplied to the Update OpenShift Managed Cluster Tags operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShift Managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenShiftManagedClusterInner updateTags(String resourceGroupName, String resourceName, TagsObject parameters);

    /**
     * Updates an OpenShift managed cluster with the specified tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param parameters Parameters supplied to the Update OpenShift Managed Cluster Tags operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShift Managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OpenShiftManagedClusterInner updateTags(
        String resourceGroupName, String resourceName, TagsObject parameters, Context context);

    /**
     * Deletes the OpenShift managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName);

    /**
     * Deletes the OpenShift managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName, Context context);

    /**
     * Deletes the OpenShift managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Deletes the OpenShift managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the OpenShift managed cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, Context context);
}
