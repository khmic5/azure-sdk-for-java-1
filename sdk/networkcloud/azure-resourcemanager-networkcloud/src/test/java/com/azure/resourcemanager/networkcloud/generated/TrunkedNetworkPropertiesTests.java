// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.TrunkedNetworkProperties;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TrunkedNetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrunkedNetworkProperties model =
            BinaryData
                .fromString(
                    "{\"associatedResourceIds\":[\"jcswsmys\",\"uluqypfc\",\"lerchpq\",\"mfpjbabw\"],\"clusterId\":\"fcxsspuunnoxy\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"qddrihpfhoqcaae\",\"hybridAksClustersAssociatedIds\":[\"omdjvlpjxxkzbrm\",\"geivsiykzkdncj\",\"xonbzoggculapz\"],\"hybridAksPluginType\":\"OSDevice\",\"interfaceName\":\"gogtqxepnylbf\",\"isolationDomainIds\":[\"jlyjtlvofq\",\"hvfcibyfmow\",\"xrkjpvdw\",\"fzwiivwzjbhyz\"],\"provisioningState\":\"Succeeded\",\"virtualMachinesAssociatedIds\":[\"ambtrnegvm\",\"vuqeqvldspast\",\"bkkd\",\"flvestmjlxrrilo\"],\"vlans\":[2775641584461567714,3644482320292863264,2016702722100674013]}")
                .toObject(TrunkedNetworkProperties.class);
        Assertions.assertEquals(HybridAksPluginType.OSDEVICE, model.hybridAksPluginType());
        Assertions.assertEquals("gogtqxepnylbf", model.interfaceName());
        Assertions.assertEquals("jlyjtlvofq", model.isolationDomainIds().get(0));
        Assertions.assertEquals(2775641584461567714L, model.vlans().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrunkedNetworkProperties model =
            new TrunkedNetworkProperties()
                .withHybridAksPluginType(HybridAksPluginType.OSDEVICE)
                .withInterfaceName("gogtqxepnylbf")
                .withIsolationDomainIds(Arrays.asList("jlyjtlvofq", "hvfcibyfmow", "xrkjpvdw", "fzwiivwzjbhyz"))
                .withVlans(Arrays.asList(2775641584461567714L, 3644482320292863264L, 2016702722100674013L));
        model = BinaryData.fromObject(model).toObject(TrunkedNetworkProperties.class);
        Assertions.assertEquals(HybridAksPluginType.OSDEVICE, model.hybridAksPluginType());
        Assertions.assertEquals("gogtqxepnylbf", model.interfaceName());
        Assertions.assertEquals("jlyjtlvofq", model.isolationDomainIds().get(0));
        Assertions.assertEquals(2775641584461567714L, model.vlans().get(0));
    }
}
