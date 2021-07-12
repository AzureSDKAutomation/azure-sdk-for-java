// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Files. */
public interface Files {
    /**
     * The project resource is a nested resource representing a stored migration project. This method returns a list of
     * files owned by a project resource.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of files.
     */
    PagedIterable<ProjectFile> list(String groupName, String serviceName, String projectName);

    /**
     * The project resource is a nested resource representing a stored migration project. This method returns a list of
     * files owned by a project resource.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return oData page of files.
     */
    PagedIterable<ProjectFile> list(String groupName, String serviceName, String projectName, Context context);

    /**
     * The files resource is a nested, proxy-only resource representing a file stored under the project resource. This
     * method retrieves information about a file.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param fileName Name of the File.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a file resource.
     */
    ProjectFile get(String groupName, String serviceName, String projectName, String fileName);

    /**
     * The files resource is a nested, proxy-only resource representing a file stored under the project resource. This
     * method retrieves information about a file.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param fileName Name of the File.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a file resource.
     */
    Response<ProjectFile> getWithResponse(
        String groupName, String serviceName, String projectName, String fileName, Context context);

    /**
     * This method deletes a file.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param fileName Name of the File.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String groupName, String serviceName, String projectName, String fileName);

    /**
     * This method deletes a file.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param fileName Name of the File.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String groupName, String serviceName, String projectName, String fileName, Context context);

    /**
     * This method is used for requesting storage information using which contents of the file can be downloaded.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param fileName Name of the File.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return file storage information.
     */
    FileStorageInfo read(String groupName, String serviceName, String projectName, String fileName);

    /**
     * This method is used for requesting storage information using which contents of the file can be downloaded.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param fileName Name of the File.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return file storage information.
     */
    Response<FileStorageInfo> readWithResponse(
        String groupName, String serviceName, String projectName, String fileName, Context context);

    /**
     * This method is used for requesting information for reading and writing the file content.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param fileName Name of the File.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return file storage information.
     */
    FileStorageInfo readWrite(String groupName, String serviceName, String projectName, String fileName);

    /**
     * This method is used for requesting information for reading and writing the file content.
     *
     * @param groupName Name of the resource group.
     * @param serviceName Name of the service.
     * @param projectName Name of the project.
     * @param fileName Name of the File.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return file storage information.
     */
    Response<FileStorageInfo> readWriteWithResponse(
        String groupName, String serviceName, String projectName, String fileName, Context context);

    /**
     * The files resource is a nested, proxy-only resource representing a file stored under the project resource. This
     * method retrieves information about a file.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a file resource.
     */
    ProjectFile getById(String id);

    /**
     * The files resource is a nested, proxy-only resource representing a file stored under the project resource. This
     * method retrieves information about a file.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a file resource.
     */
    Response<ProjectFile> getByIdWithResponse(String id, Context context);

    /**
     * This method deletes a file.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * This method deletes a file.
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
     * Begins definition for a new ProjectFile resource.
     *
     * @param name resource name.
     * @return the first stage of the new ProjectFile definition.
     */
    ProjectFile.DefinitionStages.Blank define(String name);
}
