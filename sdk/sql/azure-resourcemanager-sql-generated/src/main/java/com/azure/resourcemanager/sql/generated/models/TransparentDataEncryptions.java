// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TransparentDataEncryptions. */
public interface TransparentDataEncryptions {
    /**
     * Gets a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's transparent data encryption configuration.
     */
    TransparentDataEncryption get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName);

    /**
     * Gets a database's transparent data encryption configuration.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's transparent data encryption configuration.
     */
    Response<TransparentDataEncryption> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName,
        Context context);

    /**
     * Gets a database's transparent data encryption configuration.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's transparent data encryption configuration.
     */
    TransparentDataEncryption getById(String id);

    /**
     * Gets a database's transparent data encryption configuration.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's transparent data encryption configuration.
     */
    Response<TransparentDataEncryption> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new TransparentDataEncryption resource.
     *
     * @param name resource name.
     * @return the first stage of the new TransparentDataEncryption definition.
     */
    TransparentDataEncryption.DefinitionStages.Blank define(TransparentDataEncryptionName name);
}
