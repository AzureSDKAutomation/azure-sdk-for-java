// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IntegrationRuntimeNodes. */
public interface IntegrationRuntimeNodes {
    /**
     * Get an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param nodeName Integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime node.
     */
    SelfHostedIntegrationRuntimeNode get(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName);

    /**
     * Get an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param nodeName Integration runtime node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration runtime node.
     */
    Response<SelfHostedIntegrationRuntimeNode> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        Context context);

    /**
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param nodeName Integration runtime node name.
     * @param updateIntegrationRuntimeNodeRequest The parameters for updating an integration runtime node.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of Self-hosted integration runtime node.
     */
    SelfHostedIntegrationRuntimeNode update(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest);

    /**
     * Create an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param nodeName Integration runtime node name.
     * @param updateIntegrationRuntimeNodeRequest The parameters for updating an integration runtime node.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of Self-hosted integration runtime node.
     */
    Response<SelfHostedIntegrationRuntimeNode> updateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest,
        Context context);

    /**
     * Delete an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param nodeName Integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName);

    /**
     * Delete an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param nodeName Integration runtime node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        Context context);
}
