// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.CsmPublishingCredentialsPoliciesEntityInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.PublishingCredentialsPoliciesCollectionInner;
import com.azure.resourcemanager.appservice.generated.models.CsmPublishingCredentialsPoliciesEntity;
import com.azure.resourcemanager.appservice.generated.models.PublishingCredentialsPoliciesCollection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PublishingCredentialsPoliciesCollectionImpl implements PublishingCredentialsPoliciesCollection {
    private PublishingCredentialsPoliciesCollectionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    PublishingCredentialsPoliciesCollectionImpl(
        PublishingCredentialsPoliciesCollectionInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<CsmPublishingCredentialsPoliciesEntity> value() {
        List<CsmPublishingCredentialsPoliciesEntityInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new CsmPublishingCredentialsPoliciesEntityImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public PublishingCredentialsPoliciesCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
