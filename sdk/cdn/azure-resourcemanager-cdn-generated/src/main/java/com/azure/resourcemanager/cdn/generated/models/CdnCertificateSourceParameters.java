// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the parameters for using CDN managed certificate for securing custom domain. */
@Fluent
public final class CdnCertificateSourceParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CdnCertificateSourceParameters.class);

    /*
     * The @odata.type property.
     */
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /*
     * Type of certificate used
     */
    @JsonProperty(value = "certificateType", required = true)
    private CertificateType certificateType;

    /** Creates an instance of CdnCertificateSourceParameters class. */
    public CdnCertificateSourceParameters() {
        odataType = "#Microsoft.Azure.Cdn.Models.CdnCertificateSourceParameters";
    }

    /**
     * Get the odataType property: The @odata.type property.
     *
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The @odata.type property.
     *
     * @param odataType the odataType value to set.
     * @return the CdnCertificateSourceParameters object itself.
     */
    public CdnCertificateSourceParameters withOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the certificateType property: Type of certificate used.
     *
     * @return the certificateType value.
     */
    public CertificateType certificateType() {
        return this.certificateType;
    }

    /**
     * Set the certificateType property: Type of certificate used.
     *
     * @param certificateType the certificateType value to set.
     * @return the CdnCertificateSourceParameters object itself.
     */
    public CdnCertificateSourceParameters withCertificateType(CertificateType certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateType in model CdnCertificateSourceParameters"));
        }
    }
}
