// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of RestorableMongodbCollections. */
public interface RestorableMongodbCollections {
    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB MongoDB collections under a specific
     * database. This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the MongoDB collection events and their properties.
     */
    PagedIterable<RestorableMongodbCollectionGetResult> list(String location, String instanceId);

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB MongoDB collections under a specific
     * database. This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restorableMongodbDatabaseRid The resource ID of the MongoDB database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the MongoDB collection events and their properties.
     */
    PagedIterable<RestorableMongodbCollectionGetResult> list(
        String location, String instanceId, String restorableMongodbDatabaseRid, Context context);

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB MongoDB collections under a specific
     * database. This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the MongoDB collection events and their properties.
     */
    PagedIterable<RestorableMongodbCollectionGetResult> list(String location, String instanceId);

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB MongoDB collections under a specific
     * database. This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restorableMongodbDatabaseRid The resource ID of the MongoDB database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the MongoDB collection events and their properties.
     */
    PagedIterable<RestorableMongodbCollectionGetResult> list(
        String location, String instanceId, String restorableMongodbDatabaseRid, Context context);
}
