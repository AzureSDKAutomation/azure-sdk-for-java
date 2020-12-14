// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.ServiceObjectiveInner;
import com.azure.resourcemanager.sql.generated.models.ServiceObjective;

public final class ServiceObjectiveImpl implements ServiceObjective {
    private ServiceObjectiveInner innerObject;

    private final SqlManager serviceManager;

    public ServiceObjectiveImpl(ServiceObjectiveInner innerObject, SqlManager serviceManager) {
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

    public String serviceObjectiveName() {
        return this.innerModel().serviceObjectiveName();
    }

    public Boolean isDefault() {
        return this.innerModel().isDefault();
    }

    public Boolean isSystem() {
        return this.innerModel().isSystem();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Boolean enabled() {
        return this.innerModel().enabled();
    }

    public ServiceObjectiveInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
