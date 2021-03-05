// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.PolicyInner;
import com.azure.resourcemanager.devtestlabs.models.UpdateResource;

/** An instance of this class provides access to all the operations defined in PoliciesClient. */
public interface PoliciesClient {
    /**
     * List policies in a given policy set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyInner> list(String resourceGroupName, String labName, String policySetName);

    /**
     * List policies in a given policy set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param expand Specify the $expand query. Example: 'properties($select=description)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyInner> list(
        String resourceGroupName,
        String labName,
        String policySetName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyInner get(String resourceGroupName, String labName, String policySetName, String name);

    /**
     * Get policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @param expand Specify the $expand query. Example: 'properties($select=description)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyInner> getWithResponse(
        String resourceGroupName, String labName, String policySetName, String name, String expand, Context context);

    /**
     * Create or replace an existing policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @param policy A Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyInner createOrUpdate(
        String resourceGroupName, String labName, String policySetName, String name, PolicyInner policy);

    /**
     * Create or replace an existing policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @param policy A Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String labName,
        String policySetName,
        String name,
        PolicyInner policy,
        Context context);

    /**
     * Delete policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String policySetName, String name);

    /**
     * Delete policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String labName, String policySetName, String name, Context context);

    /**
     * Allows modifying tags of policies. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @param policy A Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyInner update(
        String resourceGroupName, String labName, String policySetName, String name, UpdateResource policy);

    /**
     * Allows modifying tags of policies. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @param policy A Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyInner> updateWithResponse(
        String resourceGroupName,
        String labName,
        String policySetName,
        String name,
        UpdateResource policy,
        Context context);
}
