/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support;

import rx.Observable;
import com.microsoft.azure.management.support.implementation.CommunicationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Communications.
 */
public interface Communications extends HasInner<CommunicationsInner> {
    /**
     * Gets details of a specific communication.
     *
     * @param supportTicketName Support ticket id.
     * @param communicationName Communication id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CommunicationDetails> getBySubscriptionTicketAsync(String supportTicketName, String communicationName);

    /**
     * Lists all communications for a support ticket.
     *
     * @param supportTicketName Support ticket name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CommunicationDetails> listBySubscriptionTicketAsync(final String supportTicketName);

}
