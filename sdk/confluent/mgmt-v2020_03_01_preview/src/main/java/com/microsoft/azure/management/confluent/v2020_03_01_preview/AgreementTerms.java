/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.confluent.v2020_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.confluent.v2020_03_01_preview.implementation.ConfluentManager;
import com.microsoft.azure.management.confluent.v2020_03_01_preview.implementation.AgreementTermsInner;
import org.joda.time.DateTime;

/**
 * Type representing AgreementTerms.
 */
public interface AgreementTerms extends HasInner<AgreementTermsInner>, HasManager<ConfluentManager> {
    /**
     * @return the accepted value.
     */
    String accepted();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the licenseTextLink value.
     */
    String licenseTextLink();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the plan value.
     */
    String plan();

    /**
     * @return the privacyPolicyLink value.
     */
    String privacyPolicyLink();

    /**
     * @return the product value.
     */
    String product();

    /**
     * @return the publisher value.
     */
    String publisher();

    /**
     * @return the retrieveDatetime value.
     */
    DateTime retrieveDatetime();

    /**
     * @return the signature value.
     */
    String signature();

    /**
     * @return the type value.
     */
    String type();

}
