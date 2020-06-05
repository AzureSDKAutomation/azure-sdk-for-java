/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2019_05_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.support.v2019_05_01_preview.implementation.CommunicationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Communications.
 */
public interface Communications extends SupportsCreating<CommunicationDetails.DefinitionStages.Blank>, HasInner<CommunicationsInner> {
    /**
     * Returns details of a specific communication in a support ticket.
     *
     * @param supportTicketName Support ticket name
     * @param communicationName Communication name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CommunicationDetails> getAsync(String supportTicketName, String communicationName);

    /**
     * Lists all communications (attachments not included) for a support ticket. &lt;br/&gt;&lt;/br&gt; You can also filter support ticket communications by &lt;i&gt;CreatedDate&lt;/i&gt;�or &lt;i&gt;CommunicationType&lt;/i&gt; using the $filter parameter. The only type of communication supported today is &lt;i&gt;Web&lt;/i&gt;. Output will be a paged result with &lt;i&gt;nextLink&lt;/i&gt;, using which you can retrieve the next set of Communication results. &lt;br/&gt;&lt;br/&gt; Support ticket data is available for 12 months after ticket creation. If a ticket was created more than 12 months ago, a request for data might cause an error.
     *
     * @param supportTicketName Support ticket name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CommunicationDetails> listAsync(final String supportTicketName);

    /**
     * Check the availability of a resource name. This API should to be used to check the uniqueness of the name for adding a new communication to the support ticket.
     *
     * @param supportTicketName Support ticket name
     * @param checkNameAvailabilityInput Input to check
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameAvailabilityOutput> checkNameAvailabilityAsync(String supportTicketName, CheckNameAvailabilityInput checkNameAvailabilityInput);

}
