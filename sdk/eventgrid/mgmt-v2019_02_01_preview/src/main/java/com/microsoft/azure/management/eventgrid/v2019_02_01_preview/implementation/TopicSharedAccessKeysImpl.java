/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_02_01_preview.implementation;

import com.microsoft.azure.management.eventgrid.v2019_02_01_preview.TopicSharedAccessKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class TopicSharedAccessKeysImpl extends WrapperImpl<TopicSharedAccessKeysInner> implements TopicSharedAccessKeys {
    private final EventGridManager manager;
    TopicSharedAccessKeysImpl(TopicSharedAccessKeysInner inner, EventGridManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    public String key1() {
        return this.inner().key1();
    }

    @Override
    public String key2() {
        return this.inner().key2();
    }

}
