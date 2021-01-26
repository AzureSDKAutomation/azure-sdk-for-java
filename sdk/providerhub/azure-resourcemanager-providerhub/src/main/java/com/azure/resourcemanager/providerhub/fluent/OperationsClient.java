// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.OperationsContentInner;
import com.azure.resourcemanager.providerhub.fluent.models.OperationsDefinitionInner;
import java.util.List;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public interface OperationsClient {
    /**
     * Lists all the operations supported by Microsoft.ProviderHub.
     *
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationsDefinitionInner> list();

    /**
     * Lists all the operations supported by Microsoft.ProviderHub.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationsDefinitionInner> list(Context context);

    /**
     * Gets the operations supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operations supported by the given provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<OperationsDefinitionInner> listByProviderRegistration(String providerNamespace);

    /**
     * Gets the operations supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operations supported by the given provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<OperationsDefinitionInner>> listByProviderRegistrationWithResponse(
        String providerNamespace, Context context);

    /**
     * Creates or updates the operation supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationsContentInner createOrUpdate(String providerNamespace);

    /**
     * Creates or updates the operation supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationsContentInner> createOrUpdateWithResponse(String providerNamespace, Context context);

    /**
     * Deletes an operation.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String providerNamespace);

    /**
     * Deletes an operation.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String providerNamespace, Context context);

    /**
     * Lists all the operations supported by Microsoft.ProviderHub.
     *
     * @throws com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationsDefinitionInner> list();

    /**
     * Lists all the operations supported by Microsoft.ProviderHub.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationsDefinitionInner> list(Context context);

    /**
     * Gets the operations supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operations supported by the given provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<OperationsDefinitionInner> listByProviderRegistration(String providerNamespace);

    /**
     * Gets the operations supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operations supported by the given provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<OperationsDefinitionInner>> listByProviderRegistrationWithResponse(
        String providerNamespace, Context context);

    /**
     * Creates or updates the operation supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationsContentInner createOrUpdate(String providerNamespace);

    /**
     * Creates or updates the operation supported by the given provider.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationsContentInner> createOrUpdateWithResponse(String providerNamespace, Context context);

    /**
     * Deletes an operation.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String providerNamespace);

    /**
     * Deletes an operation.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorAutoGeneratedException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String providerNamespace, Context context);
}
