# Azure Maps SDK Search client library for Java

Azure Maps SDK Search client library for Java.

This package contains the Azure Maps SDK Search client library.  Package tag 1.0-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## We'd love to hear your feedback

We're always working on improving our products and the way we communicate with our users. So we'd love to learn what's working and how we can do better.

If you haven't already, please take a few minutes to [complete this short survey][survey] we have put together.

Thank you in advance for your collaboration. We really appreciate your time!

## Documentation

Various documentation is available to help you get started

- [API reference documentation][docs]

## Getting started

### Prerequisites

- [Java Development Kit (JDK)][jdk] with version 8 or above
- [Azure Subscription][azure_subscription]

### Adding the package to your product

[//]: # ({x-version-update-start;com.azure:azure-maps-search;current})
```xml
<dependency>
    <groupId>com.azure.maps</groupId>
    <artifactId>azure-maps-search</artifactId>
    <version>1.0.0-beta.0</version>
</dependency>
```
[//]: # ({x-version-update-end})

### Include the recommended packages

Azure Management Libraries require a `TokenCredential` implementation for authentication and an `HttpClient` implementation for HTTP client.

[Azure Identity][azure_identity] package and [Azure Core Netty HTTP][azure_core_http_netty] package provide the default implementation.

### Authentication

By default, Azure Active Directory token authentication depends on correct configure of following environment variables.

- `AZURE_CLIENT_ID` for Azure client ID.
- `AZURE_TENANT_ID` for Azure tenant ID.
- `AZURE_CLIENT_SECRET` or `AZURE_CLIENT_CERTIFICATE_PATH` for client secret or client certificate.

In addition, Azure subscription ID can be configured via environment variable `AZURE_SUBSCRIPTION_ID`.

With above configuration, `azure` client can be authenticated by following code:

```java com.azure.maps.search.sync.builder.ad.instantiation
// Authenticates using Azure AD building a default credential
// This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

// Creates a builder
MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
builder.credential(tokenCredential);
builder.mapsClientId(System.getenv("MAPS_CLIENT_ID"));
builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));

// Builds a client
MapsSearchClient client = builder.buildClient();
```

The sample code assumes global Azure. Please change `AzureEnvironment.AZURE` variable if otherwise.

See [Authentication][authenticate] for more options.

## Key concepts

See [API design][design] for general introduction on design and key concepts on Azure Management Libraries.

## Examples
Get Polygons
```java com.azure.maps.search.sync.get_polygon
List<String> ids = results.getResults().stream()
    .filter(item -> item.getDataSource() != null && item.getDataSource().getGeometry() != null)
    .map(item -> item.getDataSource().getGeometry().getId())
    .collect(Collectors.toList());
ids.add(id);

if (ids != null && !ids.isEmpty()) {
    System.out.println("Get Polygon: " + ids);
    // MapsCommon.print(client.getPolygons(ids).get(1));
    MapsCommon.print(client.getPolygons(ids));
    MapsCommon.print(client.getPolygonsWithResponse(ids, null).getValue().getClass());
}
```

Fuzzy Search
```java com.azure.maps.search.sync.fuzzy_search
System.out.println("Search Fuzzy:");

// simple
MapsCommon.print(client.fuzzySearch(new FuzzySearchOptions("starbucks")));

// with options
SearchAddressResult results = client.fuzzySearch(
    new FuzzySearchOptions("1 Microsoft Way", new GeoPosition(-74.011454, 40.706270))
        .setTop(5));
MapsCommon.print(results);

// with response
Response<SearchAddressResult> response = client.fuzzySearchWithResponse(
    new FuzzySearchOptions("Monaco").setEntityType(GeographicEntityType.COUNTRY)
        .setTop(5), null);
MapsCommon.print(response.getStatusCode());
String id = response.getValue().getResults().get(0).getDataSource().getGeometry().getId();
```

Search Point Of Interest
```java com.azure.maps.search.sync.get_search_poi
System.out.println("Search Points of Interest:");

// coordinates
MapsCommon.print(client.searchPointOfInterest(
    new SearchPointOfInterestOptions("pizza", new GeoPosition(-121.97483, 36.98844))));

// options
MapsCommon.print(client.searchPointOfInterest(
    new SearchPointOfInterestOptions("pizza", new GeoPosition(-121.97483, 36.98844))
        .setTop(10)
        .setOperatingHours(OperatingHoursRange.NEXT_SEVEN_DAYS)));

// with response
MapsCommon.print(client.searchPointOfInterestWithResponse(
    new SearchPointOfInterestOptions("pizza", new GeoPosition(-121.97483, 36.98844))
        .setTop(10)
        .setOperatingHours(OperatingHoursRange.NEXT_SEVEN_DAYS),
    null).getStatusCode());
```

Search Nearby Point Of Interest
```java com.azure.maps.search.sync.search_nearby
System.out.println("Search Nearby:");

// options
MapsCommon.print(client.searchNearbyPointOfInterest(
    new SearchNearbyPointsOfInterestOptions(new GeoPosition(-74.011454, 40.706270))
        .setCountryFilter(Arrays.asList("US"))
        .setTop(10)));

// response
MapsCommon.print(client.searchNearbyPointOfInterestWithResponse(
    new SearchNearbyPointsOfInterestOptions(new GeoPosition(-74.011454, 40.706270))
        .setCountryFilter(Arrays.asList("US"))
        .setTop(10),
    null).getStatusCode());
```

Search Point Of Interest Category
```java com.azure.maps.search.sync.search_nearby
System.out.println("Search Nearby:");

// options
MapsCommon.print(client.searchNearbyPointOfInterest(
    new SearchNearbyPointsOfInterestOptions(new GeoPosition(-74.011454, 40.706270))
        .setCountryFilter(Arrays.asList("US"))
        .setTop(10)));

// response
MapsCommon.print(client.searchNearbyPointOfInterestWithResponse(
    new SearchNearbyPointsOfInterestOptions(new GeoPosition(-74.011454, 40.706270))
        .setCountryFilter(Arrays.asList("US"))
        .setTop(10),
    null).getStatusCode());
```

Get Point Of Interest Category Tree
```java com.azure.maps.search.sync.search_poi_category_tree
System.out.println("Get Search POI Category Tree:");
MapsCommon.print(client.getPointOfInterestCategoryTree(null));
```

Search Address
```java com.azure.maps.search.sync.search_address
System.out.println("Search Address:");

// simple
MapsCommon.print(client.searchAddress(
    new SearchAddressOptions("15127 NE 24th Street, Redmond, WA 98052")));

// options
MapsCommon.print(client.searchAddress(
    new SearchAddressOptions("1 Main Street")
        .setCoordinates(new GeoPosition(-74.011454, 40.706270))
        .setRadiusInMeters(40000)
        .setTop(5)));

// complete
MapsCommon.print(client.searchAddressWithResponse(
    new SearchAddressOptions("1 Main Street")
        .setCoordinates(new GeoPosition(-74.011454, 40.706270))
        .setRadiusInMeters(40000)
        .setTop(5), null).getStatusCode());
```

Reverse Search Address
```java com.azure.maps.search.sync.reverse_search_address
System.out.println("Search Address Reverse:");

// simple
MapsCommon.print(client.reverseSearchAddress(
    new ReverseSearchAddressOptions(new GeoPosition(-121.89, 37.337))));

MapsCommon.print(client.reverseSearchAddress(
    new ReverseSearchAddressOptions(new GeoPosition(-121.89, 37.337))));

// options
MapsCommon.print(client.reverseSearchAddress(
    new ReverseSearchAddressOptions(new GeoPosition(-121.89, 37.337))
        .setIncludeSpeedLimit(true)
        .setEntityType(GeographicEntityType.COUNTRY_SECONDARY_SUBDIVISION) // returns only city
));

// complete
MapsCommon.print(client.reverseSearchAddressWithResponse(
    new ReverseSearchAddressOptions(new GeoPosition(-121.89, 37.337))
        .setIncludeSpeedLimit(true)
        .setEntityType(GeographicEntityType.COUNTRY_SECONDARY_SUBDIVISION),
        null).getStatusCode());
```

Reverse Search Cross Street Address
```java com.azure.maps.search.sync.search_reverse_cross_street_address
System.out.println("Revere Search Cross Street Address:");

// options
MapsCommon.print(client.reverseSearchCrossStreetAddress(
    new ReverseSearchCrossStreetAddressOptions(new GeoPosition(-121.89, 37.337))));

// options
MapsCommon.print(client.reverseSearchCrossStreetAddress(
    new ReverseSearchCrossStreetAddressOptions(new GeoPosition(-121.89, 37.337))
        .setTop(2)
        .setHeading(5)));

// complete
MapsCommon.print(client.reverseSearchCrossStreetAddressWithResponse(
    new ReverseSearchCrossStreetAddressOptions(new GeoPosition(-121.89, 37.337))
        .setTop(2)
        .setHeading(5),
    null).getStatusCode());
```

Search Structured Address
```java com.azure.maps.search.sync.search_structured_address
System.out.println("Search Address Structured:");

// simple
MapsCommon.print(client.searchStructuredAddress(new StructuredAddress("US")
    .setPostalCode("98121")
    .setStreetNumber("15127")
    .setStreetName("NE 24th Street")
    .setMunicipality("Redmond")
    .setCountrySubdivision("WA"), null));

// complete
MapsCommon.print(client.searchStructuredAddressWithResponse(new StructuredAddress("US")
    .setPostalCode("98121")
    .setStreetNumber("15127")
    .setStreetName("NE 24th Street")
    .setMunicipality("Redmond")
    .setCountrySubdivision("WA"),
    new SearchStructuredAddressOptions()
            .setTop(2)
            .setRadiusInMeters(1000),
    null).getStatusCode());
```

Search Inside Geometry
```java com.azure.maps.search.sync.search_inside_geometry
System.out.println("Search Inside Geometry");

// create GeoPolygon
List<GeoPosition> coordinates = new ArrayList<>();
coordinates.add(new GeoPosition(-122.43576049804686, 37.7524152343544));
coordinates.add(new GeoPosition(-122.43301391601562, 37.70660472542312));
coordinates.add(new GeoPosition(-122.36434936523438, 37.712059855877314));
coordinates.add(new GeoPosition(-122.43576049804686, 37.7524152343544));
GeoLinearRing ring = new GeoLinearRing(coordinates);
GeoPolygon polygon = new GeoPolygon(ring);

// simple
MapsCommon.print(client.searchInsideGeometry(
    new SearchInsideGeometryOptions("Leland Avenue", polygon)));

// options
MapsCommon.print(client.searchInsideGeometry(
    new SearchInsideGeometryOptions("Leland Avenue", polygon)
        .setTop(5)));

// complete
MapsCommon.print(client.searchInsideGeometryWithResponse(
    new SearchInsideGeometryOptions("Leland Avenue", polygon)
        .setTop(5),
    null).getStatusCode());
```

Search Along Route
```java com.azure.maps.search.sync.search_along_route
System.out.println("Search Along Route");

// create route points
List<GeoPosition> points = new ArrayList<>();
points.add(new GeoPosition(-122.143035, 47.653536));
points.add(new GeoPosition(-122.187164, 47.617556));
points.add(new GeoPosition(-122.114981, 47.570599));
points.add(new GeoPosition(-122.132756, 47.654009));
GeoLineString route = new GeoLineString(points);

// simple
MapsCommon.print(client.searchAlongRoute(new SearchAlongRouteOptions("burger", 1000, route)));

// options
MapsCommon.print(client.searchAlongRoute(
    new SearchAlongRouteOptions("burger", 1000, route)
        .setCategoryFilter(Arrays.asList(7315))
        .setTop(5)));

// complete
MapsCommon.print(client.searchAlongRouteWithResponse(
    new SearchAlongRouteOptions("burger", 1000, route)
        .setCategoryFilter(Arrays.asList(7315))
        .setTop(5),
    null).getStatusCode());
```

Begin Fuzzy Search Batch
```java com.azure.maps.search.sync.fuzzy_search_batch
List<FuzzySearchOptions> fuzzyOptionsList = new ArrayList<>();
fuzzyOptionsList.add(new FuzzySearchOptions("atm", new GeoPosition(-122.128362, 47.639769))
    .setRadiusInMeters(5000).setTop(5));
fuzzyOptionsList.add(new FuzzySearchOptions("Statue of Liberty").setTop(2));
fuzzyOptionsList.add(new FuzzySearchOptions("Starbucks", new GeoPosition(-122.128362, 47.639769))
    .setRadiusInMeters(5000));

System.out.println("Post Search Fuzzy Batch Async");
MapsCommon.print(client.beginFuzzySearchBatch(fuzzyOptionsList).getFinalResult());
```

Begin Search Address Batch
```java com.azure.maps.search.sync.search_address_batch
List<SearchAddressOptions> optionsList = new ArrayList<>();
optionsList.add(new SearchAddressOptions("400 Broad St, Seattle, WA 98109").setTop(3));
optionsList.add(new SearchAddressOptions("One, Microsoft Way, Redmond, WA 98052").setTop(3));
optionsList.add(new SearchAddressOptions("350 5th Ave, New York, NY 10118").setTop(3));
optionsList.add(new SearchAddressOptions("1 Main Street")
    .setCountryFilter(Arrays.asList("GB", "US", "AU")).setTop(3));

// Search address batch async -
// https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-batch
// This call posts addresses for search using the Asynchronous Batch API.
// SyncPoller will do the polling automatically and you can retrieve the result
// with getFinalResult()
System.out.println("Search Address Batch Async");
MapsCommon.print(client.beginSearchAddressBatch(optionsList).getFinalResult());
SyncPoller<BatchSearchResult, BatchSearchResult> poller = client.beginSearchAddressBatch(optionsList);
BatchSearchResult result = poller.getFinalResult();
MapsCommon.print(result.getBatchSummary());
MapsCommon.print(result.getBatchItems().get(0).getResult().getResults().get(0).getBoundingBox());
```

Reverse Reverse Search Address Batch
```java com.azure.maps.search.sync.reverse_search_address_batch
List<ReverseSearchAddressOptions> reverseOptionsList = new ArrayList<>();
reverseOptionsList.add(new ReverseSearchAddressOptions(new GeoPosition(2.294911, 48.858561)));
reverseOptionsList.add(
    new ReverseSearchAddressOptions(new GeoPosition(-122.127896, 47.639765))
        .setRadiusInMeters(5000)
);
reverseOptionsList.add(new ReverseSearchAddressOptions(new GeoPosition(-122.348170, 47.621028)));

System.out.println("Reverse Search Address Batch Async");
BatchReverseSearchResult br1 =
    client.beginReverseSearchAddressBatch(reverseOptionsList).getFinalResult();
MapsCommon.print(br1);
MapsCommon.print(br1.getBatchItems());
MapsCommon.print(br1.getBatchItems().get(0).getResult().getAddresses().get(0).getAddress());
```

## Troubleshooting

## Next steps

## Contributing

For details on contributing to this repository, see the [contributing guide](https://github.com/Azure/azure-sdk-for-java/blob/master/CONTRIBUTING.md).

1. Fork it
1. Create your feature branch (`git checkout -b my-new-feature`)
1. Commit your changes (`git commit -am 'Add some feature'`)
1. Push to the branch (`git push origin my-new-feature`)
1. Create new Pull Request

<!-- LINKS -->
[survey]: https://microsoft.qualtrics.com/jfe/form/SV_ehN0lIk2FKEBkwd?Q_CHL=DOCS
[docs]: https://azure.github.io/azure-sdk-for-java/
[jdk]: https://docs.microsoft.com/java/azure/jdk/
[azure_subscription]: https://azure.microsoft.com/free/
[azure_identity]: https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/identity/azure-identity
[azure_core_http_netty]: https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/core/azure-core-http-netty
[authenticate]: https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/resourcemanager/docs/AUTH.md
[design]: https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/resourcemanager/docs/DESIGN.md
