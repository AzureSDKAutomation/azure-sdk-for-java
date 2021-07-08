// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateEmailInner;
import com.azure.resourcemanager.appservice.generated.models.CertificateEmail;
import java.time.OffsetDateTime;

public final class CertificateEmailImpl implements CertificateEmail {
    private CertificateEmailInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    CertificateEmailImpl(
        CertificateEmailInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String emailId() {
        return this.innerModel().emailId();
    }

    public OffsetDateTime timestamp() {
        return this.innerModel().timestamp();
    }

    public CertificateEmailInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
