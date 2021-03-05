// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.fluent.MsixImagesClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ExpandMsixImageInner;
import com.azure.resourcemanager.desktopvirtualization.models.ExpandMsixImage;
import com.azure.resourcemanager.desktopvirtualization.models.MsixImageUri;
import com.azure.resourcemanager.desktopvirtualization.models.MsixImages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MsixImagesImpl implements MsixImages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MsixImagesImpl.class);

    private final MsixImagesClient innerClient;

    private final DesktopVirtualizationManager serviceManager;

    public MsixImagesImpl(MsixImagesClient innerClient, DesktopVirtualizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ExpandMsixImage> expand(
        String resourceGroupName, String hostPoolName, MsixImageUri msixImageUri) {
        PagedIterable<ExpandMsixImageInner> inner =
            this.serviceClient().expand(resourceGroupName, hostPoolName, msixImageUri);
        return Utils.mapPage(inner, inner1 -> new ExpandMsixImageImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpandMsixImage> expand(
        String resourceGroupName, String hostPoolName, MsixImageUri msixImageUri, Context context) {
        PagedIterable<ExpandMsixImageInner> inner =
            this.serviceClient().expand(resourceGroupName, hostPoolName, msixImageUri, context);
        return Utils.mapPage(inner, inner1 -> new ExpandMsixImageImpl(inner1, this.manager()));
    }

    private MsixImagesClient serviceClient() {
        return this.innerClient;
    }

    private DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
