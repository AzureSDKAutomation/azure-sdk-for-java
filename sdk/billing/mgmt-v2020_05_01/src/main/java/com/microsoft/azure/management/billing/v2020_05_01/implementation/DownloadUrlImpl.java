/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.management.billing.v2020_05_01.DownloadUrl;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;

class DownloadUrlImpl extends WrapperImpl<DownloadUrlInner> implements DownloadUrl {
    private final BillingManager manager;
    DownloadUrlImpl(DownloadUrlInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public DateTime expiryTime() {
        return this.inner().expiryTime();
    }

    @Override
    public String url() {
        return this.inner().url();
    }

}
