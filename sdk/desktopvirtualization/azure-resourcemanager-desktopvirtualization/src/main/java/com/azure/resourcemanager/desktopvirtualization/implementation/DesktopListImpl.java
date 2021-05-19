// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.resourcemanager.desktopvirtualization.fluent.models.DesktopInner;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.DesktopListInner;
import com.azure.resourcemanager.desktopvirtualization.models.Desktop;
import com.azure.resourcemanager.desktopvirtualization.models.DesktopList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class DesktopListImpl implements DesktopList {
    private DesktopListInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    DesktopListImpl(
        DesktopListInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Desktop> value() {
        List<DesktopInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new DesktopImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public DesktopListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
