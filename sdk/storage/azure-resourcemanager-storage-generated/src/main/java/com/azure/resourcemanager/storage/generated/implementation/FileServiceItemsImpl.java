// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.FileServiceItemsInner;
import com.azure.resourcemanager.storage.generated.fluent.models.FileServicePropertiesInner;
import com.azure.resourcemanager.storage.generated.models.FileServiceItems;
import com.azure.resourcemanager.storage.generated.models.FileServiceProperties;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class FileServiceItemsImpl implements FileServiceItems {
    private FileServiceItemsInner innerObject;

    private final StorageManager serviceManager;

    public FileServiceItemsImpl(FileServiceItemsInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<FileServiceProperties> value() {
        List<FileServicePropertiesInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new FileServicePropertiesImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public FileServiceItemsInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }
}
