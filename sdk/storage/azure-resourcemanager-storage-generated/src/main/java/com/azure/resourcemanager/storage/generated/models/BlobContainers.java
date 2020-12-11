// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.ImmutabilityPolicyInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LegalHoldInner;

/** Resource collection API of BlobContainers. */
public interface BlobContainers {
    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
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
    PagedIterable<ListContainerItem> list(String resourceGroupName, String accountName);

    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of containers that can be included in the list.
     * @param filter Optional. When specified, only container names starting with the filter will be listed.
     * @param include Optional, used to include the properties for soft deleted blob containers.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    PagedIterable<ListContainerItem> list(
        String resourceGroupName,
        String accountName,
        String maxpagesize,
        String filter,
        ListContainersInclude include,
        Context context);

    /**
     * Gets properties of a specified container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified container.
     */
    BlobContainer get(String resourceGroupName, String accountName, String containerName);

    /**
     * Gets properties of a specified container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified container.
     */
    Response<BlobContainer> getWithResponse(
        String resourceGroupName, String accountName, String containerName, Context context);

    /**
     * Deletes specified container under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String containerName);

    /**
     * Deletes specified container under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String containerName, Context context);

    /**
     * Sets legal hold tags. Setting the same tag results in an idempotent operation. SetLegalHold follows an append
     * pattern and does not clear out the existing tags that are not specified in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param legalHold The LegalHold property of a blob container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    LegalHold setLegalHold(
        String resourceGroupName, String accountName, String containerName, LegalHoldInner legalHold);

    /**
     * Sets legal hold tags. Setting the same tag results in an idempotent operation. SetLegalHold follows an append
     * pattern and does not clear out the existing tags that are not specified in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param legalHold The LegalHold property of a blob container.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    Response<LegalHold> setLegalHoldWithResponse(
        String resourceGroupName, String accountName, String containerName, LegalHoldInner legalHold, Context context);

    /**
     * Clears legal hold tags. Clearing the same or non-existent tag results in an idempotent operation. ClearLegalHold
     * clears out only the specified tags in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param legalHold The LegalHold property of a blob container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    LegalHold clearLegalHold(
        String resourceGroupName, String accountName, String containerName, LegalHoldInner legalHold);

    /**
     * Clears legal hold tags. Clearing the same or non-existent tag results in an idempotent operation. ClearLegalHold
     * clears out only the specified tags in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param legalHold The LegalHold property of a blob container.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    Response<LegalHold> clearLegalHoldWithResponse(
        String resourceGroupName, String accountName, String containerName, LegalHoldInner legalHold, Context context);

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    ImmutabilityPolicy getImmutabilityPolicy(String resourceGroupName, String accountName, String containerName);

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    Response<ImmutabilityPolicy> getImmutabilityPolicyWithResponse(
        String resourceGroupName, String accountName, String containerName, String ifMatch, Context context);

    /**
     * Aborts an unlocked immutability policy. The response of delete has immutabilityPeriodSinceCreationInDays set to
     * 0. ETag in If-Match is required for this operation. Deleting a locked immutability policy is not allowed, the
     * only way is to delete the container after deleting all expired blobs inside the policy locked container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    ImmutabilityPolicy deleteImmutabilityPolicy(
        String resourceGroupName, String accountName, String containerName, String ifMatch);

    /**
     * Aborts an unlocked immutability policy. The response of delete has immutabilityPeriodSinceCreationInDays set to
     * 0. ETag in If-Match is required for this operation. Deleting a locked immutability policy is not allowed, the
     * only way is to delete the container after deleting all expired blobs inside the policy locked container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    Response<ImmutabilityPolicy> deleteImmutabilityPolicyWithResponse(
        String resourceGroupName, String accountName, String containerName, String ifMatch, Context context);

    /**
     * Sets the ImmutabilityPolicy to Locked state. The only action allowed on a Locked policy is
     * ExtendImmutabilityPolicy action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    ImmutabilityPolicy lockImmutabilityPolicy(
        String resourceGroupName, String accountName, String containerName, String ifMatch);

    /**
     * Sets the ImmutabilityPolicy to Locked state. The only action allowed on a Locked policy is
     * ExtendImmutabilityPolicy action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    Response<ImmutabilityPolicy> lockImmutabilityPolicyWithResponse(
        String resourceGroupName, String accountName, String containerName, String ifMatch, Context context);

    /**
     * Extends the immutabilityPeriodSinceCreationInDays of a locked immutabilityPolicy. The only action allowed on a
     * Locked policy will be this action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    ImmutabilityPolicy extendImmutabilityPolicy(
        String resourceGroupName, String accountName, String containerName, String ifMatch);

    /**
     * Extends the immutabilityPeriodSinceCreationInDays of a locked immutabilityPolicy. The only action allowed on a
     * Locked policy will be this action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param parameters The ImmutabilityPolicy property of a blob container, including Id, resource name, resource
     *     type, Etag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    Response<ImmutabilityPolicy> extendImmutabilityPolicyWithResponse(
        String resourceGroupName,
        String accountName,
        String containerName,
        String ifMatch,
        ImmutabilityPolicyInner parameters,
        Context context);

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    LeaseContainerResponse lease(String resourceGroupName, String accountName, String containerName);

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param parameters Lease Container request schema.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    Response<LeaseContainerResponse> leaseWithResponse(
        String resourceGroupName,
        String accountName,
        String containerName,
        LeaseContainerRequest parameters,
        Context context);

    /**
     * Gets properties of a specified container.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified container.
     */
    BlobContainer getById(String id);

    /**
     * Gets properties of a specified container.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified container.
     */
    Response<BlobContainer> getByIdWithResponse(String id, Context context);

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    ImmutabilityPolicy getImmutabilityPolicyById(String id);

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param id the resource ID.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    Response<ImmutabilityPolicy> getImmutabilityPolicyByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Deletes specified container under its account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes specified container under its account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new BlobContainer resource.
     *
     * @param name resource name.
     * @return the first stage of the new BlobContainer definition.
     */
    BlobContainer.DefinitionStages.Blank define(String name);

    /**
     * Begins definition for a new ImmutabilityPolicy resource.
     *
     * @param name resource name.
     * @return the first stage of the new ImmutabilityPolicy definition.
     */
    ImmutabilityPolicy.DefinitionStages.Blank defineImmutabilityPolicy(String name);
}
