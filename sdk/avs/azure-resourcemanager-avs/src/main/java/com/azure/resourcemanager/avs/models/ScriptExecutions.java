// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of ScriptExecutions. */
public interface ScriptExecutions {
    /**
     * Get an script execution resource by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an script execution resource by name in a private cloud.
     */
    PagedIterable<ScriptExecution> list(String resourceGroupName, String privateCloudName);

    /**
     * Get an script execution resource by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an script execution resource by name in a private cloud.
     */
    PagedIterable<ScriptExecution> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get an script execution resource by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptExecutionName Name of the user-invoked script execution resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an script execution resource by name in a private cloud.
     */
    ScriptExecution get(String resourceGroupName, String privateCloudName, String scriptExecutionName);

    /**
     * Get an script execution resource by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptExecutionName Name of the user-invoked script execution resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an script execution resource by name in a private cloud.
     */
    Response<ScriptExecution> getWithResponse(
        String resourceGroupName, String privateCloudName, String scriptExecutionName, Context context);

    /**
     * Cancel a ScriptExecution in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptExecutionName Name of the user-invoked script execution resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String privateCloudName, String scriptExecutionName);

    /**
     * Cancel a ScriptExecution in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptExecutionName Name of the user-invoked script execution resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String privateCloudName, String scriptExecutionName, Context context);

    /**
     * Return the logs for a script execution resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptExecutionName Name of the user-invoked script execution resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance of a script executed by a user - custom or AVS.
     */
    ScriptExecution getExecutionLogs(String resourceGroupName, String privateCloudName, String scriptExecutionName);

    /**
     * Return the logs for a script execution resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param scriptExecutionName Name of the user-invoked script execution resource.
     * @param scriptOutputStreamType Name of the desired output stream to return. If not provided, will return all. An
     *     empty array will return nothing.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance of a script executed by a user - custom or AVS.
     */
    Response<ScriptExecution> getExecutionLogsWithResponse(
        String resourceGroupName,
        String privateCloudName,
        String scriptExecutionName,
        List<ScriptOutputStreamType> scriptOutputStreamType,
        Context context);

    /**
     * Get an script execution resource by name in a private cloud.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an script execution resource by name in a private cloud.
     */
    ScriptExecution getById(String id);

    /**
     * Get an script execution resource by name in a private cloud.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an script execution resource by name in a private cloud.
     */
    Response<ScriptExecution> getByIdWithResponse(String id, Context context);

    /**
     * Cancel a ScriptExecution in a private cloud.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Cancel a ScriptExecution in a private cloud.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ScriptExecution resource.
     *
     * @param name resource name.
     * @return the first stage of the new ScriptExecution definition.
     */
    ScriptExecution.DefinitionStages.Blank define(String name);
}
