(ns com.amazonaws.services.cloudhsm.AbstractAWSCloudHSM
  "Abstract implementation of AWSCloudHSM. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsm AbstractAWSCloudHSM]))

(defn delete-hapg
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the DeleteHapg action. - `com.amazonaws.services.cloudhsm.model.DeleteHapgRequest`

  returns: Result of the DeleteHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteHapgResult`"
  (^com.amazonaws.services.cloudhsm.model.DeleteHapgResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DeleteHapgRequest request]
    (-> this (.deleteHapg request))))

(defn create-hapg
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the CreateHapgRequest action. - `com.amazonaws.services.cloudhsm.model.CreateHapgRequest`

  returns: Result of the CreateHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateHapgResult`"
  (^com.amazonaws.services.cloudhsm.model.CreateHapgResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.CreateHapgRequest request]
    (-> this (.createHapg request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn set-region
  "Description copied from interface: AWSCloudHSM

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSCloudHSM this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-hapg
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the DescribeHapg action. - `com.amazonaws.services.cloudhsm.model.DescribeHapgRequest`

  returns: Result of the DescribeHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeHapgResult`"
  (^com.amazonaws.services.cloudhsm.model.DescribeHapgResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DescribeHapgRequest request]
    (-> this (.describeHapg request))))

(defn delete-luna-client
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest`

  returns: Result of the DeleteLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult`"
  (^com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest request]
    (-> this (.deleteLunaClient request))))

(defn modify-hapg
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.ModifyHapgRequest`

  returns: Result of the ModifyHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyHapgResult`"
  (^com.amazonaws.services.cloudhsm.model.ModifyHapgResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ModifyHapgRequest request]
    (-> this (.modifyHapg request))))

(defn modify-hsm
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the ModifyHsm operation. - `com.amazonaws.services.cloudhsm.model.ModifyHsmRequest`

  returns: Result of the ModifyHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyHsmResult`"
  (^com.amazonaws.services.cloudhsm.model.ModifyHsmResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ModifyHsmRequest request]
    (-> this (.modifyHsm request))))

(defn describe-luna-client
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest`

  returns: Result of the DescribeLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult`"
  (^com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest request]
    (-> this (.describeLunaClient request)))
  (^com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult [^AbstractAWSCloudHSM this]
    (-> this (.describeLunaClient))))

(defn list-hapgs
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.ListHapgsRequest`

  returns: Result of the ListHapgs operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListHapgsResult`"
  (^com.amazonaws.services.cloudhsm.model.ListHapgsResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListHapgsRequest request]
    (-> this (.listHapgs request)))
  (^com.amazonaws.services.cloudhsm.model.ListHapgsResult [^AbstractAWSCloudHSM this]
    (-> this (.listHapgs))))

(defn create-luna-client
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the CreateLunaClient action. - `com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest`

  returns: Result of the CreateLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateLunaClientResult`"
  (^com.amazonaws.services.cloudhsm.model.CreateLunaClientResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest request]
    (-> this (.createLunaClient request))))

(defn create-hsm
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the CreateHsm operation. - `com.amazonaws.services.cloudhsm.model.CreateHsmRequest`

  returns: Result of the CreateHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateHsmResult`"
  (^com.amazonaws.services.cloudhsm.model.CreateHsmResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.CreateHsmRequest request]
    (-> this (.createHsm request))))

(defn delete-hsm
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the DeleteHsm operation. - `com.amazonaws.services.cloudhsm.model.DeleteHsmRequest`

  returns: Result of the DeleteHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteHsmResult`"
  (^com.amazonaws.services.cloudhsm.model.DeleteHsmResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DeleteHsmRequest request]
    (-> this (.deleteHsm request))))

(defn shutdown
  "Description copied from interface: AWSCloudHSM"
  ([^AbstractAWSCloudHSM this]
    (-> this (.shutdown))))

(defn describe-hsm
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the DescribeHsm operation. - `com.amazonaws.services.cloudhsm.model.DescribeHsmRequest`

  returns: Result of the DescribeHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeHsmResult`"
  (^com.amazonaws.services.cloudhsm.model.DescribeHsmResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DescribeHsmRequest request]
    (-> this (.describeHsm request)))
  (^com.amazonaws.services.cloudhsm.model.DescribeHsmResult [^AbstractAWSCloudHSM this]
    (-> this (.describeHsm))))

(defn set-endpoint
  "Description copied from interface: AWSCloudHSM

  endpoint - The endpoint (ex: \"cloudhsm.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://cloudhsm.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSCloudHSM this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn remove-tags-from-resource
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn list-hsms
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.ListHsmsRequest`

  returns: Result of the ListHsms operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListHsmsResult`"
  (^com.amazonaws.services.cloudhsm.model.ListHsmsResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListHsmsRequest request]
    (-> this (.listHsms request)))
  (^com.amazonaws.services.cloudhsm.model.ListHsmsResult [^AbstractAWSCloudHSM this]
    (-> this (.listHsms))))

(defn modify-luna-client
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest`

  returns: Result of the ModifyLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult`"
  (^com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest request]
    (-> this (.modifyLunaClient request))))

(defn add-tags-to-resource
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCloudHSM

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCloudHSM this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-config
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.GetConfigRequest`

  returns: Result of the GetConfig operation returned by the service. - `com.amazonaws.services.cloudhsm.model.GetConfigResult`"
  (^com.amazonaws.services.cloudhsm.model.GetConfigResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.GetConfigRequest request]
    (-> this (.getConfig request))))

(defn list-luna-clients
  "Description copied from interface: AWSCloudHSM

  request - `com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest`

  returns: Result of the ListLunaClients operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListLunaClientsResult`"
  (^com.amazonaws.services.cloudhsm.model.ListLunaClientsResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest request]
    (-> this (.listLunaClients request)))
  (^com.amazonaws.services.cloudhsm.model.ListLunaClientsResult [^AbstractAWSCloudHSM this]
    (-> this (.listLunaClients))))

(defn list-available-zones
  "Description copied from interface: AWSCloudHSM

  request - Contains the inputs for the ListAvailableZones action. - `com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest`

  returns: Result of the ListAvailableZones operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult`"
  (^com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult [^AbstractAWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest request]
    (-> this (.listAvailableZones request)))
  (^com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult [^AbstractAWSCloudHSM this]
    (-> this (.listAvailableZones))))

