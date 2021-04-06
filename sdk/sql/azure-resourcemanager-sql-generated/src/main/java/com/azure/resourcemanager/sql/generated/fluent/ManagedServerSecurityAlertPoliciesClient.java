// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyNameAutoGenerated;

/**
 * An instance of this class provides access to all the operations defined in ManagedServerSecurityAlertPoliciesClient.
 */
public interface ManagedServerSecurityAlertPoliciesClient {
    /**
     * Get a managed server's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedServerSecurityAlertPolicyInner get(
        String resourceGroupName,
        String managedInstanceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName);

    /**
     * Get a managed server's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedServerSecurityAlertPolicyInner> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        Context context);

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedServerSecurityAlertPolicyInner>, ManagedServerSecurityAlertPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
            ManagedServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The managed server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedServerSecurityAlertPolicyInner>, ManagedServerSecurityAlertPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String managedInstanceName,
            SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
            ManagedServerSecurityAlertPolicyInner parameters,
            Context context);

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The managed server security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedServerSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        ManagedServerSecurityAlertPolicyInner parameters);

    /**
     * Creates or updates a threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param securityAlertPolicyName The name of the security alert policy.
     * @param parameters The managed server security alert policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed server security alert policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedServerSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String managedInstanceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        ManagedServerSecurityAlertPolicyInner parameters,
        Context context);

    /**
     * Get the managed server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed server's threat detection policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedServerSecurityAlertPolicyInner> listByInstance(
        String resourceGroupName, String managedInstanceName);

    /**
     * Get the managed server's threat detection policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managed server's threat detection policies.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedServerSecurityAlertPolicyInner> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context);
}
