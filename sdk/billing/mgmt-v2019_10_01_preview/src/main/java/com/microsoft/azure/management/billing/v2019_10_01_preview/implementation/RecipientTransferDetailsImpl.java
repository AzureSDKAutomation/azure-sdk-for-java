/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.RecipientTransferDetails;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.EligibleProductType;
import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2019_10_01_preview.DetailedTransferStatus;
import com.microsoft.azure.management.billing.v2019_10_01_preview.TransferStatus;

class RecipientTransferDetailsImpl extends WrapperImpl<RecipientTransferDetailsInner> implements RecipientTransferDetails {
    private final BillingManager manager;
    RecipientTransferDetailsImpl(RecipientTransferDetailsInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public List<EligibleProductType> allowedProductType() {
        return this.inner().allowedProductType();
    }

    @Override
    public String canceledBy() {
        return this.inner().canceledBy();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public List<DetailedTransferStatus> detailedTransferStatus() {
        return this.inner().detailedTransferStatus();
    }

    @Override
    public DateTime expirationTime() {
        return this.inner().expirationTime();
    }

    @Override
    public String initiatorCustomerType() {
        return this.inner().initiatorCustomerType();
    }

    @Override
    public String initiatorEmailId() {
        return this.inner().initiatorEmailId();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public String recipientEmailId() {
        return this.inner().recipientEmailId();
    }

    @Override
    public String resellerId() {
        return this.inner().resellerId();
    }

    @Override
    public String resellerName() {
        return this.inner().resellerName();
    }

    @Override
    public TransferStatus transferStatus() {
        return this.inner().transferStatus();
    }

}
