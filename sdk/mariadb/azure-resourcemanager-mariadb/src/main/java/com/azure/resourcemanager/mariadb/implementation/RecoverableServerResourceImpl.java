// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.resourcemanager.mariadb.MariaDBManager;
import com.azure.resourcemanager.mariadb.fluent.models.RecoverableServerResourceInner;
import com.azure.resourcemanager.mariadb.models.RecoverableServerResource;

public final class RecoverableServerResourceImpl implements RecoverableServerResource {
    private RecoverableServerResourceInner innerObject;

    private final MariaDBManager serviceManager;

    public RecoverableServerResourceImpl(RecoverableServerResourceInner innerObject, MariaDBManager serviceManager) {
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

    public String lastAvailableBackupDateTime() {
        return this.innerModel().lastAvailableBackupDateTime();
    }

    public String serviceLevelObjective() {
        return this.innerModel().serviceLevelObjective();
    }

    public String edition() {
        return this.innerModel().edition();
    }

    public Integer vCore() {
        return this.innerModel().vCore();
    }

    public String hardwareGeneration() {
        return this.innerModel().hardwareGeneration();
    }

    public String version() {
        return this.innerModel().version();
    }

    public RecoverableServerResourceInner innerModel() {
        return this.innerObject;
    }

    private MariaDBManager manager() {
        return this.serviceManager;
    }
}
