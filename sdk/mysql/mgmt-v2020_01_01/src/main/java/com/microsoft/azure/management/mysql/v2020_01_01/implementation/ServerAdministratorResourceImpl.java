/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import com.microsoft.azure.management.mysql.v2020_01_01.ServerAdministratorResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.UUID;

class ServerAdministratorResourceImpl extends WrapperImpl<ServerAdministratorResourceInner> implements ServerAdministratorResource {
    private final MySQLManager manager;

    ServerAdministratorResourceImpl(ServerAdministratorResourceInner inner,  MySQLManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MySQLManager manager() {
        return this.manager;
    }



    @Override
    public String administratorType() {
        return this.inner().administratorType();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String login() {
        return this.inner().login();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public UUID sid() {
        return this.inner().sid();
    }

    @Override
    public UUID tenantId() {
        return this.inner().tenantId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
