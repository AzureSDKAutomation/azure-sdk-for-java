// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managedservices.fluent.models.RegistrationDefinitionInner;

/** An instance of this class provides access to all the operations defined in RegistrationDefinitionsClient. */
public interface RegistrationDefinitionsClient {
    /**
     * Gets the registration definition details.
     *
     * @param scope Scope of the resource.
     * @param registrationDefinitionId Guid of the registration definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the registration definition details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistrationDefinitionInner get(String scope, String registrationDefinitionId);

    /**
     * Gets the registration definition details.
     *
     * @param scope Scope of the resource.
     * @param registrationDefinitionId Guid of the registration definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the registration definition details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RegistrationDefinitionInner> getWithResponse(
        String scope, String registrationDefinitionId, Context context);

    /**
     * Deletes the registration definition.
     *
     * @param registrationDefinitionId Guid of the registration definition.
     * @param scope Scope of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String registrationDefinitionId, String scope);

    /**
     * Deletes the registration definition.
     *
     * @param registrationDefinitionId Guid of the registration definition.
     * @param scope Scope of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String registrationDefinitionId, String scope, Context context);

    /**
     * Creates or updates a registration definition.
     *
     * @param registrationDefinitionId Guid of the registration definition.
     * @param scope Scope of the resource.
     * @param requestBody The parameters required to create new registration definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return registration definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RegistrationDefinitionInner>, RegistrationDefinitionInner> beginCreateOrUpdate(
        String registrationDefinitionId, String scope, RegistrationDefinitionInner requestBody);

    /**
     * Creates or updates a registration definition.
     *
     * @param registrationDefinitionId Guid of the registration definition.
     * @param scope Scope of the resource.
     * @param requestBody The parameters required to create new registration definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return registration definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RegistrationDefinitionInner>, RegistrationDefinitionInner> beginCreateOrUpdate(
        String registrationDefinitionId, String scope, RegistrationDefinitionInner requestBody, Context context);

    /**
     * Creates or updates a registration definition.
     *
     * @param registrationDefinitionId Guid of the registration definition.
     * @param scope Scope of the resource.
     * @param requestBody The parameters required to create new registration definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return registration definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistrationDefinitionInner createOrUpdate(
        String registrationDefinitionId, String scope, RegistrationDefinitionInner requestBody);

    /**
     * Creates or updates a registration definition.
     *
     * @param registrationDefinitionId Guid of the registration definition.
     * @param scope Scope of the resource.
     * @param requestBody The parameters required to create new registration definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return registration definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistrationDefinitionInner createOrUpdate(
        String registrationDefinitionId, String scope, RegistrationDefinitionInner requestBody, Context context);

    /**
     * Gets a list of the registration definitions.
     *
     * @param scope Scope of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the registration definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegistrationDefinitionInner> list(String scope);

    /**
     * Gets a list of the registration definitions.
     *
     * @param scope Scope of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the registration definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegistrationDefinitionInner> list(String scope, Context context);
}
