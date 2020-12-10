// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.GalleryImageUpdate;

/** An instance of this class provides access to all the operations defined in GalleryImagesClient. */
public interface GalleryImagesClient {
    /**
     * Create or update a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery image definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery image definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryImageInner>, GalleryImageInner> beginCreateOrUpdate(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner galleryImage);

    /**
     * Create or update a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery image definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery image definition that you want to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryImageInner>, GalleryImageInner> beginCreateOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImageInner galleryImage,
        Context context);

    /**
     * Create or update a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery image definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery image definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageInner createOrUpdate(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner galleryImage);

    /**
     * Create or update a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery image definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery image definition that you want to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageInner createOrUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImageInner galleryImage,
        Context context);

    /**
     * Update a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery image definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery image definition that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryImageInner>, GalleryImageInner> beginUpdate(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageUpdate galleryImage);

    /**
     * Update a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery image definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery image definition that you want to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GalleryImageInner>, GalleryImageInner> beginUpdate(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImageUpdate galleryImage,
        Context context);

    /**
     * Update a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery image definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery image definition that you want to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageInner update(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageUpdate galleryImage);

    /**
     * Update a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be updated.
     * @param galleryImageName The name of the gallery image definition to be updated. The allowed characters are
     *     alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery image definition that you want to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageInner update(
        String resourceGroupName,
        String galleryName,
        String galleryImageName,
        GalleryImageUpdate galleryImage,
        Context context);

    /**
     * Retrieves information about a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * @param galleryImageName The name of the gallery image definition to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GalleryImageInner get(String resourceGroupName, String galleryName, String galleryImageName);

    /**
     * Retrieves information about a gallery image definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * @param galleryImageName The name of the gallery image definition to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery image definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GalleryImageInner> getWithResponse(
        String resourceGroupName, String galleryName, String galleryImageName, Context context);

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery image definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String galleryName, String galleryImageName);

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery image definition to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String galleryName, String galleryImageName, Context context);

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery image definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String galleryName, String galleryImageName);

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery image definition to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String galleryName, String galleryImageName, Context context);

    /**
     * List gallery image definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which Image Definitions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryImageInner> listByGallery(String resourceGroupName, String galleryName);

    /**
     * List gallery image definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which Image Definitions are to be listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GalleryImageInner> listByGallery(String resourceGroupName, String galleryName, Context context);
}
