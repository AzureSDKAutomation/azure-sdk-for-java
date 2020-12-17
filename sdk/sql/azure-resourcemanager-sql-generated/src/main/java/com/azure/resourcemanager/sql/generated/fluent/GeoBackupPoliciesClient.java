// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.GeoBackupPolicyInner;
import com.azure.resourcemanager.sql.generated.models.GeoBackupPolicyName;

/** An instance of this class provides access to all the operations defined in GeoBackupPoliciesClient. */
public interface GeoBackupPoliciesClient {
    /**
     * Updates a database geo backup policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GeoBackupPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters);

    /**
     * Updates a database geo backup policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GeoBackupPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters,
        Context context);

    /**
     * Gets a geo backup policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GeoBackupPolicyInner get(
        String resourceGroupName, String serverName, String databaseName, GeoBackupPolicyName geoBackupPolicyName);

    /**
     * Gets a geo backup policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GeoBackupPolicyInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        GeoBackupPolicyName geoBackupPolicyName,
        Context context);

    /**
     * Returns a list of geo backup policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list geo backup policies request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GeoBackupPolicyInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Returns a list of geo backup policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list geo backup policies request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GeoBackupPolicyInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
