/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.RecommendationInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import java.util.List;
import org.joda.time.DateTime;
import java.util.UUID;

/**
 * Type representing Recommendation.
 */
public interface Recommendation extends HasInner<RecommendationInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the actionName value.
     */
    String actionName();

    /**
     * @return the bladeName value.
     */
    String bladeName();

    /**
     * @return the categoryTags value.
     */
    List<String> categoryTags();

    /**
     * @return the channels value.
     */
    Channels channels();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the enabled value.
     */
    Integer enabled();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the extensionName value.
     */
    String extensionName();

    /**
     * @return the forwardLink value.
     */
    String forwardLink();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isDynamic value.
     */
    Boolean isDynamic();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the level value.
     */
    NotificationLevel level();

    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextNotificationTime value.
     */
    DateTime nextNotificationTime();

    /**
     * @return the notificationExpirationTime value.
     */
    DateTime notificationExpirationTime();

    /**
     * @return the notifiedTime value.
     */
    DateTime notifiedTime();

    /**
     * @return the recommendationId value.
     */
    UUID recommendationId();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the resourceScope value.
     */
    ResourceScopeType resourceScope();

    /**
     * @return the ruleName value.
     */
    String ruleName();

    /**
     * @return the score value.
     */
    Double score();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the states value.
     */
    List<String> states();

    /**
     * @return the type value.
     */
    String type();

}
