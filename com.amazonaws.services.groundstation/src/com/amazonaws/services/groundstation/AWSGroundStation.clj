(ns com.amazonaws.services.groundstation.AWSGroundStation
  "Interface for accessing AWS Ground Station.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSGroundStation instead.



  Welcome to the AWS Ground Station API Reference. AWS Ground Station is a fully managed service that enables you to
  control satellite communications, downlink and process satellite data, and scale your satellite operations
  efficiently and cost-effectively without having to build or manage your own ground station infrastructure."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.groundstation AWSGroundStation]))

(defn list-tags-for-resource
  "Returns a list of tags or a specified resource.

  list-tags-for-resource-request - `com.amazonaws.services.groundstation.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.groundstation.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListTagsForResourceResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn list-ground-stations
  "Returns a list of ground stations.

  list-ground-stations-request - `com.amazonaws.services.groundstation.model.ListGroundStationsRequest`

  returns: Result of the ListGroundStations operation returned by the service. - `com.amazonaws.services.groundstation.model.ListGroundStationsResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListGroundStationsResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.ListGroundStationsRequest list-ground-stations-request]
    (-> this (.listGroundStations list-ground-stations-request))))

(defn reserve-contact
  "Reserves a contact using specified parameters.

  reserve-contact-request - `com.amazonaws.services.groundstation.model.ReserveContactRequest`

  returns: Result of the ReserveContact operation returned by the service. - `com.amazonaws.services.groundstation.model.ReserveContactResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ReserveContactResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.ReserveContactRequest reserve-contact-request]
    (-> this (.reserveContact reserve-contact-request))))

(defn list-mission-profiles
  "Returns a list of mission profiles.

  list-mission-profiles-request - `com.amazonaws.services.groundstation.model.ListMissionProfilesRequest`

  returns: Result of the ListMissionProfiles operation returned by the service. - `com.amazonaws.services.groundstation.model.ListMissionProfilesResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListMissionProfilesResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.ListMissionProfilesRequest list-mission-profiles-request]
    (-> this (.listMissionProfiles list-mission-profiles-request))))

(defn cancel-contact
  "Cancels a contact with a specified contact ID.

  cancel-contact-request - `com.amazonaws.services.groundstation.model.CancelContactRequest`

  returns: Result of the CancelContact operation returned by the service. - `com.amazonaws.services.groundstation.model.CancelContactResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.CancelContactResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.CancelContactRequest cancel-contact-request]
    (-> this (.cancelContact cancel-contact-request))))

(defn get-satellite
  "Returns a satellite.

  get-satellite-request - `com.amazonaws.services.groundstation.model.GetSatelliteRequest`

  returns: Result of the GetSatellite operation returned by the service. - `com.amazonaws.services.groundstation.model.GetSatelliteResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetSatelliteResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.GetSatelliteRequest get-satellite-request]
    (-> this (.getSatellite get-satellite-request))))

(defn untag-resource
  "Deassigns a resource tag.

  untag-resource-request - `com.amazonaws.services.groundstation.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.groundstation.model.UntagResourceResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.UntagResourceResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn create-dataflow-endpoint-group
  "Creates a DataflowEndpoint group containing the specified list of DataflowEndpoint
   objects.


   The name field in each endpoint is used in your mission profile DataflowEndpointConfig
   to specify which endpoints to use during a contact.


   When a contact uses multiple DataflowEndpointConfig objects, each Config must match a
   DataflowEndpoint in the same group.

  create-dataflow-endpoint-group-request - `com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest`

  returns: Result of the CreateDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest create-dataflow-endpoint-group-request]
    (-> this (.createDataflowEndpointGroup create-dataflow-endpoint-group-request))))

(defn describe-contact
  "Describes an existing contact.

  describe-contact-request - `com.amazonaws.services.groundstation.model.DescribeContactRequest`

  returns: Result of the DescribeContact operation returned by the service. - `com.amazonaws.services.groundstation.model.DescribeContactResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.DescribeContactResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.DescribeContactRequest describe-contact-request]
    (-> this (.describeContact describe-contact-request))))

(defn delete-config
  "Deletes a Config.

  delete-config-request - `com.amazonaws.services.groundstation.model.DeleteConfigRequest`

  returns: Result of the DeleteConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteConfigResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.DeleteConfigResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.DeleteConfigRequest delete-config-request]
    (-> this (.deleteConfig delete-config-request))))

(defn create-config
  "Creates a Config with the specified configData parameters.


   Only one type of configData can be specified.

  create-config-request - `com.amazonaws.services.groundstation.model.CreateConfigRequest`

  returns: Result of the CreateConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateConfigResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.CreateConfigResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.CreateConfigRequest create-config-request]
    (-> this (.createConfig create-config-request))))

(defn list-contacts
  "Returns a list of contacts.


   If statusList contains AVAILABLE, the request must include groundstation,
   missionprofileArn, and satelliteArn.

  list-contacts-request - `com.amazonaws.services.groundstation.model.ListContactsRequest`

  returns: Result of the ListContacts operation returned by the service. - `com.amazonaws.services.groundstation.model.ListContactsResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListContactsResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.ListContactsRequest list-contacts-request]
    (-> this (.listContacts list-contacts-request))))

(defn delete-dataflow-endpoint-group
  "Deletes a dataflow endpoint group.

  delete-dataflow-endpoint-group-request - `com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest`

  returns: Result of the DeleteDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest delete-dataflow-endpoint-group-request]
    (-> this (.deleteDataflowEndpointGroup delete-dataflow-endpoint-group-request))))

(defn update-mission-profile
  "Updates a mission profile.


   Updating a mission profile will not update the execution parameters for existing future contacts.

  update-mission-profile-request - `com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest`

  returns: Result of the UpdateMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.UpdateMissionProfileResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.UpdateMissionProfileResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest update-mission-profile-request]
    (-> this (.updateMissionProfile update-mission-profile-request))))

(defn get-dataflow-endpoint-group
  "Returns the dataflow endpoint group.

  get-dataflow-endpoint-group-request - `com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest`

  returns: Result of the GetDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest get-dataflow-endpoint-group-request]
    (-> this (.getDataflowEndpointGroup get-dataflow-endpoint-group-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSGroundStation this]
    (-> this (.shutdown))))

(defn list-dataflow-endpoint-groups
  "Returns a list of DataflowEndpoint groups.

  list-dataflow-endpoint-groups-request - `com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest`

  returns: Result of the ListDataflowEndpointGroups operation returned by the service. - `com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest list-dataflow-endpoint-groups-request]
    (-> this (.listDataflowEndpointGroups list-dataflow-endpoint-groups-request))))

(defn delete-mission-profile
  "Deletes a mission profile.

  delete-mission-profile-request - `com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest`

  returns: Result of the DeleteMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteMissionProfileResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.DeleteMissionProfileResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest delete-mission-profile-request]
    (-> this (.deleteMissionProfile delete-mission-profile-request))))

(defn create-mission-profile
  "Creates a mission profile.


   dataflowEdges is a list of lists of strings. Each lower level list of strings has two elements: a
   from ARN and a to ARN.

  create-mission-profile-request - `com.amazonaws.services.groundstation.model.CreateMissionProfileRequest`

  returns: Result of the CreateMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateMissionProfileResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.CreateMissionProfileResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.CreateMissionProfileRequest create-mission-profile-request]
    (-> this (.createMissionProfile create-mission-profile-request))))

(defn update-config
  "Updates the Config used when scheduling contacts.


   Updating a Config will not update the execution parameters for existing future contacts scheduled
   with this Config.

  update-config-request - `com.amazonaws.services.groundstation.model.UpdateConfigRequest`

  returns: Result of the UpdateConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.UpdateConfigResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.UpdateConfigResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.UpdateConfigRequest update-config-request]
    (-> this (.updateConfig update-config-request))))

(defn list-configs
  "Returns a list of Config objects.

  list-configs-request - `com.amazonaws.services.groundstation.model.ListConfigsRequest`

  returns: Result of the ListConfigs operation returned by the service. - `com.amazonaws.services.groundstation.model.ListConfigsResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListConfigsResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.ListConfigsRequest list-configs-request]
    (-> this (.listConfigs list-configs-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSGroundStation this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-config
  "Returns Config information.


   Only one Config response can be returned.

  get-config-request - `com.amazonaws.services.groundstation.model.GetConfigRequest`

  returns: Result of the GetConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.GetConfigResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetConfigResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.GetConfigRequest get-config-request]
    (-> this (.getConfig get-config-request))))

(defn tag-resource
  "Assigns a tag to a resource.

  tag-resource-request - `com.amazonaws.services.groundstation.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.groundstation.model.TagResourceResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.TagResourceResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn get-mission-profile
  "Returns a mission profile.

  get-mission-profile-request - `com.amazonaws.services.groundstation.model.GetMissionProfileRequest`

  returns: Result of the GetMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.GetMissionProfileResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetMissionProfileResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.GetMissionProfileRequest get-mission-profile-request]
    (-> this (.getMissionProfile get-mission-profile-request))))

(defn get-minute-usage
  "Returns the number of minutes used by account.

  get-minute-usage-request - `com.amazonaws.services.groundstation.model.GetMinuteUsageRequest`

  returns: Result of the GetMinuteUsage operation returned by the service. - `com.amazonaws.services.groundstation.model.GetMinuteUsageResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.GetMinuteUsageResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.GetMinuteUsageRequest get-minute-usage-request]
    (-> this (.getMinuteUsage get-minute-usage-request))))

(defn list-satellites
  "Returns a list of satellites.

  list-satellites-request - `com.amazonaws.services.groundstation.model.ListSatellitesRequest`

  returns: Result of the ListSatellites operation returned by the service. - `com.amazonaws.services.groundstation.model.ListSatellitesResult`

  throws: com.amazonaws.services.groundstation.model.DependencyException - Dependency encountered an error."
  (^com.amazonaws.services.groundstation.model.ListSatellitesResult [^AWSGroundStation this ^com.amazonaws.services.groundstation.model.ListSatellitesRequest list-satellites-request]
    (-> this (.listSatellites list-satellites-request))))

