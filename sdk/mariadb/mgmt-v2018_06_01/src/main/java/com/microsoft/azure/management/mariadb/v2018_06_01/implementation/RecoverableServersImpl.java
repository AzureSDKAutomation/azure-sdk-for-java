/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mariadb.v2018_06_01.RecoverableServers;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.mariadb.v2018_06_01.RecoverableServerResource;

class RecoverableServersImpl extends WrapperImpl<RecoverableServersInner> implements RecoverableServers {
    private final MariaDBManager manager;

    RecoverableServersImpl(MariaDBManager manager) {
        super(manager.inner().recoverableServers());
        this.manager = manager;
    }

    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RecoverableServerResource> getAsync(String resourceGroupName, String serverName) {
        RecoverableServersInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName)
        .map(new Func1<RecoverableServerResourceInner, RecoverableServerResource>() {
            @Override
            public RecoverableServerResource call(RecoverableServerResourceInner inner) {
                return new RecoverableServerResourceImpl(inner, manager());
            }
        });
    }

}
