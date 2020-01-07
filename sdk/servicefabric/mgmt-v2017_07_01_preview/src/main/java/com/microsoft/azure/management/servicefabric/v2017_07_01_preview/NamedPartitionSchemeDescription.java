/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the named partition scheme of the service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "PartitionScheme", defaultImpl = NamedPartitionSchemeDescription.class)
@JsonTypeName("Named")
public class NamedPartitionSchemeDescription extends PartitionSchemeDescription {
    /**
     * The number of partitions.
     */
    @JsonProperty(value = "Count", required = true)
    private int count;

    /**
     * Array of size specified by the ‘Count’ parameter, for the names of the
     * partitions.
     */
    @JsonProperty(value = "Names", required = true)
    private List<String> names;

    /**
     * Get the number of partitions.
     *
     * @return the count value
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the number of partitions.
     *
     * @param count the count value to set
     * @return the NamedPartitionSchemeDescription object itself.
     */
    public NamedPartitionSchemeDescription withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get array of size specified by the ‘Count’ parameter, for the names of the partitions.
     *
     * @return the names value
     */
    public List<String> names() {
        return this.names;
    }

    /**
     * Set array of size specified by the ‘Count’ parameter, for the names of the partitions.
     *
     * @param names the names value to set
     * @return the NamedPartitionSchemeDescription object itself.
     */
    public NamedPartitionSchemeDescription withNames(List<String> names) {
        this.names = names;
        return this;
    }

}
