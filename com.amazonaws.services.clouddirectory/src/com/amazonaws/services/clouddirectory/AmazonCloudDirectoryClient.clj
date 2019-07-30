(ns com.amazonaws.services.clouddirectory.AmazonCloudDirectoryClient
  "Client for accessing Amazon CloudDirectory. All service calls made using this client are blocking, and will not
  return until the service call completes.

  Amazon Cloud Directory

  Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of
  cloud-scale web, mobile, and IoT applications. This guide describes the Cloud Directory operations that you can call
  programmatically and includes detailed information on data types and errors. For information about Cloud Directory
  features, see AWS Directory Service and the Amazon Cloud
  Directory Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.clouddirectory AmazonCloudDirectoryClient]))

(defn ->amazon-cloud-directory-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon CloudDirectory (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonCloudDirectoryClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonCloudDirectoryClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonCloudDirectoryClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudDirectoryClient aws-credentials client-configuration))
  (^AmazonCloudDirectoryClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudDirectoryClient client-configuration))
  (^AmazonCloudDirectoryClient []
    (new AmazonCloudDirectoryClient )))

(defn *builder
  "returns: `com.amazonaws.services.clouddirectory.AmazonCloudDirectoryClientBuilder`"
  (^com.amazonaws.services.clouddirectory.AmazonCloudDirectoryClientBuilder []
    (AmazonCloudDirectoryClient/builder )))

(defn list-object-children
  "Returns a paginated list of child objects that are associated with a given object.

  request - `com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest`

  returns: Result of the ListObjectChildren operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectChildrenResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListObjectChildrenRequest request]
    (-> this (.listObjectChildren request))))

(defn list-policy-attachments
  "Returns all of the ObjectIdentifiers to which a given policy is attached.

  request - `com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest`

  returns: Result of the ListPolicyAttachments operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult`

  throws: com.amazonaws.services.clouddirectory.model.NotPolicyException - Indicates that the requested operation can only operate on policy objects."
  (^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListPolicyAttachmentsRequest request]
    (-> this (.listPolicyAttachments request))))

(defn create-object
  "Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and
   LinkName is specified. An object is simply a collection of Facet attributes. You can also use
   this API call to create a policy object, if the facet from which you create the object is a policy facet.

  request - `com.amazonaws.services.clouddirectory.model.CreateObjectRequest`

  returns: Result of the CreateObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.CreateObjectResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.CreateObjectRequest request]
    (-> this (.createObject request))))

(defn list-tags-for-resource
  "Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per
   directory. All 50 tags are returned for a given directory with this API call.

  request - `com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListTagsForResourceResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-facet
  "Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You
   can call this on all kinds of schema facets -- published, development, or applied.

  request - `com.amazonaws.services.clouddirectory.model.GetFacetRequest`

  returns: Result of the GetFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetFacetResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.GetFacetRequest request]
    (-> this (.getFacet request))))

(defn list-typed-link-facet-attributes
  "Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more
   information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest`

  returns: Result of the ListTypedLinkFacetAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetAttributesRequest request]
    (-> this (.listTypedLinkFacetAttributes request))))

(defn detach-object
  "Detaches a given object from the parent object. The object that is to be detached from the parent is specified by
   the link name.

  request - `com.amazonaws.services.clouddirectory.model.DetachObjectRequest`

  returns: Result of the DetachObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DetachObjectResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DetachObjectRequest request]
    (-> this (.detachObject request))))

(defn list-index
  "Lists objects attached to the specified index.

  request - `com.amazonaws.services.clouddirectory.model.ListIndexRequest`

  returns: Result of the ListIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListIndexResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListIndexResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListIndexRequest request]
    (-> this (.listIndex request))))

(defn list-object-attributes
  "Lists all attributes that are associated with an object.

  request - `com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest`

  returns: Result of the ListObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectAttributesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListObjectAttributesRequest request]
    (-> this (.listObjectAttributes request))))

(defn detach-from-index
  "Detaches the specified object from the specified index.

  request - `com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest`

  returns: Result of the DetachFromIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachFromIndexResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DetachFromIndexResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DetachFromIndexRequest request]
    (-> this (.detachFromIndex request))))

(defn list-object-parent-paths
  "Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
   objects. For more information about objects, see Directory Structure.


   Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory
   up to the requested object. The API returns the number of paths based on user-defined MaxResults, in
   case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among
   multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored
   from the target object.

  request - `com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest`

  returns: Result of the ListObjectParentPaths operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListObjectParentPathsRequest request]
    (-> this (.listObjectParentPaths request))))

(defn list-published-schema-arns
  "Lists the major version families of each published schema. If a major version ARN is provided as
   SchemaArn, the minor version revisions in that family are listed instead.

  request - `com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest`

  returns: Result of the ListPublishedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListPublishedSchemaArnsRequest request]
    (-> this (.listPublishedSchemaArns request))))

(defn attach-to-index
  "Attaches the specified object to the specified index.

  request - `com.amazonaws.services.clouddirectory.model.AttachToIndexRequest`

  returns: Result of the AttachToIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachToIndexResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.AttachToIndexResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.AttachToIndexRequest request]
    (-> this (.attachToIndex request))))

(defn delete-directory
  "Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise
   extreme caution when deleting directories.

  request - `com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest`

  returns: Result of the DeleteDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DeleteDirectoryResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DeleteDirectoryRequest request]
    (-> this (.deleteDirectory request))))

(defn lookup-policy
  "Lists all policies from the root of the Directory to the object specified. If there are no policies
   present, an empty list is returned. If policies are present, and if some objects don't have the policies
   attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns
   ObjectIdentifier, policyId, and policyType. Paths that don't lead to the
   root from the target object are ignored. For more information, see Policies.

  request - `com.amazonaws.services.clouddirectory.model.LookupPolicyRequest`

  returns: Result of the LookupPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.LookupPolicyResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.LookupPolicyResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.LookupPolicyRequest request]
    (-> this (.lookupPolicy request))))

(defn publish-schema
  "Publishes a development schema with a major version and a recommended minor version.

  request - `com.amazonaws.services.clouddirectory.model.PublishSchemaRequest`

  returns: Result of the PublishSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.PublishSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.PublishSchemaResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.PublishSchemaRequest request]
    (-> this (.publishSchema request))))

(defn delete-typed-link-facet
  "Deletes a TypedLinkFacet. For more information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest`

  returns: Result of the DeleteTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DeleteTypedLinkFacetRequest request]
    (-> this (.deleteTypedLinkFacet request))))

(defn attach-object
  "Attaches an existing object to another object. An object can be accessed in two ways:




   Using the path




   Using ObjectIdentifier

  request - `com.amazonaws.services.clouddirectory.model.AttachObjectRequest`

  returns: Result of the AttachObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.AttachObjectResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.AttachObjectRequest request]
    (-> this (.attachObject request))))

(defn untag-resource
  "An API operation for removing tags from a resource.

  request - `com.amazonaws.services.clouddirectory.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UntagResourceResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.UntagResourceResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn upgrade-applied-schema
  "Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in
   MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers
   on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given
   directory per call. To upgrade multiple directories from one schema, you would need to call this API on each
   directory.

  request - `com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest`

  returns: Result of the UpgradeAppliedSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.UpgradeAppliedSchemaRequest request]
    (-> this (.upgradeAppliedSchema request))))

(defn get-applied-schema-version
  "Returns current applied schema version ARN, including the minor version in use.

  request - `com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest`

  returns: Result of the GetAppliedSchemaVersion operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.GetAppliedSchemaVersionRequest request]
    (-> this (.getAppliedSchemaVersion request))))

(defn create-facet
  "Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.

  request - `com.amazonaws.services.clouddirectory.model.CreateFacetRequest`

  returns: Result of the CreateFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.CreateFacetResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.CreateFacetRequest request]
    (-> this (.createFacet request))))

(defn list-typed-link-facet-names
  "Returns a paginated list of TypedLink facet names for a particular schema. For more information, see
   Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest`

  returns: Result of the ListTypedLinkFacetNames operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListTypedLinkFacetNamesRequest request]
    (-> this (.listTypedLinkFacetNames request))))

(defn list-outgoing-typed-links
  "Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also
   supports filtering by typed link facet and identity attributes. For more information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest`

  returns: Result of the ListOutgoingTypedLinks operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListOutgoingTypedLinksRequest request]
    (-> this (.listOutgoingTypedLinks request))))

(defn get-object-attributes
  "Retrieves attributes within a facet that are associated with an object.

  request - `com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest`

  returns: Result of the GetObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetObjectAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.GetObjectAttributesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.GetObjectAttributesRequest request]
    (-> this (.getObjectAttributes request))))

(defn detach-typed-link
  "Detaches a typed link from a specified source and target object. For more information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest`

  returns: Result of the DetachTypedLink operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DetachTypedLinkResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DetachTypedLinkRequest request]
    (-> this (.detachTypedLink request))))

(defn list-attached-indices
  "Lists indices attached to the specified object.

  request - `com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest`

  returns: Result of the ListAttachedIndices operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListAttachedIndicesRequest request]
    (-> this (.listAttachedIndices request))))

(defn list-facet-attributes
  "Retrieves attributes attached to the facet.

  request - `com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest`

  returns: Result of the ListFacetAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListFacetAttributesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListFacetAttributesRequest request]
    (-> this (.listFacetAttributes request))))

(defn list-facet-names
  "Retrieves the names of facets that exist in a schema.

  request - `com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest`

  returns: Result of the ListFacetNames operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListFacetNamesResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListFacetNamesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListFacetNamesRequest request]
    (-> this (.listFacetNames request))))

(defn batch-read
  "Performs all the read operations in a batch.

  request - `com.amazonaws.services.clouddirectory.model.BatchReadRequest`

  returns: Result of the BatchRead operation returned by the service. - `com.amazonaws.services.clouddirectory.model.BatchReadResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.BatchReadResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.BatchReadRequest request]
    (-> this (.batchRead request))))

(defn update-typed-link-facet
  "Updates a TypedLinkFacet. For more information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest`

  returns: Result of the UpdateTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidFacetUpdateException - An attempt to modify a Facet resulted in an invalid schema exception."
  (^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.UpdateTypedLinkFacetRequest request]
    (-> this (.updateTypedLinkFacet request))))

(defn update-object-attributes
  "Updates a given object's attributes.

  request - `com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest`

  returns: Result of the UpdateObjectAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.UpdateObjectAttributesRequest request]
    (-> this (.updateObjectAttributes request))))

(defn list-object-policies
  "Returns policies attached to an object in pagination fashion.

  request - `com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest`

  returns: Result of the ListObjectPolicies operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListObjectPoliciesRequest request]
    (-> this (.listObjectPolicies request))))

(defn update-schema
  "Updates the schema name with a new name. Only development schema names can be updated.

  request - `com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest`

  returns: Result of the UpdateSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.UpdateSchemaResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.UpdateSchemaRequest request]
    (-> this (.updateSchema request))))

(defn add-facet-to-object
  "Adds a new Facet to an object. An object can have more than one facet applied on it.

  request - `com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest`

  returns: Result of the AddFacetToObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.AddFacetToObjectResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.AddFacetToObjectRequest request]
    (-> this (.addFacetToObject request))))

(defn attach-policy
  "Attaches a policy object to a regular object. An object can have a limited number of attached policies.

  request - `com.amazonaws.services.clouddirectory.model.AttachPolicyRequest`

  returns: Result of the AttachPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachPolicyResult`

  throws: com.amazonaws.services.clouddirectory.model.NotPolicyException - Indicates that the requested operation can only operate on policy objects."
  (^com.amazonaws.services.clouddirectory.model.AttachPolicyResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.AttachPolicyRequest request]
    (-> this (.attachPolicy request))))

(defn list-development-schema-arns
  "Retrieves each Amazon Resource Name (ARN) of schemas in the development state.

  request - `com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest`

  returns: Result of the ListDevelopmentSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListDevelopmentSchemaArnsRequest request]
    (-> this (.listDevelopmentSchemaArns request))))

(defn batch-write
  "Performs all the write operations in a batch. Either all the operations succeed or none.

  request - `com.amazonaws.services.clouddirectory.model.BatchWriteRequest`

  returns: Result of the BatchWrite operation returned by the service. - `com.amazonaws.services.clouddirectory.model.BatchWriteResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.BatchWriteResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.BatchWriteRequest request]
    (-> this (.batchWrite request))))

(defn remove-facet-from-object
  "Removes the specified facet from the specified object.

  request - `com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest`

  returns: Result of the RemoveFacetFromObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.RemoveFacetFromObjectRequest request]
    (-> this (.removeFacetFromObject request))))

(defn delete-facet
  "Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted.
   Only development schema facets are allowed deletion.

  request - `com.amazonaws.services.clouddirectory.model.DeleteFacetRequest`

  returns: Result of the DeleteFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DeleteFacetResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DeleteFacetRequest request]
    (-> this (.deleteFacet request))))

(defn enable-directory
  "Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then
   be read and written to.

  request - `com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest`

  returns: Result of the EnableDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.EnableDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.ResourceNotFoundException - The specified resource could not be found."
  (^com.amazonaws.services.clouddirectory.model.EnableDirectoryResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.EnableDirectoryRequest request]
    (-> this (.enableDirectory request))))

(defn update-facet
  "Does the following:




   Adds new Attributes, Rules, or ObjectTypes.




   Updates existing Attributes, Rules, or ObjectTypes.




   Deletes existing Attributes, Rules, or ObjectTypes.

  request - `com.amazonaws.services.clouddirectory.model.UpdateFacetRequest`

  returns: Result of the UpdateFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidFacetUpdateException - An attempt to modify a Facet resulted in an invalid schema exception."
  (^com.amazonaws.services.clouddirectory.model.UpdateFacetResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.UpdateFacetRequest request]
    (-> this (.updateFacet request))))

(defn list-object-parents
  "Lists parent objects that are associated with a given object in pagination fashion.

  request - `com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest`

  returns: Result of the ListObjectParents operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListObjectParentsResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListObjectParentsResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListObjectParentsRequest request]
    (-> this (.listObjectParents request))))

(defn detach-policy
  "Detaches a policy from an object.

  request - `com.amazonaws.services.clouddirectory.model.DetachPolicyRequest`

  returns: Result of the DetachPolicy operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DetachPolicyResult`

  throws: com.amazonaws.services.clouddirectory.model.NotPolicyException - Indicates that the requested operation can only operate on policy objects."
  (^com.amazonaws.services.clouddirectory.model.DetachPolicyResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DetachPolicyRequest request]
    (-> this (.detachPolicy request))))

(defn get-typed-link-facet-information
  "Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest`

  returns: Result of the GetTypedLinkFacetInformation operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.GetTypedLinkFacetInformationRequest request]
    (-> this (.getTypedLinkFacetInformation request))))

(defn create-index
  "Creates an index object. See Indexing and
   search for more information.

  request - `com.amazonaws.services.clouddirectory.model.CreateIndexRequest`

  returns: Result of the CreateIndex operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateIndexResult`

  throws: com.amazonaws.services.clouddirectory.model.LinkNameAlreadyInUseException - Indicates that a link could not be created due to a naming conflict. Choose a different name and then try again."
  (^com.amazonaws.services.clouddirectory.model.CreateIndexResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.CreateIndexRequest request]
    (-> this (.createIndex request))))

(defn list-incoming-typed-links
  "Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also
   supports filtering by typed link facet and identity attributes. For more information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest`

  returns: Result of the ListIncomingTypedLinks operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListIncomingTypedLinksRequest request]
    (-> this (.listIncomingTypedLinks request))))

(defn apply-schema
  "Copies the input published schema, at the specified version, into the Directory with the same name and
   version as that of the published schema.

  request - `com.amazonaws.services.clouddirectory.model.ApplySchemaRequest`

  returns: Result of the ApplySchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ApplySchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.ApplySchemaResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ApplySchemaRequest request]
    (-> this (.applySchema request))))

(defn create-typed-link-facet
  "Creates a TypedLinkFacet. For more information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest`

  returns: Result of the CreateTypedLinkFacet operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.CreateTypedLinkFacetRequest request]
    (-> this (.createTypedLinkFacet request))))

(defn update-link-attributes
  "Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s
   identity, as defined by its IdentityAttributeOrder.

  request - `com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest`

  returns: Result of the UpdateLinkAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.UpdateLinkAttributesRequest request]
    (-> this (.updateLinkAttributes request))))

(defn list-directories
  "Lists directories created within an account.

  request - `com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest`

  returns: Result of the ListDirectories operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListDirectoriesResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListDirectoriesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListDirectoriesRequest request]
    (-> this (.listDirectories request))))

(defn disable-directory
  "Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can
   be disabled. Disabled directories may be reenabled.

  request - `com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest`

  returns: Result of the DisableDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DisableDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.ResourceNotFoundException - The specified resource could not be found."
  (^com.amazonaws.services.clouddirectory.model.DisableDirectoryResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DisableDirectoryRequest request]
    (-> this (.disableDirectory request))))

(defn create-schema
  "Creates a new schema in a development state. A schema can exist in three phases:




   Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the
   schema is finalized, it can be published.




   Published: Published schemas are immutable and have a version associated with them.




   Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add
   new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.

  request - `com.amazonaws.services.clouddirectory.model.CreateSchemaRequest`

  returns: Result of the CreateSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.CreateSchemaResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.CreateSchemaRequest request]
    (-> this (.createSchema request))))

(defn delete-object
  "Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The
   maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory
   Limits.

  request - `com.amazonaws.services.clouddirectory.model.DeleteObjectRequest`

  returns: Result of the DeleteObject operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteObjectResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.DeleteObjectResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DeleteObjectRequest request]
    (-> this (.deleteObject request))))

(defn get-link-attributes
  "Retrieves attributes that are associated with a typed link.

  request - `com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest`

  returns: Result of the GetLinkAttributes operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetLinkAttributesResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.GetLinkAttributesResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.GetLinkAttributesRequest request]
    (-> this (.getLinkAttributes request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudDirectoryClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-object-information
  "Retrieves metadata about an object.

  request - `com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest`

  returns: Result of the GetObjectInformation operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetObjectInformationResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetObjectInformationResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.GetObjectInformationRequest request]
    (-> this (.getObjectInformation request))))

(defn get-directory
  "Retrieves metadata about a directory.

  request - `com.amazonaws.services.clouddirectory.model.GetDirectoryRequest`

  returns: Result of the GetDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetDirectoryResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.GetDirectoryRequest request]
    (-> this (.getDirectory request))))

(defn put-schema-from-json
  "Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON
   Schema Format for more information.

  request - `com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest`

  returns: Result of the PutSchemaFromJson operation returned by the service. - `com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.PutSchemaFromJsonRequest request]
    (-> this (.putSchemaFromJson request))))

(defn create-directory
  "Creates a Directory by copying the published schema into the directory. A directory cannot be created
   without a schema.


   You can also quickly create a directory using a managed schema, called the QuickStartSchema. For
   more information, see Managed Schema
   in the Amazon Cloud Directory Developer Guide.

  request - `com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest`

  returns: Result of the CreateDirectory operation returned by the service. - `com.amazonaws.services.clouddirectory.model.CreateDirectoryResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.CreateDirectoryResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.CreateDirectoryRequest request]
    (-> this (.createDirectory request))))

(defn delete-schema
  "Deletes a given schema. Schemas in a development and published state can only be deleted.

  request - `com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest`

  returns: Result of the DeleteSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.DeleteSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.DeleteSchemaResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.DeleteSchemaRequest request]
    (-> this (.deleteSchema request))))

(defn tag-resource
  "An API operation for adding tags to a resource.

  request - `com.amazonaws.services.clouddirectory.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.clouddirectory.model.TagResourceResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.TagResourceResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-schema-as-json
  "Retrieves a JSON representation of the schema. See JSON
   Schema Format for more information.

  request - `com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest`

  returns: Result of the GetSchemaAsJson operation returned by the service. - `com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.GetSchemaAsJsonRequest request]
    (-> this (.getSchemaAsJson request))))

(defn upgrade-published-schema
  "Upgrades a published schema under a new minor version revision using the current contents of
   DevelopmentSchemaArn.

  request - `com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest`

  returns: Result of the UpgradePublishedSchema operation returned by the service. - `com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.UpgradePublishedSchemaRequest request]
    (-> this (.upgradePublishedSchema request))))

(defn attach-typed-link
  "Attaches a typed link to a specified source and target object. For more information, see Typed Links.

  request - `com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest`

  returns: Result of the AttachTypedLink operation returned by the service. - `com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult`

  throws: com.amazonaws.services.clouddirectory.model.InvalidArnException - Indicates that the provided ARN value is not valid."
  (^com.amazonaws.services.clouddirectory.model.AttachTypedLinkResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.AttachTypedLinkRequest request]
    (-> this (.attachTypedLink request))))

(defn list-managed-schema-arns
  "Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the
   minor version revisions in that family are listed instead.

  request - `com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest`

  returns: Result of the ListManagedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListManagedSchemaArnsRequest request]
    (-> this (.listManagedSchemaArns request))))

(defn list-applied-schema-arns
  "Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor
   version.

  request - `com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest`

  returns: Result of the ListAppliedSchemaArns operation returned by the service. - `com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult`

  throws: com.amazonaws.services.clouddirectory.model.InternalServiceException - Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you can retry your request until it succeeds. Otherwise, go to the AWS Service Health Dashboard site to see if there are any operational issues with the service."
  (^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsResult [^AmazonCloudDirectoryClient this ^com.amazonaws.services.clouddirectory.model.ListAppliedSchemaArnsRequest request]
    (-> this (.listAppliedSchemaArns request))))

