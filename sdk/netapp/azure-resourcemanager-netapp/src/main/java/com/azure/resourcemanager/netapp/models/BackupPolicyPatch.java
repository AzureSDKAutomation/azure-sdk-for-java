// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Backup policy Details for create and update. */
@JsonFlatten
@Fluent
public class BackupPolicyPatch extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupPolicyPatch.class);

    /*
     * Azure lifecycle management
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Daily backups count to keep
     */
    @JsonProperty(value = "properties.dailyBackupsToKeep")
    private Integer dailyBackupsToKeep;

    /*
     * Weekly backups count to keep
     */
    @JsonProperty(value = "properties.weeklyBackupsToKeep")
    private Integer weeklyBackupsToKeep;

    /*
     * Monthly backups count to keep
     */
    @JsonProperty(value = "properties.monthlyBackupsToKeep")
    private Integer monthlyBackupsToKeep;

    /*
     * Yearly backups count to keep
     */
    @JsonProperty(value = "properties.yearlyBackupsToKeep")
    private Integer yearlyBackupsToKeep;

    /*
     * Volumes using current backup policy
     */
    @JsonProperty(value = "properties.volumesAssigned")
    private Integer volumesAssigned;

    /*
     * The property to decide policy is enabled or not
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * A list of volumes assigned to this policy
     */
    @JsonProperty(value = "properties.volumeBackups")
    private List<VolumeBackups> volumeBackups;

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the dailyBackupsToKeep property: Daily backups count to keep.
     *
     * @return the dailyBackupsToKeep value.
     */
    public Integer dailyBackupsToKeep() {
        return this.dailyBackupsToKeep;
    }

    /**
     * Set the dailyBackupsToKeep property: Daily backups count to keep.
     *
     * @param dailyBackupsToKeep the dailyBackupsToKeep value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withDailyBackupsToKeep(Integer dailyBackupsToKeep) {
        this.dailyBackupsToKeep = dailyBackupsToKeep;
        return this;
    }

    /**
     * Get the weeklyBackupsToKeep property: Weekly backups count to keep.
     *
     * @return the weeklyBackupsToKeep value.
     */
    public Integer weeklyBackupsToKeep() {
        return this.weeklyBackupsToKeep;
    }

    /**
     * Set the weeklyBackupsToKeep property: Weekly backups count to keep.
     *
     * @param weeklyBackupsToKeep the weeklyBackupsToKeep value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep) {
        this.weeklyBackupsToKeep = weeklyBackupsToKeep;
        return this;
    }

    /**
     * Get the monthlyBackupsToKeep property: Monthly backups count to keep.
     *
     * @return the monthlyBackupsToKeep value.
     */
    public Integer monthlyBackupsToKeep() {
        return this.monthlyBackupsToKeep;
    }

    /**
     * Set the monthlyBackupsToKeep property: Monthly backups count to keep.
     *
     * @param monthlyBackupsToKeep the monthlyBackupsToKeep value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep) {
        this.monthlyBackupsToKeep = monthlyBackupsToKeep;
        return this;
    }

    /**
     * Get the yearlyBackupsToKeep property: Yearly backups count to keep.
     *
     * @return the yearlyBackupsToKeep value.
     */
    public Integer yearlyBackupsToKeep() {
        return this.yearlyBackupsToKeep;
    }

    /**
     * Set the yearlyBackupsToKeep property: Yearly backups count to keep.
     *
     * @param yearlyBackupsToKeep the yearlyBackupsToKeep value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withYearlyBackupsToKeep(Integer yearlyBackupsToKeep) {
        this.yearlyBackupsToKeep = yearlyBackupsToKeep;
        return this;
    }

    /**
     * Get the volumesAssigned property: Volumes using current backup policy.
     *
     * @return the volumesAssigned value.
     */
    public Integer volumesAssigned() {
        return this.volumesAssigned;
    }

    /**
     * Set the volumesAssigned property: Volumes using current backup policy.
     *
     * @param volumesAssigned the volumesAssigned value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withVolumesAssigned(Integer volumesAssigned) {
        this.volumesAssigned = volumesAssigned;
        return this;
    }

    /**
     * Get the enabled property: The property to decide policy is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The property to decide policy is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the volumeBackups property: A list of volumes assigned to this policy.
     *
     * @return the volumeBackups value.
     */
    public List<VolumeBackups> volumeBackups() {
        return this.volumeBackups;
    }

    /**
     * Set the volumeBackups property: A list of volumes assigned to this policy.
     *
     * @param volumeBackups the volumeBackups value to set.
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withVolumeBackups(List<VolumeBackups> volumeBackups) {
        this.volumeBackups = volumeBackups;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackupPolicyPatch withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BackupPolicyPatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (volumeBackups() != null) {
            volumeBackups().forEach(e -> e.validate());
        }
    }
}
