// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.resourcemanager.datamigration.fluent.models.FileStorageInfoInner;
import com.azure.resourcemanager.datamigration.models.FileStorageInfo;
import java.util.Collections;
import java.util.Map;

public final class FileStorageInfoImpl implements FileStorageInfo {
    private FileStorageInfoInner innerObject;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    FileStorageInfoImpl(
        FileStorageInfoInner innerObject, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public Map<String, String> headers() {
        Map<String, String> inner = this.innerModel().headers();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public FileStorageInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }
}
