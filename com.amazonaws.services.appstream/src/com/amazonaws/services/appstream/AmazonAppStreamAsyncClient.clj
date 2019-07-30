(ns com.amazonaws.services.appstream.AmazonAppStreamAsyncClient
  "Client for accessing Amazon AppStream asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon AppStream 2.0

  This is the Amazon AppStream 2.0 API Reference. This documentation provides descriptions and syntax for each
  of the actions and data types in AppStream 2.0. AppStream 2.0 is a fully managed, secure application streaming
  service that lets you stream desktop applications to users without rewriting applications. AppStream 2.0 manages the
  AWS resources that are required to host and run your applications, scales automatically, and provides access to your
  users on demand.


  To learn more about AppStream 2.0, see the following resources:




  Amazon AppStream 2.0 product page




  Amazon AppStream 2.0 documentation"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appstream AmazonAppStreamAsyncClient]))

(defn ->amazon-app-stream-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonAppStreamAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonAppStreamAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonAppStreamAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonAppStreamAsyncClient aws-credentials executor-service))
  (^AmazonAppStreamAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonAppStreamAsyncClient client-configuration))
  (^AmazonAppStreamAsyncClient []
    (new AmazonAppStreamAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.appstream.AmazonAppStreamAsyncClientBuilder`"
  (^com.amazonaws.services.appstream.AmazonAppStreamAsyncClientBuilder []
    (AmazonAppStreamAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn enable-user-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.EnableUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.EnableUserResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.EnableUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.EnableUserRequest request]
    (-> this (.enableUserAsync request))))

(defn create-directory-config-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectoryConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateDirectoryConfigResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectoryConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest request]
    (-> this (.createDirectoryConfigAsync request))))

(defn describe-image-builders-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeImageBuildersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImageBuilders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeImageBuildersResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeImageBuildersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImageBuildersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeImageBuildersRequest request]
    (-> this (.describeImageBuildersAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonAppStreamAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-image-builder-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DeleteImageBuilderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteImageBuilder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteImageBuilderResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteImageBuilderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteImageBuilderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteImageBuilderRequest request]
    (-> this (.deleteImageBuilderAsync request))))

(defn delete-usage-report-subscription-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUsageReportSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUsageReportSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest request]
    (-> this (.deleteUsageReportSubscriptionAsync request))))

(defn describe-image-permissions-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImagePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeImagePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImagePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest request]
    (-> this (.describeImagePermissionsAsync request))))

(defn describe-fleets-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeFleetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeFleetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeFleetsRequest request]
    (-> this (.describeFleetsAsync request))))

(defn delete-user-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn describe-images-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeImagesResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeImagesRequest request]
    (-> this (.describeImagesAsync request))))

(defn update-directory-config-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDirectoryConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDirectoryConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest request]
    (-> this (.updateDirectoryConfigAsync request))))

(defn create-image-builder-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CreateImageBuilderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateImageBuilder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateImageBuilderResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateImageBuilderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createImageBuilderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateImageBuilderRequest request]
    (-> this (.createImageBuilderAsync request))))

(defn delete-stack-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DeleteStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteStackRequest request]
    (-> this (.deleteStackAsync request))))

(defn create-streaming-url-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CreateStreamingURLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStreamingURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateStreamingURLResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateStreamingURLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamingURLAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateStreamingURLRequest request]
    (-> this (.createStreamingURLAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonAppStreamAsyncClient this]
    (-> this (.shutdown))))

(defn update-image-permissions-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateImagePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UpdateImagePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateImagePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest request]
    (-> this (.updateImagePermissionsAsync request))))

(defn create-user-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CreateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateUserRequest request]
    (-> this (.createUserAsync request))))

(defn delete-image-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DeleteImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteImageResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteImageRequest request]
    (-> this (.deleteImageAsync request))))

(defn create-fleet-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CreateFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateFleetRequest request]
    (-> this (.createFleetAsync request))))

(defn describe-directory-configs-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectoryConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectoryConfigsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest request]
    (-> this (.describeDirectoryConfigsAsync request))))

(defn copy-image-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CopyImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CopyImageResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CopyImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CopyImageRequest request]
    (-> this (.copyImageAsync request))))

(defn expire-session-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.ExpireSessionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExpireSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.ExpireSessionResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.ExpireSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.expireSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.ExpireSessionRequest request]
    (-> this (.expireSessionAsync request))))

(defn describe-stacks-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeStacksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeStacksResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeStacksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStacksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeStacksRequest request]
    (-> this (.describeStacksAsync request))))

(defn associate-fleet-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.AssociateFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.AssociateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.AssociateFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.AssociateFleetRequest request]
    (-> this (.associateFleetAsync request))))

(defn create-usage-report-subscription-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUsageReportSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUsageReportSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest request]
    (-> this (.createUsageReportSubscriptionAsync request))))

(defn batch-disassociate-user-stack-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDisassociateUserStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.BatchDisassociateUserStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDisassociateUserStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest request]
    (-> this (.batchDisassociateUserStackAsync request))))

(defn disassociate-fleet-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DisassociateFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DisassociateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DisassociateFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DisassociateFleetRequest request]
    (-> this (.disassociateFleetAsync request))))

(defn delete-fleet-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DeleteFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteFleetRequest request]
    (-> this (.deleteFleetAsync request))))

(defn start-image-builder-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.StartImageBuilderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartImageBuilder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.StartImageBuilderResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.StartImageBuilderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startImageBuilderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.StartImageBuilderRequest request]
    (-> this (.startImageBuilderAsync request))))

(defn create-image-builder-streaming-url-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateImageBuilderStreamingURL operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createImageBuilderStreamingURLAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest request]
    (-> this (.createImageBuilderStreamingURLAsync request))))

(defn describe-sessions-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeSessionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeSessionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeSessionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSessionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeSessionsRequest request]
    (-> this (.describeSessionsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn start-fleet-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.StartFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.StartFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.StartFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.StartFleetRequest request]
    (-> this (.startFleetAsync request))))

(defn update-fleet-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.UpdateFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UpdateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UpdateFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UpdateFleetRequest request]
    (-> this (.updateFleetAsync request))))

(defn list-associated-stacks-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.ListAssociatedStacksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociatedStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.ListAssociatedStacksResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.ListAssociatedStacksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociatedStacksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.ListAssociatedStacksRequest request]
    (-> this (.listAssociatedStacksAsync request))))

(defn describe-user-stack-associations-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserStackAssociations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeUserStackAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserStackAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest request]
    (-> this (.describeUserStackAssociationsAsync request))))

(defn stop-image-builder-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.StopImageBuilderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopImageBuilder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.StopImageBuilderResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.StopImageBuilderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopImageBuilderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.StopImageBuilderRequest request]
    (-> this (.stopImageBuilderAsync request))))

(defn list-associated-fleets-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociatedFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.ListAssociatedFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociatedFleetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest request]
    (-> this (.listAssociatedFleetsAsync request))))

(defn update-stack-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.UpdateStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UpdateStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UpdateStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.UpdateStackRequest request]
    (-> this (.updateStackAsync request))))

(defn create-stack-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.CreateStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.CreateStackRequest request]
    (-> this (.createStackAsync request))))

(defn delete-directory-config-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectoryConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectoryConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest request]
    (-> this (.deleteDirectoryConfigAsync request))))

(defn stop-fleet-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.StopFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.StopFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.StopFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.StopFleetRequest request]
    (-> this (.stopFleetAsync request))))

(defn describe-usage-report-subscriptions-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUsageReportSubscriptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUsageReportSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest request]
    (-> this (.describeUsageReportSubscriptionsAsync request))))

(defn batch-associate-user-stack-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchAssociateUserStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.BatchAssociateUserStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchAssociateUserStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest request]
    (-> this (.batchAssociateUserStackAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-image-permissions-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteImagePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteImagePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteImagePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest request]
    (-> this (.deleteImagePermissionsAsync request))))

(defn describe-users-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DescribeUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeUsersResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DescribeUsersRequest request]
    (-> this (.describeUsersAsync request))))

(defn disable-user-async
  "Description copied from interface: AmazonAppStreamAsync

  request - `com.amazonaws.services.appstream.model.DisableUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DisableUserResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DisableUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsyncClient this ^com.amazonaws.services.appstream.model.DisableUserRequest request]
    (-> this (.disableUserAsync request))))

