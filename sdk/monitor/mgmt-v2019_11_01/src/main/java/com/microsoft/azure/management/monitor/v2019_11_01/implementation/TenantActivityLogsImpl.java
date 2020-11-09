/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.TenantActivityLogs;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.monitor.v2019_11_01.EventData;

class TenantActivityLogsImpl extends WrapperImpl<TenantActivityLogsInner> implements TenantActivityLogs {
    private final MonitorManager manager;

    TenantActivityLogsImpl(MonitorManager manager) {
        super(manager.inner().tenantActivityLogs());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EventData> listAsync() {
        TenantActivityLogsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<EventDataInner>, Iterable<EventDataInner>>() {
            @Override
            public Iterable<EventDataInner> call(Page<EventDataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventDataInner, EventData>() {
            @Override
            public EventData call(EventDataInner inner) {
                return new EventDataImpl(inner, manager());
            }
        });
    }

}
