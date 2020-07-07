/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.ComputeModeOptions;
import org.joda.time.DateTime;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final CertificateRegistrationManager manager;
    UsageImpl(UsageInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public ComputeModeOptions computeMode() {
        return this.inner().computeMode();
    }

    @Override
    public Long currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
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
    public Long limit() {
        return this.inner().limit();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime nextResetTime() {
        return this.inner().nextResetTime();
    }

    @Override
    public String resourceName() {
        return this.inner().resourceName();
    }

    @Override
    public String siteMode() {
        return this.inner().siteMode();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
