// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HealthcareEntityProperties model. */
@Fluent
public class HealthcareEntityProperties {
    /*
     * Entity text as appears in the request.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Healthcare Entity Category.
     */
    @JsonProperty(value = "category", required = true)
    private HealthcareEntityCategory category;

    /*
     * (Optional) Entity sub type.
     */
    @JsonProperty(value = "subcategory")
    private String subcategory;

    /*
     * Start position for the entity text. Use of different 'stringIndexType'
     * values can affect the offset returned.
     */
    @JsonProperty(value = "offset", required = true)
    private int offset;

    /*
     * Length for the entity text. Use of different 'stringIndexType' values
     * can affect the length returned.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /*
     * Confidence score between 0 and 1 of the extracted entity.
     */
    @JsonProperty(value = "confidenceScore", required = true)
    private double confidenceScore;

    /**
     * Get the text property: Entity text as appears in the request.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: Entity text as appears in the request.
     *
     * @param text the text value to set.
     * @return the HealthcareEntityProperties object itself.
     */
    public HealthcareEntityProperties setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the category property: Healthcare Entity Category.
     *
     * @return the category value.
     */
    public HealthcareEntityCategory getCategory() {
        return this.category;
    }

    /**
     * Set the category property: Healthcare Entity Category.
     *
     * @param category the category value to set.
     * @return the HealthcareEntityProperties object itself.
     */
    public HealthcareEntityProperties setCategory(HealthcareEntityCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get the subcategory property: (Optional) Entity sub type.
     *
     * @return the subcategory value.
     */
    public String getSubcategory() {
        return this.subcategory;
    }

    /**
     * Set the subcategory property: (Optional) Entity sub type.
     *
     * @param subcategory the subcategory value to set.
     * @return the HealthcareEntityProperties object itself.
     */
    public HealthcareEntityProperties setSubcategory(String subcategory) {
        this.subcategory = subcategory;
        return this;
    }

    /**
     * Get the offset property: Start position for the entity text. Use of different 'stringIndexType' values can affect
     * the offset returned.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Set the offset property: Start position for the entity text. Use of different 'stringIndexType' values can affect
     * the offset returned.
     *
     * @param offset the offset value to set.
     * @return the HealthcareEntityProperties object itself.
     */
    public HealthcareEntityProperties setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the length property: Length for the entity text. Use of different 'stringIndexType' values can affect the
     * length returned.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Set the length property: Length for the entity text. Use of different 'stringIndexType' values can affect the
     * length returned.
     *
     * @param length the length value to set.
     * @return the HealthcareEntityProperties object itself.
     */
    public HealthcareEntityProperties setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * Get the confidenceScore property: Confidence score between 0 and 1 of the extracted entity.
     *
     * @return the confidenceScore value.
     */
    public double getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Set the confidenceScore property: Confidence score between 0 and 1 of the extracted entity.
     *
     * @param confidenceScore the confidenceScore value to set.
     * @return the HealthcareEntityProperties object itself.
     */
    public HealthcareEntityProperties setConfidenceScore(double confidenceScore) {
        this.confidenceScore = confidenceScore;
        return this;
    }
}
