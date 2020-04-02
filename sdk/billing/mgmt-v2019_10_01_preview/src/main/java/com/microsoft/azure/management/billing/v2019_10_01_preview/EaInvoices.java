/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.EaInvoicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing EaInvoices.
 */
public interface EaInvoices extends HasInner<EaInvoicesInner> {
    /**
     * Gets a URL to download an invoice. The operation is supported for Enterprise Agreement enrollment billing accounts.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DownloadUrl> downloadAsync(String billingAccountName, String invoiceName);

}
