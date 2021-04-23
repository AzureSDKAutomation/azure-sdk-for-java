// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.SkuResourceInner;
import com.azure.resourcemanager.providerhub.models.ResourceTypeSku;

/** An instance of this class provides access to all the operations defined in SkusClient. */
public interface SkusClient {
    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuResourceInner get(String providerNamespace, String resourceType, String sku);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuResourceInner> getWithResponse(
        String providerNamespace, String resourceType, String sku, Context context);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuResourceInner createOrUpdate(
        String providerNamespace, String resourceType, String sku, ResourceTypeSku properties);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuResourceInner> createOrUpdateWithResponse(
        String providerNamespace, String resourceType, String sku, ResourceTypeSku properties, Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String providerNamespace, String resourceType, String sku);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String providerNamespace, String resourceType, String sku, Context context);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuResourceInner getNestedResourceTypeFirst(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String sku);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuResourceInner> getNestedResourceTypeFirstWithResponse(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String sku, Context context);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuResourceInner createOrUpdateNestedResourceTypeFirst(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String sku,
        ResourceTypeSku properties);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuResourceInner> createOrUpdateNestedResourceTypeFirstWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String sku,
        ResourceTypeSku properties,
        Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteNestedResourceTypeFirst(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String sku);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteNestedResourceTypeFirstWithResponse(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String sku, Context context);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuResourceInner getNestedResourceTypeSecond(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuResourceInner> getNestedResourceTypeSecondWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku,
        Context context);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuResourceInner createOrUpdateNestedResourceTypeSecond(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku,
        ResourceTypeSku properties);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuResourceInner> createOrUpdateNestedResourceTypeSecondWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku,
        ResourceTypeSku properties,
        Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteNestedResourceTypeSecond(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteNestedResourceTypeSecondWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku,
        Context context);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuResourceInner getNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuResourceInner> getNestedResourceTypeThirdWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku,
        Context context);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SkuResourceInner createOrUpdateNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku,
        ResourceTypeSku properties);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SkuResourceInner> createOrUpdateNestedResourceTypeThirdWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku,
        ResourceTypeSku properties,
        Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteNestedResourceTypeThirdWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku,
        Context context);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listByResourceTypeRegistrations(String providerNamespace, String resourceType);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listByResourceTypeRegistrations(
        String providerNamespace, String resourceType, Context context);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listByResourceTypeRegistrationsNestedResourceTypeFirst(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listByResourceTypeRegistrationsNestedResourceTypeFirst(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, Context context);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listByResourceTypeRegistrationsNestedResourceTypeSecond(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String nestedResourceTypeSecond);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listByResourceTypeRegistrationsNestedResourceTypeSecond(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        Context context);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listByResourceTypeRegistrationsNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SkuResourceInner> listByResourceTypeRegistrationsNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        Context context);
}
