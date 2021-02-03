// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.LegalHoldInner;
import com.azure.resourcemanager.storage.generated.models.LegalHold;
import java.util.Collections;
import java.util.List;

public final class LegalHoldImpl implements LegalHold {
    private LegalHoldInner innerObject;

    private final StorageManager serviceManager;

    LegalHoldImpl(LegalHoldInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean hasLegalHold() {
        return this.innerModel().hasLegalHold();
    }

    public List<String> tags() {
        List<String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public LegalHoldInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }
}
