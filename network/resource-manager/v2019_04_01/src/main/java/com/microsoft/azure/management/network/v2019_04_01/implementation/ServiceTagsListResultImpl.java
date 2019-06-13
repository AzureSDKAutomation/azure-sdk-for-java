/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.management.network.v2019_04_01.ServiceTagsListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2019_04_01.ServiceTagInformation;

class ServiceTagsListResultImpl extends WrapperImpl<ServiceTagsListResultInner> implements ServiceTagsListResult {
    private final NetworkManager manager;
    ServiceTagsListResultImpl(ServiceTagsListResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String changeNumber() {
        return this.inner().changeNumber();
    }

    @Override
    public String cloud() {
        return this.inner().cloud();
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
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<ServiceTagInformation> values() {
        return this.inner().values();
    }

}
