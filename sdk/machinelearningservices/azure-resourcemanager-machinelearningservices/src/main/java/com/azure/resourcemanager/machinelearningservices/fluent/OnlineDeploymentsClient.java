// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.DeploymentLogsInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.OnlineDeploymentPropertiesTrackedResourceInner;
import com.azure.resourcemanager.machinelearningservices.models.DeploymentLogsRequest;

/** An instance of this class provides access to all the operations defined in OnlineDeploymentsClient. */
public interface OnlineDeploymentsClient {
    /**
     * List Inference Endpoint Deployments.
     *
     * @param endpointName Inference endpoint name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of OnlineDeploymentProperties entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OnlineDeploymentPropertiesTrackedResourceInner> list(
        String endpointName, String resourceGroupName, String workspaceName);

    /**
     * List Inference Endpoint Deployments.
     *
     * @param endpointName Inference endpoint name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param skiptoken Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of OnlineDeploymentProperties entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OnlineDeploymentPropertiesTrackedResourceInner> list(
        String endpointName, String resourceGroupName, String workspaceName, String skiptoken, Context context);

    /**
     * Delete Inference Endpoint Deployment.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String endpointName, String deploymentName, String resourceGroupName, String workspaceName);

    /**
     * Delete Inference Endpoint Deployment.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String endpointName, String deploymentName, String resourceGroupName, String workspaceName, Context context);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnlineDeploymentPropertiesTrackedResourceInner get(
        String endpointName, String deploymentName, String resourceGroupName, String workspaceName);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OnlineDeploymentPropertiesTrackedResourceInner> getWithResponse(
        String endpointName, String deploymentName, String resourceGroupName, String workspaceName, Context context);

    /**
     * Create or update Inference Endpoint Deployment.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnlineDeploymentPropertiesTrackedResourceInner createOrUpdate(
        String endpointName, String deploymentName, String resourceGroupName, String workspaceName);

    /**
     * Create or update Inference Endpoint Deployment.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param body Inference Endpoint entity to apply during operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OnlineDeploymentPropertiesTrackedResourceInner> createOrUpdateWithResponse(
        String endpointName,
        String deploymentName,
        String resourceGroupName,
        String workspaceName,
        OnlineDeploymentPropertiesTrackedResourceInner body,
        Context context);

    /**
     * Polls an Endpoint operation.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName The name and identifier for the endpoint.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeploymentLogsInner getLogs(
        String endpointName, String deploymentName, String resourceGroupName, String workspaceName);

    /**
     * Polls an Endpoint operation.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName The name and identifier for the endpoint.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param body The request containing parameters for retrieving logs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeploymentLogsInner> getLogsWithResponse(
        String endpointName,
        String deploymentName,
        String resourceGroupName,
        String workspaceName,
        DeploymentLogsRequest body,
        Context context);

    /**
     * Polls an Endpoint operation.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName The name and identifier for the endpoint.
     * @param operationId The operation ID of the async operation to be polled.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OnlineDeploymentPropertiesTrackedResourceInner poll(
        String endpointName, String deploymentName, String operationId, String resourceGroupName, String workspaceName);

    /**
     * Polls an Endpoint operation.
     *
     * @param endpointName Inference endpoint name.
     * @param deploymentName The name and identifier for the endpoint.
     * @param operationId The operation ID of the async operation to be polled.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OnlineDeploymentPropertiesTrackedResourceInner> pollWithResponse(
        String endpointName,
        String deploymentName,
        String operationId,
        String resourceGroupName,
        String workspaceName,
        Context context);
}
