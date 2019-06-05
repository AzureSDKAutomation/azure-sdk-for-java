/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Certificate details.
 */
@JsonFlatten
public class CertificateContractInner extends ProxyResource {
    /**
     * Subject attribute of the certificate.
     */
    @JsonProperty(value = "properties.subject", required = true)
    private String subject;

    /**
     * Thumbprint of the certificate.
     */
    @JsonProperty(value = "properties.thumbprint", required = true)
    private String thumbprint;

    /**
     * Expiration date of the certificate. The date conforms to the following
     * format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     */
    @JsonProperty(value = "properties.expirationDate", required = true)
    private DateTime expirationDate;

    /**
     * Get subject attribute of the certificate.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set subject attribute of the certificate.
     *
     * @param subject the subject value to set
     * @return the CertificateContractInner object itself.
     */
    public CertificateContractInner withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get thumbprint of the certificate.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set thumbprint of the certificate.
     *
     * @param thumbprint the thumbprint value to set
     * @return the CertificateContractInner object itself.
     */
    public CertificateContractInner withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get expiration date of the certificate. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the expirationDate value
     */
    public DateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set expiration date of the certificate. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param expirationDate the expirationDate value to set
     * @return the CertificateContractInner object itself.
     */
    public CertificateContractInner withExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

}
