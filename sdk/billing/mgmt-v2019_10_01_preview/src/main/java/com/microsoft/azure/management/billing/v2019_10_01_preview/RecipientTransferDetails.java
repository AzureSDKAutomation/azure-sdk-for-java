/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.RecipientTransferDetailsInner;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing RecipientTransferDetails.
 */
public interface RecipientTransferDetails extends HasInner<RecipientTransferDetailsInner>, HasManager<BillingManager> {
    /**
     * @return the allowedProductType value.
     */
    List<EligibleProductType> allowedProductType();

    /**
     * @return the canceledBy value.
     */
    String canceledBy();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the detailedTransferStatus value.
     */
    List<DetailedTransferStatus> detailedTransferStatus();

    /**
     * @return the expirationTime value.
     */
    DateTime expirationTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the initiatorCustomerType value.
     */
    String initiatorCustomerType();

    /**
     * @return the initiatorEmailId value.
     */
    String initiatorEmailId();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recipientEmailId value.
     */
    String recipientEmailId();

    /**
     * @return the resellerId value.
     */
    String resellerId();

    /**
     * @return the resellerName value.
     */
    String resellerName();

    /**
     * @return the transferStatus value.
     */
    TransferStatus transferStatus();

    /**
     * @return the type value.
     */
    String type();

}
