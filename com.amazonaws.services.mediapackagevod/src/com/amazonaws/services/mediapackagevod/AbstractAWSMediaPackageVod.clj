(ns com.amazonaws.services.mediapackagevod.AbstractAWSMediaPackageVod
  "Abstract implementation of AWSMediaPackageVod. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackagevod AbstractAWSMediaPackageVod]))

(defn list-packaging-configurations
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest`

  returns: Result of the ListPackagingConfigurations operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsResult`"
  (^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest request]
    (-> this (.listPackagingConfigurations request))))

(defn delete-asset
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest`

  returns: Result of the DeleteAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeleteAssetResult`"
  (^com.amazonaws.services.mediapackagevod.model.DeleteAssetResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest request]
    (-> this (.deleteAsset request))))

(defn list-packaging-groups
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest`

  returns: Result of the ListPackagingGroups operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsResult`"
  (^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest request]
    (-> this (.listPackagingGroups request))))

(defn delete-packaging-group
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest`

  returns: Result of the DeletePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupResult`"
  (^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest request]
    (-> this (.deletePackagingGroup request))))

(defn shutdown
  "Description copied from interface: AWSMediaPackageVod"
  ([^AbstractAWSMediaPackageVod this]
    (-> this (.shutdown))))

(defn describe-packaging-configuration
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest`

  returns: Result of the DescribePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationResult`"
  (^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest request]
    (-> this (.describePackagingConfiguration request))))

(defn list-assets
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.ListAssetsRequest`

  returns: Result of the ListAssets operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.ListAssetsResult`"
  (^com.amazonaws.services.mediapackagevod.model.ListAssetsResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.ListAssetsRequest request]
    (-> this (.listAssets request))))

(defn create-packaging-group
  "Description copied from interface: AWSMediaPackageVod

  request - A new MediaPackage VOD PackagingGroup resource configuration. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest`

  returns: Result of the CreatePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupResult`"
  (^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest request]
    (-> this (.createPackagingGroup request))))

(defn create-packaging-configuration
  "Description copied from interface: AWSMediaPackageVod

  request - A new MediaPackage VOD PackagingConfiguration resource configuration. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest`

  returns: Result of the CreatePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationResult`"
  (^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest request]
    (-> this (.createPackagingConfiguration request))))

(defn describe-packaging-group
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest`

  returns: Result of the DescribePackagingGroup operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupResult`"
  (^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest request]
    (-> this (.describePackagingGroup request))))

(defn create-asset
  "Description copied from interface: AWSMediaPackageVod

  request - A new MediaPackage VOD Asset configuration. - `com.amazonaws.services.mediapackagevod.model.CreateAssetRequest`

  returns: Result of the CreateAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.CreateAssetResult`"
  (^com.amazonaws.services.mediapackagevod.model.CreateAssetResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.CreateAssetRequest request]
    (-> this (.createAsset request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMediaPackageVod

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMediaPackageVod this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-packaging-configuration
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest`

  returns: Result of the DeletePackagingConfiguration operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationResult`"
  (^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest request]
    (-> this (.deletePackagingConfiguration request))))

(defn describe-asset
  "Description copied from interface: AWSMediaPackageVod

  request - `com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest`

  returns: Result of the DescribeAsset operation returned by the service. - `com.amazonaws.services.mediapackagevod.model.DescribeAssetResult`"
  (^com.amazonaws.services.mediapackagevod.model.DescribeAssetResult [^AbstractAWSMediaPackageVod this ^com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest request]
    (-> this (.describeAsset request))))

