// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleManagementPolicyInner;

/** Resource collection API of RoleManagementPolicies. */
public interface RoleManagementPolicies {
    /**
     * Get the specified role management policy for a resource scope.
     *
     * @param scope The scope of the role management policy.
     * @param roleManagementPolicyName The name (guid) of the role management policy to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role management policy for a resource scope.
     */
    RoleManagementPolicy get(String scope, String roleManagementPolicyName);

    /**
     * Get the specified role management policy for a resource scope.
     *
     * @param scope The scope of the role management policy.
     * @param roleManagementPolicyName The name (guid) of the role management policy to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role management policy for a resource scope.
     */
    Response<RoleManagementPolicy> getWithResponse(String scope, String roleManagementPolicyName, Context context);

    /**
     * Update a role management policy.
     *
     * @param scope The scope of the role management policy to upsert.
     * @param roleManagementPolicyName The name (guid) of the role management policy to upsert.
     * @param parameters Parameters for the role management policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role management policy.
     */
    RoleManagementPolicy update(String scope, String roleManagementPolicyName, RoleManagementPolicyInner parameters);

    /**
     * Update a role management policy.
     *
     * @param scope The scope of the role management policy to upsert.
     * @param roleManagementPolicyName The name (guid) of the role management policy to upsert.
     * @param parameters Parameters for the role management policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role management policy.
     */
    Response<RoleManagementPolicy> updateWithResponse(
        String scope, String roleManagementPolicyName, RoleManagementPolicyInner parameters, Context context);

    /**
     * Delete a role management policy.
     *
     * @param scope The scope of the role management policy to upsert.
     * @param roleManagementPolicyName The name (guid) of the role management policy to upsert.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String scope, String roleManagementPolicyName);

    /**
     * Delete a role management policy.
     *
     * @param scope The scope of the role management policy to upsert.
     * @param roleManagementPolicyName The name (guid) of the role management policy to upsert.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String scope, String roleManagementPolicyName, Context context);

    /**
     * Gets role management policies for a resource scope.
     *
     * @param scope The scope of the role management policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role management policies for a resource scope.
     */
    PagedIterable<RoleManagementPolicy> listForScope(String scope);

    /**
     * Gets role management policies for a resource scope.
     *
     * @param scope The scope of the role management policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role management policies for a resource scope.
     */
    PagedIterable<RoleManagementPolicy> listForScope(String scope, Context context);
}
