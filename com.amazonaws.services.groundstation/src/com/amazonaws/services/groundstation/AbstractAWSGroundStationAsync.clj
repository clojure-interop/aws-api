(ns com.amazonaws.services.groundstation.AbstractAWSGroundStationAsync
  "Abstract implementation of AWSGroundStationAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.groundstation AbstractAWSGroundStationAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn list-contacts-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.ListContactsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListContacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListContactsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListContactsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listContactsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListContactsRequest request]
    (-> this (.listContactsAsync request))))

(defn get-dataflow-endpoint-group-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDataflowEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDataflowEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest request]
    (-> this (.getDataflowEndpointGroupAsync request))))

(defn update-config-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.UpdateConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.UpdateConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UpdateConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UpdateConfigRequest request]
    (-> this (.updateConfigAsync request))))

(defn create-dataflow-endpoint-group-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataflowEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDataflowEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest request]
    (-> this (.createDataflowEndpointGroupAsync request))))

(defn get-satellite-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.GetSatelliteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSatellite operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetSatelliteResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetSatelliteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSatelliteAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetSatelliteRequest request]
    (-> this (.getSatelliteAsync request))))

(defn update-mission-profile-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateMissionProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.UpdateMissionProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateMissionProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest request]
    (-> this (.updateMissionProfileAsync request))))

(defn delete-config-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.DeleteConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.DeleteConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteConfigRequest request]
    (-> this (.deleteConfigAsync request))))

(defn list-satellites-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.ListSatellitesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSatellites operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListSatellitesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListSatellitesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSatellitesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListSatellitesRequest request]
    (-> this (.listSatellitesAsync request))))

(defn list-configs-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.ListConfigsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListConfigsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListConfigsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListConfigsRequest request]
    (-> this (.listConfigsAsync request))))

(defn reserve-contact-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.ReserveContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReserveContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ReserveContactResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ReserveContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reserveContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ReserveContactRequest request]
    (-> this (.reserveContactAsync request))))

(defn get-minute-usage-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.GetMinuteUsageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMinuteUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetMinuteUsageResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetMinuteUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMinuteUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetMinuteUsageRequest request]
    (-> this (.getMinuteUsageAsync request))))

(defn create-config-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.CreateConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.CreateConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateConfigRequest request]
    (-> this (.createConfigAsync request))))

(defn delete-dataflow-endpoint-group-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataflowEndpointGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDataflowEndpointGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest request]
    (-> this (.deleteDataflowEndpointGroupAsync request))))

(defn delete-mission-profile-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMissionProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.DeleteMissionProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMissionProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest request]
    (-> this (.deleteMissionProfileAsync request))))

(defn get-config-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.GetConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetConfigRequest request]
    (-> this (.getConfigAsync request))))

(defn list-dataflow-endpoint-groups-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDataflowEndpointGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDataflowEndpointGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest request]
    (-> this (.listDataflowEndpointGroupsAsync request))))

(defn describe-contact-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.DescribeContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.DescribeContactResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DescribeContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.DescribeContactRequest request]
    (-> this (.describeContactAsync request))))

(defn get-mission-profile-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.GetMissionProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMissionProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.GetMissionProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetMissionProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMissionProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.GetMissionProfileRequest request]
    (-> this (.getMissionProfileAsync request))))

(defn list-mission-profiles-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.ListMissionProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMissionProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListMissionProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListMissionProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMissionProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListMissionProfilesRequest request]
    (-> this (.listMissionProfilesAsync request))))

(defn list-ground-stations-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.ListGroundStationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroundStations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListGroundStationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListGroundStationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroundStationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListGroundStationsRequest request]
    (-> this (.listGroundStationsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn cancel-contact-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.CancelContactRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.CancelContactResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CancelContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CancelContactRequest request]
    (-> this (.cancelContactAsync request))))

(defn create-mission-profile-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.CreateMissionProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMissionProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.CreateMissionProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateMissionProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMissionProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.CreateMissionProfileRequest request]
    (-> this (.createMissionProfileAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSGroundStationAsync

  request - `com.amazonaws.services.groundstation.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.groundstation.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSGroundStationAsync this ^com.amazonaws.services.groundstation.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

