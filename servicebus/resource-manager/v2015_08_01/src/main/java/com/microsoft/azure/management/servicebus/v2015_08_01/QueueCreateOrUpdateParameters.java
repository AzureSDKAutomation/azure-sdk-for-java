/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create Or Update Queue operation.
 */
@JsonFlatten
public class QueueCreateOrUpdateParameters {
    /**
     * Queue name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The duration of a peek-lock; that is, the amount of time that the
     * message is locked for other receivers. The maximum value for
     * LockDuration is 5 minutes; the default value is 1 minute.
     */
    @JsonProperty(value = "properties.lockDuration")
    private String lockDuration;

    /**
     * Last time a message was sent, or the last time there was a receive
     * request to this queue.
     */
    @JsonProperty(value = "properties.accessedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime accessedAt;

    /**
     * the TimeSpan idle interval after which the queue is automatically
     * deleted. The minimum duration is 5 minutes.
     */
    @JsonProperty(value = "properties.autoDeleteOnIdle")
    private String autoDeleteOnIdle;

    /**
     * Entity availability status for the queue. Possible values include:
     * 'Available', 'Limited', 'Renaming', 'Restoring', 'Unknown'.
     */
    @JsonProperty(value = "properties.entityAvailabilityStatus")
    private EntityAvailabilityStatus entityAvailabilityStatus;

    /**
     * The exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The default message time to live value. This is the duration after which
     * the message expires, starting from when the message is sent to Service
     * Bus. This is the default value used when TimeToLive is not set on a
     * message itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    private String defaultMessageTimeToLive;

    /**
     * TimeSpan structure that defines the duration of the duplicate detection
     * history. The default value is 10 minutes.
     */
    @JsonProperty(value = "properties.duplicateDetectionHistoryTimeWindow")
    private String duplicateDetectionHistoryTimeWindow;

    /**
     * A value that indicates whether server-side batched operations are
     * enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /**
     * A value that indicates whether this queue has dead letter support when a
     * message expires.
     */
    @JsonProperty(value = "properties.deadLetteringOnMessageExpiration")
    private Boolean deadLetteringOnMessageExpiration;

    /**
     * A value that indicates whether Express Entities are enabled. An express
     * queue holds a message in memory temporarily before writing it to
     * persistent storage.
     */
    @JsonProperty(value = "properties.enableExpress")
    private Boolean enableExpress;

    /**
     * A value that indicates whether the queue is to be partitioned across
     * multiple message brokers.
     */
    @JsonProperty(value = "properties.enablePartitioning")
    private Boolean enablePartitioning;

    /**
     * A value that indicates whether the message is accessible anonymously.
     */
    @JsonProperty(value = "properties.isAnonymousAccessible")
    private Boolean isAnonymousAccessible;

    /**
     * The maximum delivery count. A message is automatically deadlettered
     * after this number of deliveries.
     */
    @JsonProperty(value = "properties.maxDeliveryCount")
    private Integer maxDeliveryCount;

    /**
     * The maximum size of the queue in megabytes, which is the size of memory
     * allocated for the queue.
     */
    @JsonProperty(value = "properties.maxSizeInMegabytes")
    private Long maxSizeInMegabytes;

    /**
     * The number of messages in the queue.
     */
    @JsonProperty(value = "properties.messageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long messageCount;

    /**
     * The countDetails property.
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /**
     * A value indicating if this queue requires duplicate detection.
     */
    @JsonProperty(value = "properties.requiresDuplicateDetection")
    private Boolean requiresDuplicateDetection;

    /**
     * A value that indicates whether the queue supports the concept of
     * sessions.
     */
    @JsonProperty(value = "properties.requiresSession")
    private Boolean requiresSession;

    /**
     * The size of the queue, in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /**
     * Enumerates the possible values for the status of a messaging entity.
     * Possible values include: 'Active', 'Creating', 'Deleting', 'Disabled',
     * 'ReceiveDisabled', 'Renaming', 'Restoring', 'SendDisabled', 'Unknown'.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /**
     * A value that indicates whether the queue supports ordering.
     */
    @JsonProperty(value = "properties.supportOrdering")
    private Boolean supportOrdering;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Get queue name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set queue name.
     *
     * @param name the name value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location of the resource.
     *
     * @param location the location value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute.
     *
     * @return the lockDuration value
     */
    public String lockDuration() {
        return this.lockDuration;
    }

    /**
     * Set the duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1 minute.
     *
     * @param lockDuration the lockDuration value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * Get last time a message was sent, or the last time there was a receive request to this queue.
     *
     * @return the accessedAt value
     */
    public DateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the TimeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value
     */
    public String autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the TimeSpan idle interval after which the queue is automatically deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withAutoDeleteOnIdle(String autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get entity availability status for the queue. Possible values include: 'Available', 'Limited', 'Renaming', 'Restoring', 'Unknown'.
     *
     * @return the entityAvailabilityStatus value
     */
    public EntityAvailabilityStatus entityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }

    /**
     * Set entity availability status for the queue. Possible values include: 'Available', 'Limited', 'Renaming', 'Restoring', 'Unknown'.
     *
     * @param entityAvailabilityStatus the entityAvailabilityStatus value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        this.entityAvailabilityStatus = entityAvailabilityStatus;
        return this;
    }

    /**
     * Get the exact time the message was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the default message time to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value
     */
    public String defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the default message time to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withDefaultMessageTimeToLive(String defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value
     */
    public String duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set timeSpan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withDuplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get a value that indicates whether server-side batched operations are enabled.
     *
     * @return the enableBatchedOperations value
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set a value that indicates whether server-side batched operations are enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get a value that indicates whether this queue has dead letter support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value
     */
    public Boolean deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }

    /**
     * Set a value that indicates whether this queue has dead letter support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
        return this;
    }

    /**
     * Get a value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value
     */
    public Boolean enableExpress() {
        return this.enableExpress;
    }

    /**
     * Set a value that indicates whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withEnableExpress(Boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

    /**
     * Get a value that indicates whether the queue is to be partitioned across multiple message brokers.
     *
     * @return the enablePartitioning value
     */
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }

    /**
     * Set a value that indicates whether the queue is to be partitioned across multiple message brokers.
     *
     * @param enablePartitioning the enablePartitioning value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    /**
     * Get a value that indicates whether the message is accessible anonymously.
     *
     * @return the isAnonymousAccessible value
     */
    public Boolean isAnonymousAccessible() {
        return this.isAnonymousAccessible;
    }

    /**
     * Set a value that indicates whether the message is accessible anonymously.
     *
     * @param isAnonymousAccessible the isAnonymousAccessible value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withIsAnonymousAccessible(Boolean isAnonymousAccessible) {
        this.isAnonymousAccessible = isAnonymousAccessible;
        return this;
    }

    /**
     * Get the maximum delivery count. A message is automatically deadlettered after this number of deliveries.
     *
     * @return the maxDeliveryCount value
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maximum delivery count. A message is automatically deadlettered after this number of deliveries.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Get the maximum size of the queue in megabytes, which is the size of memory allocated for the queue.
     *
     * @return the maxSizeInMegabytes value
     */
    public Long maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maximum size of the queue in megabytes, which is the size of memory allocated for the queue.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withMaxSizeInMegabytes(Long maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get the number of messages in the queue.
     *
     * @return the messageCount value
     */
    public Long messageCount() {
        return this.messageCount;
    }

    /**
     * Get the countDetails value.
     *
     * @return the countDetails value
     */
    public MessageCountDetails countDetails() {
        return this.countDetails;
    }

    /**
     * Get a value indicating if this queue requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set a value indicating if this queue requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get a value that indicates whether the queue supports the concept of sessions.
     *
     * @return the requiresSession value
     */
    public Boolean requiresSession() {
        return this.requiresSession;
    }

    /**
     * Set a value that indicates whether the queue supports the concept of sessions.
     *
     * @param requiresSession the requiresSession value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withRequiresSession(Boolean requiresSession) {
        this.requiresSession = requiresSession;
        return this;
    }

    /**
     * Get the size of the queue, in bytes.
     *
     * @return the sizeInBytes value
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Creating', 'Deleting', 'Disabled', 'ReceiveDisabled', 'Renaming', 'Restoring', 'SendDisabled', 'Unknown'.
     *
     * @return the status value
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Creating', 'Deleting', 'Disabled', 'ReceiveDisabled', 'Renaming', 'Restoring', 'SendDisabled', 'Unknown'.
     *
     * @param status the status value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get a value that indicates whether the queue supports ordering.
     *
     * @return the supportOrdering value
     */
    public Boolean supportOrdering() {
        return this.supportOrdering;
    }

    /**
     * Set a value that indicates whether the queue supports ordering.
     *
     * @param supportOrdering the supportOrdering value to set
     * @return the QueueCreateOrUpdateParameters object itself.
     */
    public QueueCreateOrUpdateParameters withSupportOrdering(Boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
        return this;
    }

    /**
     * Get the exact time the message was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

}
