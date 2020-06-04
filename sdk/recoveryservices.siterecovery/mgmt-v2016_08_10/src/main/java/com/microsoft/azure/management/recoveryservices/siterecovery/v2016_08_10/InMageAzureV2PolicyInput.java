/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMWare Azure specific protection profile Input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = InMageAzureV2PolicyInput.class)
@JsonTypeName("InMageAzureV2")
public class InMageAzureV2PolicyInput extends PolicyProviderSpecificInput {
    /**
     * The recovery point threshold in minutes.
     */
    @JsonProperty(value = "recoveryPointThresholdInMinutes")
    private Integer recoveryPointThresholdInMinutes;

    /**
     * The duration in minutes until which the recovery points need to be
     * stored.
     */
    @JsonProperty(value = "recoveryPointHistory")
    private Integer recoveryPointHistory;

    /**
     * The crash consistent snapshot frequency (in minutes).
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes")
    private Integer crashConsistentFrequencyInMinutes;

    /**
     * The app consistent snapshot frequency (in minutes).
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes")
    private Integer appConsistentFrequencyInMinutes;

    /**
     * A value indicating whether multi-VM sync has to be enabled. Value should
     * be 'Enabled' or 'Disabled'. Possible values include: 'Enable',
     * 'Disable'.
     */
    @JsonProperty(value = "multiVmSyncStatus", required = true)
    private SetMultiVmSyncStatus multiVmSyncStatus;

    /**
     * Get the recovery point threshold in minutes.
     *
     * @return the recoveryPointThresholdInMinutes value
     */
    public Integer recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes;
    }

    /**
     * Set the recovery point threshold in minutes.
     *
     * @param recoveryPointThresholdInMinutes the recoveryPointThresholdInMinutes value to set
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withRecoveryPointThresholdInMinutes(Integer recoveryPointThresholdInMinutes) {
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
        return this;
    }

    /**
     * Get the duration in minutes until which the recovery points need to be stored.
     *
     * @return the recoveryPointHistory value
     */
    public Integer recoveryPointHistory() {
        return this.recoveryPointHistory;
    }

    /**
     * Set the duration in minutes until which the recovery points need to be stored.
     *
     * @param recoveryPointHistory the recoveryPointHistory value to set
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withRecoveryPointHistory(Integer recoveryPointHistory) {
        this.recoveryPointHistory = recoveryPointHistory;
        return this;
    }

    /**
     * Get the crash consistent snapshot frequency (in minutes).
     *
     * @return the crashConsistentFrequencyInMinutes value
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crash consistent snapshot frequency (in minutes).
     *
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the app consistent snapshot frequency (in minutes).
     *
     * @return the appConsistentFrequencyInMinutes value
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the app consistent snapshot frequency (in minutes).
     *
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get a value indicating whether multi-VM sync has to be enabled. Value should be 'Enabled' or 'Disabled'. Possible values include: 'Enable', 'Disable'.
     *
     * @return the multiVmSyncStatus value
     */
    public SetMultiVmSyncStatus multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set a value indicating whether multi-VM sync has to be enabled. Value should be 'Enabled' or 'Disabled'. Possible values include: 'Enable', 'Disable'.
     *
     * @param multiVmSyncStatus the multiVmSyncStatus value to set
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withMultiVmSyncStatus(SetMultiVmSyncStatus multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
        return this;
    }

}
