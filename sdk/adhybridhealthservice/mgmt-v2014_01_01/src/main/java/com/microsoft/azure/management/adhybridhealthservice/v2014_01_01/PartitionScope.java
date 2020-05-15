/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connector partition scope.
 */
public class PartitionScope {
    /**
     * Indicates if the partition scope is default or not.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /**
     * The in-scope object classes.
     */
    @JsonProperty(value = "objectClasses")
    private List<String> objectClasses;

    /**
     * The list of containers included.
     */
    @JsonProperty(value = "containersIncluded")
    private List<String> containersIncluded;

    /**
     * The list of containers excluded.
     */
    @JsonProperty(value = "containersExcluded")
    private List<String> containersExcluded;

    /**
     * Get indicates if the partition scope is default or not.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set indicates if the partition scope is default or not.
     *
     * @param isDefault the isDefault value to set
     * @return the PartitionScope object itself.
     */
    public PartitionScope withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the in-scope object classes.
     *
     * @return the objectClasses value
     */
    public List<String> objectClasses() {
        return this.objectClasses;
    }

    /**
     * Set the in-scope object classes.
     *
     * @param objectClasses the objectClasses value to set
     * @return the PartitionScope object itself.
     */
    public PartitionScope withObjectClasses(List<String> objectClasses) {
        this.objectClasses = objectClasses;
        return this;
    }

    /**
     * Get the list of containers included.
     *
     * @return the containersIncluded value
     */
    public List<String> containersIncluded() {
        return this.containersIncluded;
    }

    /**
     * Set the list of containers included.
     *
     * @param containersIncluded the containersIncluded value to set
     * @return the PartitionScope object itself.
     */
    public PartitionScope withContainersIncluded(List<String> containersIncluded) {
        this.containersIncluded = containersIncluded;
        return this;
    }

    /**
     * Get the list of containers excluded.
     *
     * @return the containersExcluded value
     */
    public List<String> containersExcluded() {
        return this.containersExcluded;
    }

    /**
     * Set the list of containers excluded.
     *
     * @param containersExcluded the containersExcluded value to set
     * @return the PartitionScope object itself.
     */
    public PartitionScope withContainersExcluded(List<String> containersExcluded) {
        this.containersExcluded = containersExcluded;
        return this;
    }

}
