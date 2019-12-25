/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.MigrateMySqlStatus;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.OperationStatus;

class MigrateMySqlStatusImpl extends WrapperImpl<MigrateMySqlStatusInner> implements MigrateMySqlStatus {
    private final CertificateRegistrationManager manager;
    MigrateMySqlStatusImpl(MigrateMySqlStatusInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public Boolean localMySqlEnabled() {
        return this.inner().localMySqlEnabled();
    }

    @Override
    public OperationStatus migrationOperationStatus() {
        return this.inner().migrationOperationStatus();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String operationId() {
        return this.inner().operationId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
