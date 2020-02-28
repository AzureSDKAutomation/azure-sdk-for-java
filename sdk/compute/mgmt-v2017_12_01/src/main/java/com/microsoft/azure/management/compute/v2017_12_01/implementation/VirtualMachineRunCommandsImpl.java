/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineRunCommands;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.compute.v2017_12_01.RunCommandDocument;
import com.microsoft.azure.Page;

class VirtualMachineRunCommandsImpl extends WrapperImpl<VirtualMachineRunCommandsInner> implements VirtualMachineRunCommands {
    private final ComputeManager manager;

    VirtualMachineRunCommandsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineRunCommands());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private RunCommandDocumentImpl wrapRunCommandDocumentModel(RunCommandDocumentInner inner) {
        return  new RunCommandDocumentImpl(inner, manager());
    }

    private Observable<RunCommandDocumentInner> getRunCommandDocumentInnerUsingVirtualMachineRunCommandsInnerAsync(String id) {
        String location = IdParsingUtils.getValueFromIdByName(id, "locations");
        String commandId = IdParsingUtils.getValueFromIdByName(id, "runCommands");
        VirtualMachineRunCommandsInner client = this.inner();
        return client.getAsync(location, commandId);
    }

    @Override
    public Observable<RunCommandDocument> getAsync(String location, String commandId) {
        VirtualMachineRunCommandsInner client = this.inner();
        return client.getAsync(location, commandId)
        .flatMap(new Func1<RunCommandDocumentInner, Observable<RunCommandDocument>>() {
            @Override
            public Observable<RunCommandDocument> call(RunCommandDocumentInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((RunCommandDocument)wrapRunCommandDocumentModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<RunCommandDocument> listAsync(final String location) {
        VirtualMachineRunCommandsInner client = this.inner();
        return client.listAsync(location)
        .flatMapIterable(new Func1<Page<RunCommandDocumentBaseInner>, Iterable<RunCommandDocumentBaseInner>>() {
            @Override
            public Iterable<RunCommandDocumentBaseInner> call(Page<RunCommandDocumentBaseInner> page) {
                return page.items();
            }
        })
        .flatMap(new Func1<RunCommandDocumentBaseInner, Observable<RunCommandDocumentInner>>() {
            @Override
            public Observable<RunCommandDocumentInner> call(RunCommandDocumentBaseInner inner) {
                return getRunCommandDocumentInnerUsingVirtualMachineRunCommandsInnerAsync(inner.id());
            }
        })
        .map(new Func1<RunCommandDocumentInner, RunCommandDocument>() {
            @Override
            public RunCommandDocument call(RunCommandDocumentInner inner) {
                return wrapRunCommandDocumentModel(inner);
            }
        });
    }

}
