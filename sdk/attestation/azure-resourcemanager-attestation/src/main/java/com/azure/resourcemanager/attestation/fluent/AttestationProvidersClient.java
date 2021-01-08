// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.attestation.fluent.models.AttestationProviderInner;
import com.azure.resourcemanager.attestation.fluent.models.AttestationProviderListResultInner;
import com.azure.resourcemanager.attestation.models.AttestationServiceCreationParams;
import com.azure.resourcemanager.attestation.models.AttestationServicePatchParams;

/** An instance of this class provides access to all the operations defined in AttestationProvidersClient. */
public interface AttestationProvidersClient {
    /**
     * Get the status of Attestation Provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Attestation Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationProviderInner getByResourceGroup(String resourceGroupName, String providerName);

    /**
     * Get the status of Attestation Provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Attestation Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationProviderInner> getByResourceGroupWithResponse(
        String resourceGroupName, String providerName, Context context);

    /**
     * Creates or updates the Attestation Provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service instance.
     * @param creationParams Client supplied parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation service response message.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationProviderInner create(
        String resourceGroupName, String providerName, AttestationServiceCreationParams creationParams);

    /**
     * Creates or updates the Attestation Provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service instance.
     * @param creationParams Client supplied parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation service response message.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationProviderInner> createWithResponse(
        String resourceGroupName,
        String providerName,
        AttestationServiceCreationParams creationParams,
        Context context);

    /**
     * Updates the Attestation Provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service instance.
     * @param updateParams Client supplied parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation service response message.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationProviderInner update(
        String resourceGroupName, String providerName, AttestationServicePatchParams updateParams);

    /**
     * Updates the Attestation Provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service instance.
     * @param updateParams Client supplied parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation service response message.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationProviderInner> updateWithResponse(
        String resourceGroupName, String providerName, AttestationServicePatchParams updateParams, Context context);

    /**
     * Delete Attestation Service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String providerName);

    /**
     * Delete Attestation Service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String providerName, Context context);

    /**
     * Returns a list of attestation providers in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation Providers List.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationProviderListResultInner list();

    /**
     * Returns a list of attestation providers in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation Providers List.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationProviderListResultInner> listWithResponse(Context context);

    /**
     * Returns attestation providers list in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation Providers List.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationProviderListResultInner listByResourceGroup(String resourceGroupName);

    /**
     * Returns attestation providers list in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation Providers List.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationProviderListResultInner> listByResourceGroupWithResponse(
        String resourceGroupName, Context context);

    /**
     * Get the default provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationProviderListResultInner listDefault();

    /**
     * Get the default provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationProviderListResultInner> listDefaultWithResponse(Context context);

    /**
     * Get the default provider by location.
     *
     * @param location The location of the default provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default provider by location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttestationProviderInner getDefaultByLocation(String location);

    /**
     * Get the default provider by location.
     *
     * @param location The location of the default provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default provider by location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttestationProviderInner> getDefaultByLocationWithResponse(String location, Context context);
}
