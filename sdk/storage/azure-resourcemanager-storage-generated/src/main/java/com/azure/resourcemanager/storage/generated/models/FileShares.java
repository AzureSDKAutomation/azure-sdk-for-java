// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of FileShares. */
public interface FileShares {
    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    PagedIterable<FileShareItem> list(String resourceGroupName, String accountName);

    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    PagedIterable<FileShareItem> list(
        String resourceGroupName,
        String accountName,
        String maxpagesize,
        String filter,
        ListSharesExpand expand,
        Context context);

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    FileShare get(String resourceGroupName, String accountName, String shareName);

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param expand Optional, used to expand the properties within share's properties.
     * @param xMsSnapshot Optional, used to retrieve properties of a snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    Response<FileShare> getWithResponse(
        String resourceGroupName,
        String accountName,
        String shareName,
        GetShareExpand expand,
        String xMsSnapshot,
        Context context);

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String shareName);

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param xMsSnapshot Optional, used to delete a snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String shareName, String xMsSnapshot, Context context);

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShare The deleted share to be restored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restore(String resourceGroupName, String accountName, String shareName, DeletedShare deletedShare);

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShare The deleted share to be restored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> restoreWithResponse(
        String resourceGroupName, String accountName, String shareName, DeletedShare deletedShare, Context context);

    /**
     * Gets properties of a specified share.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    FileShare getById(String id);

    /**
     * Gets properties of a specified share.
     *
     * @param id the resource ID.
     * @param expand Optional, used to expand the properties within share's properties.
     * @param xMsSnapshot Optional, used to retrieve properties of a snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    Response<FileShare> getByIdWithResponse(String id, GetShareExpand expand, String xMsSnapshot, Context context);

    /**
     * Deletes specified share under its account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes specified share under its account.
     *
     * @param id the resource ID.
     * @param xMsSnapshot Optional, used to delete a snapshot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, String xMsSnapshot, Context context);

    /**
     * Begins definition for a new FileShare resource.
     *
     * @param name resource name.
     * @return the first stage of the new FileShare definition.
     */
    FileShare.DefinitionStages.Blank define(String name);
}
