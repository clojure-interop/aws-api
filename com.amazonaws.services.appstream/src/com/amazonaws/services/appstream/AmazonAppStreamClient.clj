(ns com.amazonaws.services.appstream.AmazonAppStreamClient
  "Client for accessing Amazon AppStream. All service calls made using this client are blocking, and will not return
  until the service call completes.

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
  (:import [com.amazonaws.services.appstream AmazonAppStreamClient]))

(defn ->amazon-app-stream-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon AppStream (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonAppStreamClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonAppStreamClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonAppStreamClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonAppStreamClient aws-credentials client-configuration))
  (^AmazonAppStreamClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonAppStreamClient client-configuration))
  (^AmazonAppStreamClient []
    (new AmazonAppStreamClient )))

(defn *builder
  "returns: `com.amazonaws.services.appstream.AmazonAppStreamClientBuilder`"
  (^com.amazonaws.services.appstream.AmazonAppStreamClientBuilder []
    (AmazonAppStreamClient/builder )))

(defn batch-associate-user-stack
  "Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with
   fleets that are joined to an Active Directory domain.

  request - `com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest`

  returns: Result of the BatchAssociateUserStack operation returned by the service. - `com.amazonaws.services.appstream.model.BatchAssociateUserStackResult`

  throws: com.amazonaws.services.appstream.model.OperationNotPermittedException - The attempted operation is not permitted."
  (^com.amazonaws.services.appstream.model.BatchAssociateUserStackResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest request]
    (-> this (.batchAssociateUserStack request))))

(defn delete-image-permissions
  "Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to
   which you previously granted these permissions can no longer use the image.

  request - `com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest`

  returns: Result of the DeleteImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImagePermissionsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotAvailableException - The specified resource exists and is not in use, but isn't available."
  (^com.amazonaws.services.appstream.model.DeleteImagePermissionsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest request]
    (-> this (.deleteImagePermissions request))))

(defn list-tags-for-resource
  "Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders,
   images, fleets, and stacks.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  request - `com.amazonaws.services.appstream.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.appstream.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.ListTagsForResourceResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn create-streaming-url
  "Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL
   enables application streaming to be tested without user setup.

  request - `com.amazonaws.services.appstream.model.CreateStreamingURLRequest`

  returns: Result of the CreateStreamingURL operation returned by the service. - `com.amazonaws.services.appstream.model.CreateStreamingURLResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.CreateStreamingURLResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CreateStreamingURLRequest request]
    (-> this (.createStreamingURL request))))

(defn delete-usage-report-subscription
  "Disables usage report generation.

  request - `com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest`

  returns: Result of the DeleteUsageReportSubscription operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionResult`

  throws: com.amazonaws.services.appstream.model.InvalidAccountStatusException - The resource cannot be created because your AWS account is suspended. For assistance, contact AWS Support."
  (^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest request]
    (-> this (.deleteUsageReportSubscription request))))

(defn delete-fleet
  "Deletes the specified fleet.

  request - `com.amazonaws.services.appstream.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteFleetResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DeleteFleetResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DeleteFleetRequest request]
    (-> this (.deleteFleet request))))

(defn describe-stacks
  "Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all
   stacks in the account are described.

  request - `com.amazonaws.services.appstream.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeStacksResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeStacksResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeStacksRequest request]
    (-> this (.describeStacks request))))

(defn update-image-permissions
  "Adds or updates permissions for the specified private image.

  request - `com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest`

  returns: Result of the UpdateImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateImagePermissionsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.UpdateImagePermissionsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest request]
    (-> this (.updateImagePermissions request))))

(defn waiters
  "returns: `com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters`"
  (^com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters [^AmazonAppStreamClient this]
    (-> this (.waiters))))

(defn batch-disassociate-user-stack
  "Disassociates the specified users from the specified stacks.

  request - `com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest`

  returns: Result of the BatchDisassociateUserStack operation returned by the service. - `com.amazonaws.services.appstream.model.BatchDisassociateUserStackResult`"
  (^com.amazonaws.services.appstream.model.BatchDisassociateUserStackResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest request]
    (-> this (.batchDisassociateUserStack request))))

(defn update-stack
  "Updates the specified fields for the specified stack.

  request - `com.amazonaws.services.appstream.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateStackResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.UpdateStackResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.UpdateStackRequest request]
    (-> this (.updateStack request))))

(defn enable-user
  "Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications
   from the stacks to which they are assigned.

  request - `com.amazonaws.services.appstream.model.EnableUserRequest`

  returns: Result of the EnableUser operation returned by the service. - `com.amazonaws.services.appstream.model.EnableUserResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.EnableUserResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.EnableUserRequest request]
    (-> this (.enableUser request))))

(defn stop-fleet
  "Stops the specified fleet.

  request - `com.amazonaws.services.appstream.model.StopFleetRequest`

  returns: Result of the StopFleet operation returned by the service. - `com.amazonaws.services.appstream.model.StopFleetResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.StopFleetResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.StopFleetRequest request]
    (-> this (.stopFleet request))))

(defn create-image-builder
  "Creates an image builder. An image builder is a virtual machine that is used to create an image.


   The initial state of the builder is PENDING. When it is ready, the state is RUNNING.

  request - `com.amazonaws.services.appstream.model.CreateImageBuilderRequest`

  returns: Result of the CreateImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.CreateImageBuilderResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.CreateImageBuilderResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CreateImageBuilderRequest request]
    (-> this (.createImageBuilder request))))

(defn untag-resource
  "Disassociates one or more specified tags from the specified AppStream 2.0 resource.


   To list the current tags for your resources, use ListTagsForResource.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  request - `com.amazonaws.services.appstream.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.appstream.model.UntagResourceResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.UntagResourceResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-fleet
  "Creates a fleet. A fleet consists of streaming instances that run a specified image.

  request - `com.amazonaws.services.appstream.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.CreateFleetResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.CreateFleetResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn describe-usage-report-subscriptions
  "Retrieves a list that describes one or more usage report subscriptions.

  request - `com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest`

  returns: Result of the DescribeUsageReportSubscriptions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest request]
    (-> this (.describeUsageReportSubscriptions request))))

(defn disable-user
  "Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled.
   This action does not delete the user.

  request - `com.amazonaws.services.appstream.model.DisableUserRequest`

  returns: Result of the DisableUser operation returned by the service. - `com.amazonaws.services.appstream.model.DisableUserResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DisableUserResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DisableUserRequest request]
    (-> this (.disableUser request))))

(defn describe-image-builders
  "Retrieves a list that describes one or more specified image builders, if the image builder names are provided.
   Otherwise, all image builders in the account are described.

  request - `com.amazonaws.services.appstream.model.DescribeImageBuildersRequest`

  returns: Result of the DescribeImageBuilders operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImageBuildersResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeImageBuildersResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeImageBuildersRequest request]
    (-> this (.describeImageBuilders request))))

(defn create-user
  "Creates a new user in the user pool.

  request - `com.amazonaws.services.appstream.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.appstream.model.CreateUserResult`

  throws: com.amazonaws.services.appstream.model.ResourceAlreadyExistsException - The specified resource already exists."
  (^com.amazonaws.services.appstream.model.CreateUserResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-user
  "Deletes a user from the user pool.

  request - `com.amazonaws.services.appstream.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteUserResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DeleteUserResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn create-image-builder-streaming-url
  "Creates a URL to start an image builder streaming session.

  request - `com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest`

  returns: Result of the CreateImageBuilderStreamingURL operation returned by the service. - `com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult`

  throws: com.amazonaws.services.appstream.model.OperationNotPermittedException - The attempted operation is not permitted."
  (^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest request]
    (-> this (.createImageBuilderStreamingURL request))))

(defn list-associated-fleets
  "Retrieves the name of the fleet that is associated with the specified stack.

  request - `com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest`

  returns: Result of the ListAssociatedFleets operation returned by the service. - `com.amazonaws.services.appstream.model.ListAssociatedFleetsResult`"
  (^com.amazonaws.services.appstream.model.ListAssociatedFleetsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest request]
    (-> this (.listAssociatedFleets request))))

(defn describe-image-permissions
  "Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own.

  request - `com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest`

  returns: Result of the DescribeImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImagePermissionsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeImagePermissionsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest request]
    (-> this (.describeImagePermissions request))))

(defn disassociate-fleet
  "Disassociates the specified fleet from the specified stack.

  request - `com.amazonaws.services.appstream.model.DisassociateFleetRequest`

  returns: Result of the DisassociateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.DisassociateFleetResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DisassociateFleetResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DisassociateFleetRequest request]
    (-> this (.disassociateFleet request))))

(defn create-stack
  "Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access
   policies, and storage configurations.

  request - `com.amazonaws.services.appstream.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.appstream.model.CreateStackResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.CreateStackResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CreateStackRequest request]
    (-> this (.createStack request))))

(defn expire-session
  "Immediately stops the specified streaming session.

  request - `com.amazonaws.services.appstream.model.ExpireSessionRequest`

  returns: Result of the ExpireSession operation returned by the service. - `com.amazonaws.services.appstream.model.ExpireSessionResult`"
  (^com.amazonaws.services.appstream.model.ExpireSessionResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.ExpireSessionRequest request]
    (-> this (.expireSession request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonAppStreamClient this]
    (-> this (.shutdown))))

(defn delete-image
  "Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot
   provision new capacity using the image.

  request - `com.amazonaws.services.appstream.model.DeleteImageRequest`

  returns: Result of the DeleteImage operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImageResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DeleteImageResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DeleteImageRequest request]
    (-> this (.deleteImage request))))

(defn start-image-builder
  "Starts the specified image builder.

  request - `com.amazonaws.services.appstream.model.StartImageBuilderRequest`

  returns: Result of the StartImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.StartImageBuilderResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotAvailableException - The specified resource exists and is not in use, but isn't available."
  (^com.amazonaws.services.appstream.model.StartImageBuilderResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.StartImageBuilderRequest request]
    (-> this (.startImageBuilder request))))

(defn describe-fleets
  "Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all
   fleets in the account are described.

  request - `com.amazonaws.services.appstream.model.DescribeFleetsRequest`

  returns: Result of the DescribeFleets operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeFleetsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeFleetsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeFleetsRequest request]
    (-> this (.describeFleets request))))

(defn list-associated-stacks
  "Retrieves the name of the stack with which the specified fleet is associated.

  request - `com.amazonaws.services.appstream.model.ListAssociatedStacksRequest`

  returns: Result of the ListAssociatedStacks operation returned by the service. - `com.amazonaws.services.appstream.model.ListAssociatedStacksResult`"
  (^com.amazonaws.services.appstream.model.ListAssociatedStacksResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.ListAssociatedStacksRequest request]
    (-> this (.listAssociatedStacks request))))

(defn delete-stack
  "Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the
   stack is no longer available to users. Also, any reservations made for application streaming sessions for the
   stack are released.

  request - `com.amazonaws.services.appstream.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteStackResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DeleteStackResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DeleteStackRequest request]
    (-> this (.deleteStack request))))

(defn create-directory-config
  "Creates a Directory Config object in AppStream 2.0. This object includes the configuration information required
   to join fleets and image builders to Microsoft Active Directory domains.

  request - `com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest`

  returns: Result of the CreateDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.CreateDirectoryConfigResult`

  throws: com.amazonaws.services.appstream.model.ResourceAlreadyExistsException - The specified resource already exists."
  (^com.amazonaws.services.appstream.model.CreateDirectoryConfigResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest request]
    (-> this (.createDirectoryConfig request))))

(defn describe-sessions
  "Retrieves a list that describes the streaming sessions for a specified stack and fleet. If a UserId is provided
   for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not
   provided, the default is to authenticate users using a streaming URL.

  request - `com.amazonaws.services.appstream.model.DescribeSessionsRequest`

  returns: Result of the DescribeSessions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeSessionsResult`

  throws: com.amazonaws.services.appstream.model.InvalidParameterCombinationException - Indicates an incorrect combination of parameters, or a missing parameter."
  (^com.amazonaws.services.appstream.model.DescribeSessionsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeSessionsRequest request]
    (-> this (.describeSessions request))))

(defn update-directory-config
  "Updates the specified Directory Config object in AppStream 2.0. This object includes the configuration
   information required to join fleets and image builders to Microsoft Active Directory domains.

  request - `com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest`

  returns: Result of the UpdateDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest request]
    (-> this (.updateDirectoryConfig request))))

(defn describe-directory-configs
  "Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names
   for these objects are provided. Otherwise, all Directory Config objects in the account are described. These
   objects include the configuration information required to join fleets and image builders to Microsoft Active
   Directory domains.


   Although the response syntax in this topic includes the account password, this password is not returned in the
   actual response.

  request - `com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest`

  returns: Result of the DescribeDirectoryConfigs operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest request]
    (-> this (.describeDirectoryConfigs request))))

(defn associate-fleet
  "Associates the specified fleet with the specified stack.

  request - `com.amazonaws.services.appstream.model.AssociateFleetRequest`

  returns: Result of the AssociateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.AssociateFleetResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.AssociateFleetResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.AssociateFleetRequest request]
    (-> this (.associateFleet request))))

(defn create-usage-report-subscription
  "Creates a usage report subscription. Usage reports are generated daily.

  request - `com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest`

  returns: Result of the CreateUsageReportSubscription operation returned by the service. - `com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionResult`

  throws: com.amazonaws.services.appstream.model.InvalidRoleException - The specified role is invalid."
  (^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest request]
    (-> this (.createUsageReportSubscription request))))

(defn update-fleet
  "Updates the specified fleet.


   If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the
   fleet is in the RUNNING state, you can update the DisplayName,
   ComputeCapacity, ImageARN, ImageName, and
   DisconnectTimeoutInSeconds attributes. If the fleet is in the STARTING or
   STOPPING state, you can't update it.

  request - `com.amazonaws.services.appstream.model.UpdateFleetRequest`

  returns: Result of the UpdateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateFleetResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.UpdateFleetResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.UpdateFleetRequest request]
    (-> this (.updateFleet request))))

(defn copy-image
  "Copies the image within the same region or to a new region within the same AWS account. Note that any tags you
   added to the image will not be copied.

  request - `com.amazonaws.services.appstream.model.CopyImageRequest`

  returns: Result of the CopyImage operation returned by the service. - `com.amazonaws.services.appstream.model.CopyImageResult`

  throws: com.amazonaws.services.appstream.model.ResourceAlreadyExistsException - The specified resource already exists."
  (^com.amazonaws.services.appstream.model.CopyImageResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.CopyImageRequest request]
    (-> this (.copyImage request))))

(defn stop-image-builder
  "Stops the specified image builder.

  request - `com.amazonaws.services.appstream.model.StopImageBuilderRequest`

  returns: Result of the StopImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.StopImageBuilderResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.StopImageBuilderResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.StopImageBuilderRequest request]
    (-> this (.stopImageBuilder request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonAppStreamClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-fleet
  "Starts the specified fleet.

  request - `com.amazonaws.services.appstream.model.StartFleetRequest`

  returns: Result of the StartFleet operation returned by the service. - `com.amazonaws.services.appstream.model.StartFleetResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.StartFleetResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.StartFleetRequest request]
    (-> this (.startFleet request))))

(defn tag-resource
  "Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image
   builders, images, fleets, and stacks.


   Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this
   operation updates its value.


   To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your
   resources, use UntagResource.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  request - `com.amazonaws.services.appstream.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.appstream.model.TagResourceResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.TagResourceResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-images
  "Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided.
   Otherwise, all images in the account are described.

  request - `com.amazonaws.services.appstream.model.DescribeImagesRequest`

  returns: Result of the DescribeImages operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImagesResult`

  throws: com.amazonaws.services.appstream.model.InvalidParameterCombinationException - Indicates an incorrect combination of parameters, or a missing parameter."
  (^com.amazonaws.services.appstream.model.DescribeImagesResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeImagesRequest request]
    (-> this (.describeImages request))))

(defn describe-user-stack-associations
  "Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the
   following:




   The stack name




   The user name (email address of the user associated with the stack) and the authentication type for the user

  request - `com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest`

  returns: Result of the DescribeUserStackAssociations operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUserStackAssociationsResult`

  throws: com.amazonaws.services.appstream.model.InvalidParameterCombinationException - Indicates an incorrect combination of parameters, or a missing parameter."
  (^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest request]
    (-> this (.describeUserStackAssociations request))))

(defn delete-image-builder
  "Deletes the specified image builder and releases the capacity.

  request - `com.amazonaws.services.appstream.model.DeleteImageBuilderRequest`

  returns: Result of the DeleteImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImageBuilderResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DeleteImageBuilderResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DeleteImageBuilderRequest request]
    (-> this (.deleteImageBuilder request))))

(defn delete-directory-config
  "Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required
   to join streaming instances to an Active Directory domain.

  request - `com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest`

  returns: Result of the DeleteDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest request]
    (-> this (.deleteDirectoryConfig request))))

(defn describe-users
  "Retrieves a list that describes one or more specified users in the user pool.

  request - `com.amazonaws.services.appstream.model.DescribeUsersRequest`

  returns: Result of the DescribeUsers operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUsersResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeUsersResult [^AmazonAppStreamClient this ^com.amazonaws.services.appstream.model.DescribeUsersRequest request]
    (-> this (.describeUsers request))))

