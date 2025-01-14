// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlListConditionProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ConditionActionType;
import org.junit.jupiter.api.Assertions;

public final class AccessControlListConditionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessControlListConditionProperties model =
            BinaryData
                .fromString(
                    "{\"sequenceNumber\":173106164,\"action\":\"allow\",\"destinationAddress\":\"ithxqhabifpi\",\"destinationPort\":\"xwczbyscnp\",\"sourceAddress\":\"x\",\"sourcePort\":\"hiv\",\"protocol\":1742906904,\"annotation\":\"iwbybrkxvdumjg\"}")
                .toObject(AccessControlListConditionProperties.class);
        Assertions.assertEquals("iwbybrkxvdumjg", model.annotation());
        Assertions.assertEquals(173106164, model.sequenceNumber());
        Assertions.assertEquals(ConditionActionType.ALLOW, model.action());
        Assertions.assertEquals("ithxqhabifpi", model.destinationAddress());
        Assertions.assertEquals("xwczbyscnp", model.destinationPort());
        Assertions.assertEquals("x", model.sourceAddress());
        Assertions.assertEquals("hiv", model.sourcePort());
        Assertions.assertEquals(1742906904, model.protocol());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessControlListConditionProperties model =
            new AccessControlListConditionProperties()
                .withAnnotation("iwbybrkxvdumjg")
                .withSequenceNumber(173106164)
                .withAction(ConditionActionType.ALLOW)
                .withDestinationAddress("ithxqhabifpi")
                .withDestinationPort("xwczbyscnp")
                .withSourceAddress("x")
                .withSourcePort("hiv")
                .withProtocol(1742906904);
        model = BinaryData.fromObject(model).toObject(AccessControlListConditionProperties.class);
        Assertions.assertEquals("iwbybrkxvdumjg", model.annotation());
        Assertions.assertEquals(173106164, model.sequenceNumber());
        Assertions.assertEquals(ConditionActionType.ALLOW, model.action());
        Assertions.assertEquals("ithxqhabifpi", model.destinationAddress());
        Assertions.assertEquals("xwczbyscnp", model.destinationPort());
        Assertions.assertEquals("x", model.sourceAddress());
        Assertions.assertEquals("hiv", model.sourcePort());
        Assertions.assertEquals(1742906904, model.protocol());
    }
}
