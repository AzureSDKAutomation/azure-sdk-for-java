// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountListKeysResultInner;
import com.azure.resourcemanager.storage.generated.models.StorageAccountKey;
import com.azure.resourcemanager.storage.generated.models.StorageAccountListKeysResult;
import java.util.Collections;
import java.util.List;

public final class StorageAccountListKeysResultImpl implements StorageAccountListKeysResult {
    private StorageAccountListKeysResultInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    StorageAccountListKeysResultImpl(
        StorageAccountListKeysResultInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<StorageAccountKey> keys() {
        List<StorageAccountKey> inner = this.innerModel().keys();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StorageAccountListKeysResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }
}
