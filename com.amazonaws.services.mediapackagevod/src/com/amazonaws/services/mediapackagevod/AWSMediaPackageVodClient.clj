(ns com.amazonaws.services.mediapackagevod.AWSMediaPackageVodClient
  "Client for accessing MediaPackage Vod. All service calls made using this client are blocking, and will not return
  until the service call completes.

  AWS Elemental MediaPackage VOD"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackagevod AWSMediaPackageVodClient]))

(defn *builder
  "returns: `com.amazonaws.services.mediapackagevod.AWSMediaPackageVodClientBuilder`"
  (^com.amazonaws.services.mediapackagevod.AWSMediaPackageVodClientBuilder []
    (AWSMediaPackageVodClient/builder )))

(defn list-packaging-configurations
  "Returns a collection of MediaPackage VOD PackagingConfiguration resources.

  request - `com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest`

  returns: Result of the ListPackagingConfigurations operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest request]
    (-> this (.listPackagingConfigurations request))))

(defn delete-asset
  "Deletes an existing MediaPackage VOD Asset resource.

  request - `com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest`

  returns: Result of the DeleteAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeleteAssetResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DeleteAssetResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest request]
    (-> this (.deleteAsset request))))

(defn list-packaging-groups
  "Returns a collection of MediaPackage VOD PackagingGroup resources.

  request - `com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest`

  returns: Result of the ListPackagingGroups operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest request]
    (-> this (.listPackagingGroups request))))

(defn delete-packaging-group
  "Deletes a MediaPackage VOD PackagingGroup resource.

  request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest`

  returns: Result of the DeletePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest request]
    (-> this (.deletePackagingGroup request))))

(defn describe-packaging-configuration
  "Returns a description of a MediaPackage VOD PackagingConfiguration resource.

  request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest`

  returns: Result of the DescribePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest request]
    (-> this (.describePackagingConfiguration request))))

(defn list-assets
  "Returns a collection of MediaPackage VOD Asset resources.

  request - `com.amazonaws.services.mediapackagevod.model.ListAssetsRequest`

  returns: Result of the ListAssets operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListAssetsResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.ListAssetsResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.ListAssetsRequest request]
    (-> this (.listAssets request))))

(defn create-packaging-group
  "Creates a new MediaPackage VOD PackagingGroup resource.

  request - `com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest`

  returns: Result of the CreatePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest request]
    (-> this (.createPackagingGroup request))))

(defn create-packaging-configuration
  "Creates a new MediaPackage VOD PackagingConfiguration resource.

  request - `com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest`

  returns: Result of the CreatePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest request]
    (-> this (.createPackagingConfiguration request))))

(defn describe-packaging-group
  "Returns a description of a MediaPackage VOD PackagingGroup resource.

  request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest`

  returns: Result of the DescribePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest request]
    (-> this (.describePackagingGroup request))))

(defn create-asset
  "Creates a new MediaPackage VOD Asset resource.

  request - `com.amazonaws.services.mediapackagevod.model.CreateAssetRequest`

  returns: Result of the CreateAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreateAssetResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.CreateAssetResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.CreateAssetRequest request]
    (-> this (.createAsset request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaPackageVodClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-packaging-configuration
  "Deletes a MediaPackage VOD PackagingConfiguration resource.

  request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest`

  returns: Result of the DeletePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest request]
    (-> this (.deletePackagingConfiguration request))))

(defn describe-asset
  "Returns a description of a MediaPackage VOD Asset resource.

  request - `com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest`

  returns: Result of the DescribeAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribeAssetResult`

  throws: com.amazonaws.services.mediapackagevod.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackagevod.model.DescribeAssetResult [^AWSMediaPackageVodClient this ^com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest request]
    (-> this (.describeAsset request))))

