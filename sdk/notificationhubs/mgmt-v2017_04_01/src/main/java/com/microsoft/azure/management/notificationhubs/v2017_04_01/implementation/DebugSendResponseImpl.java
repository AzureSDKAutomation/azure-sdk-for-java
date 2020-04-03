/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01.implementation;

import com.microsoft.azure.management.notificationhubs.v2017_04_01.DebugSendResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class DebugSendResponseImpl extends WrapperImpl<DebugSendResponseInner> implements DebugSendResponse {
    private final NotificationHubsManager manager;
    DebugSendResponseImpl(DebugSendResponseInner inner, NotificationHubsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NotificationHubsManager manager() {
        return this.manager;
    }

    @Override
    public Double failure() {
        return this.inner().failure();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Object results() {
        return this.inner().results();
    }

    @Override
    public Double success() {
        return this.inner().success();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
