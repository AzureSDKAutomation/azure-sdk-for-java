/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2017_02_27_preview;

import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Observable;
import com.microsoft.azure.management.billing.v2017_02_27_preview.implementation.InvoicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Invoices.
 */
public interface Invoices extends SupportsListing<Invoice>, HasInner<InvoicesInner> {
    /**
     * Gets a named invoice resource. When getting a single invoice, the downloadUrl property is expanded automatically.
     *
     * @param invoiceName The name of an invoice resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> getAsync(String invoiceName);

    /**
     * Gets the most recent invoice. When getting a single invoice, the downloadUrl property is expanded automatically.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> getLatestAsync();

}
