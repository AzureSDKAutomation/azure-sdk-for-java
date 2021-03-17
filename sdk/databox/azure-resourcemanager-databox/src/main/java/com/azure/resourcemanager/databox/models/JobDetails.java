// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Job details. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "jobDetailsType",
    defaultImpl = JobDetails.class)
@JsonTypeName("JobDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DataBoxDisk", value = DataBoxDiskJobDetails.class),
    @JsonSubTypes.Type(name = "DataBoxHeavy", value = DataBoxHeavyJobDetails.class),
    @JsonSubTypes.Type(name = "DataBox", value = DataBoxJobDetails.class)
})
@Fluent
public class JobDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobDetails.class);

    /*
     * List of stages that run in the job.
     */
    @JsonProperty(value = "jobStages", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobStages> jobStages;

    /*
     * Contact details for notification and shipping.
     */
    @JsonProperty(value = "contactDetails", required = true)
    private ContactDetails contactDetails;

    /*
     * Shipping address of the customer.
     */
    @JsonProperty(value = "shippingAddress")
    private ShippingAddress shippingAddress;

    /*
     * Delivery package shipping details.
     */
    @JsonProperty(value = "deliveryPackage", access = JsonProperty.Access.WRITE_ONLY)
    private PackageShippingDetails deliveryPackage;

    /*
     * Return package shipping details.
     */
    @JsonProperty(value = "returnPackage", access = JsonProperty.Access.WRITE_ONLY)
    private PackageShippingDetails returnPackage;

    /*
     * Details of the data to be imported into azure.
     */
    @JsonProperty(value = "dataImportDetails")
    private List<DataImportDetails> dataImportDetails;

    /*
     * Details of the data to be exported from azure.
     */
    @JsonProperty(value = "dataExportDetails")
    private List<DataExportDetails> dataExportDetails;

    /*
     * Preferences for the order.
     */
    @JsonProperty(value = "preferences")
    private Preferences preferences;

    /*
     * List of copy log details.
     */
    @JsonProperty(value = "copyLogDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<CopyLogDetails> copyLogDetails;

    /*
     * Shared access key to download the return shipment label
     */
    @JsonProperty(value = "reverseShipmentLabelSasKey", access = JsonProperty.Access.WRITE_ONLY)
    private String reverseShipmentLabelSasKey;

    /*
     * Shared access key to download the chain of custody logs
     */
    @JsonProperty(value = "chainOfCustodySasKey", access = JsonProperty.Access.WRITE_ONLY)
    private String chainOfCustodySasKey;

    /*
     * Details about which key encryption type is being used.
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyEncryptionKey keyEncryptionKey;

    /*
     * The expected size of the data, which needs to be transferred in this
     * job, in terabytes.
     */
    @JsonProperty(value = "expectedDataSizeInTeraBytes")
    private Integer expectedDataSizeInTeraBytes;

    /**
     * Get the jobStages property: List of stages that run in the job.
     *
     * @return the jobStages value.
     */
    public List<JobStages> jobStages() {
        return this.jobStages;
    }

    /**
     * Get the contactDetails property: Contact details for notification and shipping.
     *
     * @return the contactDetails value.
     */
    public ContactDetails contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set the contactDetails property: Contact details for notification and shipping.
     *
     * @param contactDetails the contactDetails value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails withContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Get the shippingAddress property: Shipping address of the customer.
     *
     * @return the shippingAddress value.
     */
    public ShippingAddress shippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Set the shippingAddress property: Shipping address of the customer.
     *
     * @param shippingAddress the shippingAddress value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails withShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Get the deliveryPackage property: Delivery package shipping details.
     *
     * @return the deliveryPackage value.
     */
    public PackageShippingDetails deliveryPackage() {
        return this.deliveryPackage;
    }

    /**
     * Get the returnPackage property: Return package shipping details.
     *
     * @return the returnPackage value.
     */
    public PackageShippingDetails returnPackage() {
        return this.returnPackage;
    }

    /**
     * Get the dataImportDetails property: Details of the data to be imported into azure.
     *
     * @return the dataImportDetails value.
     */
    public List<DataImportDetails> dataImportDetails() {
        return this.dataImportDetails;
    }

    /**
     * Set the dataImportDetails property: Details of the data to be imported into azure.
     *
     * @param dataImportDetails the dataImportDetails value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails withDataImportDetails(List<DataImportDetails> dataImportDetails) {
        this.dataImportDetails = dataImportDetails;
        return this;
    }

    /**
     * Get the dataExportDetails property: Details of the data to be exported from azure.
     *
     * @return the dataExportDetails value.
     */
    public List<DataExportDetails> dataExportDetails() {
        return this.dataExportDetails;
    }

    /**
     * Set the dataExportDetails property: Details of the data to be exported from azure.
     *
     * @param dataExportDetails the dataExportDetails value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails withDataExportDetails(List<DataExportDetails> dataExportDetails) {
        this.dataExportDetails = dataExportDetails;
        return this;
    }

    /**
     * Get the preferences property: Preferences for the order.
     *
     * @return the preferences value.
     */
    public Preferences preferences() {
        return this.preferences;
    }

    /**
     * Set the preferences property: Preferences for the order.
     *
     * @param preferences the preferences value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails withPreferences(Preferences preferences) {
        this.preferences = preferences;
        return this;
    }

    /**
     * Get the copyLogDetails property: List of copy log details.
     *
     * @return the copyLogDetails value.
     */
    public List<CopyLogDetails> copyLogDetails() {
        return this.copyLogDetails;
    }

    /**
     * Get the reverseShipmentLabelSasKey property: Shared access key to download the return shipment label.
     *
     * @return the reverseShipmentLabelSasKey value.
     */
    public String reverseShipmentLabelSasKey() {
        return this.reverseShipmentLabelSasKey;
    }

    /**
     * Get the chainOfCustodySasKey property: Shared access key to download the chain of custody logs.
     *
     * @return the chainOfCustodySasKey value.
     */
    public String chainOfCustodySasKey() {
        return this.chainOfCustodySasKey;
    }

    /**
     * Get the keyEncryptionKey property: Details about which key encryption type is being used.
     *
     * @return the keyEncryptionKey value.
     */
    public KeyEncryptionKey keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set the keyEncryptionKey property: Details about which key encryption type is being used.
     *
     * @param keyEncryptionKey the keyEncryptionKey value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails withKeyEncryptionKey(KeyEncryptionKey keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }

    /**
     * Get the expectedDataSizeInTeraBytes property: The expected size of the data, which needs to be transferred in
     * this job, in terabytes.
     *
     * @return the expectedDataSizeInTeraBytes value.
     */
    public Integer expectedDataSizeInTeraBytes() {
        return this.expectedDataSizeInTeraBytes;
    }

    /**
     * Set the expectedDataSizeInTeraBytes property: The expected size of the data, which needs to be transferred in
     * this job, in terabytes.
     *
     * @param expectedDataSizeInTeraBytes the expectedDataSizeInTeraBytes value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails withExpectedDataSizeInTeraBytes(Integer expectedDataSizeInTeraBytes) {
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (jobStages() != null) {
            jobStages().forEach(e -> e.validate());
        }
        if (contactDetails() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property contactDetails in model JobDetails"));
        } else {
            contactDetails().validate();
        }
        if (shippingAddress() != null) {
            shippingAddress().validate();
        }
        if (deliveryPackage() != null) {
            deliveryPackage().validate();
        }
        if (returnPackage() != null) {
            returnPackage().validate();
        }
        if (dataImportDetails() != null) {
            dataImportDetails().forEach(e -> e.validate());
        }
        if (dataExportDetails() != null) {
            dataExportDetails().forEach(e -> e.validate());
        }
        if (preferences() != null) {
            preferences().validate();
        }
        if (copyLogDetails() != null) {
            copyLogDetails().forEach(e -> e.validate());
        }
        if (keyEncryptionKey() != null) {
            keyEncryptionKey().validate();
        }
    }
}
