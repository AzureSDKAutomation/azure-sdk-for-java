// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.implementation;

import com.azure.resourcemanager.portal.PortalManager;
import com.azure.resourcemanager.portal.fluent.models.ViolationInner;
import com.azure.resourcemanager.portal.models.Violation;

public final class ViolationImpl implements Violation {
    private ViolationInner innerObject;

    private final PortalManager serviceManager;

    public ViolationImpl(ViolationInner innerObject, PortalManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String userId() {
        return this.innerModel().userId();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public ViolationInner innerModel() {
        return this.innerObject;
    }

    private PortalManager manager() {
        return this.serviceManager;
    }
}
