// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Organization resource properties. */
@Immutable
public final class OrganizationResourceProperties extends OrganizationResourcePropertiesAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrganizationResourceProperties.class);

    /** {@inheritDoc} */
    @Override
    public OrganizationResourceProperties withOfferDetail(OrganizationResourcePropertiesOfferDetail offerDetail) {
        super.withOfferDetail(offerDetail);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrganizationResourceProperties withUserDetail(OrganizationResourcePropertiesUserDetail userDetail) {
        super.withUserDetail(userDetail);
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
