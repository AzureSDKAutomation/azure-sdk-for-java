// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.CheckSystemServicesUpdatesAvailableResponseInner;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.OperationalizationClusterCredentialsInner;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.OperationalizationClusterInner;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.UpdateSystemServicesResponseInner;
import com.azure.resourcemanager.machinelearningcompute.models.OperationalizationClusterUpdateParameters;

/** An instance of this class provides access to all the operations defined in OperationalizationClustersClient. */
public interface OperationalizationClustersClient {
    /**
     * Create or update an operationalization cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param parameters Parameters supplied to create or update an Operationalization cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of an Azure ML Operationalization Cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OperationalizationClusterInner>, OperationalizationClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, OperationalizationClusterInner parameters);

    /**
     * Create or update an operationalization cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param parameters Parameters supplied to create or update an Operationalization cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of an Azure ML Operationalization Cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OperationalizationClusterInner>, OperationalizationClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, OperationalizationClusterInner parameters, Context context);

    /**
     * Create or update an operationalization cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param parameters Parameters supplied to create or update an Operationalization cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of an Azure ML Operationalization Cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationalizationClusterInner createOrUpdate(
        String resourceGroupName, String clusterName, OperationalizationClusterInner parameters);

    /**
     * Create or update an operationalization cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param parameters Parameters supplied to create or update an Operationalization cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of an Azure ML Operationalization Cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationalizationClusterInner createOrUpdate(
        String resourceGroupName, String clusterName, OperationalizationClusterInner parameters, Context context);

    /**
     * Gets the operationalization cluster resource view. Note that the credentials are not returned by this call. Call
     * ListKeys to get them.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operationalization cluster resource view.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationalizationClusterInner getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Gets the operationalization cluster resource view. Note that the credentials are not returned by this call. Call
     * ListKeys to get them.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operationalization cluster resource view.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationalizationClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * The PATCH operation can be used to update only the tags for a cluster. Use PUT operation to update other
     * properties.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters supplied to patch the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of an Azure ML Operationalization Cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationalizationClusterInner update(
        String resourceGroupName, String clusterName, OperationalizationClusterUpdateParameters parameters);

    /**
     * The PATCH operation can be used to update only the tags for a cluster. Use PUT operation to update other
     * properties.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param parameters The parameters supplied to patch the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return instance of an Azure ML Operationalization Cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationalizationClusterInner> updateWithResponse(
        String resourceGroupName,
        String clusterName,
        OperationalizationClusterUpdateParameters parameters,
        Context context);

    /**
     * Deletes the specified cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param deleteAll If true, deletes all resources associated with this cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, Boolean deleteAll);

    /**
     * Deletes the specified cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param deleteAll If true, deletes all resources associated with this cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, Boolean deleteAll, Context context);

    /**
     * Deletes the specified cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param deleteAll If true, deletes all resources associated with this cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, Boolean deleteAll);

    /**
     * Deletes the specified cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName);

    /**
     * Deletes the specified cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param deleteAll If true, deletes all resources associated with this cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, Boolean deleteAll, Context context);

    /**
     * Gets the credentials for the specified cluster such as Storage, ACR and ACS credentials. This is a long running
     * operation because it fetches keys from dependencies.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the credentials for the specified cluster such as Storage, ACR and ACS credentials.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationalizationClusterCredentialsInner listKeys(String resourceGroupName, String clusterName);

    /**
     * Gets the credentials for the specified cluster such as Storage, ACR and ACS credentials. This is a long running
     * operation because it fetches keys from dependencies.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the credentials for the specified cluster such as Storage, ACR and ACS credentials.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationalizationClusterCredentialsInner> listKeysWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Checks if updates are available for system services in the cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about updates available for system services in a cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckSystemServicesUpdatesAvailableResponseInner checkSystemServicesUpdatesAvailable(
        String resourceGroupName, String clusterName);

    /**
     * Checks if updates are available for system services in the cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about updates available for system services in a cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckSystemServicesUpdatesAvailableResponseInner> checkSystemServicesUpdatesAvailableWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Updates system services in a cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of the update system services API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<UpdateSystemServicesResponseInner>, UpdateSystemServicesResponseInner>
        beginUpdateSystemServices(String resourceGroupName, String clusterName);

    /**
     * Updates system services in a cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of the update system services API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<UpdateSystemServicesResponseInner>, UpdateSystemServicesResponseInner>
        beginUpdateSystemServices(String resourceGroupName, String clusterName, Context context);

    /**
     * Updates system services in a cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of the update system services API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UpdateSystemServicesResponseInner updateSystemServices(String resourceGroupName, String clusterName);

    /**
     * Updates system services in a cluster.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of the update system services API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UpdateSystemServicesResponseInner updateSystemServices(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Gets the clusters in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the clusters in the specified resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationalizationClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the clusters in the specified resource group.
     *
     * @param resourceGroupName Name of the resource group in which the cluster is located.
     * @param skiptoken Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the clusters in the specified resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationalizationClusterInner> listByResourceGroup(
        String resourceGroupName, String skiptoken, Context context);

    /**
     * Gets the operationalization clusters in the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operationalization clusters in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationalizationClusterInner> list();

    /**
     * Gets the operationalization clusters in the specified subscription.
     *
     * @param skiptoken Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operationalization clusters in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationalizationClusterInner> list(String skiptoken, Context context);
}
