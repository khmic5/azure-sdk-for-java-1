// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRoute;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRouteConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AggregateRouteConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AggregateRouteConfiguration model =
            BinaryData
                .fromString(
                    "{\"ipv4Routes\":[{\"prefix\":\"pnvjtoqnermclf\"},{\"prefix\":\"phoxus\"}],\"ipv6Routes\":[{\"prefix\":\"bgyepsbj\"},{\"prefix\":\"zq\"}]}")
                .toObject(AggregateRouteConfiguration.class);
        Assertions.assertEquals("pnvjtoqnermclf", model.ipv4Routes().get(0).prefix());
        Assertions.assertEquals("bgyepsbj", model.ipv6Routes().get(0).prefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AggregateRouteConfiguration model =
            new AggregateRouteConfiguration()
                .withIpv4Routes(
                    Arrays
                        .asList(
                            new AggregateRoute().withPrefix("pnvjtoqnermclf"),
                            new AggregateRoute().withPrefix("phoxus")))
                .withIpv6Routes(
                    Arrays.asList(new AggregateRoute().withPrefix("bgyepsbj"), new AggregateRoute().withPrefix("zq")));
        model = BinaryData.fromObject(model).toObject(AggregateRouteConfiguration.class);
        Assertions.assertEquals("pnvjtoqnermclf", model.ipv4Routes().get(0).prefix());
        Assertions.assertEquals("bgyepsbj", model.ipv6Routes().get(0).prefix());
    }
}
