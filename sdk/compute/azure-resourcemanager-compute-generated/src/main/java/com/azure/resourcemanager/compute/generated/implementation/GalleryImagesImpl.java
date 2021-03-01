// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.GalleryImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.GalleryImage;
import com.azure.resourcemanager.compute.generated.models.GalleryImages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GalleryImagesImpl implements GalleryImages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImagesImpl.class);

    private final GalleryImagesClient innerClient;

    private final ComputeManager serviceManager;

    public GalleryImagesImpl(GalleryImagesClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public GalleryImage get(String resourceGroupName, String galleryName, String galleryImageName) {
        GalleryImageInner inner = this.serviceClient().get(resourceGroupName, galleryName, galleryImageName);
        if (inner != null) {
            return new GalleryImageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GalleryImage> getWithResponse(
        String resourceGroupName, String galleryName, String galleryImageName, Context context) {
        Response<GalleryImageInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, galleryName, galleryImageName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GalleryImageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String galleryName, String galleryImageName) {
        this.serviceClient().delete(resourceGroupName, galleryName, galleryImageName);
    }

    public void delete(String resourceGroupName, String galleryName, String galleryImageName, Context context) {
        this.serviceClient().delete(resourceGroupName, galleryName, galleryImageName, context);
    }

    public PagedIterable<GalleryImage> listByGallery(String resourceGroupName, String galleryName) {
        PagedIterable<GalleryImageInner> inner = this.serviceClient().listByGallery(resourceGroupName, galleryName);
        return Utils.mapPage(inner, inner1 -> new GalleryImageImpl(inner1, this.manager()));
    }

    public PagedIterable<GalleryImage> listByGallery(String resourceGroupName, String galleryName, Context context) {
        PagedIterable<GalleryImageInner> inner =
            this.serviceClient().listByGallery(resourceGroupName, galleryName, context);
        return Utils.mapPage(inner, inner1 -> new GalleryImageImpl(inner1, this.manager()));
    }

    public GalleryImage getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        String galleryImageName = Utils.getValueFromIdByName(id, "images");
        if (galleryImageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'images'.", id)));
        }
        return this.getWithResponse(resourceGroupName, galleryName, galleryImageName, Context.NONE).getValue();
    }

    public Response<GalleryImage> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        String galleryImageName = Utils.getValueFromIdByName(id, "images");
        if (galleryImageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'images'.", id)));
        }
        return this.getWithResponse(resourceGroupName, galleryName, galleryImageName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        String galleryImageName = Utils.getValueFromIdByName(id, "images");
        if (galleryImageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'images'.", id)));
        }
        this.delete(resourceGroupName, galleryName, galleryImageName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        String galleryImageName = Utils.getValueFromIdByName(id, "images");
        if (galleryImageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'images'.", id)));
        }
        this.delete(resourceGroupName, galleryName, galleryImageName, context);
    }

    private GalleryImagesClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public GalleryImageImpl define(String name) {
        return new GalleryImageImpl(name, this.manager());
    }
}
