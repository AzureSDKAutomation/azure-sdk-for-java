// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateEmailInner;
import com.azure.resourcemanager.appservice.generated.models.CertificateEmail;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.time.OffsetDateTime;

public final class CertificateEmailImpl implements CertificateEmail {
    private CertificateEmailInner innerObject;

    private final WebSiteManager serviceManager;

    CertificateEmailImpl(CertificateEmailInner innerObject, WebSiteManager serviceManager) {
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

    public String emailId() {
        return this.innerModel().emailId();
    }

    public OffsetDateTime timestamp() {
        return this.innerModel().timestamp();
    }

    public CertificateEmailInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
