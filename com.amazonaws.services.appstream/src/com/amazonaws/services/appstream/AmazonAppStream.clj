(ns com.amazonaws.services.appstream.AmazonAppStream
  "Interface for accessing Amazon AppStream.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonAppStream instead.


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
  (:import [com.amazonaws.services.appstream AmazonAppStream]))

(defn batch-associate-user-stack
  "Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with
   fleets that are joined to an Active Directory domain.

  batch-associate-user-stack-request - `com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest`

  returns: Result of the BatchAssociateUserStack operation returned by the service. - `com.amazonaws.services.appstream.model.BatchAssociateUserStackResult`

  throws: com.amazonaws.services.appstream.model.OperationNotPermittedException - The attempted operation is not permitted."
  (^com.amazonaws.services.appstream.model.BatchAssociateUserStackResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest batch-associate-user-stack-request]
    (-> this (.batchAssociateUserStack batch-associate-user-stack-request))))

(defn delete-image-permissions
  "Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to
   which you previously granted these permissions can no longer use the image.

  delete-image-permissions-request - `com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest`

  returns: Result of the DeleteImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImagePermissionsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotAvailableException - The specified resource exists and is not in use, but isn't available."
  (^com.amazonaws.services.appstream.model.DeleteImagePermissionsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest delete-image-permissions-request]
    (-> this (.deleteImagePermissions delete-image-permissions-request))))

(defn list-tags-for-resource
  "Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders,
   images, fleets, and stacks.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  list-tags-for-resource-request - `com.amazonaws.services.appstream.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.appstream.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.ListTagsForResourceResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn create-streaming-url
  "Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL
   enables application streaming to be tested without user setup.

  create-streaming-url-request - `com.amazonaws.services.appstream.model.CreateStreamingURLRequest`

  returns: Result of the CreateStreamingURL operation returned by the service. - `com.amazonaws.services.appstream.model.CreateStreamingURLResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.CreateStreamingURLResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CreateStreamingURLRequest create-streaming-url-request]
    (-> this (.createStreamingURL create-streaming-url-request))))

(defn delete-usage-report-subscription
  "Disables usage report generation.

  delete-usage-report-subscription-request - `com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest`

  returns: Result of the DeleteUsageReportSubscription operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionResult`

  throws: com.amazonaws.services.appstream.model.InvalidAccountStatusException - The resource cannot be created because your AWS account is suspended. For assistance, contact AWS Support."
  (^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest delete-usage-report-subscription-request]
    (-> this (.deleteUsageReportSubscription delete-usage-report-subscription-request))))

(defn delete-fleet
  "Deletes the specified fleet.

  delete-fleet-request - `com.amazonaws.services.appstream.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteFleetResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DeleteFleetResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteFleetRequest delete-fleet-request]
    (-> this (.deleteFleet delete-fleet-request))))

(defn describe-stacks
  "Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all
   stacks in the account are described.

  describe-stacks-request - `com.amazonaws.services.appstream.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeStacksResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeStacksResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeStacksRequest describe-stacks-request]
    (-> this (.describeStacks describe-stacks-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonAppStream this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-image-permissions
  "Adds or updates permissions for the specified private image.

  update-image-permissions-request - `com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest`

  returns: Result of the UpdateImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateImagePermissionsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.UpdateImagePermissionsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest update-image-permissions-request]
    (-> this (.updateImagePermissions update-image-permissions-request))))

(defn waiters
  "returns: `com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters`"
  (^com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters [^AmazonAppStream this]
    (-> this (.waiters))))

(defn batch-disassociate-user-stack
  "Disassociates the specified users from the specified stacks.

  batch-disassociate-user-stack-request - `com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest`

  returns: Result of the BatchDisassociateUserStack operation returned by the service. - `com.amazonaws.services.appstream.model.BatchDisassociateUserStackResult`"
  (^com.amazonaws.services.appstream.model.BatchDisassociateUserStackResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest batch-disassociate-user-stack-request]
    (-> this (.batchDisassociateUserStack batch-disassociate-user-stack-request))))

(defn update-stack
  "Updates the specified fields for the specified stack.

  update-stack-request - `com.amazonaws.services.appstream.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateStackResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.UpdateStackResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.UpdateStackRequest update-stack-request]
    (-> this (.updateStack update-stack-request))))

(defn enable-user
  "Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications
   from the stacks to which they are assigned.

  enable-user-request - `com.amazonaws.services.appstream.model.EnableUserRequest`

  returns: Result of the EnableUser operation returned by the service. - `com.amazonaws.services.appstream.model.EnableUserResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.EnableUserResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.EnableUserRequest enable-user-request]
    (-> this (.enableUser enable-user-request))))

(defn stop-fleet
  "Stops the specified fleet.

  stop-fleet-request - `com.amazonaws.services.appstream.model.StopFleetRequest`

  returns: Result of the StopFleet operation returned by the service. - `com.amazonaws.services.appstream.model.StopFleetResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.StopFleetResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.StopFleetRequest stop-fleet-request]
    (-> this (.stopFleet stop-fleet-request))))

(defn create-image-builder
  "Creates an image builder. An image builder is a virtual machine that is used to create an image.


   The initial state of the builder is PENDING. When it is ready, the state is RUNNING.

  create-image-builder-request - `com.amazonaws.services.appstream.model.CreateImageBuilderRequest`

  returns: Result of the CreateImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.CreateImageBuilderResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.CreateImageBuilderResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CreateImageBuilderRequest create-image-builder-request]
    (-> this (.createImageBuilder create-image-builder-request))))

(defn untag-resource
  "Disassociates one or more specified tags from the specified AppStream 2.0 resource.


   To list the current tags for your resources, use ListTagsForResource.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  untag-resource-request - `com.amazonaws.services.appstream.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.appstream.model.UntagResourceResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.UntagResourceResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn create-fleet
  "Creates a fleet. A fleet consists of streaming instances that run a specified image.

  create-fleet-request - `com.amazonaws.services.appstream.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.CreateFleetResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.CreateFleetResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CreateFleetRequest create-fleet-request]
    (-> this (.createFleet create-fleet-request))))

(defn describe-usage-report-subscriptions
  "Retrieves a list that describes one or more usage report subscriptions.

  describe-usage-report-subscriptions-request - `com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest`

  returns: Result of the DescribeUsageReportSubscriptions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest describe-usage-report-subscriptions-request]
    (-> this (.describeUsageReportSubscriptions describe-usage-report-subscriptions-request))))

(defn disable-user
  "Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled.
   This action does not delete the user.

  disable-user-request - `com.amazonaws.services.appstream.model.DisableUserRequest`

  returns: Result of the DisableUser operation returned by the service. - `com.amazonaws.services.appstream.model.DisableUserResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DisableUserResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DisableUserRequest disable-user-request]
    (-> this (.disableUser disable-user-request))))

(defn describe-image-builders
  "Retrieves a list that describes one or more specified image builders, if the image builder names are provided.
   Otherwise, all image builders in the account are described.

  describe-image-builders-request - `com.amazonaws.services.appstream.model.DescribeImageBuildersRequest`

  returns: Result of the DescribeImageBuilders operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImageBuildersResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeImageBuildersResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeImageBuildersRequest describe-image-builders-request]
    (-> this (.describeImageBuilders describe-image-builders-request))))

(defn create-user
  "Creates a new user in the user pool.

  create-user-request - `com.amazonaws.services.appstream.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.appstream.model.CreateUserResult`

  throws: com.amazonaws.services.appstream.model.ResourceAlreadyExistsException - The specified resource already exists."
  (^com.amazonaws.services.appstream.model.CreateUserResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CreateUserRequest create-user-request]
    (-> this (.createUser create-user-request))))

(defn delete-user
  "Deletes a user from the user pool.

  delete-user-request - `com.amazonaws.services.appstream.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteUserResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DeleteUserResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUser delete-user-request))))

(defn create-image-builder-streaming-url
  "Creates a URL to start an image builder streaming session.

  create-image-builder-streaming-url-request - `com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest`

  returns: Result of the CreateImageBuilderStreamingURL operation returned by the service. - `com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult`

  throws: com.amazonaws.services.appstream.model.OperationNotPermittedException - The attempted operation is not permitted."
  (^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest create-image-builder-streaming-url-request]
    (-> this (.createImageBuilderStreamingURL create-image-builder-streaming-url-request))))

(defn list-associated-fleets
  "Retrieves the name of the fleet that is associated with the specified stack.

  list-associated-fleets-request - `com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest`

  returns: Result of the ListAssociatedFleets operation returned by the service. - `com.amazonaws.services.appstream.model.ListAssociatedFleetsResult`"
  (^com.amazonaws.services.appstream.model.ListAssociatedFleetsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest list-associated-fleets-request]
    (-> this (.listAssociatedFleets list-associated-fleets-request))))

(defn describe-image-permissions
  "Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own.

  describe-image-permissions-request - `com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest`

  returns: Result of the DescribeImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImagePermissionsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeImagePermissionsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest describe-image-permissions-request]
    (-> this (.describeImagePermissions describe-image-permissions-request))))

(defn disassociate-fleet
  "Disassociates the specified fleet from the specified stack.

  disassociate-fleet-request - `com.amazonaws.services.appstream.model.DisassociateFleetRequest`

  returns: Result of the DisassociateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.DisassociateFleetResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DisassociateFleetResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DisassociateFleetRequest disassociate-fleet-request]
    (-> this (.disassociateFleet disassociate-fleet-request))))

(defn create-stack
  "Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access
   policies, and storage configurations.

  create-stack-request - `com.amazonaws.services.appstream.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.appstream.model.CreateStackResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.CreateStackResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CreateStackRequest create-stack-request]
    (-> this (.createStack create-stack-request))))

(defn expire-session
  "Immediately stops the specified streaming session.

  expire-session-request - `com.amazonaws.services.appstream.model.ExpireSessionRequest`

  returns: Result of the ExpireSession operation returned by the service. - `com.amazonaws.services.appstream.model.ExpireSessionResult`"
  (^com.amazonaws.services.appstream.model.ExpireSessionResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.ExpireSessionRequest expire-session-request]
    (-> this (.expireSession expire-session-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonAppStream this]
    (-> this (.shutdown))))

(defn delete-image
  "Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot
   provision new capacity using the image.

  delete-image-request - `com.amazonaws.services.appstream.model.DeleteImageRequest`

  returns: Result of the DeleteImage operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImageResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DeleteImageResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteImageRequest delete-image-request]
    (-> this (.deleteImage delete-image-request))))

(defn start-image-builder
  "Starts the specified image builder.

  start-image-builder-request - `com.amazonaws.services.appstream.model.StartImageBuilderRequest`

  returns: Result of the StartImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.StartImageBuilderResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotAvailableException - The specified resource exists and is not in use, but isn't available."
  (^com.amazonaws.services.appstream.model.StartImageBuilderResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.StartImageBuilderRequest start-image-builder-request]
    (-> this (.startImageBuilder start-image-builder-request))))

(defn describe-fleets
  "Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all
   fleets in the account are described.

  describe-fleets-request - `com.amazonaws.services.appstream.model.DescribeFleetsRequest`

  returns: Result of the DescribeFleets operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeFleetsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeFleetsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeFleetsRequest describe-fleets-request]
    (-> this (.describeFleets describe-fleets-request))))

(defn list-associated-stacks
  "Retrieves the name of the stack with which the specified fleet is associated.

  list-associated-stacks-request - `com.amazonaws.services.appstream.model.ListAssociatedStacksRequest`

  returns: Result of the ListAssociatedStacks operation returned by the service. - `com.amazonaws.services.appstream.model.ListAssociatedStacksResult`"
  (^com.amazonaws.services.appstream.model.ListAssociatedStacksResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.ListAssociatedStacksRequest list-associated-stacks-request]
    (-> this (.listAssociatedStacks list-associated-stacks-request))))

(defn delete-stack
  "Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the
   stack is no longer available to users. Also, any reservations made for application streaming sessions for the
   stack are released.

  delete-stack-request - `com.amazonaws.services.appstream.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteStackResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DeleteStackResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteStackRequest delete-stack-request]
    (-> this (.deleteStack delete-stack-request))))

(defn create-directory-config
  "Creates a Directory Config object in AppStream 2.0. This object includes the configuration information required
   to join fleets and image builders to Microsoft Active Directory domains.

  create-directory-config-request - `com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest`

  returns: Result of the CreateDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.CreateDirectoryConfigResult`

  throws: com.amazonaws.services.appstream.model.ResourceAlreadyExistsException - The specified resource already exists."
  (^com.amazonaws.services.appstream.model.CreateDirectoryConfigResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest create-directory-config-request]
    (-> this (.createDirectoryConfig create-directory-config-request))))

(defn describe-sessions
  "Retrieves a list that describes the streaming sessions for a specified stack and fleet. If a UserId is provided
   for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not
   provided, the default is to authenticate users using a streaming URL.

  describe-sessions-request - `com.amazonaws.services.appstream.model.DescribeSessionsRequest`

  returns: Result of the DescribeSessions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeSessionsResult`

  throws: com.amazonaws.services.appstream.model.InvalidParameterCombinationException - Indicates an incorrect combination of parameters, or a missing parameter."
  (^com.amazonaws.services.appstream.model.DescribeSessionsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeSessionsRequest describe-sessions-request]
    (-> this (.describeSessions describe-sessions-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"appstream2.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"appstream2.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonAppStream this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-directory-config
  "Updates the specified Directory Config object in AppStream 2.0. This object includes the configuration
   information required to join fleets and image builders to Microsoft Active Directory domains.

  update-directory-config-request - `com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest`

  returns: Result of the UpdateDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest update-directory-config-request]
    (-> this (.updateDirectoryConfig update-directory-config-request))))

(defn describe-directory-configs
  "Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names
   for these objects are provided. Otherwise, all Directory Config objects in the account are described. These
   objects include the configuration information required to join fleets and image builders to Microsoft Active
   Directory domains.


   Although the response syntax in this topic includes the account password, this password is not returned in the
   actual response.

  describe-directory-configs-request - `com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest`

  returns: Result of the DescribeDirectoryConfigs operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest describe-directory-configs-request]
    (-> this (.describeDirectoryConfigs describe-directory-configs-request))))

(defn associate-fleet
  "Associates the specified fleet with the specified stack.

  associate-fleet-request - `com.amazonaws.services.appstream.model.AssociateFleetRequest`

  returns: Result of the AssociateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.AssociateFleetResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.AssociateFleetResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.AssociateFleetRequest associate-fleet-request]
    (-> this (.associateFleet associate-fleet-request))))

(defn create-usage-report-subscription
  "Creates a usage report subscription. Usage reports are generated daily.

  create-usage-report-subscription-request - `com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest`

  returns: Result of the CreateUsageReportSubscription operation returned by the service. - `com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionResult`

  throws: com.amazonaws.services.appstream.model.InvalidRoleException - The specified role is invalid."
  (^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest create-usage-report-subscription-request]
    (-> this (.createUsageReportSubscription create-usage-report-subscription-request))))

(defn update-fleet
  "Updates the specified fleet.


   If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the
   fleet is in the RUNNING state, you can update the DisplayName,
   ComputeCapacity, ImageARN, ImageName, and
   DisconnectTimeoutInSeconds attributes. If the fleet is in the STARTING or
   STOPPING state, you can't update it.

  update-fleet-request - `com.amazonaws.services.appstream.model.UpdateFleetRequest`

  returns: Result of the UpdateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateFleetResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.UpdateFleetResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.UpdateFleetRequest update-fleet-request]
    (-> this (.updateFleet update-fleet-request))))

(defn copy-image
  "Copies the image within the same region or to a new region within the same AWS account. Note that any tags you
   added to the image will not be copied.

  copy-image-request - `com.amazonaws.services.appstream.model.CopyImageRequest`

  returns: Result of the CopyImage operation returned by the service. - `com.amazonaws.services.appstream.model.CopyImageResult`

  throws: com.amazonaws.services.appstream.model.ResourceAlreadyExistsException - The specified resource already exists."
  (^com.amazonaws.services.appstream.model.CopyImageResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.CopyImageRequest copy-image-request]
    (-> this (.copyImage copy-image-request))))

(defn stop-image-builder
  "Stops the specified image builder.

  stop-image-builder-request - `com.amazonaws.services.appstream.model.StopImageBuilderRequest`

  returns: Result of the StopImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.StopImageBuilderResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.StopImageBuilderResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.StopImageBuilderRequest stop-image-builder-request]
    (-> this (.stopImageBuilder stop-image-builder-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonAppStream this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-fleet
  "Starts the specified fleet.

  start-fleet-request - `com.amazonaws.services.appstream.model.StartFleetRequest`

  returns: Result of the StartFleet operation returned by the service. - `com.amazonaws.services.appstream.model.StartFleetResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.StartFleetResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.StartFleetRequest start-fleet-request]
    (-> this (.startFleet start-fleet-request))))

(defn tag-resource
  "Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image
   builders, images, fleets, and stacks.


   Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this
   operation updates its value.


   To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your
   resources, use UntagResource.


   For more information about tags, see Tagging Your Resources
   in the Amazon AppStream 2.0 Developer Guide.

  tag-resource-request - `com.amazonaws.services.appstream.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.appstream.model.TagResourceResult`

  throws: com.amazonaws.services.appstream.model.LimitExceededException - The requested limit exceeds the permitted limit for an account."
  (^com.amazonaws.services.appstream.model.TagResourceResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn describe-images
  "Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided.
   Otherwise, all images in the account are described.

  describe-images-request - `com.amazonaws.services.appstream.model.DescribeImagesRequest`

  returns: Result of the DescribeImages operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImagesResult`

  throws: com.amazonaws.services.appstream.model.InvalidParameterCombinationException - Indicates an incorrect combination of parameters, or a missing parameter."
  (^com.amazonaws.services.appstream.model.DescribeImagesResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeImagesRequest describe-images-request]
    (-> this (.describeImages describe-images-request))))

(defn describe-user-stack-associations
  "Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the
   following:




   The stack name




   The user name (email address of the user associated with the stack) and the authentication type for the user

  describe-user-stack-associations-request - `com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest`

  returns: Result of the DescribeUserStackAssociations operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUserStackAssociationsResult`

  throws: com.amazonaws.services.appstream.model.InvalidParameterCombinationException - Indicates an incorrect combination of parameters, or a missing parameter."
  (^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest describe-user-stack-associations-request]
    (-> this (.describeUserStackAssociations describe-user-stack-associations-request))))

(defn delete-image-builder
  "Deletes the specified image builder and releases the capacity.

  delete-image-builder-request - `com.amazonaws.services.appstream.model.DeleteImageBuilderRequest`

  returns: Result of the DeleteImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImageBuilderResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DeleteImageBuilderResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteImageBuilderRequest delete-image-builder-request]
    (-> this (.deleteImageBuilder delete-image-builder-request))))

(defn delete-directory-config
  "Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required
   to join streaming instances to an Active Directory domain.

  delete-directory-config-request - `com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest`

  returns: Result of the DeleteDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult`

  throws: com.amazonaws.services.appstream.model.ResourceInUseException - The specified resource is in use."
  (^com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest delete-directory-config-request]
    (-> this (.deleteDirectoryConfig delete-directory-config-request))))

(defn describe-users
  "Retrieves a list that describes one or more specified users in the user pool.

  describe-users-request - `com.amazonaws.services.appstream.model.DescribeUsersRequest`

  returns: Result of the DescribeUsers operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUsersResult`

  throws: com.amazonaws.services.appstream.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.appstream.model.DescribeUsersResult [^AmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeUsersRequest describe-users-request]
    (-> this (.describeUsers describe-users-request))))

