// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.resourcemanager.mariadb.MariaDBManager;
import com.azure.resourcemanager.mariadb.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.mariadb.models.PrivateLinkResource;
import com.azure.resourcemanager.mariadb.models.PrivateLinkResourceProperties;

public final class PrivateLinkResourceImpl implements PrivateLinkResource {
    private PrivateLinkResourceInner innerObject;

    private final MariaDBManager serviceManager;

    PrivateLinkResourceImpl(PrivateLinkResourceInner innerObject, MariaDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateLinkResourceProperties properties() {
        return this.innerModel().properties();
    }

    public PrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private MariaDBManager manager() {
        return this.serviceManager;
    }
}
