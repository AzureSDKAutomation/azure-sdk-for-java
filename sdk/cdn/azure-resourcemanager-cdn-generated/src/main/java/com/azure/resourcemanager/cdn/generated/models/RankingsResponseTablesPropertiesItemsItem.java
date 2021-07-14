// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RankingsResponseTablesPropertiesItemsItem model. */
@Fluent
public final class RankingsResponseTablesPropertiesItemsItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RankingsResponseTablesPropertiesItemsItem.class);

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The metrics property.
     */
    @JsonProperty(value = "metrics")
    private List<RankingsResponseTablesPropertiesItemsMetricsItem> metrics;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the RankingsResponseTablesPropertiesItemsItem object itself.
     */
    public RankingsResponseTablesPropertiesItemsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the metrics property: The metrics property.
     *
     * @return the metrics value.
     */
    public List<RankingsResponseTablesPropertiesItemsMetricsItem> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: The metrics property.
     *
     * @param metrics the metrics value to set.
     * @return the RankingsResponseTablesPropertiesItemsItem object itself.
     */
    public RankingsResponseTablesPropertiesItemsItem withMetrics(
        List<RankingsResponseTablesPropertiesItemsMetricsItem> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
    }
}
