/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.FormulaPropertiesFromVm;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A formula.
 */
@JsonFlatten
public class FormulaInner extends Resource {
    /**
     * The description of the formula.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The author of the formula.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * The OS type of the formula.
     */
    @JsonProperty(value = "properties.osType")
    private String osType;

    /**
     * The creation date of the formula.
     */
    @JsonProperty(value = "properties.creationDate")
    private DateTime creationDate;

    /**
     * The content of the formula.
     */
    @JsonProperty(value = "properties.formulaContent")
    private LabVirtualMachineInner formulaContent;

    /**
     * Information about a VM from which a formula is to be created.
     */
    @JsonProperty(value = "properties.vm")
    private FormulaPropertiesFromVm vm;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the description of the formula.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the formula.
     *
     * @param description the description value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the author of the formula.
     *
     * @return the author value
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author of the formula.
     *
     * @param author the author value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the OS type of the formula.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the formula.
     *
     * @param osType the osType value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the creation date of the formula.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Set the creation date of the formula.
     *
     * @param creationDate the creationDate value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Get the content of the formula.
     *
     * @return the formulaContent value
     */
    public LabVirtualMachineInner formulaContent() {
        return this.formulaContent;
    }

    /**
     * Set the content of the formula.
     *
     * @param formulaContent the formulaContent value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withFormulaContent(LabVirtualMachineInner formulaContent) {
        this.formulaContent = formulaContent;
        return this;
    }

    /**
     * Get information about a VM from which a formula is to be created.
     *
     * @return the vm value
     */
    public FormulaPropertiesFromVm vm() {
        return this.vm;
    }

    /**
     * Set information about a VM from which a formula is to be created.
     *
     * @param vm the vm value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withVm(FormulaPropertiesFromVm vm) {
        this.vm = vm;
        return this;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
