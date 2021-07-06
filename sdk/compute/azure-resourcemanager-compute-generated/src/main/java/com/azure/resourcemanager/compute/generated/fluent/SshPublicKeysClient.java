// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.SshPublicKeyGenerateKeyPairResultInner;
import com.azure.resourcemanager.compute.generated.fluent.models.SshPublicKeyResourceInner;
import com.azure.resourcemanager.compute.generated.models.SshPublicKeyUpdateResource;

/** An instance of this class provides access to all the operations defined in SshPublicKeysClient. */
public interface SshPublicKeysClient {
    /**
     * Lists all of the SSH public keys in the subscription. Use the nextLink property in the response to get the next
     * page of SSH public keys.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list SSH public keys operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SshPublicKeyResourceInner> list();

    /**
     * Lists all of the SSH public keys in the subscription. Use the nextLink property in the response to get the next
     * page of SSH public keys.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list SSH public keys operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SshPublicKeyResourceInner> list(Context context);

    /**
     * Lists all of the SSH public keys in the specified resource group. Use the nextLink property in the response to
     * get the next page of SSH public keys.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list SSH public keys operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SshPublicKeyResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the SSH public keys in the specified resource group. Use the nextLink property in the response to
     * get the next page of SSH public keys.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list SSH public keys operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SshPublicKeyResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Creates a new SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param parameters Parameters supplied to create the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the SSH public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SshPublicKeyResourceInner create(
        String resourceGroupName, String sshPublicKeyName, SshPublicKeyResourceInner parameters);

    /**
     * Creates a new SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param parameters Parameters supplied to create the SSH public key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the SSH public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SshPublicKeyResourceInner> createWithResponse(
        String resourceGroupName, String sshPublicKeyName, SshPublicKeyResourceInner parameters, Context context);

    /**
     * Updates a new SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param parameters Parameters supplied to update the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the SSH public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SshPublicKeyResourceInner update(
        String resourceGroupName, String sshPublicKeyName, SshPublicKeyUpdateResource parameters);

    /**
     * Updates a new SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param parameters Parameters supplied to update the SSH public key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the SSH public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SshPublicKeyResourceInner> updateWithResponse(
        String resourceGroupName, String sshPublicKeyName, SshPublicKeyUpdateResource parameters, Context context);

    /**
     * Delete an SSH public key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String sshPublicKeyName);

    /**
     * Delete an SSH public key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String sshPublicKeyName, Context context);

    /**
     * Retrieves information about an SSH public key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the SSH public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SshPublicKeyResourceInner getByResourceGroup(String resourceGroupName, String sshPublicKeyName);

    /**
     * Retrieves information about an SSH public key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the SSH public key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SshPublicKeyResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String sshPublicKeyName, Context context);

    /**
     * Generates and returns a public/private key pair and populates the SSH public key resource with the public key.
     * The length of the key will be 3072 bits. This operation can only be performed once per SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from generation of an SSH key pair.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SshPublicKeyGenerateKeyPairResultInner generateKeyPair(String resourceGroupName, String sshPublicKeyName);

    /**
     * Generates and returns a public/private key pair and populates the SSH public key resource with the public key.
     * The length of the key will be 3072 bits. This operation can only be performed once per SSH public key resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param sshPublicKeyName The name of the SSH public key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response from generation of an SSH key pair.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SshPublicKeyGenerateKeyPairResultInner> generateKeyPairWithResponse(
        String resourceGroupName, String sshPublicKeyName, Context context);
}
