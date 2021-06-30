// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Projects. */
public interface Projects {
    /**
     * The project resource is a nested resource representing a stored migration project. This method returns a list of
     * projects owned by a service resource.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of project resources.
     */
    PagedIterable<Project> list(String groupName, String serviceName);

    /**
     * The project resource is a nested resource representing a stored migration project. This method returns a list of
     * projects owned by a service resource.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of project resources.
     */
    PagedIterable<Project> list(String groupName, String serviceName, Context context);

    /**
     * The project resource is a nested resource representing a stored migration project. The GET method retrieves
     * information about a project.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource.
     */
    Project get(String groupName, String serviceName, String projectName);

    /**
     * The project resource is a nested resource representing a stored migration project. The GET method retrieves
     * information about a project.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource.
     */
    Response<Project> getWithResponse(String groupName, String serviceName, String projectName, Context context);

    /**
     * The project resource is a nested resource representing a stored migration project. The DELETE method deletes a
     * project.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String groupName, String serviceName, String projectName);

    /**
     * The project resource is a nested resource representing a stored migration project. The DELETE method deletes a
     * project.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param deleteRunningTasks Delete the resource even if it contains running tasks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String groupName, String serviceName, String projectName, Boolean deleteRunningTasks, Context context);

    /**
     * The project resource is a nested resource representing a stored migration project. The GET method retrieves
     * information about a project.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource.
     */
    Project getById(String id);

    /**
     * The project resource is a nested resource representing a stored migration project. The GET method retrieves
     * information about a project.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project resource.
     */
    Response<Project> getByIdWithResponse(String id, Context context);

    /**
     * The project resource is a nested resource representing a stored migration project. The DELETE method deletes a
     * project.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The project resource is a nested resource representing a stored migration project. The DELETE method deletes a
     * project.
     *
     * @param id the resource ID.
     * @param deleteRunningTasks Delete the resource even if it contains running tasks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Boolean deleteRunningTasks, Context context);

    /**
     * Begins definition for a new Project resource.
     *
     * @param name resource name.
     * @return the first stage of the new Project definition.
     */
    Project.DefinitionStages.Blank define(String name);
}
