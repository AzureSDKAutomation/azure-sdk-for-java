/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.anomalydetector.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ChangePointDetectRequest model.
 */
public class ChangePointDetectRequest {
    /**
     * Time series data points. Points should be sorted by timestamp in
     * ascending order to match the change point detection result.
     */
    @JsonProperty(value = "series", required = true)
    private List<TimeSeriesPoint> series;

    /**
     * Can only be one of yearly, monthly, weekly, daily, hourly, minutely or
     * secondly. Granularity is used for verify whether input series is valid.
     * Possible values include: 'yearly', 'monthly', 'weekly', 'daily',
     * 'hourly', 'perMinute', 'perSecond'.
     */
    @JsonProperty(value = "granularity", required = true)
    private TimeGranularity granularity;

    /**
     * Custom Interval is used to set non-standard time interval, for example,
     * if the series is 5 minutes, request can be set as
     * {"granularity":"minutely", "customInterval":5}.
     */
    @JsonProperty(value = "customInterval")
    private Integer customInterval;

    /**
     * Optional argument, periodic value of a time series. If the value is null
     * or does not present, the API will determine the period automatically.
     */
    @JsonProperty(value = "period")
    private Integer periodProperty;

    /**
     * Optional argument, advanced model parameter, a default stableTrendWindow
     * will be used in detection.
     */
    @JsonProperty(value = "stableTrendWindow")
    private Integer stableTrendWindow;

    /**
     * Optional argument, advanced model parameter, between 0.0-1.0, the lower
     * the value is, the larger the trend error will be which means less change
     * point will be accepted.
     */
    @JsonProperty(value = "threshold")
    private Double threshold;

    /**
     * Get time series data points. Points should be sorted by timestamp in ascending order to match the change point detection result.
     *
     * @return the series value
     */
    public List<TimeSeriesPoint> series() {
        return this.series;
    }

    /**
     * Set time series data points. Points should be sorted by timestamp in ascending order to match the change point detection result.
     *
     * @param series the series value to set
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest withSeries(List<TimeSeriesPoint> series) {
        this.series = series;
        return this;
    }

    /**
     * Get can only be one of yearly, monthly, weekly, daily, hourly, minutely or secondly. Granularity is used for verify whether input series is valid. Possible values include: 'yearly', 'monthly', 'weekly', 'daily', 'hourly', 'perMinute', 'perSecond'.
     *
     * @return the granularity value
     */
    public TimeGranularity granularity() {
        return this.granularity;
    }

    /**
     * Set can only be one of yearly, monthly, weekly, daily, hourly, minutely or secondly. Granularity is used for verify whether input series is valid. Possible values include: 'yearly', 'monthly', 'weekly', 'daily', 'hourly', 'perMinute', 'perSecond'.
     *
     * @param granularity the granularity value to set
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest withGranularity(TimeGranularity granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * Get custom Interval is used to set non-standard time interval, for example, if the series is 5 minutes, request can be set as {"granularity":"minutely", "customInterval":5}.
     *
     * @return the customInterval value
     */
    public Integer customInterval() {
        return this.customInterval;
    }

    /**
     * Set custom Interval is used to set non-standard time interval, for example, if the series is 5 minutes, request can be set as {"granularity":"minutely", "customInterval":5}.
     *
     * @param customInterval the customInterval value to set
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest withCustomInterval(Integer customInterval) {
        this.customInterval = customInterval;
        return this;
    }

    /**
     * Get optional argument, periodic value of a time series. If the value is null or does not present, the API will determine the period automatically.
     *
     * @return the periodProperty value
     */
    public Integer periodProperty() {
        return this.periodProperty;
    }

    /**
     * Set optional argument, periodic value of a time series. If the value is null or does not present, the API will determine the period automatically.
     *
     * @param periodProperty the periodProperty value to set
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest withPeriodProperty(Integer periodProperty) {
        this.periodProperty = periodProperty;
        return this;
    }

    /**
     * Get optional argument, advanced model parameter, a default stableTrendWindow will be used in detection.
     *
     * @return the stableTrendWindow value
     */
    public Integer stableTrendWindow() {
        return this.stableTrendWindow;
    }

    /**
     * Set optional argument, advanced model parameter, a default stableTrendWindow will be used in detection.
     *
     * @param stableTrendWindow the stableTrendWindow value to set
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest withStableTrendWindow(Integer stableTrendWindow) {
        this.stableTrendWindow = stableTrendWindow;
        return this;
    }

    /**
     * Get optional argument, advanced model parameter, between 0.0-1.0, the lower the value is, the larger the trend error will be which means less change point will be accepted.
     *
     * @return the threshold value
     */
    public Double threshold() {
        return this.threshold;
    }

    /**
     * Set optional argument, advanced model parameter, between 0.0-1.0, the lower the value is, the larger the trend error will be which means less change point will be accepted.
     *
     * @param threshold the threshold value to set
     * @return the ChangePointDetectRequest object itself.
     */
    public ChangePointDetectRequest withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

}
