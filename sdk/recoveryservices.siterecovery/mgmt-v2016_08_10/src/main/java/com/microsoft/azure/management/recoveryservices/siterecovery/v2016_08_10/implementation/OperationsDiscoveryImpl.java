/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.OperationsDiscovery;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.Display;

class OperationsDiscoveryImpl extends WrapperImpl<OperationsDiscoveryInner> implements OperationsDiscovery {
    private final RecoveryServicesManager manager;

    OperationsDiscoveryImpl(OperationsDiscoveryInner inner,  RecoveryServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }



    @Override
    public Display display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public Object properties() {
        return this.inner().properties();
    }

}
