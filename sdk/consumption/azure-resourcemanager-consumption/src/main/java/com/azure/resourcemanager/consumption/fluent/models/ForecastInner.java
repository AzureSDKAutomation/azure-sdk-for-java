// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.models.ChargeType;
import com.azure.resourcemanager.consumption.models.ForecastPropertiesConfidenceLevelsItem;
import com.azure.resourcemanager.consumption.models.Grain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/** A forecast resource. */
@JsonFlatten
@Fluent
public class ForecastInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ForecastInner.class);

    /*
     * The usage date of the forecast.
     */
    @JsonProperty(value = "properties.usageDate", access = JsonProperty.Access.WRITE_ONLY)
    private String usageDate;

    /*
     * The granularity of forecast. Please note that Yearly is not currently
     * supported in this API. The API will provide responses in the Monthly
     * grain if Yearly is selected. To get yearly grain data, please use our
     * newer Forecast API.
     */
    @JsonProperty(value = "properties.grain")
    private Grain grain;

    /*
     * The amount of charge
     */
    @JsonProperty(value = "properties.charge", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal charge;

    /*
     * The ISO currency in which the meter is charged, for example, USD.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * The type of the charge. Could be actual or forecast
     */
    @JsonProperty(value = "properties.chargeType")
    private ChargeType chargeType;

    /*
     * The details about the forecast confidence levels. This is populated only
     * when chargeType is Forecast.
     */
    @JsonProperty(value = "properties.confidenceLevels", access = JsonProperty.Access.WRITE_ONLY)
    private List<ForecastPropertiesConfidenceLevelsItem> confidenceLevels;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the usageDate property: The usage date of the forecast.
     *
     * @return the usageDate value.
     */
    public String usageDate() {
        return this.usageDate;
    }

    /**
     * Get the grain property: The granularity of forecast. Please note that Yearly is not currently supported in this
     * API. The API will provide responses in the Monthly grain if Yearly is selected. To get yearly grain data, please
     * use our newer Forecast API.
     *
     * @return the grain value.
     */
    public Grain grain() {
        return this.grain;
    }

    /**
     * Set the grain property: The granularity of forecast. Please note that Yearly is not currently supported in this
     * API. The API will provide responses in the Monthly grain if Yearly is selected. To get yearly grain data, please
     * use our newer Forecast API.
     *
     * @param grain the grain value to set.
     * @return the ForecastInner object itself.
     */
    public ForecastInner withGrain(Grain grain) {
        this.grain = grain;
        return this;
    }

    /**
     * Get the charge property: The amount of charge.
     *
     * @return the charge value.
     */
    public BigDecimal charge() {
        return this.charge;
    }

    /**
     * Get the currency property: The ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the chargeType property: The type of the charge. Could be actual or forecast.
     *
     * @return the chargeType value.
     */
    public ChargeType chargeType() {
        return this.chargeType;
    }

    /**
     * Set the chargeType property: The type of the charge. Could be actual or forecast.
     *
     * @param chargeType the chargeType value to set.
     * @return the ForecastInner object itself.
     */
    public ForecastInner withChargeType(ChargeType chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    /**
     * Get the confidenceLevels property: The details about the forecast confidence levels. This is populated only when
     * chargeType is Forecast.
     *
     * @return the confidenceLevels value.
     */
    public List<ForecastPropertiesConfidenceLevelsItem> confidenceLevels() {
        return this.confidenceLevels;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (confidenceLevels() != null) {
            confidenceLevels().forEach(e -> e.validate());
        }
    }
}
