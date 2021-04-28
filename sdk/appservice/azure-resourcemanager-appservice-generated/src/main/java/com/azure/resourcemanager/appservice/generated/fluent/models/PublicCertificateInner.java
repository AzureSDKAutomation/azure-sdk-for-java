// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.generated.models.PublicCertificateLocation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Public certificate object. */
@JsonFlatten
@Fluent
public class PublicCertificateInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicCertificateInner.class);

    /*
     * Public Certificate byte array
     */
    @JsonProperty(value = "properties.blob")
    private byte[] blob;

    /*
     * Public Certificate Location
     */
    @JsonProperty(value = "properties.publicCertificateLocation")
    private PublicCertificateLocation publicCertificateLocation;

    /*
     * Certificate Thumbprint
     */
    @JsonProperty(value = "properties.thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Get the blob property: Public Certificate byte array.
     *
     * @return the blob value.
     */
    public byte[] blob() {
        return CoreUtils.clone(this.blob);
    }

    /**
     * Set the blob property: Public Certificate byte array.
     *
     * @param blob the blob value to set.
     * @return the PublicCertificateInner object itself.
     */
    public PublicCertificateInner withBlob(byte[] blob) {
        this.blob = CoreUtils.clone(blob);
        return this;
    }

    /**
     * Get the publicCertificateLocation property: Public Certificate Location.
     *
     * @return the publicCertificateLocation value.
     */
    public PublicCertificateLocation publicCertificateLocation() {
        return this.publicCertificateLocation;
    }

    /**
     * Set the publicCertificateLocation property: Public Certificate Location.
     *
     * @param publicCertificateLocation the publicCertificateLocation value to set.
     * @return the PublicCertificateInner object itself.
     */
    public PublicCertificateInner withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation) {
        this.publicCertificateLocation = publicCertificateLocation;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate Thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /** {@inheritDoc} */
    @Override
    public PublicCertificateInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
