// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.BlobServicePropertiesInner;

/** An instance of this class provides access to all the operations defined in BlobServicesClient. */
public interface BlobServicesClient {
    /**
     * List blob services of storage account. It returns a collection of one object named default.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BlobServicePropertiesInner> list(String resourceGroupName, String accountName);

    /**
     * List blob services of storage account. It returns a collection of one object named default.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BlobServicePropertiesInner> list(String resourceGroupName, String accountName, Context context);

    /**
     * Sets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The properties of a storage account’s Blob service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Blob service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlobServicePropertiesInner setServiceProperties(
        String resourceGroupName, String accountName, BlobServicePropertiesInner parameters);

    /**
     * Sets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The properties of a storage account’s Blob service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Blob service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BlobServicePropertiesInner> setServicePropertiesWithResponse(
        String resourceGroupName, String accountName, BlobServicePropertiesInner parameters, Context context);

    /**
     * Gets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlobServicePropertiesInner getServiceProperties(String resourceGroupName, String accountName);

    /**
     * Gets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BlobServicePropertiesInner> getServicePropertiesWithResponse(
        String resourceGroupName, String accountName, Context context);
}
