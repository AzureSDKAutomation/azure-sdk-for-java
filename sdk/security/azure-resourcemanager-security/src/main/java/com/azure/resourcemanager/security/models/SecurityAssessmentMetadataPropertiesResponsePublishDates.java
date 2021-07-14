// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SecurityAssessmentMetadataPropertiesResponsePublishDates model. */
@Fluent
public final class SecurityAssessmentMetadataPropertiesResponsePublishDates {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(SecurityAssessmentMetadataPropertiesResponsePublishDates.class);

    /*
     * The GA property.
     */
    @JsonProperty(value = "GA")
    private String ga;

    /*
     * The public property.
     */
    @JsonProperty(value = "public", required = true)
    private String publicProperty;

    /**
     * Get the ga property: The GA property.
     *
     * @return the ga value.
     */
    public String ga() {
        return this.ga;
    }

    /**
     * Set the ga property: The GA property.
     *
     * @param ga the ga value to set.
     * @return the SecurityAssessmentMetadataPropertiesResponsePublishDates object itself.
     */
    public SecurityAssessmentMetadataPropertiesResponsePublishDates withGa(String ga) {
        this.ga = ga;
        return this;
    }

    /**
     * Get the publicProperty property: The public property.
     *
     * @return the publicProperty value.
     */
    public String publicProperty() {
        return this.publicProperty;
    }

    /**
     * Set the publicProperty property: The public property.
     *
     * @param publicProperty the publicProperty value to set.
     * @return the SecurityAssessmentMetadataPropertiesResponsePublishDates object itself.
     */
    public SecurityAssessmentMetadataPropertiesResponsePublishDates withPublicProperty(String publicProperty) {
        this.publicProperty = publicProperty;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicProperty() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publicProperty in model"
                            + " SecurityAssessmentMetadataPropertiesResponsePublishDates"));
        }
    }
}
