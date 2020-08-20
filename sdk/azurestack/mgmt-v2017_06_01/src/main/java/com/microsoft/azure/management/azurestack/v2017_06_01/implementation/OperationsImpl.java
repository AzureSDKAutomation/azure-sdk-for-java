/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.azurestack.v2017_06_01.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.azurestack.v2017_06_01.Operation;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final AzureStackManager manager;

    OperationsImpl(AzureStackManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public AzureStackManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Operation> xXXAsync() {
        OperationsInner client = this.inner();
        return client.xXXAsync()
        .flatMapIterable(new Func1<Page<OperationInner>, Iterable<OperationInner>>() {
            @Override
            public Iterable<OperationInner> call(Page<OperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OperationInner, Operation>() {
            @Override
            public Operation call(OperationInner inner) {
                return new OperationImpl(inner, manager());
            }
        });
    }

}
