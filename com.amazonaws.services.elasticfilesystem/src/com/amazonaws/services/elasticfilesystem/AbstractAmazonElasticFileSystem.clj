(ns com.amazonaws.services.elasticfilesystem.AbstractAmazonElasticFileSystem
  "Abstract implementation of AmazonElasticFileSystem. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticfilesystem AbstractAmazonElasticFileSystem]))

(defn delete-tags
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult`"
  (^com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn describe-tags
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult`"
  (^com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn set-region
  "Description copied from interface: AmazonElasticFileSystem

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonElasticFileSystem this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-mount-targets
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest`

  returns: Result of the DescribeMountTargets operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult`"
  (^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest request]
    (-> this (.describeMountTargets request))))

(defn delete-mount-target
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest`

  returns: Result of the DeleteMountTarget operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult`"
  (^com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest request]
    (-> this (.deleteMountTarget request))))

(defn describe-lifecycle-configuration
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest`

  returns: Result of the DescribeLifecycleConfiguration operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationResult`"
  (^com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest request]
    (-> this (.describeLifecycleConfiguration request))))

(defn create-tags
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.CreateTagsResult`"
  (^com.amazonaws.services.elasticfilesystem.model.CreateTagsResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn shutdown
  "Description copied from interface: AmazonElasticFileSystem"
  ([^AbstractAmazonElasticFileSystem this]
    (-> this (.shutdown))))

(defn delete-file-system
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest`

  returns: Result of the DeleteFileSystem operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult`"
  (^com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest request]
    (-> this (.deleteFileSystem request))))

(defn set-endpoint
  "Description copied from interface: AmazonElasticFileSystem

  endpoint - The endpoint (ex: \"elasticfilesystem.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://elasticfilesystem.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonElasticFileSystem this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn put-lifecycle-configuration
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest`

  returns: Result of the PutLifecycleConfiguration operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationResult`"
  (^com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest request]
    (-> this (.putLifecycleConfiguration request))))

(defn modify-mount-target-security-groups
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest`

  returns: Result of the ModifyMountTargetSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult`"
  (^com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest request]
    (-> this (.modifyMountTargetSecurityGroups request))))

(defn describe-mount-target-security-groups
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest`

  returns: Result of the DescribeMountTargetSecurityGroups operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult`"
  (^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest request]
    (-> this (.describeMountTargetSecurityGroups request))))

(defn create-file-system
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest`

  returns: Result of the CreateFileSystem operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult`"
  (^com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest request]
    (-> this (.createFileSystem request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonElasticFileSystem

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonElasticFileSystem this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-file-systems
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest`

  returns: Result of the DescribeFileSystems operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult`"
  (^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest request]
    (-> this (.describeFileSystems request)))
  (^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult [^AbstractAmazonElasticFileSystem this]
    (-> this (.describeFileSystems))))

(defn create-mount-target
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest`

  returns: Result of the CreateMountTarget operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult`"
  (^com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest request]
    (-> this (.createMountTarget request))))

(defn update-file-system
  "Description copied from interface: AmazonElasticFileSystem

  request - `com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest`

  returns: Result of the UpdateFileSystem operation returned by the service. - `com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemResult`"
  (^com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemResult [^AbstractAmazonElasticFileSystem this ^com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest request]
    (-> this (.updateFileSystem request))))

