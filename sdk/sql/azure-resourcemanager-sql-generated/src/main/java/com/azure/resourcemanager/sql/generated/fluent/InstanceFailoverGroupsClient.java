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
import com.azure.resourcemanager.sql.generated.fluent.models.InstanceFailoverGroupInner;

/** An instance of this class provides access to all the operations defined in InstanceFailoverGroupsClient. */
public interface InstanceFailoverGroupsClient {
    /**
     * Gets a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstanceFailoverGroupInner get(String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Gets a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<InstanceFailoverGroupInner> getWithResponse(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Creates or updates a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param parameters An instance failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InstanceFailoverGroupInner>, InstanceFailoverGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String locationName, String failoverGroupName, InstanceFailoverGroupInner parameters);

    /**
     * Creates or updates a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param parameters An instance failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InstanceFailoverGroupInner>, InstanceFailoverGroupInner> beginCreateOrUpdate(
        String resourceGroupName,
        String locationName,
        String failoverGroupName,
        InstanceFailoverGroupInner parameters,
        Context context);

    /**
     * Creates or updates a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param parameters An instance failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstanceFailoverGroupInner createOrUpdate(
        String resourceGroupName, String locationName, String failoverGroupName, InstanceFailoverGroupInner parameters);

    /**
     * Creates or updates a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param parameters An instance failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstanceFailoverGroupInner createOrUpdate(
        String resourceGroupName,
        String locationName,
        String failoverGroupName,
        InstanceFailoverGroupInner parameters,
        Context context);

    /**
     * Deletes a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Deletes a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Deletes a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Deletes a failover group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Lists the failover groups in a location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of instance failover groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InstanceFailoverGroupInner> listByLocation(String resourceGroupName, String locationName);

    /**
     * Lists the failover groups in a location.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of instance failover groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InstanceFailoverGroupInner> listByLocation(
        String resourceGroupName, String locationName, Context context);

    /**
     * Fails over from the current primary managed instance to this managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InstanceFailoverGroupInner>, InstanceFailoverGroupInner> beginFailover(
        String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Fails over from the current primary managed instance to this managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InstanceFailoverGroupInner>, InstanceFailoverGroupInner> beginFailover(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Fails over from the current primary managed instance to this managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstanceFailoverGroupInner failover(String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Fails over from the current primary managed instance to this managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstanceFailoverGroupInner failover(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Fails over from the current primary managed instance to this managed instance. This operation might result in
     * data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InstanceFailoverGroupInner>, InstanceFailoverGroupInner> beginForceFailoverAllowDataLoss(
        String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Fails over from the current primary managed instance to this managed instance. This operation might result in
     * data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<InstanceFailoverGroupInner>, InstanceFailoverGroupInner> beginForceFailoverAllowDataLoss(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);

    /**
     * Fails over from the current primary managed instance to this managed instance. This operation might result in
     * data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstanceFailoverGroupInner forceFailoverAllowDataLoss(
        String resourceGroupName, String locationName, String failoverGroupName);

    /**
     * Fails over from the current primary managed instance to this managed instance. This operation might result in
     * data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param locationName The name of the region where the resource is located.
     * @param failoverGroupName The name of the failover group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an instance failover group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InstanceFailoverGroupInner forceFailoverAllowDataLoss(
        String resourceGroupName, String locationName, String failoverGroupName, Context context);
}
