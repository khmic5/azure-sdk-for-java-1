// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.maps.route.samples;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.models.GeoCollection;
import com.azure.core.models.GeoLinearRing;
import com.azure.core.models.GeoPoint;
import com.azure.core.models.GeoPointCollection;
import com.azure.core.models.GeoPolygon;
import com.azure.core.models.GeoPolygonCollection;
import com.azure.core.models.GeoPosition;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.route.RouteAsyncClient;
import com.azure.maps.route.RouteClient;
import com.azure.maps.route.RouteClientBuilder;
import com.azure.maps.route.models.RouteDirections;
import com.azure.maps.route.models.RouteDirectionsBatchResult;
import com.azure.maps.route.models.RouteDirectionsOptions;
import com.azure.maps.route.models.RouteDirectionsParameters;
import com.azure.maps.route.models.RouteMatrixOptions;
import com.azure.maps.route.models.RouteMatrixQuery;
import com.azure.maps.route.models.RouteRangeOptions;
import com.azure.maps.route.models.RouteReport;
import com.azure.maps.route.models.RouteType;
import com.azure.maps.route.models.TravelMode;

public class RouteSample {

    public RouteClient createRouteSyncClientUsingAzureKeyCredential() {
        // BEGIN: com.azure.maps.route.sync.builder.key.instantiation
        // Authenticates using subscription key
        AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));

        // Creates a builder
        RouteClientBuilder builder = new RouteClientBuilder();
        builder.credential(keyCredential);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));

        // Builds the client
        RouteClient client = builder.buildClient();
        // END: com.azure.maps.route.sync.builder.key.instantiation

        return client;
    }

    public RouteClient createRouteSyncClientUsingAzureADCredential() {
        // BEGIN: com.azure.maps.route.sync.builder.ad.instantiation
        // Authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

        // Creates a builder
        RouteClientBuilder builder = new RouteClientBuilder();
        builder.credential(tokenCredential);
        builder.mapsClientId(System.getenv("MAPS_CLIENT_ID"));
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));

        // Builds a client
        RouteClient client = builder.buildClient();
        // END: com.azure.maps.route.sync.builder.ad.instantiation

        return client;
    }

    public RouteAsyncClient createRouteAsyncClientUsingAzureKeyCredential() {
        // BEGIN: com.azure.maps.route.async.builder.key.instantiation
        // Authenticates using subscription key
        AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));

        // Creates a builder
        RouteClientBuilder builder = new RouteClientBuilder();
        builder.credential(keyCredential);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));

        // Builds the client
        RouteAsyncClient client = builder.buildAsyncClient();
        // END: com.azure.maps.route.async.builder.key.instantiation

        return client;
    }

    public RouteAsyncClient createRouteAsyncClientUsingAzureADCredential() {
        // BEGIN: com.azure.maps.route.async.builder.ad.instantiation
        // Authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

        // Creates a builder
        RouteClientBuilder builder = new RouteClientBuilder();
        builder.credential(tokenCredential);
        builder.mapsClientId(System.getenv("MAPS_CLIENT_ID"));
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));

        // Builds a client
        RouteAsyncClient client = builder.buildAsyncClient();
        // END: com.azure.maps.route.async.builder.ad.instantiation

        return client;
    }

    public static void main(String[] args) throws IOException {
        // authenticates using subscription key
        AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));

        // authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        // DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

        // build client
        RouteClientBuilder builder = new RouteClientBuilder();

        // use this for key authentication
        builder.credential(keyCredential);

        // use the next 2 lines for Azure AD authentication
        // builder.credential(tokenCredential);
        // builder.mapsClientId(System.getenv("MAPS_CLIENT_ID"));

        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        RouteClient client = builder.buildClient();

        // Begin Request Route Matrix
        // BEGIN: com.azure.maps.search.sync.begin_request_route_matrix
        System.out.println("Request route matrix");
        RouteMatrixQuery matrixQuery = new RouteMatrixQuery();

        // origins
        GeoPointCollection origins = new GeoPointCollection(Arrays.asList(
            new GeoPoint(52.36006, 4.85106),
            new GeoPoint(52.36187, 4.85056)
        ));

        // destinations
        GeoPointCollection destinations = new GeoPointCollection(Arrays.asList(
            new GeoPoint(52.36241, 4.85003),
            new GeoPoint(52.50931, 13.42937)
        ));

        matrixQuery.setDestinations(destinations);
        matrixQuery.setOrigins(origins);

        RouteMatrixOptions matrixOptions = new RouteMatrixOptions(matrixQuery);
        MapsCommon.print(client.beginRequestRouteMatrix(matrixOptions).getFinalResult());
        // END: com.azure.maps.search.sync.begin_request_route_matrix

        // Begin Get Route Matrix
        // BEGIN: com.azure.maps.search.sync.get_route_matrix
        System.out.println("Begin get route matrix");
        RouteMatrixQuery matrixQuery2 = new RouteMatrixQuery();
        GeoPointCollection origins2 = new GeoPointCollection(Arrays.asList(new GeoPoint(4.85106, 52.36006),
            new GeoPoint(4.85056, 52.36187)));
        GeoPointCollection destinations2 = new GeoPointCollection(Arrays.asList(new GeoPoint(4.85003, 52.36241),
            new GeoPoint(13.42937, 52.50931)));
        matrixQuery.setDestinations(destinations2);
        matrixQuery.setOrigins(origins2);
        RouteMatrixOptions options = new RouteMatrixOptions(matrixQuery2);
        MapsCommon.print(client.beginRequestRouteMatrix(options).getFinalResult());
        // END: com.azure.maps.search.sync.get_route_matrix

        /* One-shot operations */

        // Get Route Directions
        // BEGIN: com.azure.maps.route.sync.get_route_directions
        System.out.println("Get route directions");
        List<GeoPosition> routePoints = Arrays.asList(
            new GeoPosition(13.42936, 52.50931),
            new GeoPosition(13.43872, 52.50274));
        RouteDirectionsOptions routeOptions = new RouteDirectionsOptions(routePoints);
        RouteDirections directions = client.getRouteDirections(routeOptions);
        RouteReport report = directions.getReport(); // get the report and use it
        // END: com.azure.maps.route.sync.get_route_directions

        // Get Route Directions Parameters
        // BEGIN: com.azure.maps.route.sync.get_route_directions_parameters
        System.out.println("Get route parameters");
        // supporting points
        GeoCollection supportingPoints = new GeoCollection(
            Arrays.asList(
                new GeoPoint(13.42936, 52.5093),
                new GeoPoint(13.42859, 52.50844)
                ));

        // avoid areas
        List<GeoPolygon> polygons = Arrays.asList(
            new GeoPolygon(
                new GeoLinearRing(Arrays.asList(
                    new GeoPosition(-122.39456176757811, 47.489368981370724),
                    new GeoPosition(-122.00454711914061, 47.489368981370724),
                    new GeoPosition(-122.00454711914061, 47.65151268066222),
                    new GeoPosition(-122.39456176757811, 47.65151268066222),
                    new GeoPosition(-122.39456176757811, 47.489368981370724)
                ))
            ),
            new GeoPolygon(
                new GeoLinearRing(Arrays.asList(
                    new GeoPosition(100.0, 0.0),
                    new GeoPosition(101.0, 0.0),
                    new GeoPosition(101.0, 1.0),
                    new GeoPosition(100.0, 1.0),
                    new GeoPosition(100.0, 0.0)
                ))
            )
        );
        GeoPolygonCollection avoidAreas = new GeoPolygonCollection(polygons);
        RouteDirectionsParameters parameters = new RouteDirectionsParameters()
            .setSupportingPoints(supportingPoints)
            .setAvoidVignette(Arrays.asList("AUS", "CHE"))
            .setAvoidAreas(avoidAreas);
        MapsCommon.print(client.getRouteDirections(routeOptions,
            parameters));
        // END: com.azure.maps.route.sync.get_route_directions_parameters

        // Get Route Range
        // BEGIN: com.azure.maps.search.sync.route_range
        System.out.println("Get route range");
        RouteRangeOptions rangeOptions = new RouteRangeOptions(new GeoPosition(5.86605, 50.97452), 6000.0);
        MapsCommon.print(client.getRouteRange(rangeOptions));
        // END: com.azure.maps.search.sync.route_range

        // Begin Request Route Directions Batch
        // BEGIN: com.azure.maps.search.sync.begin_request_route_directions_batch
        RouteDirectionsOptions options1 = new RouteDirectionsOptions(
            Arrays.asList(new GeoPosition(-122.128384, 47.639987),
                new GeoPosition(-122.184408, 47.621252),
                new GeoPosition(-122.332000, 47.596437)))
            .setRouteType(RouteType.FASTEST)
            .setTravelMode(TravelMode.CAR)
            .setMaxAlternatives(5);

        RouteDirectionsOptions options2 = new RouteDirectionsOptions(
            Arrays.asList(new GeoPosition(-122.348934, 47.620659),
                new GeoPosition(-122.342015, 47.610101)))
            .setRouteType(RouteType.ECONOMY)
            .setTravelMode(TravelMode.BICYCLE)
            .setUseTrafficData(false);

        RouteDirectionsOptions options3 = new RouteDirectionsOptions(
            Arrays.asList(new GeoPosition(-73.985108, 40.759856),
                new GeoPosition(-73.973506, 40.771136)))
            .setRouteType(RouteType.SHORTEST)
            .setTravelMode(TravelMode.PEDESTRIAN);

        System.out.println("Get Route Directions Batch");

        List<RouteDirectionsOptions> optionsList = Arrays.asList(options1, options2, options3);
        SyncPoller<RouteDirectionsBatchResult, RouteDirectionsBatchResult> poller =
            client.beginRequestRouteDirectionsBatch(optionsList);
        MapsCommon.print(poller.getFinalResult());
        // END: com.azure.maps.search.sync.begin_request_route_directions_batch

        // Async Client Samples:

        // BEGIN: com.azure.maps.route.async.builder.instantiation
        RouteClientBuilder asyncClientbuilder = new RouteClientBuilder();

        // Authenticates using subscription key
        // AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));
        // builder.credential(keyCredential);

        // Authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        DefaultAzureCredential asyncClientTokenCredential = new DefaultAzureCredentialBuilder().build();

        asyncClientbuilder.credential(asyncClientTokenCredential);
        asyncClientbuilder.mapsClientId(System.getenv("MAPS_CLIENT_ID"));
        asyncClientbuilder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        RouteAsyncClient asyncClient = asyncClientbuilder.buildAsyncClient();
        // END: com.azure.maps.route.async.builder.instantiation

        // Begin Request Route Matrix
        // BEGIN: com.azure.maps.search.async.begin_request_route_matrix
        System.out.println("Request route matrix");
        RouteMatrixQuery matrixQuery3 = new RouteMatrixQuery();

        // origins
        GeoPointCollection origins3 = new GeoPointCollection(Arrays.asList(
            new GeoPoint(52.36006, 4.85106),
            new GeoPoint(52.36187, 4.85056)
        ));

        // destinations
        GeoPointCollection destinations3 = new GeoPointCollection(Arrays.asList(
            new GeoPoint(52.36241, 4.85003),
            new GeoPoint(52.50931, 13.42937)
        ));

        matrixQuery2.setDestinations(destinations3);
        matrixQuery2.setOrigins(origins3);

        RouteMatrixOptions matrixOptions2 = new RouteMatrixOptions(matrixQuery3);
        MapsCommon.print(asyncClient.beginRequestRouteMatrix(matrixOptions2).blockFirst().getFinalResult());
        // END: com.azure.maps.search.async.begin_request_route_matrix

        // Begin Get Route Matrix
        // BEGIN: com.azure.maps.search.async.get_route_matrix
        System.out.println("Begin get route matrix");
        RouteMatrixQuery matrixQuery4 = new RouteMatrixQuery();
        GeoPointCollection origins4 = new GeoPointCollection(Arrays.asList(new GeoPoint(4.85106, 52.36006),
            new GeoPoint(4.85056, 52.36187)));
        GeoPointCollection destinations4 = new GeoPointCollection(Arrays.asList(new GeoPoint(4.85003, 52.36241),
            new GeoPoint(13.42937, 52.50931)));
        matrixQuery.setDestinations(destinations4);
        matrixQuery.setOrigins(origins3);
        RouteMatrixOptions options4 = new RouteMatrixOptions(matrixQuery4);
        MapsCommon.print(asyncClient.beginRequestRouteMatrix(options4).blockFirst().getFinalResult());
        // END: com.azure.maps.search.async.get_route_matrix

        /* One-shot operations */

        // Get Route Directions
        // BEGIN: com.azure.maps.route.async.get_route_directions
        System.out.println("Get route directions");
        List<GeoPosition> routePoints2 = Arrays.asList(
            new GeoPosition(13.42936, 52.50931),
            new GeoPosition(13.43872, 52.50274));
        RouteDirectionsOptions routeOptions2 = new RouteDirectionsOptions(routePoints2);
        RouteDirections directions4 = asyncClient.getRouteDirections(routeOptions2).block();
        RouteReport report2 = directions4.getReport(); // get the report and use it
        // END: com.azure.maps.route.async.get_route_directions

        // Get Route Directions Parameters
        // BEGIN: com.azure.maps.route.async.get_route_directions_parameters
        System.out.println("Get route parameters");
        // supporting points
        GeoCollection supportingPoints2 = new GeoCollection(
            Arrays.asList(
                new GeoPoint(13.42936, 52.5093),
                new GeoPoint(13.42859, 52.50844)
                ));

        // avoid areas
        List<GeoPolygon> polygons2 = Arrays.asList(
            new GeoPolygon(
                new GeoLinearRing(Arrays.asList(
                    new GeoPosition(-122.39456176757811, 47.489368981370724),
                    new GeoPosition(-122.00454711914061, 47.489368981370724),
                    new GeoPosition(-122.00454711914061, 47.65151268066222),
                    new GeoPosition(-122.39456176757811, 47.65151268066222),
                    new GeoPosition(-122.39456176757811, 47.489368981370724)
                ))
            ),
            new GeoPolygon(
                new GeoLinearRing(Arrays.asList(
                    new GeoPosition(100.0, 0.0),
                    new GeoPosition(101.0, 0.0),
                    new GeoPosition(101.0, 1.0),
                    new GeoPosition(100.0, 1.0),
                    new GeoPosition(100.0, 0.0)
                ))
            )
        );
        GeoPolygonCollection avoidAreas2 = new GeoPolygonCollection(polygons2);
        RouteDirectionsParameters parameters2 = new RouteDirectionsParameters()
            .setSupportingPoints(supportingPoints)
            .setAvoidVignette(Arrays.asList("AUS", "CHE"))
            .setAvoidAreas(avoidAreas);
        MapsCommon.print(asyncClient.getRouteDirections(routeOptions2,
            parameters2).block());
        // END: com.azure.maps.route.async.get_route_directions_parameters

        // Get Route Range
        // BEGIN: com.azure.maps.search.async.route_range
        System.out.println("Get route range");
        RouteRangeOptions rangeOptions2 = new RouteRangeOptions(new GeoPosition(5.86605, 50.97452), 6000.0);
        MapsCommon.print(asyncClient.getRouteRange(rangeOptions2).block());
        // END: com.azure.maps.search.async.route_range

        // Begin Request Route Directions Batch
        // BEGIN: com.azure.maps.search.async.begin_request_route_directions_batch
        RouteDirectionsOptions options5 = new RouteDirectionsOptions(
            Arrays.asList(new GeoPosition(-122.128384, 47.639987),
                new GeoPosition(-122.184408, 47.621252),
                new GeoPosition(-122.332000, 47.596437)))
            .setRouteType(RouteType.FASTEST)
            .setTravelMode(TravelMode.CAR)
            .setMaxAlternatives(5);

        RouteDirectionsOptions options6 = new RouteDirectionsOptions(
            Arrays.asList(new GeoPosition(-122.348934, 47.620659),
                new GeoPosition(-122.342015, 47.610101)))
            .setRouteType(RouteType.ECONOMY)
            .setTravelMode(TravelMode.BICYCLE)
            .setUseTrafficData(false);

        RouteDirectionsOptions options7 = new RouteDirectionsOptions(
            Arrays.asList(new GeoPosition(-73.985108, 40.759856),
                new GeoPosition(-73.973506, 40.771136)))
            .setRouteType(RouteType.SHORTEST)
            .setTravelMode(TravelMode.PEDESTRIAN);

        System.out.println("Get Route Directions Batch");

        List<RouteDirectionsOptions> optionsList2 = Arrays.asList(options5, options6, options7);
        SyncPoller<RouteDirectionsBatchResult, RouteDirectionsBatchResult> poller2 =
            asyncClient.beginRequestRouteDirectionsBatch(optionsList2).getSyncPoller();
        MapsCommon.print(poller2.getFinalResult());
        // END: com.azure.maps.search.async.begin_request_route_directions_batch
    }
}
