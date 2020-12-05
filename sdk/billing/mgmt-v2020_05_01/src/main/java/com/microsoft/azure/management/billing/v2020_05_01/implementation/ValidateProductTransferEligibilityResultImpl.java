/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.management.billing.v2020_05_01.ValidateProductTransferEligibilityResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2020_05_01.ValidateProductTransferEligibilityError;

class ValidateProductTransferEligibilityResultImpl extends WrapperImpl<ValidateProductTransferEligibilityResultInner> implements ValidateProductTransferEligibilityResult {
    private final BillingManager manager;
    ValidateProductTransferEligibilityResultImpl(ValidateProductTransferEligibilityResultInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public ValidateProductTransferEligibilityError errorDetails() {
        return this.inner().errorDetails();
    }

    @Override
    public Boolean isMoveEligible() {
        return this.inner().isMoveEligible();
    }

}
