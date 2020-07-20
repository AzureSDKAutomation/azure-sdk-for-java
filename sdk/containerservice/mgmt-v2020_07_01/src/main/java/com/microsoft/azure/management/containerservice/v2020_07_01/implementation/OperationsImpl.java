/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerservice.v2020_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerservice.v2020_07_01.Operations;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2020_07_01.OperationValue;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final ContainerServiceManager manager;

    OperationsImpl(ContainerServiceManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationValue> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<List<OperationValueInner>, Observable<OperationValueInner>>() {
            @Override
            public Observable<OperationValueInner> call(List<OperationValueInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<OperationValueInner, OperationValue>() {
            @Override
            public OperationValue call(OperationValueInner inner) {
                return new OperationValueImpl(inner, manager());
            }
        });
    }

}
