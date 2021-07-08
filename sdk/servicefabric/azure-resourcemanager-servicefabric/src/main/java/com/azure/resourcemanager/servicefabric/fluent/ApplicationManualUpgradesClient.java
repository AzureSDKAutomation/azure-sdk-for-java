// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabric.models.ResumeApplicationUpgradeDescription;

/** An instance of this class provides access to all the operations defined in ApplicationManualUpgradesClient. */
public interface ApplicationManualUpgradesClient {
    /**
     * Resume manual upgrade for a Service Fabric application resource with the specified upgrade domain.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters Resume application upgrade description with the target upgrade domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationResourceInner>, ApplicationResourceInner> beginUpgrade(
        String resourceGroupName,
        String clusterName,
        String applicationName,
        ResumeApplicationUpgradeDescription parameters);

    /**
     * Resume manual upgrade for a Service Fabric application resource with the specified upgrade domain.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters Resume application upgrade description with the target upgrade domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationResourceInner>, ApplicationResourceInner> beginUpgrade(
        String resourceGroupName,
        String clusterName,
        String applicationName,
        ResumeApplicationUpgradeDescription parameters,
        Context context);

    /**
     * Resume manual upgrade for a Service Fabric application resource with the specified upgrade domain.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters Resume application upgrade description with the target upgrade domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationResourceInner upgrade(
        String resourceGroupName,
        String clusterName,
        String applicationName,
        ResumeApplicationUpgradeDescription parameters);

    /**
     * Resume manual upgrade for a Service Fabric application resource with the specified upgrade domain.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters Resume application upgrade description with the target upgrade domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationResourceInner upgrade(
        String resourceGroupName,
        String clusterName,
        String applicationName,
        ResumeApplicationUpgradeDescription parameters,
        Context context);
}
