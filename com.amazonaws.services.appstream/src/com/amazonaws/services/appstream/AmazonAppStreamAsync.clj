(ns com.amazonaws.services.appstream.AmazonAppStreamAsync
  "Interface for accessing Amazon AppStream asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonAppStreamAsync instead.


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
  (:import [com.amazonaws.services.appstream AmazonAppStreamAsync]))

(defn untag-resource-async
  "Disassociates one or more specified tags from the specified AppStream 2.0 resource.


   To list the current tags for your resources, use ListTagsForResource.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  untag-resource-request - `com.amazonaws.services.appstream.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn enable-user-async
  "Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications
   from the stacks to which they are assigned.

  enable-user-request - `com.amazonaws.services.appstream.model.EnableUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.EnableUserResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.EnableUserRequest enable-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableUserAsync enable-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.EnableUserRequest enable-user-request]
    (-> this (.enableUserAsync enable-user-request))))

(defn create-directory-config-async
  "Creates a Directory Config object in AppStream 2.0. This object includes the configuration information required
   to join fleets and image builders to Microsoft Active Directory domains.

  create-directory-config-request - `com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDirectoryConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateDirectoryConfigResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest create-directory-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDirectoryConfigAsync create-directory-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest create-directory-config-request]
    (-> this (.createDirectoryConfigAsync create-directory-config-request))))

(defn describe-image-builders-async
  "Retrieves a list that describes one or more specified image builders, if the image builder names are provided.
   Otherwise, all image builders in the account are described.

  describe-image-builders-request - `com.amazonaws.services.appstream.model.DescribeImageBuildersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImageBuilders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeImageBuildersResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeImageBuildersRequest describe-image-builders-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImageBuildersAsync describe-image-builders-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeImageBuildersRequest describe-image-builders-request]
    (-> this (.describeImageBuildersAsync describe-image-builders-request))))

(defn delete-image-builder-async
  "Deletes the specified image builder and releases the capacity.

  delete-image-builder-request - `com.amazonaws.services.appstream.model.DeleteImageBuilderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteImageBuilder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteImageBuilderResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteImageBuilderRequest delete-image-builder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteImageBuilderAsync delete-image-builder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteImageBuilderRequest delete-image-builder-request]
    (-> this (.deleteImageBuilderAsync delete-image-builder-request))))

(defn delete-usage-report-subscription-async
  "Disables usage report generation.

  delete-usage-report-subscription-request - `com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUsageReportSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest delete-usage-report-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUsageReportSubscriptionAsync delete-usage-report-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest delete-usage-report-subscription-request]
    (-> this (.deleteUsageReportSubscriptionAsync delete-usage-report-subscription-request))))

(defn describe-image-permissions-async
  "Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own.

  describe-image-permissions-request - `com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImagePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeImagePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest describe-image-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImagePermissionsAsync describe-image-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest describe-image-permissions-request]
    (-> this (.describeImagePermissionsAsync describe-image-permissions-request))))

(defn describe-fleets-async
  "Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all
   fleets in the account are described.

  describe-fleets-request - `com.amazonaws.services.appstream.model.DescribeFleetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeFleetsRequest describe-fleets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetsAsync describe-fleets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeFleetsRequest describe-fleets-request]
    (-> this (.describeFleetsAsync describe-fleets-request))))

(defn delete-user-async
  "Deletes a user from the user pool.

  delete-user-request - `com.amazonaws.services.appstream.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn describe-images-async
  "Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided.
   Otherwise, all images in the account are described.

  describe-images-request - `com.amazonaws.services.appstream.model.DescribeImagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeImagesResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeImagesRequest describe-images-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImagesAsync describe-images-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeImagesRequest describe-images-request]
    (-> this (.describeImagesAsync describe-images-request))))

(defn update-directory-config-async
  "Updates the specified Directory Config object in AppStream 2.0. This object includes the configuration
   information required to join fleets and image builders to Microsoft Active Directory domains.

  update-directory-config-request - `com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDirectoryConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest update-directory-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDirectoryConfigAsync update-directory-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest update-directory-config-request]
    (-> this (.updateDirectoryConfigAsync update-directory-config-request))))

(defn create-image-builder-async
  "Creates an image builder. An image builder is a virtual machine that is used to create an image.


   The initial state of the builder is PENDING. When it is ready, the state is RUNNING.

  create-image-builder-request - `com.amazonaws.services.appstream.model.CreateImageBuilderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateImageBuilder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateImageBuilderResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateImageBuilderRequest create-image-builder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createImageBuilderAsync create-image-builder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateImageBuilderRequest create-image-builder-request]
    (-> this (.createImageBuilderAsync create-image-builder-request))))

(defn delete-stack-async
  "Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the
   stack is no longer available to users. Also, any reservations made for application streaming sessions for the
   stack are released.

  delete-stack-request - `com.amazonaws.services.appstream.model.DeleteStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteStackRequest delete-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStackAsync delete-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteStackRequest delete-stack-request]
    (-> this (.deleteStackAsync delete-stack-request))))

(defn create-streaming-url-async
  "Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL
   enables application streaming to be tested without user setup.

  create-streaming-url-request - `com.amazonaws.services.appstream.model.CreateStreamingURLRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStreamingURL operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateStreamingURLResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateStreamingURLRequest create-streaming-url-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamingURLAsync create-streaming-url-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateStreamingURLRequest create-streaming-url-request]
    (-> this (.createStreamingURLAsync create-streaming-url-request))))

(defn update-image-permissions-async
  "Adds or updates permissions for the specified private image.

  update-image-permissions-request - `com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateImagePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UpdateImagePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest update-image-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateImagePermissionsAsync update-image-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest update-image-permissions-request]
    (-> this (.updateImagePermissionsAsync update-image-permissions-request))))

(defn create-user-async
  "Creates a new user in the user pool.

  create-user-request - `com.amazonaws.services.appstream.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateUserRequest create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync create-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateUserRequest create-user-request]
    (-> this (.createUserAsync create-user-request))))

(defn delete-image-async
  "Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot
   provision new capacity using the image.

  delete-image-request - `com.amazonaws.services.appstream.model.DeleteImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteImageResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteImageRequest delete-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteImageAsync delete-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteImageRequest delete-image-request]
    (-> this (.deleteImageAsync delete-image-request))))

(defn create-fleet-async
  "Creates a fleet. A fleet consists of streaming instances that run a specified image.

  create-fleet-request - `com.amazonaws.services.appstream.model.CreateFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateFleetRequest create-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync create-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateFleetRequest create-fleet-request]
    (-> this (.createFleetAsync create-fleet-request))))

(defn describe-directory-configs-async
  "Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names
   for these objects are provided. Otherwise, all Directory Config objects in the account are described. These
   objects include the configuration information required to join fleets and image builders to Microsoft Active
   Directory domains.


   Although the response syntax in this topic includes the account password, this password is not returned in the
   actual response.

  describe-directory-configs-request - `com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDirectoryConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest describe-directory-configs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDirectoryConfigsAsync describe-directory-configs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest describe-directory-configs-request]
    (-> this (.describeDirectoryConfigsAsync describe-directory-configs-request))))

(defn copy-image-async
  "Copies the image within the same region or to a new region within the same AWS account. Note that any tags you
   added to the image will not be copied.

  copy-image-request - `com.amazonaws.services.appstream.model.CopyImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CopyImageResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CopyImageRequest copy-image-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyImageAsync copy-image-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CopyImageRequest copy-image-request]
    (-> this (.copyImageAsync copy-image-request))))

(defn expire-session-async
  "Immediately stops the specified streaming session.

  expire-session-request - `com.amazonaws.services.appstream.model.ExpireSessionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExpireSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.ExpireSessionResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.ExpireSessionRequest expire-session-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.expireSessionAsync expire-session-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.ExpireSessionRequest expire-session-request]
    (-> this (.expireSessionAsync expire-session-request))))

(defn describe-stacks-async
  "Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all
   stacks in the account are described.

  describe-stacks-request - `com.amazonaws.services.appstream.model.DescribeStacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeStacksResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeStacksRequest describe-stacks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStacksAsync describe-stacks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeStacksRequest describe-stacks-request]
    (-> this (.describeStacksAsync describe-stacks-request))))

(defn associate-fleet-async
  "Associates the specified fleet with the specified stack.

  associate-fleet-request - `com.amazonaws.services.appstream.model.AssociateFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.AssociateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.AssociateFleetRequest associate-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateFleetAsync associate-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.AssociateFleetRequest associate-fleet-request]
    (-> this (.associateFleetAsync associate-fleet-request))))

(defn create-usage-report-subscription-async
  "Creates a usage report subscription. Usage reports are generated daily.

  create-usage-report-subscription-request - `com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUsageReportSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest create-usage-report-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUsageReportSubscriptionAsync create-usage-report-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest create-usage-report-subscription-request]
    (-> this (.createUsageReportSubscriptionAsync create-usage-report-subscription-request))))

(defn batch-disassociate-user-stack-async
  "Disassociates the specified users from the specified stacks.

  batch-disassociate-user-stack-request - `com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDisassociateUserStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.BatchDisassociateUserStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest batch-disassociate-user-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDisassociateUserStackAsync batch-disassociate-user-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest batch-disassociate-user-stack-request]
    (-> this (.batchDisassociateUserStackAsync batch-disassociate-user-stack-request))))

(defn disassociate-fleet-async
  "Disassociates the specified fleet from the specified stack.

  disassociate-fleet-request - `com.amazonaws.services.appstream.model.DisassociateFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DisassociateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DisassociateFleetRequest disassociate-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateFleetAsync disassociate-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DisassociateFleetRequest disassociate-fleet-request]
    (-> this (.disassociateFleetAsync disassociate-fleet-request))))

(defn delete-fleet-async
  "Deletes the specified fleet.

  delete-fleet-request - `com.amazonaws.services.appstream.model.DeleteFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteFleetRequest delete-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetAsync delete-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteFleetRequest delete-fleet-request]
    (-> this (.deleteFleetAsync delete-fleet-request))))

(defn start-image-builder-async
  "Starts the specified image builder.

  start-image-builder-request - `com.amazonaws.services.appstream.model.StartImageBuilderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartImageBuilder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.StartImageBuilderResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.StartImageBuilderRequest start-image-builder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startImageBuilderAsync start-image-builder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.StartImageBuilderRequest start-image-builder-request]
    (-> this (.startImageBuilderAsync start-image-builder-request))))

(defn create-image-builder-streaming-url-async
  "Creates a URL to start an image builder streaming session.

  create-image-builder-streaming-url-request - `com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateImageBuilderStreamingURL operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest create-image-builder-streaming-url-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createImageBuilderStreamingURLAsync create-image-builder-streaming-url-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest create-image-builder-streaming-url-request]
    (-> this (.createImageBuilderStreamingURLAsync create-image-builder-streaming-url-request))))

(defn describe-sessions-async
  "Retrieves a list that describes the streaming sessions for a specified stack and fleet. If a UserId is provided
   for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not
   provided, the default is to authenticate users using a streaming URL.

  describe-sessions-request - `com.amazonaws.services.appstream.model.DescribeSessionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSessions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeSessionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeSessionsRequest describe-sessions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSessionsAsync describe-sessions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeSessionsRequest describe-sessions-request]
    (-> this (.describeSessionsAsync describe-sessions-request))))

(defn list-tags-for-resource-async
  "Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders,
   images, fleets, and stacks.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  list-tags-for-resource-request - `com.amazonaws.services.appstream.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn start-fleet-async
  "Starts the specified fleet.

  start-fleet-request - `com.amazonaws.services.appstream.model.StartFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.StartFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.StartFleetRequest start-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFleetAsync start-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.StartFleetRequest start-fleet-request]
    (-> this (.startFleetAsync start-fleet-request))))

(defn update-fleet-async
  "Updates the specified fleet.


   If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the
   fleet is in the RUNNING state, you can update the DisplayName,
   ComputeCapacity, ImageARN, ImageName, and
   DisconnectTimeoutInSeconds attributes. If the fleet is in the STARTING or
   STOPPING state, you can't update it.

  update-fleet-request - `com.amazonaws.services.appstream.model.UpdateFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UpdateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UpdateFleetRequest update-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFleetAsync update-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UpdateFleetRequest update-fleet-request]
    (-> this (.updateFleetAsync update-fleet-request))))

(defn list-associated-stacks-async
  "Retrieves the name of the stack with which the specified fleet is associated.

  list-associated-stacks-request - `com.amazonaws.services.appstream.model.ListAssociatedStacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociatedStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.ListAssociatedStacksResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.ListAssociatedStacksRequest list-associated-stacks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociatedStacksAsync list-associated-stacks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.ListAssociatedStacksRequest list-associated-stacks-request]
    (-> this (.listAssociatedStacksAsync list-associated-stacks-request))))

(defn describe-user-stack-associations-async
  "Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the
   following:




   The stack name




   The user name (email address of the user associated with the stack) and the authentication type for the user

  describe-user-stack-associations-request - `com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserStackAssociations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeUserStackAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest describe-user-stack-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserStackAssociationsAsync describe-user-stack-associations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest describe-user-stack-associations-request]
    (-> this (.describeUserStackAssociationsAsync describe-user-stack-associations-request))))

(defn stop-image-builder-async
  "Stops the specified image builder.

  stop-image-builder-request - `com.amazonaws.services.appstream.model.StopImageBuilderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopImageBuilder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.StopImageBuilderResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.StopImageBuilderRequest stop-image-builder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopImageBuilderAsync stop-image-builder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.StopImageBuilderRequest stop-image-builder-request]
    (-> this (.stopImageBuilderAsync stop-image-builder-request))))

(defn list-associated-fleets-async
  "Retrieves the name of the fleet that is associated with the specified stack.

  list-associated-fleets-request - `com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociatedFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.ListAssociatedFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest list-associated-fleets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociatedFleetsAsync list-associated-fleets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest list-associated-fleets-request]
    (-> this (.listAssociatedFleetsAsync list-associated-fleets-request))))

(defn update-stack-async
  "Updates the specified fields for the specified stack.

  update-stack-request - `com.amazonaws.services.appstream.model.UpdateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.UpdateStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UpdateStackRequest update-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStackAsync update-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.UpdateStackRequest update-stack-request]
    (-> this (.updateStackAsync update-stack-request))))

(defn create-stack-async
  "Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access
   policies, and storage configurations.

  create-stack-request - `com.amazonaws.services.appstream.model.CreateStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.CreateStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateStackRequest create-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStackAsync create-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.CreateStackRequest create-stack-request]
    (-> this (.createStackAsync create-stack-request))))

(defn delete-directory-config-async
  "Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required
   to join streaming instances to an Active Directory domain.

  delete-directory-config-request - `com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDirectoryConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest delete-directory-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDirectoryConfigAsync delete-directory-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest delete-directory-config-request]
    (-> this (.deleteDirectoryConfigAsync delete-directory-config-request))))

(defn stop-fleet-async
  "Stops the specified fleet.

  stop-fleet-request - `com.amazonaws.services.appstream.model.StopFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.StopFleetResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.StopFleetRequest stop-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopFleetAsync stop-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.StopFleetRequest stop-fleet-request]
    (-> this (.stopFleetAsync stop-fleet-request))))

(defn describe-usage-report-subscriptions-async
  "Retrieves a list that describes one or more usage report subscriptions.

  describe-usage-report-subscriptions-request - `com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUsageReportSubscriptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest describe-usage-report-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUsageReportSubscriptionsAsync describe-usage-report-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest describe-usage-report-subscriptions-request]
    (-> this (.describeUsageReportSubscriptionsAsync describe-usage-report-subscriptions-request))))

(defn batch-associate-user-stack-async
  "Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with
   fleets that are joined to an Active Directory domain.

  batch-associate-user-stack-request - `com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchAssociateUserStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.BatchAssociateUserStackResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest batch-associate-user-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchAssociateUserStackAsync batch-associate-user-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest batch-associate-user-stack-request]
    (-> this (.batchAssociateUserStackAsync batch-associate-user-stack-request))))

(defn tag-resource-async
  "Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image
   builders, images, fleets, and stacks.


   Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this
   operation updates its value.


   To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your
   resources, use UntagResource.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  tag-resource-request - `com.amazonaws.services.appstream.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn delete-image-permissions-async
  "Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to
   which you previously granted these permissions can no longer use the image.

  delete-image-permissions-request - `com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteImagePermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DeleteImagePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest delete-image-permissions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteImagePermissionsAsync delete-image-permissions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest delete-image-permissions-request]
    (-> this (.deleteImagePermissionsAsync delete-image-permissions-request))))

(defn describe-users-async
  "Retrieves a list that describes one or more specified users in the user pool.

  describe-users-request - `com.amazonaws.services.appstream.model.DescribeUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DescribeUsersResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeUsersRequest describe-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUsersAsync describe-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DescribeUsersRequest describe-users-request]
    (-> this (.describeUsersAsync describe-users-request))))

(defn disable-user-async
  "Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled.
   This action does not delete the user.

  disable-user-request - `com.amazonaws.services.appstream.model.DisableUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.appstream.model.DisableUserResult>`"
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DisableUserRequest disable-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableUserAsync disable-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonAppStreamAsync this ^com.amazonaws.services.appstream.model.DisableUserRequest disable-user-request]
    (-> this (.disableUserAsync disable-user-request))))

