(ns com.amazonaws.services.mediapackagevod.AbstractAWSMediaPackageVodAsync
  "Abstract implementation of AWSMediaPackageVodAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackagevod AbstractAWSMediaPackageVodAsync]))

(defn create-packaging-configuration-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - A new MediaPackage VOD PackagingConfiguration resource configuration. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePackagingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPackagingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest request]
    (-> this (.createPackagingConfigurationAsync request))))

(defn describe-asset-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAsset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DescribeAssetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest request]
    (-> this (.describeAssetAsync request))))

(defn delete-packaging-group-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePackagingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePackagingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest request]
    (-> this (.deletePackagingGroupAsync request))))

(defn list-packaging-configurations-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPackagingConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPackagingConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest request]
    (-> this (.listPackagingConfigurationsAsync request))))

(defn delete-packaging-configuration-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePackagingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePackagingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest request]
    (-> this (.deletePackagingConfigurationAsync request))))

(defn create-asset-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - A new MediaPackage VOD Asset configuration. - `com.amazonaws.services.mediapackagevod.model.CreateAssetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAsset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.CreateAssetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreateAssetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreateAssetRequest request]
    (-> this (.createAssetAsync request))))

(defn list-assets-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.ListAssetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.ListAssetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListAssetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListAssetsRequest request]
    (-> this (.listAssetsAsync request))))

(defn delete-asset-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAsset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DeleteAssetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest request]
    (-> this (.deleteAssetAsync request))))

(defn describe-packaging-group-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePackagingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePackagingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest request]
    (-> this (.describePackagingGroupAsync request))))

(defn describe-packaging-configuration-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePackagingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePackagingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest request]
    (-> this (.describePackagingConfigurationAsync request))))

(defn list-packaging-groups-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - `com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPackagingGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPackagingGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest request]
    (-> this (.listPackagingGroupsAsync request))))

(defn create-packaging-group-async
  "Description copied from interface: AWSMediaPackageVodAsync

  request - A new MediaPackage VOD PackagingGroup resource configuration. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePackagingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPackagingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest request]
    (-> this (.createPackagingGroupAsync request))))

