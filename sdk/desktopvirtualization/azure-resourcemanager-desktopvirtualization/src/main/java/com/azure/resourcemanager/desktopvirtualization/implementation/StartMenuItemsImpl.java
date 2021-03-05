// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.fluent.StartMenuItemsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.StartMenuItemInner;
import com.azure.resourcemanager.desktopvirtualization.models.StartMenuItem;
import com.azure.resourcemanager.desktopvirtualization.models.StartMenuItems;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class StartMenuItemsImpl implements StartMenuItems {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StartMenuItemsImpl.class);

    private final StartMenuItemsClient innerClient;

    private final DesktopVirtualizationManager serviceManager;

    public StartMenuItemsImpl(StartMenuItemsClient innerClient, DesktopVirtualizationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StartMenuItem> list(String resourceGroupName, String applicationGroupName) {
        PagedIterable<StartMenuItemInner> inner = this.serviceClient().list(resourceGroupName, applicationGroupName);
        return Utils.mapPage(inner, inner1 -> new StartMenuItemImpl(inner1, this.manager()));
    }

    public PagedIterable<StartMenuItem> list(String resourceGroupName, String applicationGroupName, Context context) {
        PagedIterable<StartMenuItemInner> inner =
            this.serviceClient().list(resourceGroupName, applicationGroupName, context);
        return Utils.mapPage(inner, inner1 -> new StartMenuItemImpl(inner1, this.manager()));
    }

    private StartMenuItemsClient serviceClient() {
        return this.innerClient;
    }

    private DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
