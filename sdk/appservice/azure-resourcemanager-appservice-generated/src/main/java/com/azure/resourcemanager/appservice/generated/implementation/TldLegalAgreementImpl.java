// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.TldLegalAgreementInner;
import com.azure.resourcemanager.appservice.generated.models.TldLegalAgreement;

public final class TldLegalAgreementImpl implements TldLegalAgreement {
    private TldLegalAgreementInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    TldLegalAgreementImpl(
        TldLegalAgreementInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String agreementKey() {
        return this.innerModel().agreementKey();
    }

    public String title() {
        return this.innerModel().title();
    }

    public String content() {
        return this.innerModel().content();
    }

    public String url() {
        return this.innerModel().url();
    }

    public TldLegalAgreementInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
