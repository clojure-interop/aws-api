(ns com.amazonaws.services.mediapackagevod.AWSMediaPackageVod
  "Interface for accessing MediaPackage Vod.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaPackageVod instead.


  AWS Elemental MediaPackage VOD"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackagevod AWSMediaPackageVod]))

(defn list-packaging-configurations
  "Returns a collection of MediaPackage VOD PackagingConfiguration resources.

  list-packaging-configurations-request - `com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest`

  returns: Result of the ListPackagingConfigurations operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest list-packaging-configurations-request]
    (-> this (.listPackagingConfigurations list-packaging-configurations-request))))

(defn delete-asset
  "Deletes an existing MediaPackage VOD Asset resource.

  delete-asset-request - `com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest`

  returns: Result of the DeleteAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeleteAssetResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DeleteAssetResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest delete-asset-request]
    (-> this (.deleteAsset delete-asset-request))))

(defn list-packaging-groups
  "Returns a collection of MediaPackage VOD PackagingGroup resources.

  list-packaging-groups-request - `com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest`

  returns: Result of the ListPackagingGroups operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest list-packaging-groups-request]
    (-> this (.listPackagingGroups list-packaging-groups-request))))

(defn delete-packaging-group
  "Deletes a MediaPackage VOD PackagingGroup resource.

  delete-packaging-group-request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest`

  returns: Result of the DeletePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest delete-packaging-group-request]
    (-> this (.deletePackagingGroup delete-packaging-group-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMediaPackageVod this]
    (-> this (.shutdown))))

(defn describe-packaging-configuration
  "Returns a description of a MediaPackage VOD PackagingConfiguration resource.

  describe-packaging-configuration-request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest`

  returns: Result of the DescribePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest describe-packaging-configuration-request]
    (-> this (.describePackagingConfiguration describe-packaging-configuration-request))))

(defn list-assets
  "Returns a collection of MediaPackage VOD Asset resources.

  list-assets-request - `com.amazonaws.services.mediapackagevod.model.ListAssetsRequest`

  returns: Result of the ListAssets operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListAssetsResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.ListAssetsResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.ListAssetsRequest list-assets-request]
    (-> this (.listAssets list-assets-request))))

(defn create-packaging-group
  "Creates a new MediaPackage VOD PackagingGroup resource.

  create-packaging-group-request - A new MediaPackage VOD PackagingGroup resource configuration. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest`

  returns: Result of the CreatePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest create-packaging-group-request]
    (-> this (.createPackagingGroup create-packaging-group-request))))

(defn create-packaging-configuration
  "Creates a new MediaPackage VOD PackagingConfiguration resource.

  create-packaging-configuration-request - A new MediaPackage VOD PackagingConfiguration resource configuration. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest`

  returns: Result of the CreatePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest create-packaging-configuration-request]
    (-> this (.createPackagingConfiguration create-packaging-configuration-request))))

(defn describe-packaging-group
  "Returns a description of a MediaPackage VOD PackagingGroup resource.

  describe-packaging-group-request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest`

  returns: Result of the DescribePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest describe-packaging-group-request]
    (-> this (.describePackagingGroup describe-packaging-group-request))))

(defn create-asset
  "Creates a new MediaPackage VOD Asset resource.

  create-asset-request - A new MediaPackage VOD Asset configuration. - `com.amazonaws.services.mediapackagevod.model.CreateAssetRequest`

  returns: Result of the CreateAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreateAssetResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.CreateAssetResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.CreateAssetRequest create-asset-request]
    (-> this (.createAsset create-asset-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaPackageVod this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-packaging-configuration
  "Deletes a MediaPackage VOD PackagingConfiguration resource.

  delete-packaging-configuration-request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest`

  returns: Result of the DeletePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest delete-packaging-configuration-request]
    (-> this (.deletePackagingConfiguration delete-packaging-configuration-request))))

(defn describe-asset
  "Returns a description of a MediaPackage VOD Asset resource.

  describe-asset-request - `com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest`

  returns: Result of the DescribeAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribeAssetResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DescribeAssetResult [^AWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest describe-asset-request]
    (-> this (.describeAsset describe-asset-request))))

