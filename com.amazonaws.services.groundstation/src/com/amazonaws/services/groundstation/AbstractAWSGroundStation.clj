(ns com.amazonaws.services.groundstation.AbstractAWSGroundStation
  "Abstract implementation of AWSGroundStation. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.groundstation AbstractAWSGroundStation]))

(defn list-tags-for-resource
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.groundstation.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.groundstation.model.ListTagsForResourceResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-ground-stations
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.ListGroundStationsRequest`

  returns: Result of the ListGroundStations operation returned by the service. - `com.amazonaws.services.groundstation.model.ListGroundStationsResult`"
  (^com.amazonaws.services.groundstation.model.ListGroundStationsResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.ListGroundStationsRequest request]
    (-> this (.listGroundStations request))))

(defn reserve-contact
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.ReserveContactRequest`

  returns: Result of the ReserveContact operation returned by the service. - `com.amazonaws.services.groundstation.model.ReserveContactResult`"
  (^com.amazonaws.services.groundstation.model.ReserveContactResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.ReserveContactRequest request]
    (-> this (.reserveContact request))))

(defn list-mission-profiles
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.ListMissionProfilesRequest`

  returns: Result of the ListMissionProfiles operation returned by the service. - `com.amazonaws.services.groundstation.model.ListMissionProfilesResult`"
  (^com.amazonaws.services.groundstation.model.ListMissionProfilesResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.ListMissionProfilesRequest request]
    (-> this (.listMissionProfiles request))))

(defn cancel-contact
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.CancelContactRequest`

  returns: Result of the CancelContact operation returned by the service. - `com.amazonaws.services.groundstation.model.CancelContactResult`"
  (^com.amazonaws.services.groundstation.model.CancelContactResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.CancelContactRequest request]
    (-> this (.cancelContact request))))

(defn get-satellite
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.GetSatelliteRequest`

  returns: Result of the GetSatellite operation returned by the service. - `com.amazonaws.services.groundstation.model.GetSatelliteResult`"
  (^com.amazonaws.services.groundstation.model.GetSatelliteResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.GetSatelliteRequest request]
    (-> this (.getSatellite request))))

(defn untag-resource
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.groundstation.model.UntagResourceResult`"
  (^com.amazonaws.services.groundstation.model.UntagResourceResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-dataflow-endpoint-group
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest`

  returns: Result of the CreateDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupResult`"
  (^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest request]
    (-> this (.createDataflowEndpointGroup request))))

(defn describe-contact
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.DescribeContactRequest`

  returns: Result of the DescribeContact operation returned by the service. - `com.amazonaws.services.groundstation.model.DescribeContactResult`"
  (^com.amazonaws.services.groundstation.model.DescribeContactResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.DescribeContactRequest request]
    (-> this (.describeContact request))))

(defn delete-config
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.DeleteConfigRequest`

  returns: Result of the DeleteConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteConfigResult`"
  (^com.amazonaws.services.groundstation.model.DeleteConfigResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.DeleteConfigRequest request]
    (-> this (.deleteConfig request))))

(defn create-config
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.CreateConfigRequest`

  returns: Result of the CreateConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateConfigResult`"
  (^com.amazonaws.services.groundstation.model.CreateConfigResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.CreateConfigRequest request]
    (-> this (.createConfig request))))

(defn list-contacts
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.ListContactsRequest`

  returns: Result of the ListContacts operation returned by the service. - `com.amazonaws.services.groundstation.model.ListContactsResult`"
  (^com.amazonaws.services.groundstation.model.ListContactsResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.ListContactsRequest request]
    (-> this (.listContacts request))))

(defn delete-dataflow-endpoint-group
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest`

  returns: Result of the DeleteDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupResult`"
  (^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.DeleteDataflowEndpointGroupRequest request]
    (-> this (.deleteDataflowEndpointGroup request))))

(defn update-mission-profile
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest`

  returns: Result of the UpdateMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.UpdateMissionProfileResult`"
  (^com.amazonaws.services.groundstation.model.UpdateMissionProfileResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.UpdateMissionProfileRequest request]
    (-> this (.updateMissionProfile request))))

(defn get-dataflow-endpoint-group
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest`

  returns: Result of the GetDataflowEndpointGroup operation returned by the service. - `com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupResult`"
  (^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.GetDataflowEndpointGroupRequest request]
    (-> this (.getDataflowEndpointGroup request))))

(defn shutdown
  "Description copied from interface: AWSGroundStation"
  ([^AbstractAWSGroundStation this]
    (-> this (.shutdown))))

(defn list-dataflow-endpoint-groups
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest`

  returns: Result of the ListDataflowEndpointGroups operation returned by the service. - `com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsResult`"
  (^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.ListDataflowEndpointGroupsRequest request]
    (-> this (.listDataflowEndpointGroups request))))

(defn delete-mission-profile
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest`

  returns: Result of the DeleteMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.DeleteMissionProfileResult`"
  (^com.amazonaws.services.groundstation.model.DeleteMissionProfileResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.DeleteMissionProfileRequest request]
    (-> this (.deleteMissionProfile request))))

(defn create-mission-profile
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.CreateMissionProfileRequest`

  returns: Result of the CreateMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.CreateMissionProfileResult`"
  (^com.amazonaws.services.groundstation.model.CreateMissionProfileResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.CreateMissionProfileRequest request]
    (-> this (.createMissionProfile request))))

(defn update-config
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.UpdateConfigRequest`

  returns: Result of the UpdateConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.UpdateConfigResult`"
  (^com.amazonaws.services.groundstation.model.UpdateConfigResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.UpdateConfigRequest request]
    (-> this (.updateConfig request))))

(defn list-configs
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.ListConfigsRequest`

  returns: Result of the ListConfigs operation returned by the service. - `com.amazonaws.services.groundstation.model.ListConfigsResult`"
  (^com.amazonaws.services.groundstation.model.ListConfigsResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.ListConfigsRequest request]
    (-> this (.listConfigs request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSGroundStation

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSGroundStation this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-config
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.GetConfigRequest`

  returns: Result of the GetConfig operation returned by the service. - `com.amazonaws.services.groundstation.model.GetConfigResult`"
  (^com.amazonaws.services.groundstation.model.GetConfigResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.GetConfigRequest request]
    (-> this (.getConfig request))))

(defn tag-resource
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.groundstation.model.TagResourceResult`"
  (^com.amazonaws.services.groundstation.model.TagResourceResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-mission-profile
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.GetMissionProfileRequest`

  returns: Result of the GetMissionProfile operation returned by the service. - `com.amazonaws.services.groundstation.model.GetMissionProfileResult`"
  (^com.amazonaws.services.groundstation.model.GetMissionProfileResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.GetMissionProfileRequest request]
    (-> this (.getMissionProfile request))))

(defn get-minute-usage
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.GetMinuteUsageRequest`

  returns: Result of the GetMinuteUsage operation returned by the service. - `com.amazonaws.services.groundstation.model.GetMinuteUsageResult`"
  (^com.amazonaws.services.groundstation.model.GetMinuteUsageResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.GetMinuteUsageRequest request]
    (-> this (.getMinuteUsage request))))

(defn list-satellites
  "Description copied from interface: AWSGroundStation

  request - `com.amazonaws.services.groundstation.model.ListSatellitesRequest`

  returns: Result of the ListSatellites operation returned by the service. - `com.amazonaws.services.groundstation.model.ListSatellitesResult`"
  (^com.amazonaws.services.groundstation.model.ListSatellitesResult [^AbstractAWSGroundStation this ^com.amazonaws.services.groundstation.model.ListSatellitesRequest request]
    (-> this (.listSatellites request))))

