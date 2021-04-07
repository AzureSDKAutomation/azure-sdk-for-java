// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.BillingPermissionsPropertiesInner;
import com.azure.resourcemanager.billing.models.BillingPermissionsProperties;
import java.util.Collections;
import java.util.List;

public final class BillingPermissionsPropertiesImpl implements BillingPermissionsProperties {
    private BillingPermissionsPropertiesInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    BillingPermissionsPropertiesImpl(
        BillingPermissionsPropertiesInner innerObject,
        com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> actions() {
        List<String> inner = this.innerModel().actions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> notActions() {
        List<String> inner = this.innerModel().notActions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public BillingPermissionsPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
