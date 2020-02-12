/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for StageName.
 */
public enum StageName {
    /** An order has been created. */
    DEVICE_ORDERED("DeviceOrdered"),

    /** A device has been prepared for the order. */
    DEVICE_PREPARED("DevicePrepared"),

    /** Device has been dispatched to the user of the order. */
    DISPATCHED("Dispatched"),

    /** Device has been delivered to the user of the order. */
    DELIVERED("Delivered"),

    /** Device has been picked up from user and in transit to azure datacenter. */
    PICKED_UP("PickedUp"),

    /** Device has been received at azure datacenter from the user. */
    AT_AZURE_DC("AtAzureDC"),

    /** Data copy from the device at azure datacenter. */
    DATA_COPY("DataCopy"),

    /** Order has completed. */
    COMPLETED("Completed"),

    /** Order has completed with errors. */
    COMPLETED_WITH_ERRORS("CompletedWithErrors"),

    /** Order has been cancelled. */
    CANCELLED("Cancelled"),

    /** Order has failed due to issue reported by user. */
    FAILED_ISSUE_REPORTED_AT_CUSTOMER("Failed_IssueReportedAtCustomer"),

    /** Order has failed due to issue detected at azure datacenter. */
    FAILED_ISSUE_DETECTED_AT_AZURE_DC("Failed_IssueDetectedAtAzureDC"),

    /** Order has been aborted. */
    ABORTED("Aborted"),

    /** Order has completed with warnings. */
    COMPLETED_WITH_WARNINGS("CompletedWithWarnings"),

    /** Device is ready to be handed to customer from Azure DC. */
    READY_TO_DISPATCH_FROM_AZURE_DC("ReadyToDispatchFromAzureDC"),

    /** Device can be dropped off at Azure DC. */
    READY_TO_RECEIVE_AT_AZURE_DC("ReadyToReceiveAtAzureDC");

    /** The actual serialized value for a StageName instance. */
    private String value;

    StageName(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StageName instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StageName object, or null if unable to parse.
     */
    @JsonCreator
    public static StageName fromString(String value) {
        StageName[] items = StageName.values();
        for (StageName item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
