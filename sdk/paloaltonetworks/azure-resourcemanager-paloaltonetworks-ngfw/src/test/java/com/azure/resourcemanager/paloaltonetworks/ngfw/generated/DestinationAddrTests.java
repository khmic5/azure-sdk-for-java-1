// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DestinationAddr;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DestinationAddrTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DestinationAddr model =
            BinaryData
                .fromString(
                    "{\"cidrs\":[\"auwhvylwzbtdhx\",\"jznb\",\"pow\",\"wpr\"],\"countries\":[\"veual\"],\"feeds\":[\"mkh\"],\"prefixLists\":[\"bbcswsrtjri\"],\"fqdnLists\":[\"bpbewtghfgb\",\"c\",\"wxzvlvqhjkb\",\"gibtnm\"]}")
                .toObject(DestinationAddr.class);
        Assertions.assertEquals("auwhvylwzbtdhx", model.cidrs().get(0));
        Assertions.assertEquals("veual", model.countries().get(0));
        Assertions.assertEquals("mkh", model.feeds().get(0));
        Assertions.assertEquals("bbcswsrtjri", model.prefixLists().get(0));
        Assertions.assertEquals("bpbewtghfgb", model.fqdnLists().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DestinationAddr model =
            new DestinationAddr()
                .withCidrs(Arrays.asList("auwhvylwzbtdhx", "jznb", "pow", "wpr"))
                .withCountries(Arrays.asList("veual"))
                .withFeeds(Arrays.asList("mkh"))
                .withPrefixLists(Arrays.asList("bbcswsrtjri"))
                .withFqdnLists(Arrays.asList("bpbewtghfgb", "c", "wxzvlvqhjkb", "gibtnm"));
        model = BinaryData.fromObject(model).toObject(DestinationAddr.class);
        Assertions.assertEquals("auwhvylwzbtdhx", model.cidrs().get(0));
        Assertions.assertEquals("veual", model.countries().get(0));
        Assertions.assertEquals("mkh", model.feeds().get(0));
        Assertions.assertEquals("bbcswsrtjri", model.prefixLists().get(0));
        Assertions.assertEquals("bpbewtghfgb", model.fqdnLists().get(0));
    }
}
