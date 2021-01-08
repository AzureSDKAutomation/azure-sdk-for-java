// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.JobBaseResourceInner;

/** An instance of this class provides access to all the operations defined in JobsClient. */
public interface JobsClient {
    /**
     * Creates and executes a Job.
     *
     * @param id The name and identifier for the Job.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobBaseResourceInner createOrUpdate(String id, String resourceGroupName, String workspaceName);

    /**
     * Creates and executes a Job.
     *
     * @param id The name and identifier for the Job.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param body Job definition object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobBaseResourceInner> createOrUpdateWithResponse(
        String id, String resourceGroupName, String workspaceName, JobBaseResourceInner body, Context context);

    /**
     * Gets a Job by name/id.
     *
     * @param id The name and identifier for the Job.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job by name/id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobBaseResourceInner get(String id, String resourceGroupName, String workspaceName);

    /**
     * Gets a Job by name/id.
     *
     * @param id The name and identifier for the Job.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job by name/id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobBaseResourceInner> getWithResponse(
        String id, String resourceGroupName, String workspaceName, Context context);

    /**
     * Deletes a Job.
     *
     * @param id The name and identifier for the Job.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String id, String resourceGroupName, String workspaceName);

    /**
     * Deletes a Job.
     *
     * @param id The name and identifier for the Job.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String id, String resourceGroupName, String workspaceName, Context context);

    /**
     * Lists Jobs in the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of JobBase entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobBaseResourceInner> list(String resourceGroupName, String workspaceName);

    /**
     * Lists Jobs in the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param skiptoken Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of JobBase entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobBaseResourceInner> list(
        String resourceGroupName, String workspaceName, String skiptoken, Context context);

    /**
     * Cancels a Job.
     *
     * @param id The name and identifier for the Job.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(String id, String resourceGroupName, String workspaceName);

    /**
     * Cancels a Job.
     *
     * @param id The name and identifier for the Job.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> cancelWithResponse(String id, String resourceGroupName, String workspaceName, Context context);

    /**
     * Polls a Job operation.
     *
     * @param id The name and identifier for the Job.
     * @param operationId The operation ID of the async operation to be polled.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void poll(String id, String operationId, String resourceGroupName, String workspaceName);

    /**
     * Polls a Job operation.
     *
     * @param id The name and identifier for the Job.
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
    Response<Void> pollWithResponse(
        String id, String operationId, String resourceGroupName, String workspaceName, Context context);
}
