// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.implementation;

import com.azure.resourcemanager.saas.fluent.models.AccessTokenResultInner;
import com.azure.resourcemanager.saas.models.AccessTokenResult;

public final class AccessTokenResultImpl implements AccessTokenResult {
    private AccessTokenResultInner innerObject;

    private final com.azure.resourcemanager.saas.SaaSManager serviceManager;

    AccessTokenResultImpl(
        AccessTokenResultInner innerObject, com.azure.resourcemanager.saas.SaaSManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String publisherOfferBaseUri() {
        return this.innerModel().publisherOfferBaseUri();
    }

    public String token() {
        return this.innerModel().token();
    }

    public AccessTokenResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.saas.SaaSManager manager() {
        return this.serviceManager;
    }
}
