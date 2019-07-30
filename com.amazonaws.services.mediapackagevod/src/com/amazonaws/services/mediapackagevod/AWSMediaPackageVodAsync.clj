(ns com.amazonaws.services.mediapackagevod.AWSMediaPackageVodAsync
  "Interface for accessing MediaPackage Vod asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaPackageVodAsync instead.


  AWS Elemental MediaPackage VOD"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackagevod AWSMediaPackageVodAsync]))

(defn create-packaging-configuration-async
  "Creates a new MediaPackage VOD PackagingConfiguration resource.

  create-packaging-configuration-request - A new MediaPackage VOD PackagingConfiguration resource configuration. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePackagingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest create-packaging-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPackagingConfigurationAsync create-packaging-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingConfigurationRequest create-packaging-configuration-request]
    (-> this (.createPackagingConfigurationAsync create-packaging-configuration-request))))

(defn describe-asset-async
  "Returns a description of a MediaPackage VOD Asset resource.

  describe-asset-request - `com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAsset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DescribeAssetResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest describe-asset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssetAsync describe-asset-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribeAssetRequest describe-asset-request]
    (-> this (.describeAssetAsync describe-asset-request))))

(defn delete-packaging-group-async
  "Deletes a MediaPackage VOD PackagingGroup resource.

  delete-packaging-group-request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePackagingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest delete-packaging-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePackagingGroupAsync delete-packaging-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingGroupRequest delete-packaging-group-request]
    (-> this (.deletePackagingGroupAsync delete-packaging-group-request))))

(defn list-packaging-configurations-async
  "Returns a collection of MediaPackage VOD PackagingConfiguration resources.

  list-packaging-configurations-request - `com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPackagingConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest list-packaging-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPackagingConfigurationsAsync list-packaging-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListPackagingConfigurationsRequest list-packaging-configurations-request]
    (-> this (.listPackagingConfigurationsAsync list-packaging-configurations-request))))

(defn delete-packaging-configuration-async
  "Deletes a MediaPackage VOD PackagingConfiguration resource.

  delete-packaging-configuration-request - `com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePackagingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest delete-packaging-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePackagingConfigurationAsync delete-packaging-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeletePackagingConfigurationRequest delete-packaging-configuration-request]
    (-> this (.deletePackagingConfigurationAsync delete-packaging-configuration-request))))

(defn create-asset-async
  "Creates a new MediaPackage VOD Asset resource.

  create-asset-request - A new MediaPackage VOD Asset configuration. - `com.amazonaws.services.mediapackagevod.model.CreateAssetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAsset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.CreateAssetResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreateAssetRequest create-asset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssetAsync create-asset-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreateAssetRequest create-asset-request]
    (-> this (.createAssetAsync create-asset-request))))

(defn list-assets-async
  "Returns a collection of MediaPackage VOD Asset resources.

  list-assets-request - `com.amazonaws.services.mediapackagevod.model.ListAssetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.ListAssetsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListAssetsRequest list-assets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssetsAsync list-assets-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListAssetsRequest list-assets-request]
    (-> this (.listAssetsAsync list-assets-request))))

(defn delete-asset-async
  "Deletes an existing MediaPackage VOD Asset resource.

  delete-asset-request - `com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAsset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DeleteAssetResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest delete-asset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssetAsync delete-asset-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DeleteAssetRequest delete-asset-request]
    (-> this (.deleteAssetAsync delete-asset-request))))

(defn describe-packaging-group-async
  "Returns a description of a MediaPackage VOD PackagingGroup resource.

  describe-packaging-group-request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePackagingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest describe-packaging-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePackagingGroupAsync describe-packaging-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingGroupRequest describe-packaging-group-request]
    (-> this (.describePackagingGroupAsync describe-packaging-group-request))))

(defn describe-packaging-configuration-async
  "Returns a description of a MediaPackage VOD PackagingConfiguration resource.

  describe-packaging-configuration-request - `com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePackagingConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest describe-packaging-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePackagingConfigurationAsync describe-packaging-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.DescribePackagingConfigurationRequest describe-packaging-configuration-request]
    (-> this (.describePackagingConfigurationAsync describe-packaging-configuration-request))))

(defn list-packaging-groups-async
  "Returns a collection of MediaPackage VOD PackagingGroup resources.

  list-packaging-groups-request - `com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPackagingGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest list-packaging-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPackagingGroupsAsync list-packaging-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.ListPackagingGroupsRequest list-packaging-groups-request]
    (-> this (.listPackagingGroupsAsync list-packaging-groups-request))))

(defn create-packaging-group-async
  "Creates a new MediaPackage VOD PackagingGroup resource.

  create-packaging-group-request - A new MediaPackage VOD PackagingGroup resource configuration. - `com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePackagingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest create-packaging-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPackagingGroupAsync create-packaging-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageVodAsync this ^com.amazonaws.services.mediapackagevod.model.CreatePackagingGroupRequest create-packaging-group-request]
    (-> this (.createPackagingGroupAsync create-packaging-group-request))))

