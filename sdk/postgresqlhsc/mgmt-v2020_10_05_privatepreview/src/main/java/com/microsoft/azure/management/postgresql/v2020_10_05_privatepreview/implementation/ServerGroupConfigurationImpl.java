/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.implementation;

import com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.ServerGroupConfiguration;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.ConfigurationDataType;
import java.util.List;
import com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.ServerRoleGroupConfigurationValue;

class ServerGroupConfigurationImpl extends WrapperImpl<ServerGroupConfigurationInner> implements ServerGroupConfiguration {
    private final DBForPostgreSqlManager manager;
    ServerGroupConfigurationImpl(ServerGroupConfigurationInner inner, DBForPostgreSqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DBForPostgreSqlManager manager() {
        return this.manager;
    }

    @Override
    public String allowedValues() {
        return this.inner().allowedValues();
    }

    @Override
    public ConfigurationDataType dataType() {
        return this.inner().dataType();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<ServerRoleGroupConfigurationValue> serverRoleGroupConfigurationValues() {
        return this.inner().serverRoleGroupConfigurationValues();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
