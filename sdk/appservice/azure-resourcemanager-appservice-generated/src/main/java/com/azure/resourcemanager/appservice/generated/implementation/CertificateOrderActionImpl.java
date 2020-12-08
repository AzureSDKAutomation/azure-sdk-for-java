// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateOrderActionInner;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderAction;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderActionType;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.time.OffsetDateTime;

public final class CertificateOrderActionImpl implements CertificateOrderAction {
    private CertificateOrderActionInner innerObject;

    private final WebSiteManager serviceManager;

    public CertificateOrderActionImpl(CertificateOrderActionInner innerObject, WebSiteManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public CertificateOrderActionType actionType() {
        return this.innerModel().actionType();
    }

    public OffsetDateTime createdAt() {
        return this.innerModel().createdAt();
    }

    public CertificateOrderActionInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
