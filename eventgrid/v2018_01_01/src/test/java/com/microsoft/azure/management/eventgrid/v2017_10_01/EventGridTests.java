/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventgrid.v2017_10_01;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.arm.resources.Region;
import com.microsoft.azure.arm.utils.SdkContext;
import com.microsoft.azure.management.eventgrid.v2018_01_01.EndpointType;
import com.microsoft.azure.management.eventgrid.v2018_01_01.EventSubscription;
import com.microsoft.azure.management.eventgrid.v2018_01_01.EventSubscriptionFilter;
import com.microsoft.azure.management.eventgrid.v2018_01_01.Topic;
import com.microsoft.azure.management.eventgrid.v2018_01_01.TopicTypeInfo;
import com.microsoft.azure.management.eventgrid.v2018_01_01.WebHookEventSubscriptionDestination;
import com.microsoft.azure.management.resources.ResourceGroup;
import org.junit.Test;
import rx.functions.Action1;

public class EventGridTests extends EventGridTestBase {
    String rgName;

    @Override
    protected void cleanUpResources() {
        resourceManager.resourceGroups().deleteByName(rgName);
    }

    @Test
    public void canCRUDEventGrid() {
        rgName = SdkContext.randomResourceName("rg", 20);;
        String topicName = SdkContext.randomResourceName("tp", 20);

        ResourceGroup group = resourceManager.resourceGroups()
                .define(rgName)
                    .withRegion(Region.US_WEST.toString())
                    .create();

        Topic topic = eventGridManager.topics()
                .define(topicName)
                    .withRegion(Region.US_WEST)
                    .withExistingResourceGroup(group.name())
                    .create();

        String subscriptionName = SdkContext.randomResourceName("sub", 20);

        EventSubscription subscription = eventGridManager.eventSubscriptions()
                .define(subscriptionName)
                    .withScope(topic.id())
                    .withDestination(new WebHookEventSubscriptionDestination().withEndpointUrl("https://requestb.in/15ksip71").withEndpointType(EndpointType.WEBHOOK))
                    .withFilter(new EventSubscriptionFilter().withIsSubjectCaseSensitive(true).withSubjectBeginsWith("ExamplePrefix").withSubjectEndsWith("ExampleSuffix"))
                    .create();

        PagedList<EventSubscription> subscriptions = eventGridManager.eventSubscriptions()
                .list();

        for(EventSubscription sub : subscriptions) {
            System.out.println(sub.id());
        }

        PagedList<Topic> topics = eventGridManager.topics()
                .list();

        for(Topic tp : topics) {
            System.out.println(tp.id());
        }

        eventGridManager.topicTypes()
                .listAsync()
                .subscribe(new Action1<TopicTypeInfo>() {
                    @Override
                    public void call(TopicTypeInfo topicTypeInfo) {
                        System.out.println(topicTypeInfo.id());
                    }
                });
    }
}
