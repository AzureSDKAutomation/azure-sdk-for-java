/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 * abc
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ValidateOperationsResponse;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ClientDiscoveryValueForSingleApi;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ValidateOperationRequest;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final RecoveryServicesManager manager;

    OperationsImpl(RecoveryServicesManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ValidateOperationsResponse> validateAsync(String vaultName, String resourceGroupName, ValidateOperationRequest parameters) {
        OperationsInner client = this.inner();
        return client.validateAsync(vaultName, resourceGroupName, parameters)
        .map(new Func1<ValidateOperationsResponseInner, ValidateOperationsResponse>() {
            @Override
            public ValidateOperationsResponse call(ValidateOperationsResponseInner inner) {
                return new ValidateOperationsResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ClientDiscoveryValueForSingleApi> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ClientDiscoveryValueForSingleApiInner>, Iterable<ClientDiscoveryValueForSingleApiInner>>() {
            @Override
            public Iterable<ClientDiscoveryValueForSingleApiInner> call(Page<ClientDiscoveryValueForSingleApiInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ClientDiscoveryValueForSingleApiInner, ClientDiscoveryValueForSingleApi>() {
            @Override
            public ClientDiscoveryValueForSingleApi call(ClientDiscoveryValueForSingleApiInner inner) {
                return new ClientDiscoveryValueForSingleApiImpl(inner, manager());
            }
        });
    }

}
