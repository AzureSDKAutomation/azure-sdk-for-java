// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of OnlineDeployments. */
public interface OnlineDeployments {
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
    PagedIterable<OnlineDeploymentPropertiesTrackedResource> list(
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
    PagedIterable<OnlineDeploymentPropertiesTrackedResource> list(
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
    OnlineDeploymentPropertiesTrackedResource get(
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
    Response<OnlineDeploymentPropertiesTrackedResource> getWithResponse(
        String endpointName, String deploymentName, String resourceGroupName, String workspaceName, Context context);

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
    DeploymentLogs getLogs(String endpointName, String deploymentName, String resourceGroupName, String workspaceName);

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
    Response<DeploymentLogs> getLogsWithResponse(
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
    OnlineDeploymentPropertiesTrackedResource poll(
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
    Response<OnlineDeploymentPropertiesTrackedResource> pollWithResponse(
        String endpointName,
        String deploymentName,
        String operationId,
        String resourceGroupName,
        String workspaceName,
        Context context);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment.
     */
    OnlineDeploymentPropertiesTrackedResource getById(String id);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment.
     */
    Response<OnlineDeploymentPropertiesTrackedResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete Inference Endpoint Deployment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete Inference Endpoint Deployment.
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
     * Begins definition for a new OnlineDeploymentPropertiesTrackedResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new OnlineDeploymentPropertiesTrackedResource definition.
     */
    OnlineDeploymentPropertiesTrackedResource.DefinitionStages.Blank define(String name);
}
