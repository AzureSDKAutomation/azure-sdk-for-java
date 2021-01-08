// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ModelVersions. */
public interface ModelVersions {
    /**
     * List model versions.
     *
     * @param name Model name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of ModelVersion entities.
     */
    PagedIterable<ModelVersionResource> list(String name, String resourceGroupName, String workspaceName);

    /**
     * List model versions.
     *
     * @param name Model name.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param skiptoken Continuation token for pagination.
     * @param version Model version.
     * @param description Model description.
     * @param count Maximum number of results to return.
     * @param offset Number of initial results to skip.
     * @param tags Comma-separated list of tag names (and optionally values). Example: tag1,tag2=value2.
     * @param properties Comma-separated list of property names (and optionally values). Example: prop1,prop2=value2.
     * @param orderBy Property by which to order the results.
     * @param latestVersionOnly Only return the most recent version of a model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of ModelVersion entities.
     */
    PagedIterable<ModelVersionResource> list(
        String name,
        String resourceGroupName,
        String workspaceName,
        String skiptoken,
        String version,
        String description,
        Integer count,
        Integer offset,
        String tags,
        String properties,
        String orderBy,
        Boolean latestVersionOnly,
        Context context);

    /**
     * Get version.
     *
     * @param name Container name.
     * @param version Version identifier.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version.
     */
    ModelVersionResource get(String name, String version, String resourceGroupName, String workspaceName);

    /**
     * Get version.
     *
     * @param name Container name.
     * @param version Version identifier.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version.
     */
    Response<ModelVersionResource> getWithResponse(
        String name, String version, String resourceGroupName, String workspaceName, Context context);

    /**
     * Delete version.
     *
     * @param name Container name.
     * @param version Version identifier.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String name, String version, String resourceGroupName, String workspaceName);

    /**
     * Delete version.
     *
     * @param name Container name.
     * @param version Version identifier.
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String name, String version, String resourceGroupName, String workspaceName, Context context);

    /**
     * Get version.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version.
     */
    ModelVersionResource getById(String id);

    /**
     * Get version.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version.
     */
    Response<ModelVersionResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete version.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete version.
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
     * Begins definition for a new ModelVersionResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ModelVersionResource definition.
     */
    ModelVersionResource.DefinitionStages.Blank define(String name);
}
