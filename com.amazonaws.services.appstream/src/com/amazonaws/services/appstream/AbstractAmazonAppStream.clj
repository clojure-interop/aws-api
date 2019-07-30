(ns com.amazonaws.services.appstream.AbstractAmazonAppStream
  "Abstract implementation of AmazonAppStream. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appstream AbstractAmazonAppStream]))

(defn batch-associate-user-stack
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest`

  returns: Result of the BatchAssociateUserStack operation returned by the service. - `com.amazonaws.services.appstream.model.BatchAssociateUserStackResult`"
  (^com.amazonaws.services.appstream.model.BatchAssociateUserStackResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.BatchAssociateUserStackRequest request]
    (-> this (.batchAssociateUserStack request))))

(defn delete-image-permissions
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest`

  returns: Result of the DeleteImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImagePermissionsResult`"
  (^com.amazonaws.services.appstream.model.DeleteImagePermissionsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteImagePermissionsRequest request]
    (-> this (.deleteImagePermissions request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.appstream.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.appstream.model.ListTagsForResourceResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn create-streaming-url
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CreateStreamingURLRequest`

  returns: Result of the CreateStreamingURL operation returned by the service. - `com.amazonaws.services.appstream.model.CreateStreamingURLResult`"
  (^com.amazonaws.services.appstream.model.CreateStreamingURLResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CreateStreamingURLRequest request]
    (-> this (.createStreamingURL request))))

(defn delete-usage-report-subscription
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest`

  returns: Result of the DeleteUsageReportSubscription operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionResult`"
  (^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteUsageReportSubscriptionRequest request]
    (-> this (.deleteUsageReportSubscription request))))

(defn delete-fleet
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteFleetResult`"
  (^com.amazonaws.services.appstream.model.DeleteFleetResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteFleetRequest request]
    (-> this (.deleteFleet request))))

(defn describe-stacks
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeStacksResult`"
  (^com.amazonaws.services.appstream.model.DescribeStacksResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeStacksRequest request]
    (-> this (.describeStacks request))))

(defn set-region
  "Description copied from interface: AmazonAppStream

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonAppStream this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn update-image-permissions
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest`

  returns: Result of the UpdateImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateImagePermissionsResult`"
  (^com.amazonaws.services.appstream.model.UpdateImagePermissionsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.UpdateImagePermissionsRequest request]
    (-> this (.updateImagePermissions request))))

(defn waiters
  "returns: `com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters`"
  (^com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters [^AbstractAmazonAppStream this]
    (-> this (.waiters))))

(defn batch-disassociate-user-stack
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest`

  returns: Result of the BatchDisassociateUserStack operation returned by the service. - `com.amazonaws.services.appstream.model.BatchDisassociateUserStackResult`"
  (^com.amazonaws.services.appstream.model.BatchDisassociateUserStackResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.BatchDisassociateUserStackRequest request]
    (-> this (.batchDisassociateUserStack request))))

(defn update-stack
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateStackResult`"
  (^com.amazonaws.services.appstream.model.UpdateStackResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.UpdateStackRequest request]
    (-> this (.updateStack request))))

(defn enable-user
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.EnableUserRequest`

  returns: Result of the EnableUser operation returned by the service. - `com.amazonaws.services.appstream.model.EnableUserResult`"
  (^com.amazonaws.services.appstream.model.EnableUserResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.EnableUserRequest request]
    (-> this (.enableUser request))))

(defn stop-fleet
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.StopFleetRequest`

  returns: Result of the StopFleet operation returned by the service. - `com.amazonaws.services.appstream.model.StopFleetResult`"
  (^com.amazonaws.services.appstream.model.StopFleetResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.StopFleetRequest request]
    (-> this (.stopFleet request))))

(defn create-image-builder
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CreateImageBuilderRequest`

  returns: Result of the CreateImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.CreateImageBuilderResult`"
  (^com.amazonaws.services.appstream.model.CreateImageBuilderResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CreateImageBuilderRequest request]
    (-> this (.createImageBuilder request))))

(defn untag-resource
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.appstream.model.UntagResourceResult`"
  (^com.amazonaws.services.appstream.model.UntagResourceResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-fleet
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.CreateFleetResult`"
  (^com.amazonaws.services.appstream.model.CreateFleetResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn describe-usage-report-subscriptions
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest`

  returns: Result of the DescribeUsageReportSubscriptions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsResult`"
  (^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeUsageReportSubscriptionsRequest request]
    (-> this (.describeUsageReportSubscriptions request))))

(defn disable-user
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DisableUserRequest`

  returns: Result of the DisableUser operation returned by the service. - `com.amazonaws.services.appstream.model.DisableUserResult`"
  (^com.amazonaws.services.appstream.model.DisableUserResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DisableUserRequest request]
    (-> this (.disableUser request))))

(defn describe-image-builders
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeImageBuildersRequest`

  returns: Result of the DescribeImageBuilders operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImageBuildersResult`"
  (^com.amazonaws.services.appstream.model.DescribeImageBuildersResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeImageBuildersRequest request]
    (-> this (.describeImageBuilders request))))

(defn create-user
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.appstream.model.CreateUserResult`"
  (^com.amazonaws.services.appstream.model.CreateUserResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn delete-user
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteUserResult`"
  (^com.amazonaws.services.appstream.model.DeleteUserResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn create-image-builder-streaming-url
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest`

  returns: Result of the CreateImageBuilderStreamingURL operation returned by the service. - `com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult`"
  (^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CreateImageBuilderStreamingURLRequest request]
    (-> this (.createImageBuilderStreamingURL request))))

(defn list-associated-fleets
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest`

  returns: Result of the ListAssociatedFleets operation returned by the service. - `com.amazonaws.services.appstream.model.ListAssociatedFleetsResult`"
  (^com.amazonaws.services.appstream.model.ListAssociatedFleetsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.ListAssociatedFleetsRequest request]
    (-> this (.listAssociatedFleets request))))

(defn describe-image-permissions
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest`

  returns: Result of the DescribeImagePermissions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImagePermissionsResult`"
  (^com.amazonaws.services.appstream.model.DescribeImagePermissionsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeImagePermissionsRequest request]
    (-> this (.describeImagePermissions request))))

(defn disassociate-fleet
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DisassociateFleetRequest`

  returns: Result of the DisassociateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.DisassociateFleetResult`"
  (^com.amazonaws.services.appstream.model.DisassociateFleetResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DisassociateFleetRequest request]
    (-> this (.disassociateFleet request))))

(defn create-stack
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.appstream.model.CreateStackResult`"
  (^com.amazonaws.services.appstream.model.CreateStackResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CreateStackRequest request]
    (-> this (.createStack request))))

(defn expire-session
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.ExpireSessionRequest`

  returns: Result of the ExpireSession operation returned by the service. - `com.amazonaws.services.appstream.model.ExpireSessionResult`"
  (^com.amazonaws.services.appstream.model.ExpireSessionResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.ExpireSessionRequest request]
    (-> this (.expireSession request))))

(defn shutdown
  "Description copied from interface: AmazonAppStream"
  ([^AbstractAmazonAppStream this]
    (-> this (.shutdown))))

(defn delete-image
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DeleteImageRequest`

  returns: Result of the DeleteImage operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImageResult`"
  (^com.amazonaws.services.appstream.model.DeleteImageResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteImageRequest request]
    (-> this (.deleteImage request))))

(defn start-image-builder
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.StartImageBuilderRequest`

  returns: Result of the StartImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.StartImageBuilderResult`"
  (^com.amazonaws.services.appstream.model.StartImageBuilderResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.StartImageBuilderRequest request]
    (-> this (.startImageBuilder request))))

(defn describe-fleets
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeFleetsRequest`

  returns: Result of the DescribeFleets operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeFleetsResult`"
  (^com.amazonaws.services.appstream.model.DescribeFleetsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeFleetsRequest request]
    (-> this (.describeFleets request))))

(defn list-associated-stacks
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.ListAssociatedStacksRequest`

  returns: Result of the ListAssociatedStacks operation returned by the service. - `com.amazonaws.services.appstream.model.ListAssociatedStacksResult`"
  (^com.amazonaws.services.appstream.model.ListAssociatedStacksResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.ListAssociatedStacksRequest request]
    (-> this (.listAssociatedStacks request))))

(defn delete-stack
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteStackResult`"
  (^com.amazonaws.services.appstream.model.DeleteStackResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteStackRequest request]
    (-> this (.deleteStack request))))

(defn create-directory-config
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest`

  returns: Result of the CreateDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.CreateDirectoryConfigResult`"
  (^com.amazonaws.services.appstream.model.CreateDirectoryConfigResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CreateDirectoryConfigRequest request]
    (-> this (.createDirectoryConfig request))))

(defn describe-sessions
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeSessionsRequest`

  returns: Result of the DescribeSessions operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeSessionsResult`"
  (^com.amazonaws.services.appstream.model.DescribeSessionsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeSessionsRequest request]
    (-> this (.describeSessions request))))

(defn set-endpoint
  "Description copied from interface: AmazonAppStream

  endpoint - The endpoint (ex: \"appstream2.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"appstream2.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonAppStream this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-directory-config
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest`

  returns: Result of the UpdateDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult`"
  (^com.amazonaws.services.appstream.model.UpdateDirectoryConfigResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.UpdateDirectoryConfigRequest request]
    (-> this (.updateDirectoryConfig request))))

(defn describe-directory-configs
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest`

  returns: Result of the DescribeDirectoryConfigs operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult`"
  (^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeDirectoryConfigsRequest request]
    (-> this (.describeDirectoryConfigs request))))

(defn associate-fleet
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.AssociateFleetRequest`

  returns: Result of the AssociateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.AssociateFleetResult`"
  (^com.amazonaws.services.appstream.model.AssociateFleetResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.AssociateFleetRequest request]
    (-> this (.associateFleet request))))

(defn create-usage-report-subscription
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest`

  returns: Result of the CreateUsageReportSubscription operation returned by the service. - `com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionResult`"
  (^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CreateUsageReportSubscriptionRequest request]
    (-> this (.createUsageReportSubscription request))))

(defn update-fleet
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.UpdateFleetRequest`

  returns: Result of the UpdateFleet operation returned by the service. - `com.amazonaws.services.appstream.model.UpdateFleetResult`"
  (^com.amazonaws.services.appstream.model.UpdateFleetResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.UpdateFleetRequest request]
    (-> this (.updateFleet request))))

(defn copy-image
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.CopyImageRequest`

  returns: Result of the CopyImage operation returned by the service. - `com.amazonaws.services.appstream.model.CopyImageResult`"
  (^com.amazonaws.services.appstream.model.CopyImageResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.CopyImageRequest request]
    (-> this (.copyImage request))))

(defn stop-image-builder
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.StopImageBuilderRequest`

  returns: Result of the StopImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.StopImageBuilderResult`"
  (^com.amazonaws.services.appstream.model.StopImageBuilderResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.StopImageBuilderRequest request]
    (-> this (.stopImageBuilder request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonAppStream

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonAppStream this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-fleet
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.StartFleetRequest`

  returns: Result of the StartFleet operation returned by the service. - `com.amazonaws.services.appstream.model.StartFleetResult`"
  (^com.amazonaws.services.appstream.model.StartFleetResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.StartFleetRequest request]
    (-> this (.startFleet request))))

(defn tag-resource
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.appstream.model.TagResourceResult`"
  (^com.amazonaws.services.appstream.model.TagResourceResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn describe-images
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeImagesRequest`

  returns: Result of the DescribeImages operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeImagesResult`"
  (^com.amazonaws.services.appstream.model.DescribeImagesResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeImagesRequest request]
    (-> this (.describeImages request))))

(defn describe-user-stack-associations
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest`

  returns: Result of the DescribeUserStackAssociations operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUserStackAssociationsResult`"
  (^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeUserStackAssociationsRequest request]
    (-> this (.describeUserStackAssociations request))))

(defn delete-image-builder
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DeleteImageBuilderRequest`

  returns: Result of the DeleteImageBuilder operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteImageBuilderResult`"
  (^com.amazonaws.services.appstream.model.DeleteImageBuilderResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteImageBuilderRequest request]
    (-> this (.deleteImageBuilder request))))

(defn delete-directory-config
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest`

  returns: Result of the DeleteDirectoryConfig operation returned by the service. - `com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult`"
  (^com.amazonaws.services.appstream.model.DeleteDirectoryConfigResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DeleteDirectoryConfigRequest request]
    (-> this (.deleteDirectoryConfig request))))

(defn describe-users
  "Description copied from interface: AmazonAppStream

  request - `com.amazonaws.services.appstream.model.DescribeUsersRequest`

  returns: Result of the DescribeUsers operation returned by the service. - `com.amazonaws.services.appstream.model.DescribeUsersResult`"
  (^com.amazonaws.services.appstream.model.DescribeUsersResult [^AbstractAmazonAppStream this ^com.amazonaws.services.appstream.model.DescribeUsersRequest request]
    (-> this (.describeUsers request))))

