(ns com.amazonaws.services.groundstation.AWSGroundStationClient
  "Client for accessing AWS Ground Station. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Welcome to the AWS Ground Station API Reference. AWS Ground Station is a fully managed service that enables you to
  control satellite communications, downlink and process satellite data, and scale your satellite operations
  efficiently and cost-effectively without having to build or manage your own ground station infrastructure."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.groundstation AWSGroundStationClient]))

(defn *builder
  "returns: `com.amazonaws.services.groundstation.AWSGroundStationClientBuilder`"
  (^com.amazonaws.services.groundstation.AWSGroundStationClientBuilder []
    (AWSGroundStationClient/builder )))

(defn list-tags-for-resource
  "Returns a list of tags or a specified resource.

  request - `com.amazonaws.services.groundstation.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.groundstation.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListTagsForResourceResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-ground-stations
  "Returns a list of ground stations.

  request - `com.amazonaws.services.groundstation.model.ListGroundStationsRequest`

  returns: Result of the ListGroundStations operation returned by the service. - `com.amazonaws.services.groundstation.model.ListGroundStationsResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListGroundStationsResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.ListGroundStationsRequest request]
    (-> this (.listGroundStations request))))

(defn reserve-contact
  "Reserves a contact using specified parameters.

  request - `com.amazonaws.services.groundstation.model.ReserveContactRequest`

  returns: Result of the ReserveContact operation returned by the service. - `com.amazonaws.services.groundstation.model.ReserveContactResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ReserveContactResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.ReserveContactRequest request]
    (-> this (.reserveContact request))))

(defn list-mission-profiles
  "Returns a list of mission profiles.

  request - `com.amazonaws.services.groundstation.model.ListMissionProfilesRequest`

  returns: Result of the ListMissionProfiles operation returned by the service. - `com.amazonaws.services.groundstation.model.ListMissionProfilesResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListMissionProfilesResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.ListMissionProfilesRequest request]
    (-> this (.listMissionProfiles request))))

(defn cancel-contact
  "Cancels a contact with a specified contact ID.

  request - `com.amazonaws.services.groundstation.model.CancelContactRequest`

  returns: Result of the CancelContact operation returned by the service. - `com.amazonaws.services.groundstation.model.CancelContactResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.CancelContactResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.CancelContactRequest request]
    (-> this (.cancelContact request))))

(defn get-satellite
  "Returns a satellite.

  request - `com.amazonaws.services.groundstation.model.GetSatelliteRequest`

  returns: Result of the GetSatellite operation returned by the service. - `com.amazonaws.services.groundstation.model.GetSatelliteResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetSatelliteResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.GetSatelliteRequest request]
    (-> this (.getSatellite request))))

(defn untag-resource
  "Deassigns a resource tag.

  request - `com.amazonaws.services.groundstation.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.groundstation.model.UntagResourceResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.UntagResourceResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-dataflow-endpoint-group
  "Creates a DataflowEndpoint group containing the specified list of DataflowEndpoint
   objects.


   The name field in each endpoint is used in your mission profile DataflowEndpointConfig
   to specify which endpoints to use during a contact.


   When a contact uses multiple DataflowEndpointConfig objects, each Config must match a
   DataflowEndpoint in the same group.

  request - `com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest`

  returns: Result of the CreateDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest request]
    (-> this (.createDataflowEndpointGroup request))))

(defn describe-contact
  "Describes an existing contact.

  request - `com.amazonaws.services.groundstation.model.DescribeContactRequest`

  returns: Result of the DescribeContact operation returned by the service. - `com.amazonaws.services.groundstation.model.DescribeContactResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.DescribeContactResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.DescribeContactRequest request]
    (-> this (.describeContact request))))

(defn delete-config
  "Deletes a Config.

  request - `com.amazonaws.services.groundstation.model.DeleteConfigRequest`

  returns: Result of the DeleteConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteConfigResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.DeleteConfigResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.DeleteConfigRequest request]
    (-> this (.deleteConfig request))))

(defn create-config
  "Creates a Config with the specified configData parameters.


   Only one type of configData can be specified.

  request - `com.amazonaws.services.groundstation.model.CreateConfigRequest`

  returns: Result of the CreateConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateConfigResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.CreateConfigResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.CreateConfigRequest request]
    (-> this (.createConfig request))))

(defn list-contacts
  "Returns a list of contacts.


   If statusList contains AVAILABLE, the request must include groundstation,
   missionprofileArn, and satelliteArn.

  request - `com.amazonaws.services.groundstation.model.ListContactsRequest`

  returns: Result of the ListContacts operation returned by the service. - `com.amazonaws.services.groundstation.model.ListContactsResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListContactsResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.ListContactsRequest request]
    (-> this (.listContacts request))))

(defn delete-dataflow-endpoint-group
  "Deletes a dataflow endpoint group.

  request - `com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest`

  returns: Result of the DeleteDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest request]
    (-> this (.deleteDataflowEndpointGroup request))))

(defn update-mission-profile
  "Updates a mission profile.


   Updating a mission profile will not update the execution parameters for existing future contacts.

  request - `com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest`

  returns: Result of the UpdateMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.UpdateMissionProfileResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.UpdateMissionProfileResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest request]
    (-> this (.updateMissionProfile request))))

(defn get-dataflow-endpoint-group
  "Returns the dataflow endpoint group.

  request - `com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest`

  returns: Result of the GetDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest request]
    (-> this (.getDataflowEndpointGroup request))))

(defn list-dataflow-endpoint-groups
  "Returns a list of DataflowEndpoint groups.

  request - `com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest`

  returns: Result of the ListDataflowEndpointGroups operation returned by the service. - `com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest request]
    (-> this (.listDataflowEndpointGroups request))))

(defn delete-mission-profile
  "Deletes a mission profile.

  request - `com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest`

  returns: Result of the DeleteMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteMissionProfileResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.DeleteMissionProfileResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest request]
    (-> this (.deleteMissionProfile request))))

(defn create-mission-profile
  "Creates a mission profile.


   dataflowEdges is a list of lists of strings. Each lower level list of strings has two elements: a
   from ARN and a to ARN.

  request - `com.amazonaws.services.groundstation.model.CreateMissionProfileRequest`

  returns: Result of the CreateMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateMissionProfileResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.CreateMissionProfileResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.CreateMissionProfileRequest request]
    (-> this (.createMissionProfile request))))

(defn update-config
  "Updates the Config used when scheduling contacts.


   Updating a Config will not update the execution parameters for existing future contacts scheduled
   with this Config.

  request - `com.amazonaws.services.groundstation.model.UpdateConfigRequest`

  returns: Result of the UpdateConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.UpdateConfigResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.UpdateConfigResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.UpdateConfigRequest request]
    (-> this (.updateConfig request))))

(defn list-configs
  "Returns a list of Config objects.

  request - `com.amazonaws.services.groundstation.model.ListConfigsRequest`

  returns: Result of the ListConfigs operation returned by the service. - `com.amazonaws.services.groundstation.model.ListConfigsResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListConfigsResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.ListConfigsRequest request]
    (-> this (.listConfigs request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSGroundStationClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-config
  "Returns Config information.


   Only one Config response can be returned.

  request - `com.amazonaws.services.groundstation.model.GetConfigRequest`

  returns: Result of the GetConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.GetConfigResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetConfigResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.GetConfigRequest request]
    (-> this (.getConfig request))))

(defn tag-resource
  "Assigns a tag to a resource.

  request - `com.amazonaws.services.groundstation.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.groundstation.model.TagResourceResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.TagResourceResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-mission-profile
  "Returns a mission profile.

  request - `com.amazonaws.services.groundstation.model.GetMissionProfileRequest`

  returns: Result of the GetMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.GetMissionProfileResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetMissionProfileResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.GetMissionProfileRequest request]
    (-> this (.getMissionProfile request))))

(defn get-minute-usage
  "Returns the number of minutes used by account.

  request - `com.amazonaws.services.groundstation.model.GetMinuteUsageRequest`

  returns: Result of the GetMinuteUsage operation returned by the service. - `com.amazonaws.services.groundstation.model.GetMinuteUsageResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetMinuteUsageResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.GetMinuteUsageRequest request]
    (-> this (.getMinuteUsage request))))

(defn list-satellites
  "Returns a list of satellites.

  request - `com.amazonaws.services.groundstation.model.ListSatellitesRequest`

  returns: Result of the ListSatellites operation returned by the service. - `com.amazonaws.services.groundstation.model.ListSatellitesResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListSatellitesResult [^AWSGroundStationClient this ^com.amazonaws.services.groundstation.model.ListSatellitesRequest request]
    (-> this (.listSatellites request))))

