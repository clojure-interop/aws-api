(ns com.amazonaws.services.elasticfilesystem.AbstractAmazonElasticFileSystemAsync
  "Abstract implementation of AmazonElasticFileSystemAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticfilesystem AbstractAmazonElasticFileSystemAsync]))

(defn update-file-system-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest request]
    (-> this (.updateFileSystemAsync request))))

(defn delete-tags-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn describe-lifecycle-configuration-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLifecycleConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLifecycleConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest request]
    (-> this (.describeLifecycleConfigurationAsync request))))

(defn delete-mount-target-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMountTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMountTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest request]
    (-> this (.deleteMountTargetAsync request))))

(defn put-lifecycle-configuration-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecycleConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecycleConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest request]
    (-> this (.putLifecycleConfigurationAsync request))))

(defn modify-mount-target-security-groups-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyMountTargetSecurityGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyMountTargetSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest request]
    (-> this (.modifyMountTargetSecurityGroupsAsync request))))

(defn create-file-system-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest request]
    (-> this (.createFileSystemAsync request))))

(defn describe-mount-targets-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMountTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMountTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest request]
    (-> this (.describeMountTargetsAsync request))))

(defn create-tags-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest request]
    (-> this (.createTagsAsync request))))

(defn delete-file-system-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest request]
    (-> this (.deleteFileSystemAsync request))))

(defn describe-file-systems-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFileSystems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFileSystemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest request]
    (-> this (.describeFileSystemsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this]
    (-> this (.describeFileSystemsAsync))))

(defn describe-tags-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn create-mount-target-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMountTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMountTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest request]
    (-> this (.createMountTargetAsync request))))

(defn describe-mount-target-security-groups-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMountTargetSecurityGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMountTargetSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonElasticFileSystemAsync this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest request]
    (-> this (.describeMountTargetSecurityGroupsAsync request))))

