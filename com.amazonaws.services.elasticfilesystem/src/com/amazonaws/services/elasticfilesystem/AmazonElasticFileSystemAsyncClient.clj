(ns com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystemAsyncClient
  "Client for accessing EFS asynchronously. Each asynchronous method will return a Java Future object representing the
  asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when an
  asynchronous operation completes.

  Amazon Elastic File System

  Amazon Elastic File System (Amazon EFS) provides simple, scalable file storage for use with Amazon EC2 instances in
  the AWS Cloud. With Amazon EFS, storage capacity is elastic, growing and shrinking automatically as you add and
  remove files, so your applications have the storage they need, when they need it. For more information, see the User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticfilesystem AmazonElasticFileSystemAsyncClient]))

(defn ->amazon-elastic-file-system-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonElasticFileSystemAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonElasticFileSystemAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonElasticFileSystemAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonElasticFileSystemAsyncClient aws-credentials executor-service))
  (^AmazonElasticFileSystemAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonElasticFileSystemAsyncClient client-configuration))
  (^AmazonElasticFileSystemAsyncClient []
    (new AmazonElasticFileSystemAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystemAsyncClientBuilder`"
  (^com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystemAsyncClientBuilder []
    (AmazonElasticFileSystemAsyncClient/asyncBuilder )))

(defn update-file-system-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.UpdateFileSystemRequest request]
    (-> this (.updateFileSystemAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonElasticFileSystemAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-tags-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn describe-lifecycle-configuration-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLifecycleConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLifecycleConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeLifecycleConfigurationRequest request]
    (-> this (.describeLifecycleConfigurationAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonElasticFileSystemAsyncClient this]
    (-> this (.shutdown))))

(defn delete-mount-target-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMountTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMountTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DeleteMountTargetRequest request]
    (-> this (.deleteMountTargetAsync request))))

(defn put-lifecycle-configuration-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLifecycleConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLifecycleConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.PutLifecycleConfigurationRequest request]
    (-> this (.putLifecycleConfigurationAsync request))))

(defn modify-mount-target-security-groups-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyMountTargetSecurityGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyMountTargetSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.ModifyMountTargetSecurityGroupsRequest request]
    (-> this (.modifyMountTargetSecurityGroupsAsync request))))

(defn create-file-system-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.CreateFileSystemResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.CreateFileSystemRequest request]
    (-> this (.createFileSystemAsync request))))

(defn describe-mount-targets-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMountTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMountTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetsRequest request]
    (-> this (.describeMountTargetsAsync request))))

(defn create-tags-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.CreateTagsRequest request]
    (-> this (.createTagsAsync request))))

(defn delete-file-system-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFileSystem operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFileSystemAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DeleteFileSystemRequest request]
    (-> this (.deleteFileSystemAsync request))))

(defn describe-file-systems-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFileSystems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFileSystemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeFileSystemsRequest request]
    (-> this (.describeFileSystemsAsync request)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this]
    (-> this (.describeFileSystemsAsync))))

(defn describe-tags-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn create-mount-target-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateMountTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.CreateMountTargetResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createMountTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.CreateMountTargetRequest request]
    (-> this (.createMountTargetAsync request))))

(defn describe-mount-target-security-groups-async
  "Description copied from interface: AmazonElasticFileSystemAsync

  request - `com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMountTargetSecurityGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMountTargetSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonElasticFileSystemAsyncClient this ^com.amazonaws.services.elasticfilesystem.model.DescribeMountTargetSecurityGroupsRequest request]
    (-> this (.describeMountTargetSecurityGroupsAsync request))))

