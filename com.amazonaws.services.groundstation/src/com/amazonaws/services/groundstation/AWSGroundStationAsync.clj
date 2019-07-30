(ns com.amazonaws.services.groundstation.AWSGroundStationAsync
  "Interface for accessing AWS Ground Station asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSGroundStationAsync instead.



  Welcome to the AWS Ground Station API Reference. AWS Ground Station is a fully managed service that enables you to
  control satellite communications, downlink and process satellite data, and scale your satellite operations
  efficiently and cost-effectively without having to build or manage your own ground station infrastructure."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.groundstation AWSGroundStationAsync]))

(defn untag-resource-async
  "Deassigns a resource tag.

  untag-resource-request - `com.amazonaws.services.groundstation.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn list-contacts-async
  "Returns a list of contacts.


   If statusList contains AVAILABLE, the request must include groundstation,
   missionprofileArn, and satelliteArn.

  list-contacts-request - `com.amazonaws.services.groundstation.model.ListContactsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListContacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListContactsResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListContactsRequest list-contacts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listContactsAsync list-contacts-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListContactsRequest list-contacts-request]
    (-> this (.listContactsAsync list-contacts-request))))

(defn get-dataflow-endpoint-group-async
  "Returns the dataflow endpoint group.

  get-dataflow-endpoint-group-request - `com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataflowEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest get-dataflow-endpoint-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataflowEndpointGroupAsync get-dataflow-endpoint-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest get-dataflow-endpoint-group-request]
    (-> this (.getDataflowEndpointGroupAsync get-dataflow-endpoint-group-request))))

(defn update-config-async
  "Updates the Config used when scheduling contacts.


   Updating a Config will not update the execution parameters for existing future contacts scheduled
   with this Config.

  update-config-request - `com.amazonaws.services.groundstation.model.UpdateConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.UpdateConfigResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UpdateConfigRequest update-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigAsync update-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UpdateConfigRequest update-config-request]
    (-> this (.updateConfigAsync update-config-request))))

(defn create-dataflow-endpoint-group-async
  "Creates a DataflowEndpoint group containing the specified list of DataflowEndpoint
   objects.


   The name field in each endpoint is used in your mission profile DataflowEndpointConfig
   to specify which endpoints to use during a contact.


   When a contact uses multiple DataflowEndpointConfig objects, each Config must match a
   DataflowEndpoint in the same group.

  create-dataflow-endpoint-group-request - `com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataflowEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest create-dataflow-endpoint-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataflowEndpointGroupAsync create-dataflow-endpoint-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest create-dataflow-endpoint-group-request]
    (-> this (.createDataflowEndpointGroupAsync create-dataflow-endpoint-group-request))))

(defn get-satellite-async
  "Returns a satellite.

  get-satellite-request - `com.amazonaws.services.groundstation.model.GetSatelliteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSatellite operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetSatelliteResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetSatelliteRequest get-satellite-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSatelliteAsync get-satellite-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetSatelliteRequest get-satellite-request]
    (-> this (.getSatelliteAsync get-satellite-request))))

(defn update-mission-profile-async
  "Updates a mission profile.


   Updating a mission profile will not update the execution parameters for existing future contacts.

  update-mission-profile-request - `com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMissionProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.UpdateMissionProfileResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest update-mission-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMissionProfileAsync update-mission-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest update-mission-profile-request]
    (-> this (.updateMissionProfileAsync update-mission-profile-request))))

(defn delete-config-async
  "Deletes a Config.

  delete-config-request - `com.amazonaws.services.groundstation.model.DeleteConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.DeleteConfigResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteConfigRequest delete-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigAsync delete-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteConfigRequest delete-config-request]
    (-> this (.deleteConfigAsync delete-config-request))))

(defn list-satellites-async
  "Returns a list of satellites.

  list-satellites-request - `com.amazonaws.services.groundstation.model.ListSatellitesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSatellites operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListSatellitesResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListSatellitesRequest list-satellites-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSatellitesAsync list-satellites-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListSatellitesRequest list-satellites-request]
    (-> this (.listSatellitesAsync list-satellites-request))))

(defn list-configs-async
  "Returns a list of Config objects.

  list-configs-request - `com.amazonaws.services.groundstation.model.ListConfigsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListConfigsResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListConfigsRequest list-configs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigsAsync list-configs-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListConfigsRequest list-configs-request]
    (-> this (.listConfigsAsync list-configs-request))))

(defn reserve-contact-async
  "Reserves a contact using specified parameters.

  reserve-contact-request - `com.amazonaws.services.groundstation.model.ReserveContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReserveContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ReserveContactResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ReserveContactRequest reserve-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reserveContactAsync reserve-contact-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ReserveContactRequest reserve-contact-request]
    (-> this (.reserveContactAsync reserve-contact-request))))

(defn get-minute-usage-async
  "Returns the number of minutes used by account.

  get-minute-usage-request - `com.amazonaws.services.groundstation.model.GetMinuteUsageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMinuteUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetMinuteUsageResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetMinuteUsageRequest get-minute-usage-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMinuteUsageAsync get-minute-usage-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetMinuteUsageRequest get-minute-usage-request]
    (-> this (.getMinuteUsageAsync get-minute-usage-request))))

(defn create-config-async
  "Creates a Config with the specified configData parameters.


   Only one type of configData can be specified.

  create-config-request - `com.amazonaws.services.groundstation.model.CreateConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.CreateConfigResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateConfigRequest create-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigAsync create-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateConfigRequest create-config-request]
    (-> this (.createConfigAsync create-config-request))))

(defn delete-dataflow-endpoint-group-async
  "Deletes a dataflow endpoint group.

  delete-dataflow-endpoint-group-request - `com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataflowEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest delete-dataflow-endpoint-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDataflowEndpointGroupAsync delete-dataflow-endpoint-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest delete-dataflow-endpoint-group-request]
    (-> this (.deleteDataflowEndpointGroupAsync delete-dataflow-endpoint-group-request))))

(defn delete-mission-profile-async
  "Deletes a mission profile.

  delete-mission-profile-request - `com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMissionProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.DeleteMissionProfileResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest delete-mission-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMissionProfileAsync delete-mission-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest delete-mission-profile-request]
    (-> this (.deleteMissionProfileAsync delete-mission-profile-request))))

(defn get-config-async
  "Returns Config information.


   Only one Config response can be returned.

  get-config-request - `com.amazonaws.services.groundstation.model.GetConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetConfigResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetConfigRequest get-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigAsync get-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetConfigRequest get-config-request]
    (-> this (.getConfigAsync get-config-request))))

(defn list-dataflow-endpoint-groups-async
  "Returns a list of DataflowEndpoint groups.

  list-dataflow-endpoint-groups-request - `com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDataflowEndpointGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest list-dataflow-endpoint-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDataflowEndpointGroupsAsync list-dataflow-endpoint-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest list-dataflow-endpoint-groups-request]
    (-> this (.listDataflowEndpointGroupsAsync list-dataflow-endpoint-groups-request))))

(defn describe-contact-async
  "Describes an existing contact.

  describe-contact-request - `com.amazonaws.services.groundstation.model.DescribeContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.DescribeContactResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DescribeContactRequest describe-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContactAsync describe-contact-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DescribeContactRequest describe-contact-request]
    (-> this (.describeContactAsync describe-contact-request))))

(defn get-mission-profile-async
  "Returns a mission profile.

  get-mission-profile-request - `com.amazonaws.services.groundstation.model.GetMissionProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMissionProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetMissionProfileResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetMissionProfileRequest get-mission-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMissionProfileAsync get-mission-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetMissionProfileRequest get-mission-profile-request]
    (-> this (.getMissionProfileAsync get-mission-profile-request))))

(defn list-mission-profiles-async
  "Returns a list of mission profiles.

  list-mission-profiles-request - `com.amazonaws.services.groundstation.model.ListMissionProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMissionProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListMissionProfilesResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListMissionProfilesRequest list-mission-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMissionProfilesAsync list-mission-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListMissionProfilesRequest list-mission-profiles-request]
    (-> this (.listMissionProfilesAsync list-mission-profiles-request))))

(defn list-ground-stations-async
  "Returns a list of ground stations.

  list-ground-stations-request - `com.amazonaws.services.groundstation.model.ListGroundStationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroundStations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListGroundStationsResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListGroundStationsRequest list-ground-stations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroundStationsAsync list-ground-stations-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListGroundStationsRequest list-ground-stations-request]
    (-> this (.listGroundStationsAsync list-ground-stations-request))))

(defn list-tags-for-resource-async
  "Returns a list of tags or a specified resource.

  list-tags-for-resource-request - `com.amazonaws.services.groundstation.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn cancel-contact-async
  "Cancels a contact with a specified contact ID.

  cancel-contact-request - `com.amazonaws.services.groundstation.model.CancelContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.CancelContactResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CancelContactRequest cancel-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelContactAsync cancel-contact-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CancelContactRequest cancel-contact-request]
    (-> this (.cancelContactAsync cancel-contact-request))))

(defn create-mission-profile-async
  "Creates a mission profile.


   dataflowEdges is a list of lists of strings. Each lower level list of strings has two elements: a
   from ARN and a to ARN.

  create-mission-profile-request - `com.amazonaws.services.groundstation.model.CreateMissionProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMissionProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.CreateMissionProfileResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateMissionProfileRequest create-mission-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMissionProfileAsync create-mission-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateMissionProfileRequest create-mission-profile-request]
    (-> this (.createMissionProfileAsync create-mission-profile-request))))

(defn tag-resource-async
  "Assigns a tag to a resource.

  tag-resource-request - `com.amazonaws.services.groundstation.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

