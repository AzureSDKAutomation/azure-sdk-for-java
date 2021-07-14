// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.postgresqlhsc.fluent.models.ServerConfigurationInner;
import com.azure.resourcemanager.postgresqlhsc.models.ConfigurationDataType;
import com.azure.resourcemanager.postgresqlhsc.models.ServerConfiguration;

public final class ServerConfigurationImpl implements ServerConfiguration {
    private ServerConfigurationInner innerObject;

    private final com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager serviceManager;

    ServerConfigurationImpl(
        ServerConfigurationInner innerObject,
        com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String value() {
        return this.innerModel().value();
    }

    public String source() {
        return this.innerModel().source();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String defaultValue() {
        return this.innerModel().defaultValue();
    }

    public ConfigurationDataType dataType() {
        return this.innerModel().dataType();
    }

    public String allowedValues() {
        return this.innerModel().allowedValues();
    }

    public ServerConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager() {
        return this.serviceManager;
    }
}
