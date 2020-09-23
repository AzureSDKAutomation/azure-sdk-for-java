// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MediaLiveEventIncomingStreamsOutOfSyncEventData model. */
@Immutable
public final class MediaLiveEventIncomingStreamsOutOfSyncEventData {
    /*
     * Gets the minimum last timestamp received.
     */
    @JsonProperty(value = "minLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String minLastTimestamp;

    /*
     * Gets the type of stream with minimum last timestamp.
     */
    @JsonProperty(value = "typeOfStreamWithMinLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String typeOfStreamWithMinLastTimestamp;

    /*
     * Gets the maximum timestamp among all the tracks (audio or video).
     */
    @JsonProperty(value = "maxLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String maxLastTimestamp;

    /*
     * Gets the type of stream with maximum last timestamp.
     */
    @JsonProperty(value = "typeOfStreamWithMaxLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String typeOfStreamWithMaxLastTimestamp;

    /*
     * Gets the timescale in which "MinLastTimestamp" is represented.
     */
    @JsonProperty(value = "timescaleOfMinLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timescaleOfMinLastTimestamp;

    /*
     * Gets the timescale in which "MaxLastTimestamp" is represented.
     */
    @JsonProperty(value = "timescaleOfMaxLastTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timescaleOfMaxLastTimestamp;

    /**
     * Get the minLastTimestamp property: Gets the minimum last timestamp received.
     *
     * @return the minLastTimestamp value.
     */
    public String getMinLastTimestamp() {
        return this.minLastTimestamp;
    }

    /**
     * Get the typeOfStreamWithMinLastTimestamp property: Gets the type of stream with minimum last timestamp.
     *
     * @return the typeOfStreamWithMinLastTimestamp value.
     */
    public String getTypeOfStreamWithMinLastTimestamp() {
        return this.typeOfStreamWithMinLastTimestamp;
    }

    /**
     * Get the maxLastTimestamp property: Gets the maximum timestamp among all the tracks (audio or video).
     *
     * @return the maxLastTimestamp value.
     */
    public String getMaxLastTimestamp() {
        return this.maxLastTimestamp;
    }

    /**
     * Get the typeOfStreamWithMaxLastTimestamp property: Gets the type of stream with maximum last timestamp.
     *
     * @return the typeOfStreamWithMaxLastTimestamp value.
     */
    public String getTypeOfStreamWithMaxLastTimestamp() {
        return this.typeOfStreamWithMaxLastTimestamp;
    }

    /**
     * Get the timescaleOfMinLastTimestamp property: Gets the timescale in which "MinLastTimestamp" is represented.
     *
     * @return the timescaleOfMinLastTimestamp value.
     */
    public String getTimescaleOfMinLastTimestamp() {
        return this.timescaleOfMinLastTimestamp;
    }

    /**
     * Get the timescaleOfMaxLastTimestamp property: Gets the timescale in which "MaxLastTimestamp" is represented.
     *
     * @return the timescaleOfMaxLastTimestamp value.
     */
    public String getTimescaleOfMaxLastTimestamp() {
        return this.timescaleOfMaxLastTimestamp;
    }
}
