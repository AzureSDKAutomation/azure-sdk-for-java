/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2018_06_01_preview.ManagedInstanceOperations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2018_06_01_preview.ManagedInstanceOperation;

class ManagedInstanceOperationsImpl extends WrapperImpl<ManagedInstanceOperationsInner> implements ManagedInstanceOperations {
    private final SqlManager manager;

    ManagedInstanceOperationsImpl(SqlManager manager) {
        super(manager.inner().managedInstanceOperations());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private ManagedInstanceOperationImpl wrapManagedInstanceOperationModel(ManagedInstanceOperationInner inner) {
        return  new ManagedInstanceOperationImpl(inner, manager());
    }

    @Override
    public Observable<ManagedInstanceOperation> listByManagedInstanceAsync(final String resourceGroupName, final String managedInstanceName) {
        ManagedInstanceOperationsInner client = this.inner();
        return client.listByManagedInstanceAsync(resourceGroupName, managedInstanceName)
        .flatMapIterable(new Func1<Page<ManagedInstanceOperationInner>, Iterable<ManagedInstanceOperationInner>>() {
            @Override
            public Iterable<ManagedInstanceOperationInner> call(Page<ManagedInstanceOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedInstanceOperationInner, ManagedInstanceOperation>() {
            @Override
            public ManagedInstanceOperation call(ManagedInstanceOperationInner inner) {
                return wrapManagedInstanceOperationModel(inner);
            }
        });
    }

}
