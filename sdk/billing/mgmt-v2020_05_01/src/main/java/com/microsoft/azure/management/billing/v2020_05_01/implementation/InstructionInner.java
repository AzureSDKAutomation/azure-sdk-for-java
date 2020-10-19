/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An instruction.
 */
@JsonFlatten
public class InstructionInner extends ProxyResource {
    /**
     * The amount budgeted for this billing instruction.
     */
    @JsonProperty(value = "properties.amount", required = true)
    private double amount;

    /**
     * The date this billing instruction goes into effect.
     */
    @JsonProperty(value = "properties.startDate", required = true)
    private DateTime startDate;

    /**
     * The date this billing instruction is no longer in effect.
     */
    @JsonProperty(value = "properties.endDate", required = true)
    private DateTime endDate;

    /**
     * The date this billing instruction was created.
     */
    @JsonProperty(value = "properties.creationDate")
    private DateTime creationDate;

    /**
     * Get the amount budgeted for this billing instruction.
     *
     * @return the amount value
     */
    public double amount() {
        return this.amount;
    }

    /**
     * Set the amount budgeted for this billing instruction.
     *
     * @param amount the amount value to set
     * @return the InstructionInner object itself.
     */
    public InstructionInner withAmount(double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the date this billing instruction goes into effect.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the date this billing instruction goes into effect.
     *
     * @param startDate the startDate value to set
     * @return the InstructionInner object itself.
     */
    public InstructionInner withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the date this billing instruction is no longer in effect.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the date this billing instruction is no longer in effect.
     *
     * @param endDate the endDate value to set
     * @return the InstructionInner object itself.
     */
    public InstructionInner withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the date this billing instruction was created.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Set the date this billing instruction was created.
     *
     * @param creationDate the creationDate value to set
     * @return the InstructionInner object itself.
     */
    public InstructionInner withCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

}
