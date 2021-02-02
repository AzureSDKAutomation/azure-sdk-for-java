// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.powerplatform.fluent.models.EnterprisePolicyInner;

/** An instance of this class provides access to all the operations defined in EnterprisePoliciesClient. */
public interface EnterprisePoliciesClient {
    /**
     * Creates an EnterprisePolicy.
     *
     * @param enterprisePolicyName Name of the EnterprisePolicy.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters supplied to create or update EnterprisePolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the EnterprisePolicy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnterprisePolicyInner createOrUpdate(
        String enterprisePolicyName, String resourceGroupName, EnterprisePolicyInner parameters);

    /**
     * Creates an EnterprisePolicy.
     *
     * @param enterprisePolicyName Name of the EnterprisePolicy.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters supplied to create or update EnterprisePolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the EnterprisePolicy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnterprisePolicyInner> createOrUpdateWithResponse(
        String enterprisePolicyName, String resourceGroupName, EnterprisePolicyInner parameters, Context context);

    /**
     * Get information about an EnterprisePolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName The EnterprisePolicy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an EnterprisePolicy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnterprisePolicyInner getByResourceGroup(String resourceGroupName, String enterprisePolicyName);

    /**
     * Get information about an EnterprisePolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName The EnterprisePolicy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an EnterprisePolicy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnterprisePolicyInner> getByResourceGroupWithResponse(
        String resourceGroupName, String enterprisePolicyName, Context context);

    /**
     * Delete an EnterprisePolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName Name of the EnterprisePolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String enterprisePolicyName);

    /**
     * Delete an EnterprisePolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName Name of the EnterprisePolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String enterprisePolicyName, Context context);

    /**
     * Updates an EnterprisePolicy.
     *
     * @param enterprisePolicyName Name of the EnterprisePolicy.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters supplied to update EnterprisePolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the EnterprisePolicy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnterprisePolicyInner update(
        String enterprisePolicyName, String resourceGroupName, EnterprisePolicyInner parameters);

    /**
     * Updates an EnterprisePolicy.
     *
     * @param enterprisePolicyName Name of the EnterprisePolicy.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters supplied to update EnterprisePolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the EnterprisePolicy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnterprisePolicyInner> updateWithResponse(
        String enterprisePolicyName, String resourceGroupName, EnterprisePolicyInner parameters, Context context);

    /**
     * Retrieve a list of EnterprisePolicies within a given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list EnterprisePolicy operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnterprisePolicyInner> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieve a list of EnterprisePolicies within a given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list EnterprisePolicy operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnterprisePolicyInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve a list of EnterprisePolicies within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list EnterprisePolicy operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnterprisePolicyInner> list();

    /**
     * Retrieve a list of EnterprisePolicies within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list EnterprisePolicy operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnterprisePolicyInner> list(Context context);
}
