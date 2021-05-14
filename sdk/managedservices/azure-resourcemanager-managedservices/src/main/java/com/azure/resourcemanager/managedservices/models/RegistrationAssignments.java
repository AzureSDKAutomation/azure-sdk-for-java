// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RegistrationAssignments. */
public interface RegistrationAssignments {
    /**
     * Gets the details of specified registration assignment.
     *
     * @param scope Scope of the resource.
     * @param registrationAssignmentId Guid of the registration assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified registration assignment.
     */
    RegistrationAssignment get(String scope, String registrationAssignmentId);

    /**
     * Gets the details of specified registration assignment.
     *
     * @param scope Scope of the resource.
     * @param registrationAssignmentId Guid of the registration assignment.
     * @param expandRegistrationDefinition Tells whether to return registration definition details also along with
     *     registration assignment details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified registration assignment.
     */
    Response<RegistrationAssignment> getWithResponse(
        String scope, String registrationAssignmentId, Boolean expandRegistrationDefinition, Context context);

    /**
     * Deletes the specified registration assignment.
     *
     * @param scope Scope of the resource.
     * @param registrationAssignmentId Guid of the registration assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String scope, String registrationAssignmentId);

    /**
     * Deletes the specified registration assignment.
     *
     * @param scope Scope of the resource.
     * @param registrationAssignmentId Guid of the registration assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String scope, String registrationAssignmentId, Context context);

    /**
     * Gets a list of the registration assignments.
     *
     * @param scope Scope of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the registration assignments.
     */
    PagedIterable<RegistrationAssignment> list(String scope);

    /**
     * Gets a list of the registration assignments.
     *
     * @param scope Scope of the resource.
     * @param expandRegistrationDefinition Tells whether to return registration definition details also along with
     *     registration assignment details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the registration assignments.
     */
    PagedIterable<RegistrationAssignment> list(String scope, Boolean expandRegistrationDefinition, Context context);

    /**
     * Gets the details of specified registration assignment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified registration assignment.
     */
    RegistrationAssignment getById(String id);

    /**
     * Gets the details of specified registration assignment.
     *
     * @param id the resource ID.
     * @param expandRegistrationDefinition Tells whether to return registration definition details also along with
     *     registration assignment details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified registration assignment.
     */
    Response<RegistrationAssignment> getByIdWithResponse(
        String id, Boolean expandRegistrationDefinition, Context context);

    /**
     * Deletes the specified registration assignment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified registration assignment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RegistrationAssignment resource.
     *
     * @param name resource name.
     * @return the first stage of the new RegistrationAssignment definition.
     */
    RegistrationAssignment.DefinitionStages.Blank define(String name);
}
