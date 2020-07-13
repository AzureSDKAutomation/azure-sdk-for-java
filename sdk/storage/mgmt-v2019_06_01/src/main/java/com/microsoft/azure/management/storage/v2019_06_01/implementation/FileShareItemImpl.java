/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.FileShareItem;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_06_01.ShareAccessTier;
import org.joda.time.DateTime;
import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.azure.management.storage.v2019_06_01.EnabledProtocols;
import java.util.Map;
import com.microsoft.azure.management.storage.v2019_06_01.RootSquashType;

class FileShareItemImpl extends WrapperImpl<FileShareItemInner> implements FileShareItem {
    private final StorageManager manager;
    FileShareItemImpl(FileShareItemInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public ShareAccessTier accessTier() {
        return this.inner().accessTier();
    }

    @Override
    public DateTime accessTierChangeTime() {
        return this.inner().accessTierChangeTime();
    }

    @Override
    public String accessTierStatus() {
        return this.inner().accessTierStatus();
    }

    @Override
    public Boolean deleted() {
        return this.inner().deleted();
    }

    @Override
    public DateTime deletedTime() {
        return this.inner().deletedTime();
    }

    @Override
    public EnabledProtocols enabledProtocols() {
        return this.inner().enabledProtocols();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public Map<String, String> metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer remainingRetentionDays() {
        return this.inner().remainingRetentionDays();
    }

    @Override
    public RootSquashType rootSquash() {
        return this.inner().rootSquash();
    }

    @Override
    public Integer shareQuota() {
        return this.inner().shareQuota();
    }

    @Override
    public Long shareUsageBytes() {
        return this.inner().shareUsageBytes();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

}
