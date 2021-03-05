// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseRestoreResourceInner;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseRestoreResource;
import java.util.Collections;
import java.util.List;

public final class DatabaseRestoreResourceImpl implements DatabaseRestoreResource {
    private DatabaseRestoreResourceInner innerObject;

    private final CosmosDBManager serviceManager;

    DatabaseRestoreResourceImpl(DatabaseRestoreResourceInner innerObject, CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public List<String> collectionNames() {
        List<String> inner = this.innerModel().collectionNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DatabaseRestoreResourceInner innerModel() {
        return this.innerObject;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }
}
